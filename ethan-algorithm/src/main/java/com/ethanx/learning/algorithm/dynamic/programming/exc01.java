/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-03-13
 */
package com.ethanx.learning.algorithm.dynamic.programming;

import java.util.Scanner;

/**
 *                 7
 *               8   3
 *             5   4   1
 *           3   10  5   9
 *  在上面的数字三角形中寻找一条从顶部到底边的路径，使得路径上所经过的数字之和最大。
 *  路径上的每一步都只能往左下或 右下走。只需要求出这个最大和即可，不必给出具体路径。
 *  三角形的行数大于1小于等于100，数字为 0 - 99
 *
 *  input:
 *  line: 4
 *  number:
 *  7
 *  8  3
 *  5  4  1
 *  3  10  5  9
 *  output:
 *  30
 */
public class exc01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();

    }
}