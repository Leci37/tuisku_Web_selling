//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: FFIV_15Min_2BV0_3934e108 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2BV0_3934e108", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_3934e108(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= -0.029348 )
		if( bbm <= 0.10995 )
			if( VIP_VIM <= 0.153889 )
				if( VIP <= 0.793892 )
					if( bullPower <= -1.0978 )
						if( bullPower <= -2.23442 )
							if( VIP <= 0.770647 )
								if( VIP <= 0.631013 )
									ret := -0.250000
								if( VIP > 0.631013 )
									ret := -0.900000 // sell
							if( VIP > 0.770647 )
								ret := 0.200000
						if( bullPower > -2.23442 )
							if( VIP_VIM <= -0.600973 )
								if( bbp <= -2.73878 )
									ret := 0.052632
								if( bbp > -2.73878 )
									ret := -0.666667
							if( VIP_VIM > -0.600973 )
								if( VIM <= 1.31237 )
									ret := 0.904762 // buy
								if( VIM > 1.31237 )
									ret := 0.500000
					if( bullPower > -1.0978 )
						if( VIM <= 1.3525 )
							if( bullPower <= -0.302955 )
								if( VIP_VIM <= -0.606674 )
									ret := 0.961538 // buy
								if( VIP_VIM > -0.606674 )
									ret := 0.666667
							if( bullPower > -0.302955 )
								if( VIP_VIM <= -0.556069 )
									ret := 0.812500 // buy
								if( VIP_VIM > -0.556069 )
									ret := -0.076923
						if( VIM > 1.3525 )
							if( VIM <= 1.39614 )
								if( bearPower <= -0.287812 )
									ret := -0.175258
								if( bearPower > -0.287812 )
									ret := 0.857143 // buy
							if( VIM > 1.39614 )
								if( VIP <= 0.637474 )
									ret := 0.818182 // buy
								if( VIP > 0.637474 )
									ret := 0.406977
				if( VIP > 0.793892 )
					if( bbm <= 0.010536 )
						if( VIP_VIM <= -0.376608 )
							if( VIP <= 1.27962 )
								if( bearPower <= -1.7897 )
									ret := -0.621212
								if( bearPower > -1.7897 )
									ret := -0.021021
							if( VIP > 1.27962 )
								if( bearPower <= -1.20131 )
									ret := 0.857143 // buy
								if( bearPower > -1.20131 )
									ret := -0.222222
						if( VIP_VIM > -0.376608 )
							if( bbp <= -3.03554 )
								if( VIP <= 2.17433 )
									ret := 0.905660 // buy
								if( VIP > 2.17433 )
									ret := -1.000000 // sell
							if( bbp > -3.03554 )
								if( bullPower <= -0.887222 )
									ret := -0.384615
								if( bullPower > -0.887222 )
									ret := 0.154343
					if( bbm > 0.010536 )
						if( VIP <= 1.00355 )
							if( bbp <= -0.736291 )
								if( bbp <= -1.09025 )
									ret := 0.843137 // buy
								if( bbp > -1.09025 )
									ret := 0.550000
							if( bbp > -0.736291 )
								if( VIP <= 0.94252 )
									ret := -0.023810
								if( VIP > 0.94252 )
									ret := 0.571429
						if( VIP > 1.00355 )
							if( bbp <= -3.82186 )
								if( bbm <= 0.032173 )
									ret := -0.333333
								if( bbm > 0.032173 )
									ret := 0.800000 // buy
							if( bbp > -3.82186 )
								if( VIP_VIM <= -0.478341 )
									ret := 1.000000 // buy
								if( VIP_VIM > -0.478341 )
									ret := -0.126316
			if( VIP_VIM > 0.153889 )
				if( bearPower <= -3.87584 )
					if( VIM <= 1.51281 )
						ret := -1.000000 // sell
					if( VIM > 1.51281 )
						ret := -0.500000
				if( bearPower > -3.87584 )
					if( bearPower <= -1.44336 )
						if( VIM <= 1.83797 )
							if( VIP_VIM <= 0.552093 )
								if( VIP_VIM <= 0.338223 )
									ret := 1.000000 // buy
								if( VIP_VIM > 0.338223 )
									ret := 0.923077 // buy
							if( VIP_VIM > 0.552093 )
								if( bbp <= -4.49164 )
									ret := 1.000000 // buy
								if( bbp > -4.49164 )
									ret := -0.250000
						if( VIM > 1.83797 )
							ret := 0.000000
					if( bearPower > -1.44336 )
						if( VIM <= 1.16655 )
							if( bearPower <= -0.432335 )
								if( VIM <= 0.963802 )
									ret := 0.600000
								if( VIM > 0.963802 )
									ret := 0.925000 // buy
							if( bearPower > -0.432335 )
								if( VIP <= 1.26718 )
									ret := 0.554545
								if( VIP > 1.26718 )
									ret := -0.107692
						if( VIM > 1.16655 )
							if( bearPower <= -0.77285 )
								if( VIP_VIM <= 0.564295 )
									ret := -0.833333 // sell
								if( VIP_VIM > 0.564295 )
									ret := 0.400000
							if( bearPower > -0.77285 )
								if( bullPower <= -0.281864 )
									ret := 0.500000
								if( bullPower > -0.281864 )
									ret := -0.555556
		if( bbm > 0.10995 )
			if( VIP_VIM <= -0.734429 )
				if( VIP <= 0.521816 )
					if( bearPower <= -1.22215 )
						if( bbm <= 0.533744 )
							if( VIP_VIM <= -1.07305 )
								if( VIM <= 1.60201 )
									ret := 0.888889 // buy
								if( VIM > 1.60201 )
									ret := 0.333333
							if( VIP_VIM > -1.07305 )
								if( bbm <= 0.463139 )
									ret := 0.333333
								if( bbm > 0.463139 )
									ret := -0.846154 // sell
						if( bbm > 0.533744 )
							if( bbp <= -2.93623 )
								if( bbp <= -4.35419 )
									ret := 0.573770
								if( bbp > -4.35419 )
									ret := -0.096774
							if( bbp > -2.93623 )
								if( bearPower <= -1.54232 )
									ret := 0.962963 // buy
								if( bearPower > -1.54232 )
									ret := 0.300000
					if( bearPower > -1.22215 )
						if( VIP_VIM <= -1.10927 )
							ret := 0.142857
						if( VIP_VIM > -1.10927 )
							if( bbp <= -1.68124 )
								ret := -0.500000
							if( bbp > -1.68124 )
								if( bullPower <= -0.396067 )
									ret := -1.000000 // sell
								if( bullPower > -0.396067 )
									ret := -0.750000 // sell
				if( VIP > 0.521816 )
					if( bullPower <= -0.352651 )
						if( VIM <= 1.46907 )
							if( bbm <= 3.25705 )
								if( bbp <= -5.94189 )
									ret := -0.678571
								if( bbp > -5.94189 )
									ret := -0.243077
							if( bbm > 3.25705 )
								if( bullPower <= -8.45544 )
									ret := 0.500000
								if( bullPower > -8.45544 )
									ret := 1.000000 // buy
						if( VIM > 1.46907 )
							if( bbm <= 1.24469 )
								if( bullPower <= -3.55157 )
									ret := -0.625000
								if( bullPower > -3.55157 )
									ret := 0.064182
							if( bbm > 1.24469 )
								if( bullPower <= -2.48714 )
									ret := -0.285714
								if( bullPower > -2.48714 )
									ret := -0.710526 // sell
					if( bullPower > -0.352651 )
						if( bearPower <= -0.840471 )
							if( VIP_VIM <= -0.75904 )
								if( VIP <= 0.555567 )
									ret := 0.500000
								if( VIP > 0.555567 )
									ret := 0.941176 // buy
							if( VIP_VIM > -0.75904 )
								if( VIP_VIM <= -0.751063 )
									ret := 0.250000
								if( VIP_VIM > -0.751063 )
									ret := 0.250000
						if( bearPower > -0.840471 )
							if( VIM <= 1.69916 )
								if( VIP <= 0.785031 )
									ret := 0.073171
								if( VIP > 0.785031 )
									ret := 1.000000 // buy
							if( VIM > 1.69916 )
								ret := -0.500000
			if( VIP_VIM > -0.734429 )
				if( bbm <= 1.84922 )
					if( bullPower <= -2.66155 )
						if( bullPower <= -3.29587 )
							if( bearPower <= -4.67742 )
								if( VIM <= 1.81501 )
									ret := 0.757576 // buy
								if( VIM > 1.81501 )
									ret := -0.200000
							if( bearPower > -4.67742 )
								if( VIP <= 1.22254 )
									ret := -0.750000 // sell
								if( VIP > 1.22254 )
									ret := 0.066667
						if( bullPower > -3.29587 )
							if( VIP <= 0.872037 )
								if( VIP_VIM <= -0.622201 )
									ret := 0.875000 // buy
								if( VIP_VIM > -0.622201 )
									ret := -0.250000
							if( VIP > 0.872037 )
								if( VIP <= 1.52679 )
									ret := 0.939394 // buy
								if( VIP > 1.52679 )
									ret := 0.500000
					if( bullPower > -2.66155 )
						if( bbp <= -6.44431 )
							if( VIP <= 0.827664 )
								ret := -1.000000 // sell
							if( VIP > 0.827664 )
								ret := -0.250000
						if( bbp > -6.44431 )
							if( VIP_VIM <= -0.50959 )
								if( bearPower <= -3.76064 )
									ret := -0.785714 // sell
								if( bearPower > -3.76064 )
									ret := 0.117449
							if( VIP_VIM > -0.50959 )
								if( bbp <= -5.66075 )
									ret := 0.675000
								if( bbp > -5.66075 )
									ret := 0.042959
				if( bbm > 1.84922 )
					if( bullPower <= -0.433023 )
						if( bullPower <= -0.680736 )
							if( bbp <= -3.5807 )
								if( bullPower <= -0.787939 )
									ret := 0.272000
								if( bullPower > -0.787939 )
									ret := -0.434783
							if( bbp > -3.5807 )
								if( VIP <= 0.725772 )
									ret := 0.750000 // buy
								if( VIP > 0.725772 )
									ret := 1.000000 // buy
						if( bullPower > -0.680736 )
							if( bearPower <= -3.52631 )
								if( VIP <= 0.933612 )
									ret := 0.900000 // buy
								if( VIP > 0.933612 )
									ret := 0.000000
							if( bearPower > -3.52631 )
								if( bbm <= 1.87604 )
									ret := 1.000000 // buy
								if( bbm > 1.87604 )
									ret := -0.490196
					if( bullPower > -0.433023 )
						if( bearPower <= -2.06816 )
							if( bearPower <= -2.40575 )
								if( VIP_VIM <= -0.571796 )
									ret := -0.666667
								if( VIP_VIM > -0.571796 )
									ret := 0.540816
							if( bearPower > -2.40575 )
								if( VIM <= 1.17283 )
									ret := 1.000000 // buy
								if( VIM > 1.17283 )
									ret := 0.814815 // buy
						if( bearPower > -2.06816 )
							ret := -1.000000 // sell
	if( bullPower > -0.029348 )
		if( VIP_VIM <= -0.022551 )
			if( VIM <= 0.9769 )
				if( bbm <= 1.49143 )
					if( bbm <= 1.18444 )
						if( bbp <= -0.358689 )
							if( VIP <= 0.923851 )
								ret := -0.571429
							if( VIP > 0.923851 )
								ret := -1.000000 // sell
						if( bbp > -0.358689 )
							if( bbp <= -0.244001 )
								ret := 0.500000
							if( bbp > -0.244001 )
								if( bbp <= -0.09076 )
									ret := -0.777778 // sell
								if( bbp > -0.09076 )
									ret := -0.142857
					if( bbm > 1.18444 )
						if( VIP <= 0.817119 )
							ret := -0.400000
						if( VIP > 0.817119 )
							if( VIP_VIM <= -0.040326 )
								if( VIP_VIM <= -0.057002 )
									ret := 0.666667
								if( VIP_VIM > -0.057002 )
									ret := 0.916667 // buy
							if( VIP_VIM > -0.040326 )
								ret := 0.142857
				if( bbm > 1.49143 )
					if( bearPower <= -3.08291 )
						if( VIP <= 0.569221 )
							ret := -1.000000 // sell
						if( VIP > 0.569221 )
							if( VIM <= 0.905894 )
								ret := -0.250000
							if( VIM > 0.905894 )
								ret := 1.000000 // buy
					if( bearPower > -3.08291 )
						if( bearPower <= -2.02151 )
							if( VIM <= 0.898339 )
								ret := -0.500000
							if( VIM > 0.898339 )
								ret := -1.000000 // sell
						if( bearPower > -2.02151 )
							if( VIP <= 0.690978 )
								ret := 1.000000 // buy
							if( VIP > 0.690978 )
								if( bbm <= 2.44625 )
									ret := -0.640625
								if( bbm > 2.44625 )
									ret := 0.125000
			if( VIM > 0.9769 )
				if( bbm <= 0.028062 )
					if( VIP_VIM <= -0.163317 )
						if( bullPower <= 1.01281 )
							if( VIP <= 0.944012 )
								if( VIP_VIM <= -0.318797 )
									ret := -0.214286
								if( VIP_VIM > -0.318797 )
									ret := -0.719298 // sell
							if( VIP > 0.944012 )
								if( bbp <= 0.181558 )
									ret := 0.382979
								if( bbp > 0.181558 )
									ret := -0.345133
						if( bullPower > 1.01281 )
							if( bearPower <= 1.45815 )
								if( bbp <= 2.60314 )
									ret := -0.750000 // sell
								if( bbp > 2.60314 )
									ret := -0.500000
							if( bearPower > 1.45815 )
								if( VIP_VIM <= -0.697609 )
									ret := -0.500000
								if( VIP_VIM > -0.697609 )
									ret := -0.960000 // sell
					if( VIP_VIM > -0.163317 )
						if( VIP <= 1.01304 )
							if( bearPower <= 0.016241 )
								if( VIP_VIM <= -0.095541 )
									ret := 0.960000 // buy
								if( VIP_VIM > -0.095541 )
									ret := 0.000000
							if( bearPower > 0.016241 )
								if( bearPower <= 0.266945 )
									ret := 0.173913
								if( bearPower > 0.266945 )
									ret := -0.571429
						if( VIP > 1.01304 )
							if( bbp <= 0.117168 )
								if( VIP <= 1.06765 )
									ret := -0.666667
								if( VIP > 1.06765 )
									ret := 0.800000 // buy
							if( bbp > 0.117168 )
								if( VIP <= 1.07559 )
									ret := 0.246753
								if( VIP > 1.07559 )
									ret := -0.192308
				if( bbm > 0.028062 )
					if( bearPower <= 0.108876 )
						if( VIP_VIM <= -0.505779 )
							if( bbp <= -1.28394 )
								if( bearPower <= -6.57804 )
									ret := 0.400000
								if( bearPower > -6.57804 )
									ret := -0.533333
							if( bbp > -1.28394 )
								if( bbm <= 0.614061 )
									ret := 0.099338
								if( bbm > 0.614061 )
									ret := 0.466165
						if( VIP_VIM > -0.505779 )
							if( bbp <= 1.40753 )
								if( VIP <= 0.820853 )
									ret := -0.134677
								if( VIP > 0.820853 )
									ret := 0.006148
							if( bbp > 1.40753 )
								if( VIM <= 1.58736 )
									ret := -0.634146
								if( VIM > 1.58736 )
									ret := 0.400000
					if( bearPower > 0.108876 )
						if( bbm <= 0.601044 )
							if( bbp <= 1.47448 )
								if( VIP_VIM <= -0.44417 )
									ret := -0.750000 // sell
								if( VIP_VIM > -0.44417 )
									ret := 0.134021
							if( bbp > 1.47448 )
								if( VIP <= 1.31171 )
									ret := -0.118644
								if( VIP > 1.31171 )
									ret := -0.658537
						if( bbm > 0.601044 )
							if( VIM <= 1.09406 )
								if( bbm <= 0.717571 )
									ret := 0.571429
								if( bbm > 0.717571 )
									ret := -0.135135
							if( VIM > 1.09406 )
								if( bullPower <= 1.38301 )
									ret := 0.579710
								if( bullPower > 1.38301 )
									ret := 0.186667
		if( VIP_VIM > -0.022551 )
			if( VIP <= 1.58689 )
				if( bearPower <= 3.43951 )
					if( bbp <= 7.19187 )
						if( bearPower <= 2.76978 )
							if( bbp <= 6.17265 )
								if( bullPower <= 3.20846 )
									ret := 0.056192
								if( bullPower > 3.20846 )
									ret := -0.242857
							if( bbp > 6.17265 )
								if( VIP_VIM <= 0.578733 )
									ret := 0.875000 // buy
								if( VIP_VIM > 0.578733 )
									ret := 0.200000
						if( bearPower > 2.76978 )
							if( VIM <= 0.578866 )
								ret := 0.857143 // buy
							if( VIM > 0.578866 )
								if( bbm <= 0.007587 )
									ret := -1.000000 // sell
								if( bbm > 0.007587 )
									ret := -0.478261
					if( bbp > 7.19187 )
						if( VIP_VIM <= 0.795754 )
							if( VIP_VIM <= 0.602418 )
								if( VIM <= 0.711189 )
									ret := 0.600000
								if( VIM > 0.711189 )
									ret := -0.666667
							if( VIP_VIM > 0.602418 )
								if( bearPower <= 2.97277 )
									ret := -0.926829 // sell
								if( bearPower > 2.97277 )
									ret := -0.500000
						if( VIP_VIM > 0.795754 )
							if( VIM <= 0.585778 )
								ret := 0.800000 // buy
							if( VIM > 0.585778 )
								if( VIM <= 0.608217 )
									ret := 0.250000
								if( VIM > 0.608217 )
									ret := -0.250000
				if( bearPower > 3.43951 )
					if( VIP_VIM <= 0.838069 )
						if( VIM <= 0.670554 )
							if( VIP <= 1.42713 )
								if( bearPower <= 3.86604 )
									ret := 0.533333
								if( bearPower > 3.86604 )
									ret := 0.935484 // buy
							if( VIP > 1.42713 )
								ret := -0.500000
						if( VIM > 0.670554 )
							if( VIP_VIM <= 0.686417 )
								if( bbm <= 1.82274 )
									ret := 0.681818
								if( bbm > 1.82274 )
									ret := -1.000000 // sell
							if( VIP_VIM > 0.686417 )
								ret := -1.000000 // sell
					if( VIP_VIM > 0.838069 )
						if( bullPower <= 5.02008 )
							if( bullPower <= 4.54573 )
								ret := 0.250000
							if( bullPower > 4.54573 )
								ret := -1.000000 // sell
						if( bullPower > 5.02008 )
							if( bbm <= 0.929131 )
								ret := -0.714286 // sell
							if( bbm > 0.929131 )
								if( bullPower <= 10.9894 )
									ret := 0.687500
								if( bullPower > 10.9894 )
									ret := -0.333333
			if( VIP > 1.58689 )
				if( bearPower <= 0.453284 )
					if( VIM <= 1.25573 )
						if( bullPower <= 0.36986 )
							if( VIP_VIM <= 0.429731 )
								ret := 0.200000
							if( VIP_VIM > 0.429731 )
								if( bearPower <= 0.150289 )
									ret := -0.500000
								if( bearPower > 0.150289 )
									ret := -0.818182 // sell
						if( bullPower > 0.36986 )
							if( bearPower <= -1.00089 )
								ret := -1.000000 // sell
							if( bearPower > -1.00089 )
								if( VIP <= 1.64308 )
									ret := 0.241379
								if( VIP > 1.64308 )
									ret := -0.150000
					if( VIM > 1.25573 )
						if( VIP <= 2.19088 )
							if( VIM <= 1.82989 )
								if( VIP_VIM <= 0.181547 )
									ret := -0.142857
								if( VIP_VIM > 0.181547 )
									ret := 0.350000
							if( VIM > 1.82989 )
								if( bearPower <= -0.479693 )
									ret := -0.250000
								if( bearPower > -0.479693 )
									ret := -0.857143 // sell
						if( VIP > 2.19088 )
							if( bullPower <= 0.125926 )
								ret := -0.285714
							if( bullPower > 0.125926 )
								if( VIP <= 2.69609 )
									ret := 0.708333 // buy
								if( VIP > 2.69609 )
									ret := 0.000000
				if( bearPower > 0.453284 )
					if( bearPower <= 1.47473 )
						if( bullPower <= 2.01383 )
							if( bbm <= 0.040486 )
								if( bbp <= 1.82158 )
									ret := -0.142857
								if( bbp > 1.82158 )
									ret := -0.806452 // sell
							if( bbm > 0.040486 )
								if( bullPower <= 1.06591 )
									ret := 0.000000
								if( bullPower > 1.06591 )
									ret := -0.308824
						if( bullPower > 2.01383 )
							if( VIM <= 0.754131 )
								ret := -1.000000 // sell
							if( VIM > 0.754131 )
								if( VIM <= 1.01313 )
									ret := 0.000000
								if( VIM > 1.01313 )
									ret := -1.000000 // sell
					if( bearPower > 1.47473 )
						if( VIP_VIM <= 0.971307 )
							if( VIM <= 1.16308 )
								if( VIM <= 1.05843 )
									ret := 0.067568
								if( VIM > 1.05843 )
									ret := 0.538462
							if( VIM > 1.16308 )
								if( bbp <= 4.47296 )
									ret := -0.571429
								if( bbp > 4.47296 )
									ret := -0.080460
						if( VIP_VIM > 0.971307 )
							if( bbm <= 0.5875 )
								if( bearPower <= 1.81929 )
									ret := -0.250000
								if( bearPower > 1.81929 )
									ret := 0.571429
							if( bbm > 0.5875 )
								if( bbm <= 1.44 )
									ret := -0.857143 // sell
								if( bbm > 1.44 )
									ret := 0.500000
	
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
float op_operation = decision_tree_0_FFIV_15Min_3934e108(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


