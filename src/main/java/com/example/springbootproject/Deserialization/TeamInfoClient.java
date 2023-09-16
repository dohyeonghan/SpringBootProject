package com.example.springbootproject.Deserialization;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="TeamInfoService", url="http://127.0.0.1:8000")
public interface TeamInfoClient {
    @GetMapping("/")
    List<List<Object>> getTeamInfoList();
}
