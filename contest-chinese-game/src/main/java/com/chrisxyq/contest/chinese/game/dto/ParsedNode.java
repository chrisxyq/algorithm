package com.chrisxyq.contest.chinese.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParsedNode {
    private List<StrokeNode> strokeNodeList;
    private String[] word;
}
