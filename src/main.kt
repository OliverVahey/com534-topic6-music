fun main() {
    val songs = listOf(
        Song("Song 1", "Artist 1", 120.0),
        Song("Song 2", "Artist 1", 60.0),
        Song("Song 3", "Artist 2", 90.0),
        Song("Song 4", "Artist 3", 10.0),
    )
    val album = Album(songs)
    val single = Single(songs[0], songs[1])

    val recordPlayer = RecordPlayer()

    println("Album")
    recordPlayer.play(album)

    println("Single")
    recordPlayer.play(single)


}