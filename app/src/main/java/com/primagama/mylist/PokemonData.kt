package com.primagama.mylist

object PokemonData{
    fun getListData(): Collection<Pokemon> {
        return listData
    }


    private var data = arrayOf(
        arrayOf("Bulbasaur", "Bulbasaur can be seen napping in bright sunlight. There is a seed on its back. By soaking up the sun's rays, the seed grows progressively larger.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/001.png"),
        arrayOf("Charmander", "The flame that burns at the tip of its tail is an indication of its emotions. The flame wavers when Charmander is enjoying itself. If the Pokémon becomes enraged, the flame burns fiercely.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/004.png"),
        arrayOf("Squirtle", "Squirtle's shell is not merely used for protection. The shell's rounded shape and the grooves on its surface help minimize resistance in water, enabling this Pokémon to swim at high speeds.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/007.png"),
        arrayOf("Caterpie", "Caterpie has a voracious appetite. It can devour leaves bigger than its body right before your eyes. From its antenna, this Pokémon releases a terrifically strong odor.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/010.png"),
        arrayOf("Weedle", "Weedle has an extremely acute sense of smell. It is capable of distinguishing its favorite kinds of leaves from those it dislikes just by sniffing with its big red proboscis (nose).",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/013.png"),

        arrayOf("Pidgey", "Pidgey has an extremely sharp sense of direction. It is capable of unerringly returning home to its nest, however far it may be removed from its familiar surroundings.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/016.png"),
        arrayOf("Rattata", "Rattata is cautious in the extreme. Even while it is asleep, it constantly listens by moving its ears around. It is not picky about where it lives—it will make its nest anywhere.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/019.png"),
        arrayOf("Spearow", "Spearow has a very loud cry that can be heard over half a mile away. If its high, keening cry is heard echoing all around, it is a sign that they are warning each other of danger.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/021.png"),
        arrayOf("Ekans", "Ekans curls itself up in a spiral while it rests. Assuming this position allows it to quickly respond to a threat from any direction with a glare from its upraised head.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/023.png"),
        arrayOf("Pikachu", "Whenever Pikachu comes across something new, it blasts it with a jolt of electricity. If you come across a blackened berry, it's evidence that this Pokémon mistook the intensity of its charge.",
            "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/025.png")
        )

    private val listData: ArrayList<Pokemon>
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