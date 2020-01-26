package com.jedro.demo_aurora.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


class PaymentControllerTest {

    @Test
    public void testPaymentPage() throws Exception {
        PaymentController controller = new PaymentController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/payment")).andExpect(view().name("paymentPage")).andExpect(status().isOk());


    }



}