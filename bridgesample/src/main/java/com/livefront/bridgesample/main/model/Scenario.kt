package com.livefront.bridgesample.main.model

import android.content.Context
import com.livefront.bridgesample.R
import com.livefront.bridgesample.scenario.activity.FragmentContainerActivity
import com.livefront.bridgesample.scenario.activity.LargeDataActivity
import com.livefront.bridgesample.scenario.activity.NonBridgeLargeDataActivity
import com.livefront.bridgesample.scenario.fragment.LargeDataFragment
import com.livefront.bridgesample.scenario.fragment.NonBridgeLargeDataFragment
import com.livefront.bridgesample.scenario.fragment.StatePagerArguments
import com.livefront.bridgesample.scenario.fragment.StatePagerFragment

/**
 * This is the list of all Bridge scenarios demonstrated in this app.
 */
fun getScenarios(context: Context): List<MainItem> = listOf(
        MainItem(
                R.string.large_data_scenario_title,
                R.string.large_data_scenario_description,
                LargeDataActivity.getNavigationIntent(context)
        ),
        MainItem(
                R.string.non_bridge_large_data_scenario_title,
                R.string.non_bridge_large_data_scenario_description,
                NonBridgeLargeDataActivity.getNavigationIntent(context)
        ),
        MainItem(
                R.string.large_data_fragment_scenario_title,
                R.string.large_data_fragment_scenario_description,
                FragmentContainerActivity.getNavigationIntent(
                        context,
                        LargeDataFragment.getFragmentData()
                )
        ),
        MainItem(
                R.string.non_bridge_large_data_fragment_scenario_title,
                R.string.non_bridge_large_data_fragment_scenario_description,
                FragmentContainerActivity.getNavigationIntent(
                        context,
                        NonBridgeLargeDataFragment.getFragmentData()
                )
        ),
        MainItem(
                R.string.state_pager_scenario_title,
                R.string.state_pager_scenario_description,
                FragmentContainerActivity.getNavigationIntent(
                        context,
                        StatePagerFragment.getFragmentData(
                                StatePagerArguments(
                                        StatePagerFragment.Mode.BRIDGE
                                )
                        )
                )
        ),
        MainItem(
                R.string.non_bridge_state_pager_scenario_title,
                R.string.non_bridge_state_pager_scenario_description,
                FragmentContainerActivity.getNavigationIntent(
                        context,
                        StatePagerFragment.getFragmentData(
                                StatePagerArguments(
                                        StatePagerFragment.Mode.NON_BRIDGE
                                )
                        )
                )
        )
)
