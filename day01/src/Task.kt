import java.io.File
import kotlin.math.abs

fun part1() {
    val input: List<Pair<Int, Int>> = File("src\\input.txt").readLines().map{
        val split = it.split(Regex(" {3}"))
        Pair(split[0].toIntOrNull()?: 0, split[1].toIntOrNull()?: 0)
    }

    val first = List(input.size) {
        input[it].first
    }.sorted()

    val second = List(input.size) {
        input[it].second
    }.sorted()

    val zipped = (first zip second)
    println(zipped.sumOf { abs(it.first - it.second) })
}

fun part2() {
    val input: List<Pair<Int, Int>> = File("src\\input.txt").readLines().map{
        val split = it.split(Regex(" {3}"))
        Pair(split[0].toIntOrNull()?: 0, split[1].toIntOrNull()?: 0)
    }

    val first = List(input.size) {
        input[it].first
    }

    val second = List(input.size) {
        input[it].second
    }

    println(first.sumOf { i -> i * second.count { j -> i == j } })
}

fun main() {
    part1()
    part2()
}