package org.vgfstudio.Thread;

public class Test1 {
    public static void main (String args[]) {

        Thread1 thread1 = new Thread1();
        new Thread(thread1, "线程1").start();

        new Thread2("线程2").start();

        for( int i = 0;  i < 100; i++) {
            System.out.println(" 主线程运行第" + i +" 步");
        }
    }

}
//第一种实现线程的方式， 实现Runnable接口  (推荐使用)
class Thread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++ ){
            System.out.println(Thread.currentThread().getName()+ "运行第" + i + "步");
        }
    }
}
//第二中实现线程的方式， 继承Thread类,它的本质还是实现Runnable接口，因为Thread类就实现了Runnable接口
class Thread2 extends Thread {
    public Thread2(String 线程2) {
    }

    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName()+ "运行第" + i + "步");
        }
    }
}