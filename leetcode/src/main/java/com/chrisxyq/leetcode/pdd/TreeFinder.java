package com.chrisxyq.leetcode.pdd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Tree {
    private String val;
    private String parent;
    private String root;
}

public class TreeFinder {
    private static List<Tree> data = new ArrayList<>();

    private static void add(Tree tree) {
        data.add(tree);
    }

    /**
     * 以传入节点为父节点找所有节点
     * "1":["2","3"];
     * "2":["4","5","6"];
     * "3":["7","8"];
     * "4":[];
     * "9":[];
     *
     * @param parent
     * @return
     */
    private static List<Tree> findByParent(String parent) {
        return data.stream().filter(e -> {
            return Objects.equals(e.getParent(), parent);
        }).collect(Collectors.toList());
    }

    /**
     * 以传入节点为根节点，找所有节点
     * "1":["2","3","4","5","6","7","8"];
     * "2":[];
     * "3":[];
     * "4":[];
     * "9":[];
     *
     * @param root
     * @return
     */
    private static List<Tree> findByRoot(String root) {
        return data.stream().filter(e -> {
            return Objects.equals(e.getRoot(), root);
        }).collect(Collectors.toList());
    }

    /**
     * 已知提供两个方法，方法1：以传入节点为父节点找所有节点
     * 方法2：以传入节点为根节点，找所有节点
     * 要求根据以上两个方法，实现功能：
     * 以传入节点为根节点，找所有叶子节点
     * 要求不能循环调用提供的两个方法
     * "1":["4","5","6","7","8"];
     * "2":["4","5","6"];
     * "3":["7","8"];
     * "4":["4"];
     * "9":["9"];
     *
     * @param root
     * @return
     */
    private static List<Tree> findLeafByRoot(String root) {
        return null;
    }

    public static void main(String[] args) {
        add(new Tree("2", "1", "1"));
        add(new Tree("3", "1", "1"));
        add(new Tree("4", "2", "1"));
        add(new Tree("5", "2", "1"));
        add(new Tree("6", "2", "1"));
        add(new Tree("7", "3", "1"));
        add(new Tree("8", "3", "1"));
        List<Tree> res = findLeafByRoot("1");
        System.out.println(res);
    }
}
