package com.example.springbootproject.Deserialization;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeamInfoService {
    private final TeamInfoClient teamInfoClient;

    public List<TeamInfo> getTeamInfoList(){
        List<List<Object>> response = teamInfoClient.getTeamInfoList();
        List<TeamInfo> teamInfoList = new ArrayList<>();

        for(List<Object> teamInfoResponse : response){
            TeamInfo teamInfo = TeamInfo.from(teamInfoResponse);
            teamInfoList.add(teamInfo);
        }
        log.info("teamInfoList : {}", teamInfoList);
        return teamInfoList;
    }

    /*
    for id in List<id>
        List<String> memberList = getMemberList(id)
        List<Info> infoList = getInfoList(memberList)
        for Info in List<Info>
            infoResponse = from(Info)
            infoResponseList.add(infoResponse)
        Item = infoResponseList
     */

}
