//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: U_1Min_2BV0_7c59f338 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2BV0_7c59f338", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_7c59f338(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.009144 )
		if( VIP <= 1.11742 )
			if( bbm <= 0.046305 )
				if( bbm <= 0.004855 )
					if( bearPower <= -0.016353 )
						if( VIM <= 1.84757 )
							if( VIM <= 1.28914 )
								if( VIP <= 0.869377 )
									ret := -0.350000
								if( VIP > 0.869377 )
									ret := 0.279070
							if( VIM > 1.28914 )
								if( VIP_VIM <= -0.339804 )
									ret := 0.423077
								if( VIP_VIM > -0.339804 )
									ret := 0.880000 // buy
						if( VIM > 1.84757 )
							if( VIP <= 0.84119 )
								if( VIP_VIM <= -1.40535 )
									ret := 0.000000
								if( VIP_VIM > -1.40535 )
									ret := 0.875000 // buy
							if( VIP > 0.84119 )
								if( bbm <= 0.003465 )
									ret := -0.300000
								if( bbm > 0.003465 )
									ret := 1.000000 // buy
					if( bearPower > -0.016353 )
						if( bearPower <= -0.010206 )
							if( VIM <= 1.64503 )
								if( bullPower <= -0.009688 )
									ret := 0.049180
								if( bullPower > -0.009688 )
									ret := -0.583333
							if( VIM > 1.64503 )
								if( VIM <= 1.74069 )
									ret := -1.000000 // sell
								if( VIM > 1.74069 )
									ret := -0.333333
						if( bearPower > -0.010206 )
							if( bearPower <= -0.009504 )
								ret := 0.800000 // buy
							if( bearPower > -0.009504 )
								ret := 0.250000
				if( bbm > 0.004855 )
					if( bbm <= 0.020381 )
						if( VIP <= 0.643642 )
							if( VIP_VIM <= -0.77843 )
								if( VIP <= 0.588252 )
									ret := 0.156098
								if( VIP > 0.588252 )
									ret := -0.110092
							if( VIP_VIM > -0.77843 )
								if( VIM <= 1.36218 )
									ret := 0.115385
								if( VIM > 1.36218 )
									ret := 0.469880
						if( VIP > 0.643642 )
							if( VIP <= 0.783729 )
								if( VIM <= 1.34648 )
									ret := -0.146825
								if( VIM > 1.34648 )
									ret := 0.072941
							if( VIP > 0.783729 )
								if( VIM <= 1.0337 )
									ret := -0.087407
								if( VIM > 1.0337 )
									ret := 0.012042
					if( bbm > 0.020381 )
						if( VIP_VIM <= 0.158136 )
							if( VIP_VIM <= 0.094429 )
								if( bbp <= -0.183436 )
									ret := -0.116959
								if( bbp > -0.183436 )
									ret := 0.048770
							if( VIP_VIM > 0.094429 )
								if( bbp <= -0.037997 )
									ret := 0.295775
								if( bbp > -0.037997 )
									ret := -0.239278
						if( VIP_VIM > 0.158136 )
							if( VIP_VIM <= 0.209598 )
								if( VIP_VIM <= 0.169288 )
									ret := 0.560440
								if( VIP_VIM > 0.169288 )
									ret := 0.278302
							if( VIP_VIM > 0.209598 )
								if( VIM <= 0.862675 )
									ret := 0.074074
								if( VIM > 0.862675 )
									ret := -0.314815
			if( bbm > 0.046305 )
				if( bbp <= 0.025997 )
					if( VIM <= 1.3685 )
						if( VIP_VIM <= -0.569967 )
							if( bbp <= -0.184915 )
								if( VIP_VIM <= -0.740782 )
									ret := 0.466667
								if( VIP_VIM > -0.740782 )
									ret := -0.336207
							if( bbp > -0.184915 )
								if( VIP <= 0.648426 )
									ret := 0.392157
								if( VIP > 0.648426 )
									ret := -0.008000
						if( VIP_VIM > -0.569967 )
							if( bbm <= 0.479101 )
								if( VIP_VIM <= -0.235433 )
									ret := 0.165640
								if( VIP_VIM > -0.235433 )
									ret := 0.069602
							if( bbm > 0.479101 )
								if( bbm <= 0.982292 )
									ret := -1.000000 // sell
								if( bbm > 0.982292 )
									ret := -0.250000
					if( VIM > 1.3685 )
						if( bearPower <= -0.260135 )
							if( bullPower <= -0.022992 )
								if( bearPower <= -0.284348 )
									ret := -0.101852
								if( bearPower > -0.284348 )
									ret := -0.724138 // sell
							if( bullPower > -0.022992 )
								ret := 1.000000 // buy
						if( bearPower > -0.260135 )
							if( bearPower <= -0.137971 )
								if( VIP_VIM <= -1.22108 )
									ret := -0.647059
								if( VIP_VIM > -1.22108 )
									ret := 0.555332
							if( bearPower > -0.137971 )
								if( bbp <= -0.164144 )
									ret := -0.191667
								if( bbp > -0.164144 )
									ret := 0.330233
				if( bbp > 0.025997 )
					if( bullPower <= 0.130388 )
						if( VIM <= 0.75395 )
							if( VIM <= 0.713692 )
								ret := -0.600000
							if( VIM > 0.713692 )
								ret := -1.000000 // sell
						if( VIM > 0.75395 )
							if( VIP <= 1.00301 )
								if( bearPower <= -0.027121 )
									ret := 0.000000
								if( bearPower > -0.027121 )
									ret := -0.424779
							if( VIP > 1.00301 )
								if( bullPower <= 0.080024 )
									ret := 0.109756
								if( bullPower > 0.080024 )
									ret := -0.363636
					if( bullPower > 0.130388 )
						if( VIP_VIM <= 0.198482 )
							if( bullPower <= 0.491043 )
								if( bbm <= 0.20515 )
									ret := 0.357143
								if( bbm > 0.20515 )
									ret := 0.870968 // buy
							if( bullPower > 0.491043 )
								ret := -0.600000
						if( VIP_VIM > 0.198482 )
							if( bearPower <= -0.028452 )
								if( VIM <= 0.493311 )
									ret := 0.750000 // buy
								if( VIM > 0.493311 )
									ret := -0.684211
							if( bearPower > -0.028452 )
								if( bbp <= 0.13178 )
									ret := 1.000000 // buy
								if( bbp > 0.13178 )
									ret := 0.200000
		if( VIP > 1.11742 )
			if( bbm <= 0.009889 )
				if( bearPower <= -0.033326 )
					if( VIM <= 1.42659 )
						if( VIP <= 1.23596 )
							if( bullPower <= -0.044978 )
								if( VIP_VIM <= -0.077003 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.077003 )
									ret := -0.250000
							if( bullPower > -0.044978 )
								if( bearPower <= -0.043987 )
									ret := 0.000000
								if( bearPower > -0.043987 )
									ret := -0.500000
						if( VIP > 1.23596 )
							if( bbp <= -0.066981 )
								if( bearPower <= -0.05954 )
									ret := 0.971429 // buy
								if( bearPower > -0.05954 )
									ret := 0.712329 // buy
							if( bbp > -0.066981 )
								ret := -0.250000
					if( VIM > 1.42659 )
						if( VIP_VIM <= -0.403961 )
							if( VIP_VIM <= -1.97364 )
								if( VIM <= 28.8767 )
									ret := 0.333333
								if( VIM > 28.8767 )
									ret := -0.466667
							if( VIP_VIM > -1.97364 )
								if( bearPower <= -0.053569 )
									ret := 0.655844
								if( bearPower > -0.053569 )
									ret := 0.488565
						if( VIP_VIM > -0.403961 )
							if( bullPower <= -0.058545 )
								if( VIM <= 2.41245 )
									ret := 0.576471
								if( VIM > 2.41245 )
									ret := -0.079812
							if( bullPower > -0.058545 )
								if( VIP <= 1.2617 )
									ret := -0.888889 // sell
								if( VIP > 1.2617 )
									ret := 0.433239
				if( bearPower > -0.033326 )
					if( VIP_VIM <= 1.03589 )
						if( bbm <= 0.002753 )
							if( VIM <= 10.2002 )
								if( VIP_VIM <= -1.67503 )
									ret := 0.556962
								if( VIP_VIM > -1.67503 )
									ret := 0.197588
							if( VIM > 10.2002 )
								if( bbp <= -0.057384 )
									ret := 0.793651 // buy
								if( bbp > -0.057384 )
									ret := 0.356923
						if( bbm > 0.002753 )
							if( VIP_VIM <= -1.17092 )
								if( bbm <= 0.008611 )
									ret := 1.000000 // buy
								if( bbm > 0.008611 )
									ret := 0.750000 // buy
							if( VIP_VIM > -1.17092 )
								if( VIP <= 21.3019 )
									ret := 0.381295
								if( VIP > 21.3019 )
									ret := -0.500000
					if( VIP_VIM > 1.03589 )
						if( VIP_VIM <= 1.72341 )
							if( VIP <= 3.21264 )
								if( VIM <= 1.26847 )
									ret := 0.500000
								if( VIM > 1.26847 )
									ret := -0.222222
							if( VIP > 3.21264 )
								if( VIP_VIM <= 1.17622 )
									ret := 0.933333 // buy
								if( VIP_VIM > 1.17622 )
									ret := 0.596154
						if( VIP_VIM > 1.72341 )
							if( bearPower <= -0.020026 )
								if( VIP_VIM <= 2.23548 )
									ret := 0.681818
								if( VIP_VIM > 2.23548 )
									ret := -0.222222
							if( bearPower > -0.020026 )
								if( VIP_VIM <= 1.81879 )
									ret := -0.750000 // sell
								if( VIP_VIM > 1.81879 )
									ret := 0.028571
			if( bbm > 0.009889 )
				if( bullPower <= 0.00621 )
					if( VIP <= 3.7017 )
						if( bearPower <= -0.167526 )
							if( bbp <= -0.227687 )
								if( bbm <= 0.066255 )
									ret := 0.885714 // buy
								if( bbm > 0.066255 )
									ret := 0.487805
							if( bbp > -0.227687 )
								ret := -0.500000
						if( bearPower > -0.167526 )
							if( VIM <= 1.03664 )
								if( VIM <= 0.831761 )
									ret := -0.030769
								if( VIM > 0.831761 )
									ret := 0.365306
							if( VIM > 1.03664 )
								if( VIM <= 3.66833 )
									ret := 0.093840
								if( VIM > 3.66833 )
									ret := 0.461538
					if( VIP > 3.7017 )
						if( VIP_VIM <= -0.053648 )
							if( bbm <= 0.010613 )
								if( VIM <= 6.7198 )
									ret := 0.450000
								if( VIM > 6.7198 )
									ret := 0.100000
							if( bbm > 0.010613 )
								if( VIP_VIM <= -1.11453 )
									ret := 0.050000
								if( VIP_VIM > -1.11453 )
									ret := 0.668421
						if( VIP_VIM > -0.053648 )
							if( VIM <= 4.46923 )
								if( VIP_VIM <= 0.242319 )
									ret := -0.615385
								if( VIP_VIM > 0.242319 )
									ret := 0.604167
							if( VIM > 4.46923 )
								if( VIP <= 4.69284 )
									ret := -0.833333 // sell
								if( VIP > 4.69284 )
									ret := 0.120482
				if( bullPower > 0.00621 )
					if( bearPower <= -0.046668 )
						if( VIP <= 1.1744 )
							if( bullPower <= 0.027576 )
								if( VIP <= 1.15524 )
									ret := 0.500000
								if( VIP > 1.15524 )
									ret := -0.333333
							if( bullPower > 0.027576 )
								if( bbp <= -0.051222 )
									ret := -1.000000 // sell
								if( bbp > -0.051222 )
									ret := -0.555556
						if( VIP > 1.1744 )
							if( VIP_VIM <= -0.102995 )
								if( bearPower <= -0.103036 )
									ret := 0.750000 // buy
								if( bearPower > -0.103036 )
									ret := 0.136364
							if( VIP_VIM > -0.102995 )
								if( VIP_VIM <= 0.309546 )
									ret := -0.423423
								if( VIP_VIM > 0.309546 )
									ret := 0.310811
					if( bearPower > -0.046668 )
						if( VIP <= 1.16485 )
							if( bullPower <= 0.008621 )
								if( bbp <= -0.014871 )
									ret := 0.153846
								if( bbp > -0.014871 )
									ret := -0.297297
							if( bullPower > 0.008621 )
								if( bullPower <= 0.022674 )
									ret := 0.415584
								if( bullPower > 0.022674 )
									ret := 0.137536
						if( VIP > 1.16485 )
							if( bbm <= 0.049468 )
								if( VIP <= 1.17466 )
									ret := -0.344828
								if( VIP > 1.17466 )
									ret := -0.023857
							if( bbm > 0.049468 )
								if( VIP <= 1.2773 )
									ret := 0.226923
								if( VIP > 1.2773 )
									ret := 0.012690
	if( bearPower > -0.009144 )
		if( VIP <= 1.65319 )
			if( VIP_VIM <= 0.559416 )
				if( VIM <= 0.999982 )
					if( bearPower <= 0.002136 )
						if( VIM <= 0.973819 )
							if( VIP <= 1.38056 )
								if( VIP <= 1.15651 )
									ret := -0.060185
								if( VIP > 1.15651 )
									ret := 0.054232
							if( VIP > 1.38056 )
								if( bbp <= 0.024701 )
									ret := -0.250000
								if( bbp > 0.024701 )
									ret := -0.941176 // sell
						if( VIM > 0.973819 )
							if( VIP_VIM <= 0.103616 )
								if( bullPower <= 0.006633 )
									ret := -0.147541
								if( bullPower > 0.006633 )
									ret := 0.231132
							if( VIP_VIM > 0.103616 )
								if( VIP <= 1.08981 )
									ret := -0.666667
								if( VIP > 1.08981 )
									ret := -0.058140
					if( bearPower > 0.002136 )
						if( bullPower <= 0.412633 )
							if( VIP_VIM <= 0.546481 )
								if( bbp <= 0.408473 )
									ret := 0.062384
								if( bbp > 0.408473 )
									ret := -0.511111
							if( VIP_VIM > 0.546481 )
								if( bbm <= 0.024349 )
									ret := -0.344828
								if( bbm > 0.024349 )
									ret := -0.051136
						if( bullPower > 0.412633 )
							if( VIM <= 0.755033 )
								ret := 1.000000 // buy
							if( VIM > 0.755033 )
								ret := 0.800000 // buy
				if( VIM > 0.999982 )
					if( bullPower <= 0.031992 )
						if( VIM <= 1.0001 )
							if( bullPower <= -0.003722 )
								ret := 0.666667
							if( bullPower > -0.003722 )
								if( bearPower <= -0.004961 )
									ret := -0.261682
								if( bearPower > -0.004961 )
									ret := -0.042071
						if( VIM > 1.0001 )
							if( VIP <= 0.841367 )
								if( bbm <= 0.025786 )
									ret := 0.170940
								if( bbm > 0.025786 )
									ret := 0.866667 // buy
							if( VIP > 0.841367 )
								if( bbp <= 0.017635 )
									ret := -0.003107
								if( bbp > 0.017635 )
									ret := 0.059848
					if( bullPower > 0.031992 )
						if( VIP_VIM <= -0.003372 )
							if( bbm <= 0.039888 )
								if( VIM <= 1.00002 )
									ret := 0.470588
								if( VIM > 1.00002 )
									ret := -0.330275
							if( bbm > 0.039888 )
								if( bullPower <= 0.05784 )
									ret := 0.045283
								if( bullPower > 0.05784 )
									ret := -0.250000
						if( VIP_VIM > -0.003372 )
							if( VIM <= 1.0778 )
								if( VIP_VIM <= 0.06859 )
									ret := -0.077551
								if( VIP_VIM > 0.06859 )
									ret := 0.293860
							if( VIM > 1.0778 )
								if( VIP_VIM <= 0.051705 )
									ret := 0.187500
								if( VIP_VIM > 0.051705 )
									ret := -0.295019
			if( VIP_VIM > 0.559416 )
				if( bearPower <= 0.022527 )
					if( VIP <= 1.26942 )
						if( bbm <= 0.030163 )
							if( bbm <= 0.029381 )
								if( bbm <= 0.0255 )
									ret := 0.076923
								if( bbm > 0.0255 )
									ret := 1.000000 // buy
							if( bbm > 0.029381 )
								ret := -0.428571
						if( bbm > 0.030163 )
							if( bearPower <= 0.018908 )
								if( VIM <= 0.687663 )
									ret := 0.470588
								if( VIM > 0.687663 )
									ret := 0.923077 // buy
							if( bearPower > 0.018908 )
								ret := -0.750000 // sell
					if( VIP > 1.26942 )
						if( bullPower <= 0.109178 )
							if( bullPower <= 0.066232 )
								if( bullPower <= 0.052464 )
									ret := -0.039906
								if( bullPower > 0.052464 )
									ret := -0.448276
							if( bullPower > 0.066232 )
								if( VIM <= 0.712529 )
									ret := 0.302326
								if( VIM > 0.712529 )
									ret := 0.958333 // buy
						if( bullPower > 0.109178 )
							if( bullPower <= 0.184772 )
								ret := -1.000000 // sell
							if( bullPower > 0.184772 )
								ret := 0.600000
				if( bearPower > 0.022527 )
					if( VIP_VIM <= 1.17831 )
						if( VIM <= 0.577614 )
							if( bearPower <= 0.187054 )
								if( VIP <= 1.58415 )
									ret := 0.062958
								if( VIP > 1.58415 )
									ret := -0.617647
							if( bearPower > 0.187054 )
								if( VIM <= 0.545373 )
									ret := 0.721519 // buy
								if( VIM > 0.545373 )
									ret := -0.277778
						if( VIM > 0.577614 )
							if( bbp <= 0.312895 )
								if( bbp <= 0.278786 )
									ret := 0.216561
								if( bbp > 0.278786 )
									ret := 0.619469
							if( bbp > 0.312895 )
								if( bbm <= 0.165498 )
									ret := -0.123506
								if( bbm > 0.165498 )
									ret := 0.475410
					if( VIP_VIM > 1.17831 )
						if( bbm <= 0.05 )
							if( bbp <= 0.173955 )
								if( VIM <= 0.391646 )
									ret := -0.750000 // sell
								if( VIM > 0.391646 )
									ret := 0.625000
							if( bbp > 0.173955 )
								if( bbm <= 0.034878 )
									ret := 0.961538 // buy
								if( bbm > 0.034878 )
									ret := 0.615385
						if( bbm > 0.05 )
							if( VIP_VIM <= 1.21833 )
								ret := -0.250000
							if( VIP_VIM > 1.21833 )
								ret := -0.500000
		if( VIP > 1.65319 )
			if( bbp <= 0.026853 )
				if( bullPower <= 0.00188 )
					if( VIP <= 26.815 )
						if( VIP_VIM <= 0.275424 )
							if( bearPower <= -0.00901 )
								if( bullPower <= -0.008068 )
									ret := -0.500000
								if( bullPower > -0.008068 )
									ret := -1.000000 // sell
							if( bearPower > -0.00901 )
								if( VIP <= 7.225 )
									ret := 0.055046
								if( VIP > 7.225 )
									ret := -0.115152
						if( VIP_VIM > 0.275424 )
							if( VIM <= 1.18236 )
								if( bearPower <= -0.001851 )
									ret := -0.615385
								if( bearPower > -0.001851 )
									ret := 0.000000
							if( VIM > 1.18236 )
								if( VIP_VIM <= 0.329633 )
									ret := 0.447368
								if( VIP_VIM > 0.329633 )
									ret := 0.121032
					if( VIP > 26.815 )
						if( VIP_VIM <= 1.95238 )
							if( VIP <= 76.1871 )
								if( VIP_VIM <= -1.36708 )
									ret := 0.000000
								if( VIP_VIM > -1.36708 )
									ret := 0.731707 // buy
							if( VIP > 76.1871 )
								if( VIP <= 1164.31 )
									ret := 0.294118
								if( VIP > 1164.31 )
									ret := 0.000000
						if( VIP_VIM > 1.95238 )
							if( VIP_VIM <= 3.75496 )
								ret := 0.000000
							if( VIP_VIM > 3.75496 )
								ret := -0.500000
				if( bullPower > 0.00188 )
					if( VIP_VIM <= 0.205025 )
						if( VIP <= 1.76265 )
							if( bullPower <= 0.021354 )
								if( bullPower <= 0.01259 )
									ret := 0.325581
								if( bullPower > 0.01259 )
									ret := 0.807692 // buy
							if( bullPower > 0.021354 )
								if( bullPower <= 0.023484 )
									ret := -1.000000 // sell
								if( bullPower > 0.023484 )
									ret := 0.000000
						if( VIP > 1.76265 )
							if( VIP <= 1.90424 )
								if( VIM <= 2.20856 )
									ret := -0.424242
								if( VIM > 2.20856 )
									ret := 0.100000
							if( VIP > 1.90424 )
								if( VIP_VIM <= -1.81095 )
									ret := -0.261538
								if( VIP_VIM > -1.81095 )
									ret := 0.008212
					if( VIP_VIM > 0.205025 )
						if( VIP <= 1.72904 )
							if( bbm <= 0.001315 )
								if( VIP_VIM <= 0.598052 )
									ret := -0.500000
								if( VIP_VIM > 0.598052 )
									ret := 0.250000
							if( bbm > 0.001315 )
								if( bbp <= 0.021508 )
									ret := -1.000000 // sell
								if( bbp > 0.021508 )
									ret := -0.500000
						if( VIP > 1.72904 )
							if( VIM <= 1.5858 )
								if( bbp <= 0.000604 )
									ret := -0.777778 // sell
								if( bbp > 0.000604 )
									ret := 0.139073
							if( VIM > 1.5858 )
								if( VIM <= 1.63762 )
									ret := -0.681818
								if( VIM > 1.63762 )
									ret := -0.109276
			if( bbp > 0.026853 )
				if( VIP <= 2.70378 )
					if( bbp <= 0.284266 )
						if( VIP_VIM <= -1.31665 )
							if( VIM <= 3.40619 )
								ret := 1.000000 // buy
							if( VIM > 3.40619 )
								ret := -0.142857
						if( VIP_VIM > -1.31665 )
							if( VIP <= 2.43214 )
								if( VIP_VIM <= -0.429979 )
									ret := -0.561151
								if( VIP_VIM > -0.429979 )
									ret := -0.143369
							if( VIP > 2.43214 )
								if( bbm <= 0.032103 )
									ret := 0.203857
								if( bbm > 0.032103 )
									ret := -0.360000
					if( bbp > 0.284266 )
						if( VIP_VIM <= 0.409027 )
							ret := 0.666667
						if( VIP_VIM > 0.409027 )
							if( bullPower <= 0.286679 )
								if( VIP_VIM <= 1.41375 )
									ret := -0.840000 // sell
								if( VIP_VIM > 1.41375 )
									ret := 0.000000
							if( bullPower > 0.286679 )
								if( bullPower <= 0.322084 )
									ret := 0.500000
								if( bullPower > 0.322084 )
									ret := -0.777778 // sell
				if( VIP > 2.70378 )
					if( VIM <= 1.862 )
						if( bbp <= 0.32771 )
							if( VIP <= 2.98694 )
								if( VIP_VIM <= 1.15806 )
									ret := 0.071429
								if( VIP_VIM > 1.15806 )
									ret := -0.724138 // sell
							if( VIP > 2.98694 )
								if( bbp <= 0.125963 )
									ret := 0.051282
								if( bbp > 0.125963 )
									ret := 0.804878 // buy
						if( bbp > 0.32771 )
							if( VIP <= 2.90165 )
								ret := -1.000000 // sell
							if( VIP > 2.90165 )
								ret := -0.600000
					if( VIM > 1.862 )
						if( VIP <= 3.29213 )
							if( bbp <= 0.07598 )
								if( VIM <= 3.31855 )
									ret := -0.173745
								if( VIM > 3.31855 )
									ret := -0.505376
							if( bbp > 0.07598 )
								if( VIP <= 2.96757 )
									ret := -0.597826
								if( VIP > 2.96757 )
									ret := -0.775194 // sell
						if( VIP > 3.29213 )
							if( bbm <= 0.004763 )
								if( VIP_VIM <= 1.15496 )
									ret := -0.305540
								if( VIP_VIM > 1.15496 )
									ret := -0.126087
							if( bbm > 0.004763 )
								if( bearPower <= -0.00111 )
									ret := 0.423077
								if( bearPower > -0.00111 )
									ret := -0.118263
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_U_1Min_7c59f338(bbp, bullPower, BBPower_Color, bearPower, bbm, VIP, VIP_VIM, VIM)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


