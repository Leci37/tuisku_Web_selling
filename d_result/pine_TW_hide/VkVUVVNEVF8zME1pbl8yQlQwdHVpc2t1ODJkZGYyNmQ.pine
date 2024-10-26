//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: VETUSDT_30Min_2BT0_82ddf26d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_VETUSDT_30Min_2BT0_82ddf26d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_VETUSDT_30Min_82ddf26d(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bbp <= -0.000484 )
		if( tema <= 0.029826 )
			if( ema12 <= -0.000108 )
				if( ema12 <= -0.000436 )
					if( tema <= 0.022317 )
						if( ema3 <= 0.022679 )
							if( tema <= 0.020579 )
								if( bearPower <= -0.000845 )
									ret := 0.669811
								if( bearPower > -0.000845 )
									ret := -0.333333
							if( tema > 0.020579 )
								if( ema3 <= 0.02237 )
									ret := -1.000000 // sell
								if( ema3 > 0.02237 )
									ret := -0.333333
						if( ema3 > 0.022679 )
							if( bbp <= -0.002042 )
								ret := 1.000000 // buy
							if( bbp > -0.002042 )
								if( bbm <= 0.00081 )
									ret := 0.864865 // buy
								if( bbm > 0.00081 )
									ret := -0.500000
					if( tema > 0.022317 )
						if( ema2 <= 0.025906 )
							if( ema1 <= 0.024032 )
								if( ema13 <= -0.000933 )
									ret := 0.581395
								if( ema13 > -0.000933 )
									ret := -0.294118
							if( ema1 > 0.024032 )
								if( bearPower <= -0.00103 )
									ret := -0.837209 // sell
								if( bearPower > -0.00103 )
									ret := -0.222222
						if( ema2 > 0.025906 )
							if( ema3 <= 0.030782 )
								if( bbp <= -0.001447 )
									ret := 0.774390 // buy
								if( bbp > -0.001447 )
									ret := 0.258065
							if( ema3 > 0.030782 )
								if( ema13 <= -0.000977 )
									ret := -0.761905 // sell
								if( ema13 > -0.000977 )
									ret := 0.566667
				if( ema12 > -0.000436 )
					if( tema <= 0.028702 )
						if( ema3 <= 0.028309 )
							if( ema2 <= 0.026758 )
								if( ema2 <= 0.023763 )
									ret := 0.254391
								if( ema2 > 0.023763 )
									ret := 0.053899
							if( ema2 > 0.026758 )
								if( bearPower <= -0.000742 )
									ret := 0.702970 // buy
								if( bearPower > -0.000742 )
									ret := 0.305882
						if( ema3 > 0.028309 )
							if( bullPower <= -0.000195 )
								if( bearPower <= -0.001044 )
									ret := 0.473684
								if( bearPower > -0.001044 )
									ret := -0.386503
							if( bullPower > -0.000195 )
								if( ema1 <= 0.028022 )
									ret := -0.500000
								if( ema1 > 0.028022 )
									ret := 0.354839
					if( tema > 0.028702 )
						if( ema13 <= -0.000122 )
							if( ema2 <= 0.029129 )
								ret := -1.000000 // sell
							if( ema2 > 0.029129 )
								if( ema13 <= -0.000305 )
									ret := 0.401747
								if( ema13 > -0.000305 )
									ret := 0.700000 // buy
						if( ema13 > -0.000122 )
							if( ema3 <= 0.029595 )
								ret := 0.000000
							if( ema3 > 0.029595 )
								ret := -1.000000 // sell
			if( ema12 > -0.000108 )
				if( ema1 <= 0.01984 )
					if( ema1 <= 0.017032 )
						if( ema2 <= 0.014614 )
							if( tema <= 0.013288 )
								if( ema12 <= -0.000104 )
									ret := -0.500000
								if( ema12 > -0.000104 )
									ret := 0.500000
							if( tema > 0.013288 )
								if( ema2 <= 0.01383 )
									ret := -1.000000 // sell
								if( ema2 > 0.01383 )
									ret := -0.250000
						if( ema2 > 0.014614 )
							if( bullPower <= -0.000124 )
								if( ema2 <= 0.016749 )
									ret := 0.000000
								if( ema2 > 0.016749 )
									ret := 0.750000 // buy
							if( bullPower > -0.000124 )
								if( ema3 <= 0.016385 )
									ret := 1.000000 // buy
								if( ema3 > 0.016385 )
									ret := 0.625000
					if( ema1 > 0.017032 )
						if( ema13 <= -0.000115 )
							if( ema1 <= 0.018688 )
								ret := 0.428571
							if( ema1 > 0.018688 )
								ret := -0.500000
						if( ema13 > -0.000115 )
							if( bbm <= 0.000381 )
								if( ema3 <= 0.017925 )
									ret := -1.000000 // sell
								if( ema3 > 0.017925 )
									ret := -0.850000 // sell
							if( bbm > 0.000381 )
								if( bullPower <= -6.7e-05 )
									ret := -0.750000 // sell
								if( bullPower > -6.7e-05 )
									ret := 0.000000
				if( ema1 > 0.01984 )
					if( bullPower <= 5.8e-05 )
						if( ema12 <= -7.2e-05 )
							if( ema3 <= 0.027515 )
								if( bbm <= 0.000213 )
									ret := -0.227273
								if( bbm > 0.000213 )
									ret := 0.385417
							if( ema3 > 0.027515 )
								if( ema3 <= 0.029165 )
									ret := -0.636364
								if( ema3 > 0.029165 )
									ret := 0.080000
						if( ema12 > -7.2e-05 )
							if( ema3 <= 0.01973 )
								ret := 1.000000 // buy
							if( ema3 > 0.01973 )
								if( ema13 <= 4e-05 )
									ret := -0.430769
								if( ema13 > 4e-05 )
									ret := 0.027778
					if( bullPower > 5.8e-05 )
						if( ema2 <= 0.02682 )
							if( bbp <= -0.000643 )
								ret := 1.000000 // buy
							if( bbp > -0.000643 )
								ret := 0.750000 // buy
						if( ema2 > 0.02682 )
							if( ema2 <= 0.028571 )
								ret := 0.000000
							if( ema2 > 0.028571 )
								ret := 1.000000 // buy
		if( tema > 0.029826 )
			if( bullPower <= -0.000616 )
				if( ema12 <= -0.004157 )
					if( bearPower <= -0.007673 )
						if( ema12 <= -0.007192 )
							if( ema2 <= 0.199706 )
								if( bearPower <= -0.019995 )
									ret := 1.000000 // buy
								if( bearPower > -0.019995 )
									ret := 0.500000
							if( ema2 > 0.199706 )
								if( ema1 <= 0.20652 )
									ret := -1.000000 // sell
								if( ema1 > 0.20652 )
									ret := 0.000000
						if( ema12 > -0.007192 )
							if( bullPower <= -0.005139 )
								if( ema12 <= -0.006587 )
									ret := 0.600000
								if( ema12 > -0.006587 )
									ret := 0.978723 // buy
							if( bullPower > -0.005139 )
								if( ema13 <= -0.009701 )
									ret := 0.000000
								if( ema13 > -0.009701 )
									ret := 0.795699 // buy
					if( bearPower > -0.007673 )
						if( ema2 <= 0.15743 )
							if( ema13 <= -0.008722 )
								ret := -0.833333 // sell
							if( ema13 > -0.008722 )
								ret := 0.000000
						if( ema2 > 0.15743 )
							ret := 0.500000
				if( ema12 > -0.004157 )
					if( ema1 <= 0.088076 )
						if( ema2 <= 0.048888 )
							if( bbp <= -0.005333 )
								if( bbm <= 0.001297 )
									ret := 0.500000
								if( bbm > 0.001297 )
									ret := 1.000000 // buy
							if( bbp > -0.005333 )
								if( ema2 <= 0.04748 )
									ret := 0.128713
								if( ema2 > 0.04748 )
									ret := -0.759259 // sell
						if( ema2 > 0.048888 )
							if( ema2 <= 0.050554 )
								if( tema <= 0.04816 )
									ret := 0.969697 // buy
								if( tema > 0.04816 )
									ret := 0.785714 // buy
							if( ema2 > 0.050554 )
								if( bearPower <= -0.006774 )
									ret := 0.838710 // buy
								if( bearPower > -0.006774 )
									ret := 0.274493
					if( ema1 > 0.088076 )
						if( ema1 <= 0.090428 )
							if( ema3 <= 0.091538 )
								if( bearPower <= -0.00235 )
									ret := 0.642857
								if( bearPower > -0.00235 )
									ret := -0.428571
							if( ema3 > 0.091538 )
								if( bullPower <= -0.000797 )
									ret := -0.764706 // sell
								if( bullPower > -0.000797 )
									ret := 0.000000
						if( ema1 > 0.090428 )
							if( ema13 <= -0.001159 )
								if( ema2 <= 0.228998 )
									ret := 0.085359
								if( ema2 > 0.228998 )
									ret := -0.510638
							if( ema13 > -0.001159 )
								if( bbp <= -0.0063 )
									ret := -0.312500
								if( bbp > -0.0063 )
									ret := 0.395954
			if( bullPower > -0.000616 )
				if( ema3 <= 0.210468 )
					if( bullPower <= 0.000193 )
						if( tema <= 0.173844 )
							if( ema3 <= 0.171747 )
								if( ema3 <= 0.030551 )
									ret := -0.462687
								if( ema3 > 0.030551 )
									ret := 0.044991
							if( ema3 > 0.171747 )
								if( bullPower <= 3e-05 )
									ret := 1.000000 // buy
								if( bullPower > 3e-05 )
									ret := 0.250000
						if( tema > 0.173844 )
							if( bbp <= -0.00414 )
								if( bbp <= -0.004592 )
									ret := 0.086957
								if( bbp > -0.004592 )
									ret := 0.833333 // buy
							if( bbp > -0.00414 )
								if( bbp <= -0.001876 )
									ret := -0.563025
								if( bbp > -0.001876 )
									ret := 1.000000 // buy
					if( bullPower > 0.000193 )
						if( ema1 <= 0.201335 )
							if( tema <= 0.162236 )
								if( bbm <= 0.003753 )
									ret := 0.182592
								if( bbm > 0.003753 )
									ret := 0.574586
							if( tema > 0.162236 )
								if( ema12 <= -0.00136 )
									ret := 0.404762
								if( ema12 > -0.00136 )
									ret := -0.122066
						if( ema1 > 0.201335 )
							if( ema12 <= 0.00071 )
								if( ema12 <= -0.001138 )
									ret := 0.500000
								if( ema12 > -0.001138 )
									ret := 0.925926 // buy
							if( ema12 > 0.00071 )
								ret := 0.428571
				if( ema3 > 0.210468 )
					if( bbm <= 0.007952 )
						if( ema13 <= 0.001803 )
							if( bullPower <= -0.000342 )
								if( bbm <= 0.00467 )
									ret := -0.600000
								if( bbm > 0.00467 )
									ret := 0.538462
							if( bullPower > -0.000342 )
								if( ema13 <= 0.000123 )
									ret := -0.672222
								if( ema13 > 0.000123 )
									ret := -0.291667
						if( ema13 > 0.001803 )
							if( tema <= 0.239396 )
								ret := 0.857143 // buy
							if( tema > 0.239396 )
								ret := 0.250000
					if( bbm > 0.007952 )
						if( ema3 <= 0.231732 )
							if( ema3 <= 0.219409 )
								ret := -0.200000
							if( ema3 > 0.219409 )
								if( bbm <= 0.009255 )
									ret := 0.500000
								if( bbm > 0.009255 )
									ret := 1.000000 // buy
						if( ema3 > 0.231732 )
							if( ema12 <= -0.004156 )
								ret := 1.000000 // buy
							if( ema12 > -0.004156 )
								if( bullPower <= 0.002739 )
									ret := -0.764706 // sell
								if( bullPower > 0.002739 )
									ret := 0.500000
	if( bbp > -0.000484 )
		if( ema3 <= 0.022838 )
			if( bbm <= 0.000141 )
				if( tema <= 0.009196 )
					if( ema12 <= -5.6e-05 )
						if( ema13 <= -0.000237 )
							ret := 0.750000 // buy
						if( ema13 > -0.000237 )
							ret := 1.000000 // buy
					if( ema12 > -5.6e-05 )
						ret := 0.500000
				if( tema > 0.009196 )
					if( bearPower <= 6.3e-05 )
						if( ema1 <= 0.009677 )
							if( ema1 <= 0.009506 )
								if( bearPower <= -0.000185 )
									ret := -1.000000 // sell
								if( bearPower > -0.000185 )
									ret := 0.181818
							if( ema1 > 0.009506 )
								if( bbm <= 9.3e-05 )
									ret := -1.000000 // sell
								if( bbm > 9.3e-05 )
									ret := -0.733333 // sell
						if( ema1 > 0.009677 )
							if( ema3 <= 0.010027 )
								if( bbp <= -0.000137 )
									ret := -0.111111
								if( bbp > -0.000137 )
									ret := 0.529412
							if( ema3 > 0.010027 )
								if( ema2 <= 0.010513 )
									ret := -0.370370
								if( ema2 > 0.010513 )
									ret := 0.008139
					if( bearPower > 6.3e-05 )
						if( tema <= 0.012873 )
							if( ema1 <= 0.011565 )
								if( ema3 <= 0.009792 )
									ret := -0.541667
								if( ema3 > 0.009792 )
									ret := 0.265823
							if( ema1 > 0.011565 )
								if( ema3 <= 0.011585 )
									ret := -0.818182 // sell
								if( ema3 > 0.011585 )
									ret := -0.288136
						if( tema > 0.012873 )
							if( ema3 <= 0.012729 )
								if( bbm <= 0.000119 )
									ret := 0.933333 // buy
								if( bbm > 0.000119 )
									ret := 0.500000
							if( ema3 > 0.012729 )
								if( ema2 <= 0.012822 )
									ret := -1.000000 // sell
								if( ema2 > 0.012822 )
									ret := 0.133712
			if( bbm > 0.000141 )
				if( ema12 <= 0.000575 )
					if( bullPower <= 0.000291 )
						if( ema1 <= 0.011514 )
							if( ema13 <= 3.9e-05 )
								if( ema13 <= -0.000146 )
									ret := 0.547368
								if( ema13 > -0.000146 )
									ret := -0.134409
							if( ema13 > 3.9e-05 )
								if( tema <= 0.011117 )
									ret := 0.802817 // buy
								if( tema > 0.011117 )
									ret := 0.403226
						if( ema1 > 0.011514 )
							if( ema2 <= 0.011606 )
								if( bbm <= 0.000168 )
									ret := -0.645161
								if( bbm > 0.000168 )
									ret := -0.081081
							if( ema2 > 0.011606 )
								if( ema2 <= 0.022422 )
									ret := 0.099541
								if( ema2 > 0.022422 )
									ret := -0.028037
					if( bullPower > 0.000291 )
						if( ema13 <= 0.000337 )
							if( ema1 <= 0.010284 )
								if( ema13 <= 0.000167 )
									ret := -0.083333
								if( ema13 > 0.000167 )
									ret := -1.000000 // sell
							if( ema1 > 0.010284 )
								if( ema3 <= 0.02264 )
									ret := 0.262680
								if( ema3 > 0.02264 )
									ret := 0.547826
						if( ema13 > 0.000337 )
							if( ema2 <= 0.022873 )
								if( bbp <= 0.000907 )
									ret := 0.134206
								if( bbp > 0.000907 )
									ret := -0.062874
							if( ema2 > 0.022873 )
								if( bbm <= 0.000194 )
									ret := -0.500000
								if( bbm > 0.000194 )
									ret := 0.800000 // buy
				if( ema12 > 0.000575 )
					if( bearPower <= 0.000503 )
						ret := 0.333333
					if( bearPower > 0.000503 )
						if( bullPower <= 0.001606 )
							ret := -1.000000 // sell
						if( bullPower > 0.001606 )
							if( bullPower <= 0.00177 )
								ret := -0.250000
							if( bullPower > 0.00177 )
								ret := -1.000000 // sell
		if( ema3 > 0.022838 )
			if( ema13 <= 0.000108 )
				if( ema1 <= 0.192891 )
					if( bearPower <= -0.000509 )
						if( ema12 <= -0.000275 )
							if( bbm <= 0.000635 )
								if( bbm <= 0.000601 )
									ret := 0.000000
								if( bbm > 0.000601 )
									ret := -0.875000 // sell
							if( bbm > 0.000635 )
								if( ema2 <= 0.108267 )
									ret := 0.431298
								if( ema2 > 0.108267 )
									ret := 0.154206
						if( ema12 > -0.000275 )
							if( tema <= 0.122512 )
								if( bearPower <= -0.00097 )
									ret := -0.380531
								if( bearPower > -0.00097 )
									ret := 0.046458
							if( tema > 0.122512 )
								if( ema13 <= -0.000283 )
									ret := 0.087379
								if( ema13 > -0.000283 )
									ret := 0.489583
					if( bearPower > -0.000509 )
						if( bbp <= 0.000335 )
							if( ema3 <= 0.032743 )
								if( ema3 <= 0.031112 )
									ret := -0.028341
								if( ema3 > 0.031112 )
									ret := -0.239680
							if( ema3 > 0.032743 )
								if( ema2 <= 0.035262 )
									ret := 0.190476
								if( ema2 > 0.035262 )
									ret := -0.004690
						if( bbp > 0.000335 )
							if( ema2 <= 0.026821 )
								if( bbm <= 0.000518 )
									ret := -0.215962
								if( bbm > 0.000518 )
									ret := -0.691176
							if( ema2 > 0.026821 )
								if( bullPower <= 0.00138 )
									ret := -0.053536
								if( bullPower > 0.00138 )
									ret := -0.200466
				if( ema1 > 0.192891 )
					if( ema3 <= 0.201469 )
						if( ema3 <= 0.199048 )
							if( tema <= 0.194481 )
								ret := -1.000000 // sell
							if( tema > 0.194481 )
								if( bbp <= 0.000392 )
									ret := -0.785714 // sell
								if( bbp > 0.000392 )
									ret := -0.357143
						if( ema3 > 0.199048 )
							ret := -1.000000 // sell
					if( ema3 > 0.201469 )
						if( ema13 <= -0.000917 )
							if( ema2 <= 0.209176 )
								ret := 0.333333
							if( ema2 > 0.209176 )
								if( bbm <= 0.009971 )
									ret := -0.793651 // sell
								if( bbm > 0.009971 )
									ret := 0.200000
						if( ema13 > -0.000917 )
							if( ema3 <= 0.230195 )
								if( ema3 <= 0.220538 )
									ret := 0.812500 // buy
								if( ema3 > 0.220538 )
									ret := 0.200000
							if( ema3 > 0.230195 )
								if( ema3 <= 0.231793 )
									ret := -1.000000 // sell
								if( ema3 > 0.231793 )
									ret := -0.750000 // sell
			if( ema13 > 0.000108 )
				if( ema13 <= 0.002622 )
					if( bbm <= 0.001161 )
						if( ema3 <= 0.029925 )
							if( ema1 <= 0.030069 )
								if( ema3 <= 0.023819 )
									ret := -0.052721
								if( ema3 > 0.023819 )
									ret := 0.081791
							if( ema1 > 0.030069 )
								if( bbm <= 0.000579 )
									ret := 0.699115
								if( bbm > 0.000579 )
									ret := -0.160000
						if( ema3 > 0.029925 )
							if( ema2 <= 0.033277 )
								if( ema2 <= 0.032943 )
									ret := -0.093057
								if( ema2 > 0.032943 )
									ret := -0.532710
							if( ema2 > 0.033277 )
								if( ema3 <= 0.03548 )
									ret := 0.200663
								if( ema3 > 0.03548 )
									ret := 0.012426
					if( bbm > 0.001161 )
						if( ema3 <= 0.057118 )
							if( ema3 <= 0.051103 )
								if( ema1 <= 0.049753 )
									ret := -0.037879
								if( ema1 > 0.049753 )
									ret := 0.488636
							if( ema3 > 0.051103 )
								if( bullPower <= 0.002125 )
									ret := -0.305556
								if( bullPower > 0.002125 )
									ret := -0.822581 // sell
						if( ema3 > 0.057118 )
							if( bullPower <= 0.004087 )
								if( ema12 <= 0.000448 )
									ret := 0.031579
								if( ema12 > 0.000448 )
									ret := 0.209067
							if( bullPower > 0.004087 )
								if( ema1 <= 0.110232 )
									ret := 0.222222
								if( ema1 > 0.110232 )
									ret := -0.264286
				if( ema13 > 0.002622 )
					if( ema3 <= 0.13565 )
						if( tema <= 0.109599 )
							if( bbm <= 0.002665 )
								if( tema <= 0.100911 )
									ret := -0.304054
								if( tema > 0.100911 )
									ret := 0.344828
							if( bbm > 0.002665 )
								if( bearPower <= 0.002511 )
									ret := 0.617647
								if( bearPower > 0.002511 )
									ret := 0.000000
						if( tema > 0.109599 )
							if( ema13 <= 0.005026 )
								if( ema2 <= 0.107667 )
									ret := -0.851852 // sell
								if( ema2 > 0.107667 )
									ret := -0.362264
							if( ema13 > 0.005026 )
								if( bearPower <= 0.003398 )
									ret := 0.263889
								if( bearPower > 0.003398 )
									ret := -0.625000
					if( ema3 > 0.13565 )
						if( ema3 <= 0.199395 )
							if( tema <= 0.20542 )
								if( bullPower <= 0.007052 )
									ret := 0.283753
								if( bullPower > 0.007052 )
									ret := -0.302752
							if( tema > 0.20542 )
								if( ema2 <= 0.185923 )
									ret := 0.500000
								if( ema2 > 0.185923 )
									ret := 0.975000 // buy
						if( ema3 > 0.199395 )
							if( ema1 <= 0.218607 )
								if( ema13 <= 0.004266 )
									ret := -0.833333 // sell
								if( ema13 > 0.004266 )
									ret := -0.960784 // sell
							if( ema1 > 0.218607 )
								if( tema <= 0.23498 )
									ret := 0.742424 // buy
								if( tema > 0.23498 )
									ret := -0.280000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_VETUSDT_30Min_82ddf26d(bbp, bullPower, BBPower_Color, bearPower, bbm, ema2, tema, ema12, ema3, ema1, ema13)

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


