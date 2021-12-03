package net.cechacek.aoc21

import java.io.File

fun solve(data: List<Int>, windowSize: Int): Int = data.windowed(windowSize).count { it[0] < it[windowSize - 1]}

fun main() {
    val data = File("input", "Day01.txt").readLines().map { it.toInt() }

    val part1 = solve(data, windowSize = 2)
    val part2 = solve(data, windowSize = 4)

    println(part1)
    println(part2)
}
