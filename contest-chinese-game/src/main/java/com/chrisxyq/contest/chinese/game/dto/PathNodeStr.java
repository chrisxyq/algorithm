package com.chrisxyq.contest.chinese.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PathNodeStr {
    private int row;
    private int column;
    private String str;
}
