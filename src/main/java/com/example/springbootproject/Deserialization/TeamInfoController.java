package com.example.springbootproject.Deserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class TeamInfoController {
    private final TeamInfoService teamInfoService;

    @GetMapping("")
    public ResponseEntity<List<TeamInfo>> getTeamInfo() {
        return ResponseEntity.ok(teamInfoService.getTeamInfoList());
    }
}
