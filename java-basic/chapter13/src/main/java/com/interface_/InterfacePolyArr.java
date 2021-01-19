package com.interface_;

/**
 * Author:ZJF
 * Date:2021-01-19 上午10:16
 */
public class InterfacePolyArr {
    public static void main(String[] args) {

        Phone phone = new Phone();
        phone.start();
        phone.call();
        phone.stop();

        Camera camera = new Camera();
        camera.start();
        camera.stop();

        System.out.println("========");

        //接口体现的多态数组
        NormalInterface[] devices = {new Phone(),new Camera()};
        for (int i = 0; i < devices.length; i++) {
            devices[i].start();
            devices[i].stop();

            if (devices[i] instanceof Phone){
                ((Phone)(devices[i])).call();
            }
        }
    }
}

interface NormalInterface{

    public void start();
    public void stop();
}

class Phone implements NormalInterface{

    @Override
    public void start() {
        System.out.println("手机开机");
    }

    @Override
    public void stop() {
        System.out.println("手机关机");
    }

    public void call(){
        System.out.println("call....");
    }
}

class Camera implements NormalInterface{

    @Override
    public void start() {
        System.out.println("camera is start");
    }

    @Override
    public void stop() {
        System.out.println("camera is stop");
    }
}
