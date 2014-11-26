package com.semantics3;

import com.semantics3.api.Products;
import org.json.JSONObject;

/**
 * SORCER class
 * User: prubach
 * Date: 20.11.14
 */
public class Run {

    public static void main(String[] args) {

        /* Set up a client to talk to the Semantics3 API using your Semantics3 API Credentials */
        Products products = new Products(
                "SEM3xxxxxxxxxxxxxxxxxxxxxx",
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
        );
        products.productsField("cat_id", 4992).productsField("brand", "Toshiba");
        JSONObject results = null;
        try {
            results = products.getProducts();
        } catch (Exception e) {
            System.out.println("Problem authenticating with Semantics3!");
        }
        System.out.println(results);
    }

}
