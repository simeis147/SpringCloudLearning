package cn.itcast.mq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SpringRabbitListener {

//    @RabbitListener(queues = "simple.queue")
//    public void listenSimpleQueue(String msg){
//        System.out.println("消费者接受到simple.queue的消息：{" + msg + "} .");
//    }


    @RabbitListener(queues = "simple.queue")
    public void listenWorkQueue1(String msg) throws InterruptedException {
        System.out.println("消费者1接受到simple.queue的消息：{" + msg + "} ." + LocalDateTime.now());
        Thread.sleep(20);
    }

    @RabbitListener(queues = "simple.queue")
    public void listenWorkQueue2(String msg) throws InterruptedException {
        System.err.println("消费者2接受到simple.queue的消息：{" + msg + "} ."+ LocalDateTime.now());
        Thread.sleep(200);
    }

}
