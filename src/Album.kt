class Album(val songs: List<Song>): Music {
    fun getSongsByArtist(artist: String): List<Song> {
        return songs.filter { it.artist == artist }
    }

    override fun getPlayingTime(): Double {
        var playTime = 0.0
        for(song in songs){
            playTime += song.playingTime
        }
        return playTime
    }

    override fun getAllSongs(): List<Song> {
        return songs
    }
}