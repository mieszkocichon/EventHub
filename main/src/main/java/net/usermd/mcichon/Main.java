package net.usermd.mcichon;

import net.usermd.mcichon.Dispatcher.Dispatcher;
import net.usermd.mcichon.Dispatcher.DispatcherImpl;
import net.usermd.mcichon.bus.Action;
import net.usermd.mcichon.bus.Bus;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello " + Primitives.VERSION);
//
//        Bus bus = Bus.initBus(1);
//        AtomicInteger counter = new AtomicInteger(0);
//        String subject = "testMessage";
//
//        Action action = () -> System.out.println("Hello World!");
//
//        bus.responseFor(subject).then(action);
//        bus.message(subject).send();

        DispatcherImpl dispatcher = new DispatcherImpl(DispatcherImpl.DispatcherTypeEnum.ASYNC);
        System.out.println(dispatcher.process().toString());
    }
}
