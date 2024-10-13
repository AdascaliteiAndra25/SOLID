package com.solid.o.good;

import com.solid.o.bad.BadClient;
import com.solid.s.good.GoodEmployee;

public class GoodServer {

    public void reactToClient(Client_I client) {
        client.doSomething();
    }

}
