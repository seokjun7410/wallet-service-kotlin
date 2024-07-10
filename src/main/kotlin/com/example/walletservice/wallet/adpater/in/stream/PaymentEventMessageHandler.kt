package com.example.walletservice.wallet.adpater.`in`.stream

import com.example.walletservice.common.StreamAdapter
import com.example.walletservice.wallet.domain.PaymentEventMessage
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.messaging.Message
import java.util.function.Consumer

@Configuration
@StreamAdapter
class PaymentEventMessageHandler {

    @Bean
    fun consume(): Consumer<Message<PaymentEventMessage>>{
        return Consumer {message ->
            print(message.payload)
        }
    }
}