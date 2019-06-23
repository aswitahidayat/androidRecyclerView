package com.primagama.mylist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var rvCategory: RecyclerView
    private var list: ArrayList<Pokemon> = arrayListOf()
    private var title: String = "Mode List"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCategory = findViewById(R.id.rv_category)
        rvCategory.setHasFixedSize(true)

        list.addAll(PokemonData.getListData())
        showRecyclerList()

        setActionBarTitle(title)
    }

    private fun showRecyclerList() {
        rvCategory.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListHeroAdapter(list)
        rvCategory.adapter = listHeroAdapter
        listHeroAdapter.onItemClickListener = { hero ->
            showSelectedPresident(hero)
        }
    }

    private fun showRecyclerGrid() {
        rvCategory.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridHeroAdapter(list)
        rvCategory.adapter = gridHeroAdapter
        gridHeroAdapter.onItemClickListener = { hero ->
            showSelectedPresident(hero)
        }
    }

    private fun showRecyclerCardView() {
        rvCategory.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewHeroAdapter(list)
        rvCategory.adapter = cardViewHeroAdapter
        cardViewHeroAdapter.onItemClickListener = { hero ->
            showSelectedPresident(hero)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            supportActionBar?.title= title
        }
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
                setActionBarTitle( "Mode List")
            }
            R.id.action_grid -> {
                showRecyclerGrid()
                setActionBarTitle("Mode Grid")
            }
            R.id.action_cardview -> {
                showRecyclerCardView()
                setActionBarTitle("Mode CardView")
            }
        }
    }

    private fun showSelectedPresident(hero: Pokemon) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }
}
