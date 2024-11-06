//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: LTCUSDT_15Min_2BV0_ad84be9a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_2BV0_ad84be9a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_ad84be9a(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.943508 )
		if( bbm <= 1.19257 )
			if( bullPower <= -0.532035 )
				if( bearPower <= -0.991382 )
					if( VIM <= 1.26303 )
						if( bbp <= -1.92273 )
							if( bbp <= -2.28279 )
								if( VIP_VIM <= -0.395905 )
									ret := 0.323370
								if( VIP_VIM > -0.395905 )
									ret := -0.055866
							if( bbp > -2.28279 )
								if( VIP_VIM <= -0.079688 )
									ret := 0.577007
								if( VIP_VIM > -0.079688 )
									ret := -0.750000 // sell
						if( bbp > -1.92273 )
							if( VIM <= 1.24427 )
								if( bearPower <= -1.12501 )
									ret := -0.070093
								if( bearPower > -1.12501 )
									ret := 0.261905
							if( VIM > 1.24427 )
								if( bearPower <= -1.2016 )
									ret := 0.000000
								if( bearPower > -1.2016 )
									ret := 0.724138 // buy
					if( VIM > 1.26303 )
						if( bullPower <= -1.13392 )
							if( bearPower <= -2.23305 )
								if( bearPower <= -2.35939 )
									ret := 0.195489
								if( bearPower > -2.35939 )
									ret := -0.571429
							if( bearPower > -2.23305 )
								if( bullPower <= -1.20904 )
									ret := 0.369427
								if( bullPower > -1.20904 )
									ret := 0.746667 // buy
						if( bullPower > -1.13392 )
							if( bullPower <= -1.04503 )
								if( bearPower <= -2.19774 )
									ret := 0.750000 // buy
								if( bearPower > -2.19774 )
									ret := -0.487500
							if( bullPower > -1.04503 )
								if( bbm <= 1.08568 )
									ret := 0.098143
								if( bbm > 1.08568 )
									ret := 0.857143 // buy
				if( bearPower > -0.991382 )
					if( bullPower <= -0.537598 )
						if( VIM <= 1.24199 )
							if( bullPower <= -0.656052 )
								if( VIP <= 0.793802 )
									ret := 1.000000 // buy
								if( VIP > 0.793802 )
									ret := 0.500000
							if( bullPower > -0.656052 )
								if( VIM <= 1.17194 )
									ret := 0.590909
								if( VIM > 1.17194 )
									ret := -0.209302
						if( VIM > 1.24199 )
							if( bbm <= 0.290796 )
								if( bullPower <= -0.614142 )
									ret := 0.655172
								if( bullPower > -0.614142 )
									ret := 0.145833
							if( bbm > 0.290796 )
								if( bbm <= 0.398236 )
									ret := 0.785714 // buy
								if( bbm > 0.398236 )
									ret := 0.388889
					if( bullPower > -0.537598 )
						if( VIP <= 0.809099 )
							if( VIM <= 1.2689 )
								if( bbm <= 0.291048 )
									ret := 0.750000 // buy
								if( bbm > 0.291048 )
									ret := 1.000000 // buy
							if( VIM > 1.2689 )
								ret := 0.500000
						if( VIP > 0.809099 )
							ret := 0.500000
			if( bullPower > -0.532035 )
				if( bbp <= -1.96199 )
					if( bbm <= 1.1546 )
						if( bbm <= 0.945569 )
							ret := 0.250000
						if( bbm > 0.945569 )
							if( VIM <= 1.12084 )
								if( VIM <= 1.08839 )
									ret := -0.750000 // sell
								if( VIM > 1.08839 )
									ret := 0.400000
							if( VIM > 1.12084 )
								if( VIM <= 1.21117 )
									ret := -0.975000 // sell
								if( VIM > 1.21117 )
									ret := -0.333333
					if( bbm > 1.1546 )
						if( VIM <= 1.12483 )
							ret := 0.500000
						if( VIM > 1.12483 )
							ret := 1.000000 // buy
				if( bbp > -1.96199 )
					if( VIP_VIM <= -0.561932 )
						if( VIP_VIM <= -0.681279 )
							if( VIM <= 1.3036 )
								if( bullPower <= -0.419476 )
									ret := -1.000000 // sell
								if( bullPower > -0.419476 )
									ret := -0.250000
							if( VIM > 1.3036 )
								if( VIP_VIM <= -0.707032 )
									ret := 0.225806
								if( VIP_VIM > -0.707032 )
									ret := 0.657895
						if( VIP_VIM > -0.681279 )
							if( VIP <= 0.622178 )
								if( bbp <= -1.69058 )
									ret := -0.923077 // sell
								if( bbp > -1.69058 )
									ret := -0.363636
							if( VIP > 0.622178 )
								if( bbm <= 0.783507 )
									ret := -0.076132
								if( bbm > 0.783507 )
									ret := 0.346154
					if( VIP_VIM > -0.561932 )
						if( VIP_VIM <= -0.367552 )
							if( bullPower <= -0.002035 )
								if( VIP_VIM <= -0.471099 )
									ret := 0.157062
								if( VIP_VIM > -0.471099 )
									ret := 0.312417
							if( bullPower > -0.002035 )
								if( VIP <= 0.73898 )
									ret := -0.500000
								if( VIP > 0.73898 )
									ret := -1.000000 // sell
						if( VIP_VIM > -0.367552 )
							if( bearPower <= -0.728204 )
								if( VIM <= 1.1361 )
									ret := 0.121798
								if( VIM > 1.1361 )
									ret := 0.255056
							if( bearPower > -0.728204 )
								if( VIM <= 1.06948 )
									ret := 0.454545
								if( VIM > 1.06948 )
									ret := -0.169139
		if( bbm > 1.19257 )
			if( VIM <= 1.17492 )
				if( VIP_VIM <= -0.268575 )
					if( bbp <= -3.12992 )
						if( VIP_VIM <= -0.325359 )
							if( VIM <= 1.10686 )
								if( VIM <= 1.0366 )
									ret := 0.923077 // buy
								if( VIM > 1.0366 )
									ret := 0.250000
							if( VIM > 1.10686 )
								if( bbp <= -4.46391 )
									ret := 0.950000 // buy
								if( bbp > -4.46391 )
									ret := 0.763889 // buy
						if( VIP_VIM > -0.325359 )
							if( VIP <= 0.818621 )
								if( bbp <= -4.34555 )
									ret := 0.000000
								if( bbp > -4.34555 )
									ret := -1.000000 // sell
							if( VIP > 0.818621 )
								if( VIP <= 0.832922 )
									ret := 1.000000 // buy
								if( VIP > 0.832922 )
									ret := 0.500000
					if( bbp > -3.12992 )
						if( bbm <= 2.79137 )
							if( bbp <= -2.98281 )
								if( VIM <= 1.13716 )
									ret := -1.000000 // sell
								if( VIM > 1.13716 )
									ret := 0.600000
							if( bbp > -2.98281 )
								if( bearPower <= -1.58201 )
									ret := 0.591065
								if( bearPower > -1.58201 )
									ret := 0.387640
						if( bbm > 2.79137 )
							ret := -0.714286 // sell
				if( VIP_VIM > -0.268575 )
					if( bbp <= -1.23059 )
						if( bbp <= -1.31743 )
							if( VIM <= 1.01385 )
								if( bullPower <= 1.12781 )
									ret := 0.606383
								if( bullPower > 1.12781 )
									ret := -1.000000 // sell
							if( VIM > 1.01385 )
								if( bbm <= 1.29629 )
									ret := 0.500000
								if( bbm > 1.29629 )
									ret := 0.015707
						if( bbp > -1.31743 )
							if( bearPower <= -1.36957 )
								if( bearPower <= -1.53818 )
									ret := -0.550000
								if( bearPower > -1.53818 )
									ret := 0.416667
							if( bearPower > -1.36957 )
								if( bbp <= -1.27968 )
									ret := -1.000000 // sell
								if( bbp > -1.27968 )
									ret := -0.363636
					if( bbp > -1.23059 )
						if( bbp <= -0.989672 )
							if( VIP_VIM <= 0.114056 )
								if( bullPower <= 0.597042 )
									ret := 0.757282 // buy
								if( bullPower > 0.597042 )
									ret := -0.250000
							if( VIP_VIM > 0.114056 )
								ret := -0.200000
						if( bbp > -0.989672 )
							if( VIM <= 1.0043 )
								ret := 0.285714
							if( VIM > 1.0043 )
								ret := -0.750000 // sell
			if( VIM > 1.17492 )
				if( bullPower <= -0.313487 )
					if( bearPower <= -2.09517 )
						if( bbp <= -3.68587 )
							if( VIP_VIM <= -0.593253 )
								if( VIP <= 0.677438 )
									ret := 0.238636
								if( VIP > 0.677438 )
									ret := -0.916667 // sell
							if( VIP_VIM > -0.593253 )
								if( bbm <= 1.25538 )
									ret := -0.833333 // sell
								if( bbm > 1.25538 )
									ret := 0.503597
						if( bbp > -3.68587 )
							if( bearPower <= -2.49057 )
								if( bbm <= 1.98974 )
									ret := -0.794872 // sell
								if( bbm > 1.98974 )
									ret := 0.259259
							if( bearPower > -2.49057 )
								if( bearPower <= -2.18008 )
									ret := 0.452632
								if( bearPower > -2.18008 )
									ret := -0.545455
					if( bearPower > -2.09517 )
						if( bbp <= -2.23578 )
							if( bbm <= 1.26189 )
								if( bearPower <= -1.96022 )
									ret := -0.250000
								if( bearPower > -1.96022 )
									ret := 0.700000 // buy
							if( bbm > 1.26189 )
								if( bbm <= 1.42313 )
									ret := 0.931818 // buy
								if( bbm > 1.42313 )
									ret := 0.541667
						if( bbp > -2.23578 )
							if( bullPower <= -0.386235 )
								if( VIP_VIM <= -0.565621 )
									ret := 0.666667
								if( VIP_VIM > -0.565621 )
									ret := -0.333333
							if( bullPower > -0.386235 )
								if( VIM <= 1.21366 )
									ret := 0.600000
								if( VIM > 1.21366 )
									ret := 1.000000 // buy
				if( bullPower > -0.313487 )
					if( bullPower <= -0.053712 )
						if( bbm <= 1.22797 )
							ret := -1.000000 // sell
						if( bbm > 1.22797 )
							if( bearPower <= -1.85219 )
								if( bbp <= -2.68337 )
									ret := 0.600000
								if( bbp > -2.68337 )
									ret := -0.923077 // sell
							if( bearPower > -1.85219 )
								if( VIP_VIM <= -0.440279 )
									ret := 0.130435
								if( VIP_VIM > -0.440279 )
									ret := 0.727273 // buy
					if( bullPower > -0.053712 )
						if( bbp <= -1.25729 )
							if( VIM <= 1.19378 )
								ret := -0.750000 // sell
							if( VIM > 1.19378 )
								ret := -1.000000 // sell
						if( bbp > -1.25729 )
							ret := -0.400000
	if( bbp > -0.943508 )
		if( bearPower <= -0.234098 )
			if( VIP_VIM <= 0.309335 )
				if( bbp <= 0.227227 )
					if( bbm <= 0.21048 )
						if( bearPower <= -0.400617 )
							if( bbp <= -0.66147 )
								if( VIP_VIM <= -0.836757 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.836757 )
									ret := 0.027778
							if( bbp > -0.66147 )
								if( VIP_VIM <= -0.078605 )
									ret := 0.293478
								if( VIP_VIM > -0.078605 )
									ret := 0.928571 // buy
						if( bearPower > -0.400617 )
							if( VIP <= 0.742302 )
								if( bbm <= 0.160666 )
									ret := -0.036145
								if( bbm > 0.160666 )
									ret := -0.422680
							if( VIP > 0.742302 )
								if( bbp <= -0.41623 )
									ret := -0.057283
								if( bbp > -0.41623 )
									ret := 0.047411
					if( bbm > 0.21048 )
						if( bearPower <= -1.04624 )
							if( bbm <= 1.39 )
								if( bbp <= -0.919396 )
									ret := 0.000000
								if( bbp > -0.919396 )
									ret := -0.837838 // sell
							if( bbm > 1.39 )
								if( VIM <= 0.959594 )
									ret := -0.263158
								if( VIM > 0.959594 )
									ret := 0.150943
						if( bearPower > -1.04624 )
							if( bbm <= 1.40006 )
								if( bbm <= 0.217145 )
									ret := 0.383333
								if( bbm > 0.217145 )
									ret := 0.087367
							if( bbm > 1.40006 )
								if( VIM <= 0.867203 )
									ret := -0.500000
								if( VIM > 0.867203 )
									ret := 0.561983
				if( bbp > 0.227227 )
					if( bearPower <= -0.716207 )
						if( bullPower <= 1.42483 )
							if( bullPower <= 1.22686 )
								if( bearPower <= -0.780708 )
									ret := 0.250000
								if( bearPower > -0.780708 )
									ret := 0.909091 // buy
							if( bullPower > 1.22686 )
								ret := -0.666667
						if( bullPower > 1.42483 )
							if( bearPower <= -0.794033 )
								ret := 1.000000 // buy
							if( bearPower > -0.794033 )
								ret := 0.750000 // buy
					if( bearPower > -0.716207 )
						if( VIP <= 1.0979 )
							if( bearPower <= -0.388001 )
								if( bbm <= 1.68577 )
									ret := 0.368421
								if( bbm > 1.68577 )
									ret := -0.470588
							if( bearPower > -0.388001 )
								if( bearPower <= -0.251924 )
									ret := -0.435737
								if( bearPower > -0.251924 )
									ret := 0.163934
						if( VIP > 1.0979 )
							if( bullPower <= 0.658775 )
								ret := -0.428571
							if( bullPower > 0.658775 )
								if( VIM <= 0.837342 )
									ret := 0.166667
								if( VIM > 0.837342 )
									ret := 0.863636 // buy
			if( VIP_VIM > 0.309335 )
				if( VIM <= 0.77958 )
					if( VIM <= 0.74165 )
						if( VIP_VIM <= 0.40963 )
							ret := 0.000000
						if( VIP_VIM > 0.40963 )
							if( bullPower <= 0.665367 )
								ret := 0.400000
							if( bullPower > 0.665367 )
								ret := 1.000000 // buy
					if( VIM > 0.74165 )
						if( VIM <= 0.749962 )
							ret := -1.000000 // sell
						if( VIM > 0.749962 )
							if( VIP <= 1.15286 )
								if( bbm <= 1.11865 )
									ret := 0.000000
								if( bbm > 1.11865 )
									ret := -0.428571
							if( VIP > 1.15286 )
								if( bearPower <= -0.42903 )
									ret := -1.000000 // sell
								if( bearPower > -0.42903 )
									ret := -0.250000
				if( VIM > 0.77958 )
					if( bbp <= -0.564909 )
						ret := -0.428571
					if( bbp > -0.564909 )
						if( VIP_VIM <= 0.342477 )
							if( bullPower <= 0.15075 )
								if( bbp <= -0.148089 )
									ret := 0.307692
								if( bbp > -0.148089 )
									ret := -0.750000 // sell
							if( bullPower > 0.15075 )
								if( bullPower <= 0.288078 )
									ret := 0.941176 // buy
								if( bullPower > 0.288078 )
									ret := 0.318182
						if( VIP_VIM > 0.342477 )
							if( VIP_VIM <= 0.502955 )
								if( bbp <= -0.136241 )
									ret := 0.722222 // buy
								if( bbp > -0.136241 )
									ret := 0.913043 // buy
							if( VIP_VIM > 0.502955 )
								ret := 0.000000
		if( bearPower > -0.234098 )
			if( VIP <= 1.25767 )
				if( VIP_VIM <= -0.302236 )
					if( bbm <= 0.355619 )
						if( bearPower <= -0.014758 )
							if( VIM <= 1.22391 )
								if( bbm <= 0.306407 )
									ret := -0.053763
								if( bbm > 0.306407 )
									ret := 0.272727
							if( VIM > 1.22391 )
								if( bbm <= 0.240838 )
									ret := -0.152975
								if( bbm > 0.240838 )
									ret := -0.657143
						if( bearPower > -0.014758 )
							if( VIM <= 1.19877 )
								if( bbm <= 0.190376 )
									ret := -0.750000 // sell
								if( bbm > 0.190376 )
									ret := -1.000000 // sell
							if( VIM > 1.19877 )
								ret := -0.428571
					if( bbm > 0.355619 )
						if( bbp <= 0.191817 )
							if( VIP_VIM <= -0.404503 )
								ret := 0.000000
							if( VIP_VIM > -0.404503 )
								if( VIP <= 0.859284 )
									ret := -0.814815 // sell
								if( VIP > 0.859284 )
									ret := -0.333333
						if( bbp > 0.191817 )
							if( bbp <= 0.334598 )
								if( VIM <= 1.1617 )
									ret := -0.250000
								if( VIM > 1.1617 )
									ret := 0.750000 // buy
							if( bbp > 0.334598 )
								if( bearPower <= -0.050576 )
									ret := -0.555556
								if( bearPower > -0.050576 )
									ret := -1.000000 // sell
				if( VIP_VIM > -0.302236 )
					if( bbp <= 1.9817 )
						if( bbp <= 1.76282 )
							if( bbm <= 0.590908 )
								if( VIP <= 1.20801 )
									ret := 0.026823
								if( VIP > 1.20801 )
									ret := -0.036181
							if( bbm > 0.590908 )
								if( VIM <= 0.766405 )
									ret := 0.156522
								if( VIM > 0.766405 )
									ret := -0.081565
						if( bbp > 1.76282 )
							if( VIM <= 0.954757 )
								if( bbp <= 1.84867 )
									ret := -0.610619
								if( bbp > 1.84867 )
									ret := -0.225806
							if( VIM > 0.954757 )
								if( bearPower <= 0.454021 )
									ret := 0.888889 // buy
								if( bearPower > 0.454021 )
									ret := 0.230769
					if( bbp > 1.9817 )
						if( bearPower <= 0.990297 )
							if( bullPower <= 1.36451 )
								if( bullPower <= 1.2622 )
									ret := -0.266667
								if( bullPower > 1.2622 )
									ret := 0.731343 // buy
							if( bullPower > 1.36451 )
								if( VIM <= 0.9355 )
									ret := 0.208609
								if( VIM > 0.9355 )
									ret := -0.482759
						if( bearPower > 0.990297 )
							if( bearPower <= 1.36443 )
								if( VIM <= 0.767024 )
									ret := 0.011364
								if( VIM > 0.767024 )
									ret := -0.404959
							if( bearPower > 1.36443 )
								if( bullPower <= 2.79978 )
									ret := 0.710526 // buy
								if( bullPower > 2.79978 )
									ret := -0.288462
			if( VIP > 1.25767 )
				if( bearPower <= 1.5265 )
					if( bearPower <= 1.23357 )
						if( bbm <= 0.218662 )
							if( bullPower <= 0.667575 )
								if( bullPower <= 0.597303 )
									ret := -0.003322
								if( bullPower > 0.597303 )
									ret := 0.521739
							if( bullPower > 0.667575 )
								if( bearPower <= 0.55418 )
									ret := -0.634146
								if( bearPower > 0.55418 )
									ret := 0.000000
						if( bbm > 0.218662 )
							if( bullPower <= 1.50959 )
								if( bullPower <= 1.39466 )
									ret := -0.133264
								if( bullPower > 1.39466 )
									ret := -0.446809
							if( bullPower > 1.50959 )
								if( bullPower <= 1.73733 )
									ret := 0.287356
								if( bullPower > 1.73733 )
									ret := -0.184426
					if( bearPower > 1.23357 )
						if( bbm <= 1.15677 )
							if( VIP <= 1.35362 )
								if( bbm <= 0.537083 )
									ret := -1.000000 // sell
								if( bbm > 0.537083 )
									ret := -0.028571
							if( VIP > 1.35362 )
								if( bbp <= 3.54713 )
									ret := -0.806452 // sell
								if( bbp > 3.54713 )
									ret := -0.400000
						if( bbm > 1.15677 )
							if( bbp <= 4.72366 )
								if( VIP <= 1.38841 )
									ret := -0.918919 // sell
								if( VIP > 1.38841 )
									ret := -0.500000
							if( bbp > 4.72366 )
								ret := 0.250000
				if( bearPower > 1.5265 )
					if( bbp <= 6.36936 )
						if( bbm <= 0.535 )
							if( VIM <= 0.558771 )
								ret := -0.250000
							if( VIM > 0.558771 )
								ret := -0.500000
						if( bbm > 0.535 )
							if( bullPower <= 3.39071 )
								if( bullPower <= 2.98488 )
									ret := 0.422018
								if( bullPower > 2.98488 )
									ret := 0.872340 // buy
							if( bullPower > 3.39071 )
								if( bbm <= 1.47971 )
									ret := -0.923077 // sell
								if( bbm > 1.47971 )
									ret := 0.700000 // buy
					if( bbp > 6.36936 )
						if( VIP_VIM <= 0.691597 )
							if( bbm <= 2.01611 )
								ret := 1.000000 // buy
							if( bbm > 2.01611 )
								if( VIP <= 1.29057 )
									ret := 1.000000 // buy
								if( VIP > 1.29057 )
									ret := -0.333333
						if( VIP_VIM > 0.691597 )
							if( bullPower <= 5.77636 )
								if( VIM <= 0.449684 )
									ret := -1.000000 // sell
								if( VIM > 0.449684 )
									ret := -0.368421
							if( bullPower > 5.77636 )
								if( VIP <= 1.36254 )
									ret := 1.000000 // buy
								if( VIP > 1.36254 )
									ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_LTCUSDT_15Min_ad84be9a(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


