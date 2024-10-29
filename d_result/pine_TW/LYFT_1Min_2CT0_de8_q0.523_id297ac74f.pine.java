//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: LYFT_1Min_2CT0_297ac74f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_1Min_2CT0_297ac74f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_1Min_297ac74f(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= 0.618612 )
		if( ema12 <= 0.002516 )
			if( ad_mf <= -1522.58 )
				if( ema3 <= 15.7319 )
					if( ad_mf <= -256806 )
						if( ad_mf <= -572745 )
							if( ad <= -723980 )
								if( ema3 <= 12.1288 )
									ret := 0.250000
								if( ema3 > 12.1288 )
									ret := 0.857143 // buy
							if( ad > -723980 )
								ret := -1.000000 // sell
						if( ad_mf > -572745 )
							if( ema2 <= 12.2817 )
								if( mf <= -0.301359 )
									ret := 0.800000 // buy
								if( mf > -0.301359 )
									ret := 1.000000 // buy
							if( ema2 > 12.2817 )
								if( ad <= -420044 )
									ret := 0.909091 // buy
								if( ad > -420044 )
									ret := 0.260870
					if( ad_mf > -256806 )
						if( ad <= -169573 )
							if( ad_mf <= -195899 )
								if( ema13 <= -0.065032 )
									ret := 0.714286 // buy
								if( ema13 > -0.065032 )
									ret := -0.230769
							if( ad_mf > -195899 )
								if( ad_mf <= -185408 )
									ret := -0.916667 // sell
								if( ad_mf > -185408 )
									ret := -0.500000
						if( ad > -169573 )
							if( ad <= -1532.56 )
								if( ema3 <= 11.2831 )
									ret := 0.194336
								if( ema3 > 11.2831 )
									ret := 0.117779
							if( ad > -1532.56 )
								if( ema1 <= 12.652 )
									ret := -0.500000
								if( ema1 > 12.652 )
									ret := -0.900000 // sell
				if( ema3 > 15.7319 )
					if( ad_mf <= -60877.6 )
						if( mf <= -0.00357 )
							if( ad <= -62988.3 )
								if( tema <= 16.2118 )
									ret := 0.254717
								if( tema > 16.2118 )
									ret := -0.051095
							if( ad > -62988.3 )
								if( ad <= -61840.7 )
									ret := 0.800000 // buy
								if( ad > -61840.7 )
									ret := 1.000000 // buy
						if( mf > -0.00357 )
							if( ad <= -93236.1 )
								if( ema12 <= -0.007325 )
									ret := 1.000000 // buy
								if( ema12 > -0.007325 )
									ret := 0.500000
							if( ad > -93236.1 )
								if( ema12 <= -0.008348 )
									ret := -0.333333
								if( ema12 > -0.008348 )
									ret := 0.705882 // buy
					if( ad_mf > -60877.6 )
						if( ad <= -2447.45 )
							if( mf <= -0.067137 )
								if( ema13 <= 0.013808 )
									ret := -0.050694
								if( ema13 > 0.013808 )
									ret := -0.909091 // sell
							if( mf > -0.067137 )
								if( ad <= -4582.22 )
									ret := 0.074106
								if( ad > -4582.22 )
									ret := -0.141700
						if( ad > -2447.45 )
							if( ema13 <= -0.031823 )
								if( ad_mf <= -2165.91 )
									ret := 0.920000 // buy
								if( ad_mf > -2165.91 )
									ret := 0.333333
							if( ema13 > -0.031823 )
								if( ema12 <= -0.013995 )
									ret := -0.200000
								if( ema12 > -0.013995 )
									ret := 0.062500
			if( ad_mf > -1522.58 )
				if( ad <= -970.493 )
					if( tema <= 15.3641 )
						if( tema <= 11.2851 )
							if( ema13 <= -0.025051 )
								ret := 1.000000 // buy
							if( ema13 > -0.025051 )
								if( tema <= 10.8418 )
									ret := 0.589744
								if( tema > 10.8418 )
									ret := 0.857143 // buy
						if( tema > 11.2851 )
							if( tema <= 11.9401 )
								if( mf <= 0.110982 )
									ret := 0.177778
								if( mf > 0.110982 )
									ret := 0.857143 // buy
							if( tema > 11.9401 )
								if( ad <= -1309.85 )
									ret := 0.740385 // buy
								if( ad > -1309.85 )
									ret := 0.528497
					if( tema > 15.3641 )
						if( ad <= -1400.5 )
							if( ad <= -1440.83 )
								if( mf <= -0.110041 )
									ret := -0.125000
								if( mf > -0.110041 )
									ret := 0.500000
							if( ad > -1440.83 )
								if( ema12 <= -0.00803 )
									ret := -0.909091 // sell
								if( ema12 > -0.00803 )
									ret := -0.142857
						if( ad > -1400.5 )
							if( ad <= -1165.54 )
								if( ad <= -1271.65 )
									ret := 0.357143
								if( ad > -1271.65 )
									ret := 0.718750 // buy
							if( ad > -1165.54 )
								if( ad <= -1066.79 )
									ret := -0.100000
								if( ad > -1066.79 )
									ret := 0.461538
				if( ad > -970.493 )
					if( ema12 <= -0.007397 )
						if( ema12 <= -0.018609 )
							if( tema <= 17.2388 )
								if( ema3 <= 10.7499 )
									ret := 0.689076
								if( ema3 > 10.7499 )
									ret := 0.277380
							if( tema > 17.2388 )
								if( ema13 <= -0.034345 )
									ret := 0.878788 // buy
								if( ema13 > -0.034345 )
									ret := 0.333333
						if( ema12 > -0.018609 )
							if( ema13 <= -0.022051 )
								if( ema1 <= 16.2324 )
									ret := 0.145374
								if( ema1 > 16.2324 )
									ret := -0.141844
							if( ema13 > -0.022051 )
								if( mf <= 0.259179 )
									ret := 0.265504
								if( mf > 0.259179 )
									ret := 0.581395
					if( ema12 > -0.007397 )
						if( ema13 <= -0.014107 )
							if( ema12 <= -0.006008 )
								if( ema12 <= -0.006187 )
									ret := -0.146667
								if( ema12 > -0.006187 )
									ret := 0.473684
							if( ema12 > -0.006008 )
								if( mf <= -0.068163 )
									ret := -0.456522
								if( mf > -0.068163 )
									ret := -0.220588
						if( ema13 > -0.014107 )
							if( ema13 <= 0.006083 )
								if( ema12 <= -0.001334 )
									ret := 0.170806
								if( ema12 > -0.001334 )
									ret := 0.028571
							if( ema13 > 0.006083 )
								if( ad_mf <= 0.024858 )
									ret := 0.231250
								if( ad_mf > 0.024858 )
									ret := 0.442308
		if( ema12 > 0.002516 )
			if( tema <= 17.5544 )
				if( ema3 <= 9.6905 )
					if( ad_mf <= -0.239087 )
						if( tema <= 9.70842 )
							if( ema2 <= 9.45688 )
								if( ema1 <= 9.44816 )
									ret := 0.000000
								if( ema1 > 9.44816 )
									ret := -0.800000 // sell
							if( ema2 > 9.45688 )
								if( tema <= 9.63319 )
									ret := 0.730769 // buy
								if( tema > 9.63319 )
									ret := 0.222222
						if( tema > 9.70842 )
							if( tema <= 9.71153 )
								ret := -1.000000 // sell
							if( tema > 9.71153 )
								if( ema3 <= 9.62013 )
									ret := -0.750000 // sell
								if( ema3 > 9.62013 )
									ret := 0.000000
					if( ad_mf > -0.239087 )
						if( mf <= 0.027476 )
							if( tema <= 9.69813 )
								if( ema3 <= 9.0695 )
									ret := 0.750000 // buy
								if( ema3 > 9.0695 )
									ret := 0.259259
							if( tema > 9.69813 )
								ret := -0.200000
						if( mf > 0.027476 )
							if( mf <= 0.078494 )
								if( ema12 <= 0.013353 )
									ret := 1.000000 // buy
								if( ema12 > 0.013353 )
									ret := 0.750000 // buy
							if( mf > 0.078494 )
								if( tema <= 9.35762 )
									ret := 0.000000
								if( tema > 9.35762 )
									ret := 0.764706 // buy
				if( ema3 > 9.6905 )
					if( ad_mf <= -0.316154 )
						if( tema <= 11.4587 )
							if( tema <= 10.9996 )
								if( ad_mf <= -0.471073 )
									ret := 0.087766
								if( ad_mf > -0.471073 )
									ret := -0.395833
							if( tema > 10.9996 )
								if( mf <= 0.380924 )
									ret := 0.193309
								if( mf > 0.380924 )
									ret := 0.588235
						if( tema > 11.4587 )
							if( mf <= 0.017919 )
								if( ad_mf <= -34236.6 )
									ret := 0.221122
								if( ad_mf > -34236.6 )
									ret := 0.056254
							if( mf > 0.017919 )
								if( ad_mf <= -0.561528 )
									ret := -0.042416
								if( ad_mf > -0.561528 )
									ret := 0.162921
					if( ad_mf > -0.316154 )
						if( tema <= 15.6948 )
							if( mf <= 0.273255 )
								if( ema13 <= 0.005984 )
									ret := -0.269682
								if( ema13 > 0.005984 )
									ret := -0.041096
							if( mf > 0.273255 )
								if( tema <= 10.8618 )
									ret := 0.214286
								if( tema > 10.8618 )
									ret := -0.417143
						if( tema > 15.6948 )
							if( ema12 <= 0.024243 )
								if( mf <= -0.169369 )
									ret := -0.115646
								if( mf > -0.169369 )
									ret := 0.211180
							if( ema12 > 0.024243 )
								if( mf <= -0.216224 )
									ret := 0.083333
								if( mf > -0.216224 )
									ret := -0.339506
			if( tema > 17.5544 )
				if( ad_mf <= -59803.4 )
					if( ema3 <= 16.9714 )
						ret := -0.750000 // sell
					if( ema3 > 16.9714 )
						if( ema13 <= 0.16542 )
							if( ema12 <= 0.033156 )
								ret := 0.250000
							if( ema12 > 0.033156 )
								ret := -0.250000
						if( ema13 > 0.16542 )
							if( ad <= -79720.2 )
								ret := 0.500000
							if( ad > -79720.2 )
								ret := 1.000000 // buy
				if( ad_mf > -59803.4 )
					if( ema12 <= 0.005176 )
						if( ema1 <= 17.7537 )
							if( ema1 <= 17.588 )
								ret := 0.000000
							if( ema1 > 17.588 )
								if( ema1 <= 17.641 )
									ret := -0.750000 // sell
								if( ema1 > 17.641 )
									ret := -0.222222
						if( ema1 > 17.7537 )
							if( tema <= 17.771 )
								ret := 1.000000 // buy
							if( tema > 17.771 )
								ret := 0.166667
					if( ema12 > 0.005176 )
						if( tema <= 17.5967 )
							if( ema1 <= 17.5502 )
								if( mf <= -0.124937 )
									ret := 0.250000
								if( mf > -0.124937 )
									ret := -0.800000 // sell
							if( ema1 > 17.5502 )
								if( ad <= -5854 )
									ret := -0.500000
								if( ad > -5854 )
									ret := 0.045455
						if( tema > 17.5967 )
							if( ema3 <= 17.7615 )
								if( ema3 <= 17.4603 )
									ret := 0.000000
								if( ema3 > 17.4603 )
									ret := -0.776000 // sell
							if( ema3 > 17.7615 )
								if( mf <= -0.085904 )
									ret := -1.000000 // sell
								if( mf > -0.085904 )
									ret := -0.142857
	if( ad_mf > 0.618612 )
		if( ema12 <= 0.016375 )
			if( ema1 <= 15.805 )
				if( ad_mf <= 1376.84 )
					if( tema <= 15.8006 )
						if( ad <= 499.052 )
							if( ema12 <= 0.005478 )
								if( ad_mf <= 72.9403 )
									ret := -0.238318
								if( ad_mf > 72.9403 )
									ret := 0.013369
							if( ema12 > 0.005478 )
								if( ad_mf <= 76.0075 )
									ret := 0.489796
								if( ad_mf > 76.0075 )
									ret := 0.075472
						if( ad > 499.052 )
							if( ema12 <= 0.006181 )
								if( tema <= 12.53 )
									ret := -0.236934
								if( tema > 12.53 )
									ret := -0.027356
							if( ema12 > 0.006181 )
								if( ema1 <= 12.4277 )
									ret := -0.602273
								if( ema1 > 12.4277 )
									ret := -0.273504
					if( tema > 15.8006 )
						ret := 1.000000 // buy
				if( ad_mf > 1376.84 )
					if( ad <= 879938 )
						if( tema <= 11.1998 )
							if( ad <= 71035 )
								if( ad_mf <= 1384.37 )
									ret := 1.000000 // buy
								if( ad_mf > 1384.37 )
									ret := 0.078350
							if( ad > 71035 )
								if( ad_mf <= 129666 )
									ret := 0.565891
								if( ad_mf > 129666 )
									ret := 0.041667
						if( tema > 11.1998 )
							if( ad <= 119792 )
								if( ad <= 14850.8 )
									ret := 0.034910
								if( ad > 14850.8 )
									ret := -0.016690
							if( ad > 119792 )
								if( ema12 <= -0.11958 )
									ret := 1.000000 // buy
								if( ema12 > -0.11958 )
									ret := 0.134259
					if( ad > 879938 )
						if( ad <= 1.57193e+06 )
							if( ad <= 1.13305e+06 )
								if( ema13 <= -0.005702 )
									ret := -1.000000 // sell
								if( ema13 > -0.005702 )
									ret := -0.600000
							if( ad > 1.13305e+06 )
								ret := -1.000000 // sell
						if( ad > 1.57193e+06 )
							ret := -0.500000
			if( ema1 > 15.805 )
				if( ema2 <= 17.4335 )
					if( ema2 <= 15.8392 )
						if( ad_mf <= 414.256 )
							ret := 0.666667
						if( ad_mf > 414.256 )
							if( ema1 <= 15.8269 )
								if( ema2 <= 15.8165 )
									ret := -0.340426
								if( ema2 > 15.8165 )
									ret := 0.000000
							if( ema1 > 15.8269 )
								if( tema <= 15.8442 )
									ret := -0.900000 // sell
								if( tema > 15.8442 )
									ret := -0.190476
					if( ema2 > 15.8392 )
						if( mf <= -0.082441 )
							if( ad <= 10588.1 )
								if( ema12 <= 0.004935 )
									ret := 0.033101
								if( ema12 > 0.004935 )
									ret := -0.370370
							if( ad > 10588.1 )
								if( ema2 <= 17.2934 )
									ret := -0.168421
								if( ema2 > 17.2934 )
									ret := -0.486486
						if( mf > -0.082441 )
							if( mf <= 0.383837 )
								if( ema13 <= -0.030939 )
									ret := 0.120112
								if( ema13 > -0.030939 )
									ret := -0.014798
							if( mf > 0.383837 )
								if( ad <= 45347.7 )
									ret := -0.200000
								if( ad > 45347.7 )
									ret := -0.846154 // sell
				if( ema2 > 17.4335 )
					if( ad_mf <= 69337.1 )
						if( ema3 <= 17.7623 )
							if( ema12 <= -0.009148 )
								if( ema2 <= 17.4513 )
									ret := -0.583333
								if( ema2 > 17.4513 )
									ret := 0.035714
							if( ema12 > -0.009148 )
								if( ema12 <= 0.015351 )
									ret := -0.333333
								if( ema12 > 0.015351 )
									ret := 0.750000 // buy
						if( ema3 > 17.7623 )
							if( ema2 <= 18.0691 )
								if( ema12 <= -0.030375 )
									ret := -0.400000
								if( ema12 > -0.030375 )
									ret := -0.900000 // sell
							if( ema2 > 18.0691 )
								ret := 0.166667
					if( ad_mf > 69337.1 )
						if( ad_mf <= 78428.6 )
							if( mf <= 0.078519 )
								ret := 1.000000 // buy
							if( mf > 0.078519 )
								ret := 0.500000
						if( ad_mf > 78428.6 )
							if( ad_mf <= 92246.7 )
								ret := -0.833333 // sell
							if( ad_mf > 92246.7 )
								if( ema3 <= 17.9234 )
									ret := 0.333333
								if( ema3 > 17.9234 )
									ret := -0.500000
		if( ema12 > 0.016375 )
			if( ad <= 4345.99 )
				if( ema13 <= 0.052133 )
					if( mf <= -0.161985 )
						if( ad_mf <= 943.097 )
							if( ema12 <= 0.020874 )
								if( ema1 <= 14.6914 )
									ret := -0.250000
								if( ema1 > 14.6914 )
									ret := 0.250000
							if( ema12 > 0.020874 )
								ret := -0.800000 // sell
						if( ad_mf > 943.097 )
							if( ema1 <= 10.7956 )
								ret := 0.000000
							if( ema1 > 10.7956 )
								if( mf <= -0.258559 )
									ret := -0.727273 // sell
								if( mf > -0.258559 )
									ret := -1.000000 // sell
					if( mf > -0.161985 )
						if( ema3 <= 11.5824 )
							if( ad_mf <= 827.555 )
								if( ema12 <= 0.019844 )
									ret := -1.000000 // sell
								if( ema12 > 0.019844 )
									ret := -0.400000
							if( ad_mf > 827.555 )
								if( ad <= 4109.4 )
									ret := 0.340000
								if( ad > 4109.4 )
									ret := -1.000000 // sell
						if( ema3 > 11.5824 )
							if( ad <= 193.899 )
								if( tema <= 14.9663 )
									ret := 0.000000
								if( tema > 14.9663 )
									ret := 0.857143 // buy
							if( ad > 193.899 )
								if( tema <= 12.2096 )
									ret := -0.560976
								if( tema > 12.2096 )
									ret := -0.245509
				if( ema13 > 0.052133 )
					if( ema13 <= 0.056981 )
						if( mf <= -0.065149 )
							ret := -1.000000 // sell
						if( mf > -0.065149 )
							if( mf <= 0.228772 )
								if( tema <= 13.1812 )
									ret := -0.785714 // sell
								if( tema > 13.1812 )
									ret := -0.176471
							if( mf > 0.228772 )
								if( ema12 <= 0.027319 )
									ret := -0.400000
								if( ema12 > 0.027319 )
									ret := -1.000000 // sell
					if( ema13 > 0.056981 )
						if( ad <= 3866.68 )
							if( mf <= -0.033518 )
								if( ad_mf <= 3650.46 )
									ret := -0.702128 // sell
								if( ad_mf > 3650.46 )
									ret := 0.250000
							if( mf > -0.033518 )
								if( ad_mf <= 309.433 )
									ret := 0.222222
								if( ad_mf > 309.433 )
									ret := -0.328467
						if( ad > 3866.68 )
							if( ema2 <= 13.2863 )
								ret := -0.571429
							if( ema2 > 13.2863 )
								ret := -1.000000 // sell
			if( ad > 4345.99 )
				if( tema <= 11.6604 )
					if( ad <= 194810 )
						if( ad_mf <= 20729 )
							if( ad_mf <= 17010.9 )
								if( ad_mf <= 11479.2 )
									ret := -0.157576
								if( ad_mf > 11479.2 )
									ret := 0.420000
							if( ad_mf > 17010.9 )
								if( ema2 <= 10.2284 )
									ret := -0.190476
								if( ema2 > 10.2284 )
									ret := -0.767857 // sell
						if( ad_mf > 20729 )
							if( tema <= 10.9458 )
								if( ema12 <= 0.059258 )
									ret := 0.161435
								if( ema12 > 0.059258 )
									ret := -1.000000 // sell
							if( tema > 10.9458 )
								if( mf <= 0.111591 )
									ret := 0.691176
								if( mf > 0.111591 )
									ret := 0.188235
					if( ad > 194810 )
						if( ad_mf <= 309621 )
							if( ad_mf <= 225279 )
								ret := -0.800000 // sell
							if( ad_mf > 225279 )
								ret := -1.000000 // sell
						if( ad_mf > 309621 )
							if( mf <= 0.27371 )
								ret := 0.800000 // buy
							if( mf > 0.27371 )
								ret := -1.000000 // sell
				if( tema > 11.6604 )
					if( ema13 <= 0.015038 )
						if( ema1 <= 12.1965 )
							ret := 1.000000 // buy
						if( ema1 > 12.1965 )
							if( ad_mf <= 23515.5 )
								if( ema12 <= 0.017391 )
									ret := -0.500000
								if( ema12 > 0.017391 )
									ret := 0.500000
							if( ad_mf > 23515.5 )
								if( mf <= -0.010994 )
									ret := 1.000000 // buy
								if( mf > -0.010994 )
									ret := 0.500000
					if( ema13 > 0.015038 )
						if( ad_mf <= 5095.15 )
							if( mf <= 0.254302 )
								if( ema13 <= 0.0267 )
									ret := -0.500000
								if( ema13 > 0.0267 )
									ret := 0.653061
							if( mf > 0.254302 )
								if( ema2 <= 13.0632 )
									ret := 0.500000
								if( ema2 > 13.0632 )
									ret := -0.608696
						if( ad_mf > 5095.15 )
							if( ad <= 5699.76 )
								if( ad_mf <= 5350.95 )
									ret := 0.000000
								if( ad_mf > 5350.95 )
									ret := -0.725000 // sell
							if( ad > 5699.76 )
								if( ema13 <= 0.058806 )
									ret := -0.051026
								if( ema13 > 0.058806 )
									ret := -0.166456
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_LYFT_1Min_297ac74f(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


