//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Vortex_Indicator
// ID_model: MSFT_1Min_2BV0_bc81ea27 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2BV0_bc81ea27", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_bc81ea27(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.326725 )
		if( VIP <= 1.12395 )
			if( bbm <= 1.20818 )
				if( VIM <= 1.50075 )
					if( VIM <= 1.19104 )
						if( bullPower <= 0.255262 )
							if( VIP <= 1.06634 )
								if( bbp <= -1.1089 )
									ret := 0.001799
								if( bbp > -1.1089 )
									ret := 0.118066
							if( VIP > 1.06634 )
								if( bbm <= 0.328084 )
									ret := -0.331288
								if( bbm > 0.328084 )
									ret := 0.084746
						if( bullPower > 0.255262 )
							if( VIP <= 0.98874 )
								if( VIM <= 1.0762 )
									ret := 0.722222 // buy
								if( VIM > 1.0762 )
									ret := 1.000000 // buy
							if( VIP > 0.98874 )
								if( bearPower <= -0.674768 )
									ret := 0.600000
								if( bearPower > -0.674768 )
									ret := -0.800000 // sell
					if( VIM > 1.19104 )
						if( bullPower <= 0.030857 )
							if( bearPower <= -0.996127 )
								if( VIP <= 0.782932 )
									ret := 0.042146
								if( VIP > 0.782932 )
									ret := 0.407692
							if( bearPower > -0.996127 )
								if( bullPower <= -0.65522 )
									ret := 0.377778
								if( bullPower > -0.65522 )
									ret := -0.017576
						if( bullPower > 0.030857 )
							if( bbp <= -0.818505 )
								if( VIP <= 0.797173 )
									ret := -1.000000 // sell
								if( VIP > 0.797173 )
									ret := -0.500000
							if( bbp > -0.818505 )
								if( VIM <= 1.28177 )
									ret := 0.595506
								if( VIM > 1.28177 )
									ret := 0.028571
				if( VIM > 1.50075 )
					if( bbm <= 0.310327 )
						if( VIM <= 1.78585 )
							if( bullPower <= -0.360993 )
								if( bearPower <= -0.630005 )
									ret := 0.428571
								if( bearPower > -0.630005 )
									ret := 0.824176 // buy
							if( bullPower > -0.360993 )
								if( bbp <= -0.659413 )
									ret := -0.200000
								if( bbp > -0.659413 )
									ret := 0.454545
						if( VIM > 1.78585 )
							if( bullPower <= -0.589289 )
								if( bullPower <= -1.40227 )
									ret := 1.000000 // buy
								if( bullPower > -1.40227 )
									ret := 0.525000
							if( bullPower > -0.589289 )
								if( bbm <= 0.014968 )
									ret := 0.100000
								if( bbm > 0.014968 )
									ret := -0.311688
					if( bbm > 0.310327 )
						if( bullPower <= -1.54609 )
							if( VIP_VIM <= -0.823518 )
								if( bullPower <= -1.84914 )
									ret := -1.000000 // sell
								if( bullPower > -1.84914 )
									ret := -0.444444
							if( VIP_VIM > -0.823518 )
								ret := 0.500000
						if( bullPower > -1.54609 )
							if( VIM <= 1.57615 )
								if( bullPower <= -0.353638 )
									ret := 0.184783
								if( bullPower > -0.353638 )
									ret := 0.615385
							if( VIM > 1.57615 )
								if( VIP_VIM <= -0.996909 )
									ret := 0.344828
								if( VIP_VIM > -0.996909 )
									ret := -0.373737
			if( bbm > 1.20818 )
				if( bullPower <= 0.077099 )
					if( bbp <= -2.28536 )
						if( bullPower <= -0.590119 )
							if( VIP <= 0.709511 )
								if( bearPower <= -4.91362 )
									ret := 1.000000 // buy
								if( bearPower > -4.91362 )
									ret := -0.076923
							if( VIP > 0.709511 )
								if( bearPower <= -2.57418 )
									ret := 0.980392 // buy
								if( bearPower > -2.57418 )
									ret := 0.400000
						if( bullPower > -0.590119 )
							if( bullPower <= -0.117265 )
								if( VIM <= 1.11156 )
									ret := 0.300000
								if( VIM > 1.11156 )
									ret := -0.615385
							if( bullPower > -0.117265 )
								if( VIP_VIM <= -0.874153 )
									ret := 0.500000
								if( VIP_VIM > -0.874153 )
									ret := 1.000000 // buy
					if( bbp > -2.28536 )
						if( bearPower <= -1.38207 )
							if( VIP <= 0.689284 )
								if( VIP_VIM <= -0.557634 )
									ret := 0.733333 // buy
								if( VIP_VIM > -0.557634 )
									ret := -0.250000
							if( VIP > 0.689284 )
								if( VIM <= 0.969538 )
									ret := 0.400000
								if( VIM > 0.969538 )
									ret := 0.906977 // buy
						if( bearPower > -1.38207 )
							if( VIM <= 1.17501 )
								if( VIP_VIM <= -0.264887 )
									ret := -1.000000 // sell
								if( VIP_VIM > -0.264887 )
									ret := 0.750000 // buy
							if( VIM > 1.17501 )
								if( bbm <= 1.25848 )
									ret := 0.750000 // buy
								if( bbm > 1.25848 )
									ret := 1.000000 // buy
				if( bullPower > 0.077099 )
					if( VIM <= 1.00976 )
						if( bullPower <= 0.44219 )
							if( VIP <= 0.91914 )
								if( bearPower <= -1.30151 )
									ret := -0.250000
								if( bearPower > -1.30151 )
									ret := -1.000000 // sell
							if( VIP > 0.91914 )
								if( bbm <= 1.42745 )
									ret := 0.000000
								if( bbm > 1.42745 )
									ret := 0.894737 // buy
						if( bullPower > 0.44219 )
							if( bearPower <= -4.6697 )
								if( bbp <= -6.65225 )
									ret := -1.000000 // sell
								if( bbp > -6.65225 )
									ret := 1.000000 // buy
							if( bearPower > -4.6697 )
								if( bbp <= -0.903294 )
									ret := -0.370370
								if( bbp > -0.903294 )
									ret := -0.800000 // sell
					if( VIM > 1.00976 )
						if( VIM <= 1.28436 )
							if( bullPower <= 0.550982 )
								if( bearPower <= -1.94693 )
									ret := -0.520000
								if( bearPower > -1.94693 )
									ret := 0.194631
							if( bullPower > 0.550982 )
								if( bearPower <= -1.69413 )
									ret := 0.428571
								if( bearPower > -1.69413 )
									ret := 0.942857 // buy
						if( VIM > 1.28436 )
							if( bearPower <= -1.84229 )
								if( bbm <= 2.99981 )
									ret := 1.000000 // buy
								if( bbm > 2.99981 )
									ret := 0.000000
							if( bearPower > -1.84229 )
								if( bearPower <= -1.2832 )
									ret := -0.875000 // sell
								if( bearPower > -1.2832 )
									ret := -0.157895
		if( VIP > 1.12395 )
			if( bullPower <= -0.483728 )
				if( bearPower <= -1.15445 )
					if( VIP_VIM <= -1.54034 )
						if( VIM <= 8.35646 )
							if( VIM <= 5.51488 )
								ret := 0.000000
							if( VIM > 5.51488 )
								if( VIP_VIM <= -1.96953 )
									ret := -0.500000
								if( VIP_VIM > -1.96953 )
									ret := -0.950000 // sell
						if( VIM > 8.35646 )
							if( bbp <= -2.9115 )
								ret := 0.750000 // buy
							if( bbp > -2.9115 )
								ret := 0.000000
					if( VIP_VIM > -1.54034 )
						if( bullPower <= -1.48267 )
							if( VIP_VIM <= 0.77881 )
								if( bbp <= -3.90111 )
									ret := 0.545455
								if( bbp > -3.90111 )
									ret := 0.916667 // buy
							if( VIP_VIM > 0.77881 )
								ret := -0.400000
						if( bullPower > -1.48267 )
							if( VIP <= 4.47143 )
								if( bullPower <= -0.938343 )
									ret := -0.416667
								if( bullPower > -0.938343 )
									ret := 0.375000
							if( VIP > 4.47143 )
								if( VIP_VIM <= -0.964765 )
									ret := -0.250000
								if( VIP_VIM > -0.964765 )
									ret := 0.840000 // buy
				if( bearPower > -1.15445 )
					if( VIM <= 6.31259 )
						if( VIP_VIM <= 0.756636 )
							if( VIP_VIM <= -0.612679 )
								if( VIP <= 4.52941 )
									ret := 0.360784
								if( VIP > 4.52941 )
									ret := 0.909091 // buy
							if( VIP_VIM > -0.612679 )
								if( VIP_VIM <= -0.299953 )
									ret := 0.763636 // buy
								if( VIP_VIM > -0.299953 )
									ret := 0.527660
						if( VIP_VIM > 0.756636 )
							if( VIP_VIM <= 0.828547 )
								ret := -1.000000 // sell
							if( VIP_VIM > 0.828547 )
								ret := -0.142857
					if( VIM > 6.31259 )
						if( VIP <= 7.93898 )
							if( VIP <= 6.75934 )
								if( VIM <= 7.08792 )
									ret := 0.000000
								if( VIM > 7.08792 )
									ret := 0.764706 // buy
							if( VIP > 6.75934 )
								if( VIP_VIM <= -1.31232 )
									ret := 0.571429
								if( VIP_VIM > -1.31232 )
									ret := -0.444444
						if( VIP > 7.93898 )
							if( VIM <= 125.444 )
								if( VIM <= 30.7625 )
									ret := 0.407407
								if( VIM > 30.7625 )
									ret := 0.744186 // buy
							if( VIM > 125.444 )
								if( VIP <= 369.067 )
									ret := 0.000000
								if( VIP > 369.067 )
									ret := -0.500000
			if( bullPower > -0.483728 )
				if( VIP_VIM <= 0.009257 )
					if( VIP <= 8.29753 )
						if( VIP <= 3.72167 )
							if( VIM <= 2.7203 )
								if( VIP_VIM <= -0.731375 )
									ret := -0.118644
								if( VIP_VIM > -0.731375 )
									ret := 0.122432
							if( VIM > 2.7203 )
								if( VIP <= 2.65782 )
									ret := 0.341518
								if( VIP > 2.65782 )
									ret := 0.058659
						if( VIP > 3.72167 )
							if( bbm <= 0.000494 )
								if( VIM <= 3.90734 )
									ret := -1.000000 // sell
								if( VIM > 3.90734 )
									ret := 0.255814
							if( bbm > 0.000494 )
								if( bbp <= -0.366767 )
									ret := 0.612319
								if( bbp > -0.366767 )
									ret := 0.000000
					if( VIP > 8.29753 )
						if( VIM <= 8.86033 )
							ret := -1.000000 // sell
						if( VIM > 8.86033 )
							if( VIM <= 12.6821 )
								if( VIP <= 10.7824 )
									ret := -0.074380
								if( VIP > 10.7824 )
									ret := 0.560976
							if( VIM > 12.6821 )
								if( VIM <= 19.7607 )
									ret := -0.323699
								if( VIM > 19.7607 )
									ret := 0.013333
				if( VIP_VIM > 0.009257 )
					if( bbm <= 0.260331 )
						if( VIP <= 1.30874 )
							if( VIM <= 0.889238 )
								ret := 0.714286 // buy
							if( VIM > 0.889238 )
								if( bbm <= 0.188819 )
									ret := -0.088889
								if( bbm > 0.188819 )
									ret := -0.526316
						if( VIP > 1.30874 )
							if( VIP_VIM <= 1.10764 )
								if( bullPower <= -0.404477 )
									ret := 0.628571
								if( bullPower > -0.404477 )
									ret := 0.297521
							if( VIP_VIM > 1.10764 )
								if( VIP <= 20.5487 )
									ret := -0.089286
								if( VIP > 20.5487 )
									ret := 0.466667
					if( bbm > 0.260331 )
						if( bbm <= 1.5528 )
							if( VIP <= 1.37474 )
								if( VIP_VIM <= 0.167396 )
									ret := -0.263158
								if( VIP_VIM > 0.167396 )
									ret := 0.554054
							if( VIP > 1.37474 )
								if( bbp <= -0.502156 )
									ret := 0.483333
								if( bbp > -0.502156 )
									ret := 0.836066 // buy
						if( bbm > 1.5528 )
							ret := -0.600000
	if( bbp > -0.326725 )
		if( bbp <= 0.959093 )
			if( bearPower <= -0.808585 )
				if( VIM <= 0.79336 )
					if( bbp <= 0.798291 )
						ret := 1.000000 // buy
					if( bbp > 0.798291 )
						ret := 0.750000 // buy
				if( VIM > 0.79336 )
					if( BBPower_Color <= 0.5 )
						if( bullPower <= 1.19489 )
							if( VIP <= 0.936364 )
								if( bbp <= -0.255255 )
									ret := -0.750000 // sell
								if( bbp > -0.255255 )
									ret := 0.400000
							if( VIP > 0.936364 )
								if( bearPower <= -0.816232 )
									ret := -0.772727 // sell
								if( bearPower > -0.816232 )
									ret := 0.333333
						if( bullPower > 1.19489 )
							ret := 1.000000 // buy
					if( BBPower_Color > 0.5 )
						if( VIP <= 1.13291 )
							if( VIM <= 0.821682 )
								ret := -0.600000
							if( VIM > 0.821682 )
								if( bbm <= 2.04956 )
									ret := -0.857143 // sell
								if( bbm > 2.04956 )
									ret := -0.968750 // sell
						if( VIP > 1.13291 )
							ret := 0.500000
			if( bearPower > -0.808585 )
				if( VIP_VIM <= 0.20338 )
					if( bearPower <= 0.328494 )
						if( bullPower <= 0.617165 )
							if( VIM <= 6.10727 )
								if( VIP_VIM <= -0.815466 )
									ret := -0.119622
								if( VIP_VIM > -0.815466 )
									ret := 0.025184
							if( VIM > 6.10727 )
								if( VIM <= 6.60444 )
									ret := 0.390351
								if( VIM > 6.60444 )
									ret := 0.060671
						if( bullPower > 0.617165 )
							if( VIM <= 0.988433 )
								if( bbm <= 0.654608 )
									ret := -0.478022
								if( bbm > 0.654608 )
									ret := -0.049738
							if( VIM > 0.988433 )
								if( VIP <= 0.884887 )
									ret := -0.590909
								if( VIP > 0.884887 )
									ret := 0.111748
					if( bearPower > 0.328494 )
						if( bullPower <= 0.509884 )
							if( VIP_VIM <= -1.53148 )
								if( VIP_VIM <= -1.85897 )
									ret := 0.222222
								if( VIP_VIM > -1.85897 )
									ret := 0.800000 // buy
							if( VIP_VIM > -1.53148 )
								if( bbp <= 0.692341 )
									ret := -0.548387
								if( bbp > 0.692341 )
									ret := -0.230769
						if( bullPower > 0.509884 )
							if( VIP <= 1.39732 )
								if( bearPower <= 0.334529 )
									ret := -0.750000 // sell
								if( bearPower > 0.334529 )
									ret := 0.133333
							if( VIP > 1.39732 )
								if( bullPower <= 0.531609 )
									ret := 0.250000
								if( bullPower > 0.531609 )
									ret := 1.000000 // buy
				if( VIP_VIM > 0.20338 )
					if( bbm <= 1.32021 )
						if( bullPower <= -0.086449 )
							if( VIP_VIM <= 1.42738 )
								if( bbp <= -0.309508 )
									ret := 0.645833
								if( bbp > -0.309508 )
									ret := 0.293970
							if( VIP_VIM > 1.42738 )
								if( VIP_VIM <= 2.5809 )
									ret := -0.200000
								if( VIP_VIM > 2.5809 )
									ret := 0.666667
						if( bullPower > -0.086449 )
							if( VIP <= 1.44666 )
								if( bbp <= 0.362933 )
									ret := 0.012818
								if( bbp > 0.362933 )
									ret := 0.120852
							if( VIP > 1.44666 )
								if( VIM <= 8.46377 )
									ret := -0.023761
								if( VIM > 8.46377 )
									ret := 0.116564
					if( bbm > 1.32021 )
						if( bullPower <= 1.05068 )
							if( VIP_VIM <= 0.280947 )
								if( bullPower <= 0.68127 )
									ret := -1.000000 // sell
								if( bullPower > 0.68127 )
									ret := -0.125000
							if( VIP_VIM > 0.280947 )
								if( bearPower <= -0.650378 )
									ret := -0.500000
								if( bearPower > -0.650378 )
									ret := -1.000000 // sell
						if( bullPower > 1.05068 )
							if( bbp <= 0.560391 )
								ret := 1.000000 // buy
							if( bbp > 0.560391 )
								if( VIM <= 0.83044 )
									ret := 0.000000
								if( VIM > 0.83044 )
									ret := -0.666667
		if( bbp > 0.959093 )
			if( bbp <= 1.74125 )
				if( VIP_VIM <= 0.719475 )
					if( VIM <= 0.736635 )
						if( bullPower <= 1.33011 )
							if( bullPower <= 0.661836 )
								if( bbm <= 0.123685 )
									ret := -0.222222
								if( bbm > 0.123685 )
									ret := 0.575000
							if( bullPower > 0.661836 )
								if( bearPower <= 0.612799 )
									ret := 0.109875
								if( bearPower > 0.612799 )
									ret := -0.391304
						if( bullPower > 1.33011 )
							if( VIP <= 1.19354 )
								if( bullPower <= 1.86264 )
									ret := -0.250000
								if( bullPower > 1.86264 )
									ret := -0.875000 // sell
							if( VIP > 1.19354 )
								if( VIP <= 1.23886 )
									ret := -1.000000 // sell
								if( VIP > 1.23886 )
									ret := -0.750000 // sell
					if( VIM > 0.736635 )
						if( bbm <= 0.505367 )
							if( VIP_VIM <= 0.481419 )
								if( bbp <= 1.12964 )
									ret := 0.115635
								if( bbp > 1.12964 )
									ret := -0.040816
							if( VIP_VIM > 0.481419 )
								if( VIP <= 2.96338 )
									ret := -0.312155
								if( VIP > 2.96338 )
									ret := 0.150000
						if( bbm > 0.505367 )
							if( VIP <= 1.24446 )
								if( VIP <= 1.18874 )
									ret := -0.170077
								if( VIP > 1.18874 )
									ret := -0.509317
							if( VIP > 1.24446 )
								if( bullPower <= 1.40543 )
									ret := -0.017544
								if( bullPower > 1.40543 )
									ret := 0.789474 // buy
				if( VIP_VIM > 0.719475 )
					if( VIM <= 3.32821 )
						if( VIP <= 1.50801 )
							if( bearPower <= 0.411183 )
								if( bbm <= 0.54 )
									ret := 0.183486
								if( bbm > 0.54 )
									ret := -0.619048
							if( bearPower > 0.411183 )
								if( bullPower <= 1.05972 )
									ret := -0.293210
								if( bullPower > 1.05972 )
									ret := 0.666667
						if( VIP > 1.50801 )
							if( bearPower <= 0.585203 )
								if( bbm <= 0.438981 )
									ret := -0.717703 // sell
								if( bbm > 0.438981 )
									ret := -0.450000
							if( bearPower > 0.585203 )
								if( VIP <= 2.64011 )
									ret := -0.627907
								if( VIP > 2.64011 )
									ret := 0.191919
					if( VIM > 3.32821 )
						if( VIM <= 3.73342 )
							if( VIP <= 5.35435 )
								if( bullPower <= 0.524987 )
									ret := 0.142857
								if( bullPower > 0.524987 )
									ret := 0.897959 // buy
							if( VIP > 5.35435 )
								if( bbp <= 1.1699 )
									ret := -0.750000 // sell
								if( bbp > 1.1699 )
									ret := 0.000000
						if( VIM > 3.73342 )
							if( VIP_VIM <= 1.06658 )
								if( VIM <= 8.32897 )
									ret := -0.411765
								if( VIM > 8.32897 )
									ret := 0.526316
							if( VIP_VIM > 1.06658 )
								if( VIP <= 20.55 )
									ret := -0.456000
								if( VIP > 20.55 )
									ret := 0.187500
			if( bbp > 1.74125 )
				if( bbm <= 4.0387 )
					if( VIP_VIM <= 1.37129 )
						if( bullPower <= 3.61248 )
							if( VIP_VIM <= 0.518932 )
								if( bbp <= 2.45619 )
									ret := 0.025180
								if( bbp > 2.45619 )
									ret := -0.276667
							if( VIP_VIM > 0.518932 )
								if( VIP <= 1.29838 )
									ret := 0.457895
								if( VIP > 1.29838 )
									ret := 0.018905
						if( bullPower > 3.61248 )
							if( bbm <= 3.7044 )
								if( bearPower <= 2.00104 )
									ret := -0.250000
								if( bearPower > 2.00104 )
									ret := -0.968750 // sell
							if( bbm > 3.7044 )
								ret := 0.400000
					if( VIP_VIM > 1.37129 )
						if( bullPower <= 0.919827 )
							ret := -0.285714
						if( bullPower > 0.919827 )
							if( VIM <= 0.956329 )
								if( VIP <= 1.88796 )
									ret := 0.600000
								if( VIP > 1.88796 )
									ret := 0.962963 // buy
							if( VIM > 0.956329 )
								if( VIM <= 1.09987 )
									ret := -0.071429
								if( VIM > 1.09987 )
									ret := 0.626866
				if( bbm > 4.0387 )
					if( VIP_VIM <= 0.245269 )
						if( bullPower <= 6.40918 )
							ret := 0.666667
						if( bullPower > 6.40918 )
							ret := 1.000000 // buy
					if( VIP_VIM > 0.245269 )
						if( VIP_VIM <= 0.827399 )
							if( bbp <= 10.403 )
								if( bearPower <= 0.831026 )
									ret := 0.888889 // buy
								if( bearPower > 0.831026 )
									ret := -0.500000
							if( bbp > 10.403 )
								if( bbp <= 16.0748 )
									ret := -0.666667
								if( bbp > 16.0748 )
									ret := 0.000000
						if( VIP_VIM > 0.827399 )
							ret := 1.000000 // buy
	
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
float op_operation = decision_tree_0_MSFT_1Min_bc81ea27(bearPower, bbm, bbp, bullPower, BBPower_Color, VIP, VIP_VIM, VIM)

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


