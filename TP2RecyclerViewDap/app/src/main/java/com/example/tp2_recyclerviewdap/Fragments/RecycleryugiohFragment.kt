package com.example.tp2_recyclerviewdap.Fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tp2_recyclerviewdap.R
import com.example.tp2_recyclerviewdap.adapter.yugiohAdapter
import com.example.tp2_recyclerviewdap.yugioh
import com.example.tp2_recyclerviewdap.yugiohProvider

class RecycleryugiohFragment : Fragment() {

    companion object {
        fun newInstance() = RecycleryugiohFragment()
    }

    private lateinit var viewModel: RecycleryugiohViewModel
    private lateinit var v : View
    private lateinit var recycleryugioh : RecyclerView
    private var repository = yugiohProvider()
    private lateinit var yugiohList: MutableList<yugioh>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return inflater.inflate(R.layout.fragment_recycleryugioh, container, false)
        v = inflater.inflate(R.layout.fragment_recycleryugioh, container, false)

        recycleryugioh = v.findViewById(R.id.recycleryugioh)
        return v
    }

    override fun onStart() {
        super.onStart()

        recycleryugioh.setHasFixedSize(true)

        recycleryugioh.layoutManager  = LinearLayoutManager(context)

                recycleryugioh.adapter = yugiohAdapter(yugiohProvider.yugiohList())


    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RecycleryugiohViewModel::class.java)
        // TODO: Use the ViewModel
    }



}