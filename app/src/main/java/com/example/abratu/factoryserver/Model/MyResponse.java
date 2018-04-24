package com.example.abratu.factoryserver.Model;

import java.util.List;

/**
 * Created by abratu on 4/23/2018.
 */

public class MyResponse {
    public long multicast_id;
    public int success;
    public int failure;
    public int canonical_ids;
    public List<Result> results;
}
