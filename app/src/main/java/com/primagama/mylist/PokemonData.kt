package com.primagama.mylist

object PokemonData{
    var data = arrayOf(arrayOf("Bulbasaur", "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.",
        "https://assets.pokemon.com/assets/cms2/img/pokedex/full/001.png"))

    val listData: ArrayList<Pokemon>
        get() {
            val list = ArrayList<Pokemon>()
            for (aData in data) {
                val pokemon = Pokemon()
                pokemon.name = aData[0]
                pokemon.from = aData[1]
                pokemon.photo = aData[2]
                list.add(pokemon)
            }
            return list
        }
}