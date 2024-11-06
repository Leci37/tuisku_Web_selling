//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Chaikin_Money_Flow
// ID_model: SNOW_1Min_2BC0_5cb10efd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SNOW_1Min_2BC0_5cb10efd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SNOW_1Min_5cb10efd(bbm, bearPower, bbp, bullPower, BBPower_Color, mf, ad, ad_mf)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( BBPower_Color <= 0.5 )
		if( bbm <= 0.01998 )
			if( bullPower <= -0.13037 )
				if( mf <= -0.905693 )
					if( bullPower <= -0.487723 )
						ret := -0.200000
					if( bullPower > -0.487723 )
						if( ad_mf <= 0.981343 )
							ret := -1.000000 // sell
						if( ad_mf > 0.981343 )
							ret := -0.250000
				if( mf > -0.905693 )
					if( ad <= -818 )
						if( bbp <= -0.304245 )
							if( ad <= -1692.5 )
								if( bbp <= -0.63538 )
									ret := 0.500000
								if( bbp > -0.63538 )
									ret := -0.250000
							if( ad > -1692.5 )
								if( bearPower <= -0.179824 )
									ret := -0.722222 // sell
								if( bearPower > -0.179824 )
									ret := 0.000000
						if( bbp > -0.304245 )
							ret := 0.666667
					if( ad > -818 )
						if( bullPower <= -0.418937 )
							if( bearPower <= -0.480351 )
								if( mf <= -0.558296 )
									ret := -0.500000
								if( mf > -0.558296 )
									ret := 0.425287
							if( bearPower > -0.480351 )
								if( mf <= 0.178398 )
									ret := 0.803030 // buy
								if( mf > 0.178398 )
									ret := -0.071429
						if( bullPower > -0.418937 )
							if( bbp <= -0.310547 )
								if( bearPower <= -0.39227 )
									ret := -0.037975
								if( bearPower > -0.39227 )
									ret := 0.309019
							if( bbp > -0.310547 )
								if( mf <= 0.266597 )
									ret := 0.414835
								if( mf > 0.266597 )
									ret := 0.753247 // buy
			if( bullPower > -0.13037 )
				if( bullPower <= -0.021499 )
					if( bullPower <= -0.046422 )
						if( ad_mf <= -0.308299 )
							if( ad_mf <= -0.471349 )
								if( mf <= 0.75996 )
									ret := -0.041667
								if( mf > 0.75996 )
									ret := 0.657143
							if( ad_mf > -0.471349 )
								if( bbp <= -0.106977 )
									ret := 0.479167
								if( bbp > -0.106977 )
									ret := 0.916667 // buy
						if( ad_mf > -0.308299 )
							if( mf <= 0.182975 )
								if( bullPower <= -0.069847 )
									ret := 0.188542
								if( bullPower > -0.069847 )
									ret := 0.032751
							if( mf > 0.182975 )
								if( bbp <= -0.133643 )
									ret := -0.312000
								if( bbp > -0.133643 )
									ret := 0.230769
					if( bullPower > -0.046422 )
						if( mf <= 0.421639 )
							if( ad_mf <= 0.448756 )
								if( mf <= -0.398489 )
									ret := 0.729730 // buy
								if( mf > -0.398489 )
									ret := 0.307198
							if( ad_mf > 0.448756 )
								if( mf <= -0.556773 )
									ret := -0.057143
								if( mf > -0.556773 )
									ret := 0.188679
						if( mf > 0.421639 )
							if( bullPower <= -0.039893 )
								if( ad_mf <= -0.625571 )
									ret := -0.250000
								if( ad_mf > -0.625571 )
									ret := 0.250000
							if( bullPower > -0.039893 )
								if( mf <= 0.627077 )
									ret := -0.428571
								if( mf > 0.627077 )
									ret := 0.000000
				if( bullPower > -0.021499 )
					if( bbp <= -0.03973 )
						if( mf <= -0.104349 )
							if( mf <= -0.231227 )
								if( mf <= -0.481215 )
									ret := 0.000000
								if( mf > -0.481215 )
									ret := -0.333333
							if( mf > -0.231227 )
								if( bullPower <= -0.020722 )
									ret := 0.250000
								if( bullPower > -0.020722 )
									ret := 0.600000
						if( mf > -0.104349 )
							if( bullPower <= -0.019927 )
								if( ad_mf <= -0.01876 )
									ret := -0.090909
								if( ad_mf > -0.01876 )
									ret := -0.400000
							if( bullPower > -0.019927 )
								if( mf <= 0.0441 )
									ret := -1.000000 // sell
								if( mf > 0.0441 )
									ret := 0.000000
					if( bbp > -0.03973 )
						if( ad_mf <= 0.062712 )
							if( ad_mf <= 0.016033 )
								if( ad_mf <= -9.3e-05 )
									ret := -0.048295
								if( ad_mf > -9.3e-05 )
									ret := 0.412698
							if( ad_mf > 0.016033 )
								if( mf <= -0.023057 )
									ret := -0.285714
								if( mf > -0.023057 )
									ret := -0.933333 // sell
						if( ad_mf > 0.062712 )
							if( mf <= -0.407935 )
								if( mf <= -0.499867 )
									ret := 0.031250
								if( mf > -0.499867 )
									ret := -0.344828
							if( mf > -0.407935 )
								if( bearPower <= 0.449699 )
									ret := 0.297959
								if( bearPower > 0.449699 )
									ret := 1.000000 // buy
		if( bbm > 0.01998 )
			if( ad_mf <= -228.566 )
				if( bbm <= 0.362214 )
					if( ad <= -1467.44 )
						if( bearPower <= 0.087903 )
							if( ad <= -23226.4 )
								if( ad <= -23953.8 )
									ret := 0.163522
								if( ad > -23953.8 )
									ret := 0.744186 // buy
							if( ad > -23226.4 )
								if( ad <= -2806.14 )
									ret := 0.052370
								if( ad > -2806.14 )
									ret := -0.022953
						if( bearPower > 0.087903 )
							if( mf <= -0.042776 )
								if( bullPower <= 0.264802 )
									ret := 0.523810
								if( bullPower > 0.264802 )
									ret := -0.272727
							if( mf > -0.042776 )
								if( ad <= -1684.3 )
									ret := 0.406061
								if( ad > -1684.3 )
									ret := -0.714286 // sell
					if( ad > -1467.44 )
						if( bearPower <= -1.01826 )
							if( ad_mf <= -764.987 )
								ret := -0.714286 // sell
							if( ad_mf > -764.987 )
								ret := -1.000000 // sell
						if( bearPower > -1.01826 )
							if( bullPower <= 0.054859 )
								if( mf <= -0.152178 )
									ret := 0.033624
								if( mf > -0.152178 )
									ret := 0.186378
							if( bullPower > 0.054859 )
								if( mf <= 0.15048 )
									ret := 0.362319
								if( mf > 0.15048 )
									ret := -0.012821
				if( bbm > 0.362214 )
					if( ad_mf <= -44940.2 )
						if( bbm <= 1.42127 )
							if( ad_mf <= -49574.5 )
								if( ad_mf <= -50964.8 )
									ret := 0.157480
								if( ad_mf > -50964.8 )
									ret := 1.000000 // buy
							if( ad_mf > -49574.5 )
								if( mf <= -0.328327 )
									ret := 0.125000
								if( mf > -0.328327 )
									ret := -0.708333 // sell
						if( bbm > 1.42127 )
							if( bearPower <= -7.04865 )
								ret := 1.000000 // buy
							if( bearPower > -7.04865 )
								if( ad <= -74229.1 )
									ret := -0.846154 // sell
								if( ad > -74229.1 )
									ret := 0.666667
					if( ad_mf > -44940.2 )
						if( bullPower <= 0.068934 )
							if( bearPower <= -1.38234 )
								if( ad <= -2340.93 )
									ret := 0.645570
								if( ad > -2340.93 )
									ret := -0.300000
							if( bearPower > -1.38234 )
								if( mf <= 0.330743 )
									ret := 0.155857
								if( mf > 0.330743 )
									ret := 0.772727 // buy
						if( bullPower > 0.068934 )
							if( ad_mf <= -32327.8 )
								if( mf <= 0.035018 )
									ret := 0.645161
								if( mf > 0.035018 )
									ret := 0.926829 // buy
							if( ad_mf > -32327.8 )
								if( ad_mf <= -4878.83 )
									ret := 0.220039
								if( ad_mf > -4878.83 )
									ret := 0.568421
			if( ad_mf > -228.566 )
				if( mf <= 0.333491 )
					if( ad <= 14367.9 )
						if( ad <= -212.587 )
							if( bbp <= -0.247987 )
								if( ad_mf <= -223.846 )
									ret := -0.750000 // sell
								if( ad_mf > -223.846 )
									ret := 0.750000 // buy
							if( bbp > -0.247987 )
								if( ad <= -224.257 )
									ret := -0.818182 // sell
								if( ad > -224.257 )
									ret := -1.000000 // sell
						if( ad > -212.587 )
							if( ad_mf <= 13782.1 )
								if( bbm <= 0.46871 )
									ret := 0.032678
								if( bbm > 0.46871 )
									ret := -0.141553
							if( ad_mf > 13782.1 )
								if( ad_mf <= 14044.5 )
									ret := 0.571429
								if( ad_mf > 14044.5 )
									ret := 0.051948
					if( ad > 14367.9 )
						if( ad_mf <= 27543.9 )
							if( ad_mf <= 20932.7 )
								if( ad <= 20056.2 )
									ret := -0.104753
								if( ad > 20056.2 )
									ret := 0.282051
							if( ad_mf > 20932.7 )
								if( ad <= 21918.7 )
									ret := -0.548673
								if( ad > 21918.7 )
									ret := -0.169863
						if( ad_mf > 27543.9 )
							if( ad_mf <= 28486.5 )
								if( bbp <= -0.525226 )
									ret := 0.952381 // buy
								if( bbp > -0.525226 )
									ret := 0.466667
							if( ad_mf > 28486.5 )
								if( mf <= -0.128345 )
									ret := -0.302817
								if( mf > -0.128345 )
									ret := 0.081340
				if( mf > 0.333491 )
					if( bullPower <= 0.091439 )
						if( bullPower <= -0.159438 )
							if( mf <= 0.528396 )
								if( bearPower <= -1.15802 )
									ret := -0.500000
								if( bearPower > -1.15802 )
									ret := 0.241379
							if( mf > 0.528396 )
								if( mf <= 0.647597 )
									ret := 1.000000 // buy
								if( mf > 0.647597 )
									ret := 0.666667
						if( bullPower > -0.159438 )
							if( bearPower <= -0.20261 )
								if( bbm <= 0.46201 )
									ret := -0.420290
								if( bbm > 0.46201 )
									ret := 0.090909
							if( bearPower > -0.20261 )
								if( bearPower <= -0.161453 )
									ret := 0.344828
								if( bearPower > -0.161453 )
									ret := -0.114130
					if( bullPower > 0.091439 )
						if( bbp <= 1.97124 )
							if( mf <= 0.590468 )
								if( ad <= 28871.9 )
									ret := -0.429224
								if( ad > 28871.9 )
									ret := 0.042553
							if( mf > 0.590468 )
								if( bbp <= 0.549025 )
									ret := -0.866667 // sell
								if( bbp > 0.549025 )
									ret := -0.333333
						if( bbp > 1.97124 )
							ret := 1.000000 // buy
	if( BBPower_Color > 0.5 )
		if( bbm <= 5e-05 )
			if( bullPower <= 0.073129 )
				if( ad_mf <= -0.192972 )
					if( bullPower <= 0.061423 )
						if( ad_mf <= -0.457018 )
							if( bullPower <= 0.05171 )
								if( bullPower <= 0.009844 )
									ret := 0.000000
								if( bullPower > 0.009844 )
									ret := -0.425926
							if( bullPower > 0.05171 )
								if( ad_mf <= -0.677309 )
									ret := 0.500000
								if( ad_mf > -0.677309 )
									ret := -0.111111
						if( ad_mf > -0.457018 )
							if( mf <= 0.34981 )
								if( bbp <= 0.106111 )
									ret := 0.140625
								if( bbp > 0.106111 )
									ret := 0.619048
							if( mf > 0.34981 )
								if( bearPower <= 0.041042 )
									ret := 0.675325
								if( bearPower > 0.041042 )
									ret := 0.166667
					if( bullPower > 0.061423 )
						if( mf <= 0.294566 )
							if( mf <= 0.254777 )
								if( bbp <= 0.13082 )
									ret := -0.250000
								if( bbp > 0.13082 )
									ret := -0.750000 // sell
							if( mf > 0.254777 )
								if( bullPower <= 0.069418 )
									ret := 0.937500 // buy
								if( bullPower > 0.069418 )
									ret := 0.250000
						if( mf > 0.294566 )
							if( mf <= 0.437426 )
								if( mf <= 0.31217 )
									ret := -0.571429
								if( mf > 0.31217 )
									ret := -0.842105 // sell
							if( mf > 0.437426 )
								if( mf <= 0.488985 )
									ret := 0.600000
								if( mf > 0.488985 )
									ret := 0.166667
				if( ad_mf > -0.192972 )
					if( bbp <= 0.135865 )
						if( bearPower <= 0.067051 )
							if( mf <= -0.060251 )
								if( mf <= -0.294924 )
									ret := -0.108392
								if( mf > -0.294924 )
									ret := 0.089588
							if( mf > -0.060251 )
								if( bearPower <= 0.007721 )
									ret := -0.383459
								if( bearPower > 0.007721 )
									ret := -0.079890
						if( bearPower > 0.067051 )
							if( bbp <= 0.135301 )
								if( bearPower <= 0.067374 )
									ret := -0.666667
								if( bearPower > 0.067374 )
									ret := -1.000000 // sell
							if( bbp > 0.135301 )
								if( bullPower <= 0.067879 )
									ret := -0.250000
								if( bullPower > 0.067879 )
									ret := -0.750000 // sell
					if( bbp > 0.135865 )
						if( bearPower <= 0.072786 )
							if( ad_mf <= 0.221768 )
								if( ad_mf <= -0.027914 )
									ret := 0.066667
								if( ad_mf > -0.027914 )
									ret := 0.500000
							if( ad_mf > 0.221768 )
								if( bullPower <= 0.070366 )
									ret := 0.100000
								if( bullPower > 0.070366 )
									ret := -0.500000
						if( bearPower > 0.072786 )
							ret := 1.000000 // buy
			if( bullPower > 0.073129 )
				if( mf <= -0.666591 )
					if( bbp <= 0.81515 )
						if( mf <= -0.751488 )
							if( bbp <= 0.181616 )
								ret := 0.666667
							if( bbp > 0.181616 )
								if( bullPower <= 0.114268 )
									ret := -0.500000
								if( bullPower > 0.114268 )
									ret := 0.300000
						if( mf > -0.751488 )
							if( ad_mf <= 0.736357 )
								if( bearPower <= 0.096489 )
									ret := 0.727273 // buy
								if( bearPower > 0.096489 )
									ret := 0.333333
							if( ad_mf > 0.736357 )
								ret := 1.000000 // buy
					if( bbp > 0.81515 )
						ret := -0.750000 // sell
				if( mf > -0.666591 )
					if( ad_mf <= -0.857377 )
						if( ad_mf <= -0.883967 )
							if( bearPower <= 0.136918 )
								ret := 0.000000
							if( bearPower > 0.136918 )
								ret := -0.500000
						if( ad_mf > -0.883967 )
							if( ad_mf <= -0.871364 )
								ret := 1.000000 // buy
							if( ad_mf > -0.871364 )
								ret := 0.750000 // buy
					if( ad_mf > -0.857377 )
						if( bbp <= 0.383939 )
							if( bearPower <= 0.18294 )
								if( mf <= 0.765161 )
									ret := -0.218623
								if( mf > 0.765161 )
									ret := 0.533333
							if( bearPower > 0.18294 )
								if( ad_mf <= -0.19795 )
									ret := -0.250000
								if( ad_mf > -0.19795 )
									ret := 0.298507
						if( bbp > 0.383939 )
							if( bullPower <= 0.749119 )
								if( bullPower <= 0.472056 )
									ret := -0.314410
								if( bullPower > 0.472056 )
									ret := -0.510067
							if( bullPower > 0.749119 )
								if( bullPower <= 0.845603 )
									ret := 0.483333
								if( bullPower > 0.845603 )
									ret := -0.248227
		if( bbm > 5e-05 )
			if( ad_mf <= -0.108712 )
				if( bullPower <= 0.197425 )
					if( ad <= -4591.25 )
						if( bbm <= 0.260923 )
							if( mf <= 0.133718 )
								if( bullPower <= 0.129761 )
									ret := -0.034660
								if( bullPower > 0.129761 )
									ret := 0.054017
							if( mf > 0.133718 )
								if( bearPower <= -0.083342 )
									ret := 0.250000
								if( bearPower > -0.083342 )
									ret := -0.114558
						if( bbm > 0.260923 )
							if( bbm <= 0.32051 )
								if( bbm <= 0.264505 )
									ret := -1.000000 // sell
								if( bbm > 0.264505 )
									ret := -0.351351
							if( bbm > 0.32051 )
								if( mf <= -0.159898 )
									ret := 0.750000 // buy
								if( mf > -0.159898 )
									ret := 0.076923
					if( ad > -4591.25 )
						if( ad_mf <= -0.344174 )
							if( bbm <= 0.084648 )
								if( ad <= -242.4 )
									ret := 0.023021
								if( ad > -242.4 )
									ret := -0.240000
							if( bbm > 0.084648 )
								if( bullPower <= 0.126971 )
									ret := 0.076621
								if( bullPower > 0.126971 )
									ret := 0.171113
						if( ad_mf > -0.344174 )
							if( bearPower <= -0.01355 )
								if( ad_mf <= -0.135277 )
									ret := -0.300000
								if( ad_mf > -0.135277 )
									ret := 0.200000
							if( bearPower > -0.01355 )
								if( bbp <= 0.041064 )
									ret := 0.909091 // buy
								if( bbp > 0.041064 )
									ret := 0.467290
				if( bullPower > 0.197425 )
					if( bearPower <= -0.013171 )
						if( ad_mf <= -4744.8 )
							if( ad_mf <= -5149.55 )
								if( mf <= 0.321506 )
									ret := 0.234257
								if( mf > 0.321506 )
									ret := -0.347826
							if( ad_mf > -5149.55 )
								if( mf <= 0.048405 )
									ret := 0.200000
								if( mf > 0.048405 )
									ret := -0.800000 // sell
						if( ad_mf > -4744.8 )
							if( bullPower <= 0.232996 )
								if( ad_mf <= -2728.36 )
									ret := -0.093750
								if( ad_mf > -2728.36 )
									ret := 0.514286
							if( bullPower > 0.232996 )
								if( bbm <= 0.721511 )
									ret := 0.571429
								if( bbm > 0.721511 )
									ret := 0.162162
					if( bearPower > -0.013171 )
						if( ad_mf <= -60299.1 )
							if( bullPower <= 0.681804 )
								if( ad_mf <= -126093 )
									ret := 0.684211
								if( ad_mf > -126093 )
									ret := 0.095238
							if( bullPower > 0.681804 )
								if( ad <= -72238.3 )
									ret := 0.545455
								if( ad > -72238.3 )
									ret := 1.000000 // buy
						if( ad_mf > -60299.1 )
							if( ad <= -44935.2 )
								if( ad <= -51035.4 )
									ret := -0.279070
								if( ad > -51035.4 )
									ret := -0.818182 // sell
							if( ad > -44935.2 )
								if( ad <= -1210.34 )
									ret := 0.116181
								if( ad > -1210.34 )
									ret := -0.018547
			if( ad_mf > -0.108712 )
				if( ad_mf <= 15742 )
					if( bullPower <= 0.33928 )
						if( bearPower <= -0.059462 )
							if( ad <= 305.885 )
								if( bbp <= 0.022619 )
									ret := -0.400000
								if( bbp > 0.022619 )
									ret := 0.705882 // buy
							if( ad > 305.885 )
								if( bbm <= 0.413239 )
									ret := -0.121581
								if( bbm > 0.413239 )
									ret := -0.612245
						if( bearPower > -0.059462 )
							if( ad <= 6413.39 )
								if( ad <= 527.727 )
									ret := -0.091228
								if( ad > 527.727 )
									ret := 0.010257
							if( ad > 6413.39 )
								if( bbp <= 0.371409 )
									ret := 0.074878
								if( bbp > 0.371409 )
									ret := 0.276119
					if( bullPower > 0.33928 )
						if( ad_mf <= 1202.83 )
							if( bullPower <= 1.64147 )
								if( ad <= 982.265 )
									ret := -0.258278
								if( ad > 982.265 )
									ret := -0.555556
							if( bullPower > 1.64147 )
								ret := 0.800000 // buy
						if( ad_mf > 1202.83 )
							if( ad <= 15056.2 )
								if( bbp <= 1.78614 )
									ret := -0.051920
								if( bbp > 1.78614 )
									ret := -0.533333
							if( ad > 15056.2 )
								if( bbm <= 0.185181 )
									ret := 0.200000
								if( bbm > 0.185181 )
									ret := -0.653846
				if( ad_mf > 15742 )
					if( bullPower <= 1.11347 )
						if( bbp <= 0.288079 )
							if( bearPower <= -0.283514 )
								if( ad <= 54603 )
									ret := 0.833333 // buy
								if( ad > 54603 )
									ret := 0.000000
							if( bearPower > -0.283514 )
								if( bullPower <= 0.298738 )
									ret := 0.050096
								if( bullPower > 0.298738 )
									ret := -0.285714
						if( bbp > 0.288079 )
							if( ad <= 16247.6 )
								if( bullPower <= 0.272969 )
									ret := -0.600000
								if( bullPower > 0.272969 )
									ret := 0.836735 // buy
							if( ad > 16247.6 )
								if( ad <= 83550.6 )
									ret := 0.227419
								if( ad > 83550.6 )
									ret := -0.196970
					if( bullPower > 1.11347 )
						if( bullPower <= 1.95885 )
							if( bullPower <= 1.64174 )
								if( ad_mf <= 82429.2 )
									ret := -0.560000
								if( ad_mf > 82429.2 )
									ret := -1.000000 // sell
							if( bullPower > 1.64174 )
								ret := 0.500000
						if( bullPower > 1.95885 )
							ret := -1.000000 // sell
	
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


//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf
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
float op_operation = decision_tree_0_SNOW_1Min_5cb10efd(bbm, bearPower, bbp, bullPower, BBPower_Color, mf, ad, ad_mf)

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


