//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: UPST_1Min_1SMA_f7a78d53 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_1SMA_f7a78d53", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_f7a78d53(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Internal_Swing_High <= 22.4775 )
		if( Discount_Zone <= 18.7625 )
			if( Discount_Zone <= 18.2849 )
				if( Order_Block_Low <= 21.475 )
					if( Internal_Swing_Low <= 21.1826 )
						if( Discount_Zone <= 16.6796 )
							if( Discount_Zone <= 16.6228 )
								if( Internal_Swing_High <= 20.716 )
									ret := 0.159341
								if( Internal_Swing_High > 20.716 )
									ret := 0.612245
							if( Discount_Zone > 16.6228 )
								if( Premium_Zone <= 24.4878 )
									ret := 1.000000 // buy
								if( Premium_Zone > 24.4878 )
									ret := 0.609756
						if( Discount_Zone > 16.6796 )
							if( Premium_Zone <= 27.3822 )
								if( Discount_Zone <= 17.3971 )
									ret := -0.354331
								if( Discount_Zone > 17.3971 )
									ret := 0.240506
							if( Premium_Zone > 27.3822 )
								if( Internal_Swing_High <= 21.9395 )
									ret := 0.607595
								if( Internal_Swing_High > 21.9395 )
									ret := -1.000000 // sell
					if( Internal_Swing_Low > 21.1826 )
						if( Discount_Zone <= 16.1093 )
							if( Equilibrium_Zone <= 10.3675 )
								if( Internal_Swing_Low <= 22.1499 )
									ret := 0.888889 // buy
								if( Internal_Swing_Low > 22.1499 )
									ret := 0.255814
							if( Equilibrium_Zone > 10.3675 )
								if( Internal_Swing_Low <= 21.6495 )
									ret := 0.750000 // buy
								if( Internal_Swing_Low > 21.6495 )
									ret := -0.200000
						if( Discount_Zone > 16.1093 )
							if( Discount_Zone <= 18.1753 )
								if( atr <= 4.83425 )
									ret := 0.791045 // buy
								if( atr > 4.83425 )
									ret := 0.933333 // buy
							if( Discount_Zone > 18.1753 )
								if( Internal_Swing_Low <= 23.11 )
									ret := 0.750000 // buy
								if( Internal_Swing_Low > 23.11 )
									ret := -0.200000
				if( Order_Block_Low > 21.475 )
					if( Order_Block_Low <= 21.7776 )
						ret := -1.000000 // sell
					if( Order_Block_Low > 21.7776 )
						ret := -0.571429
			if( Discount_Zone > 18.2849 )
				if( Equilibrium_Zone <= 21.7037 )
					if( Order_Block_High <= 21.8005 )
						if( Equilibrium_Zone <= 21.1534 )
							ret := 1.000000 // buy
						if( Equilibrium_Zone > 21.1534 )
							if( Discount_Zone <= 18.3452 )
								if( atr <= 3.31513 )
									ret := 0.500000
								if( atr > 3.31513 )
									ret := 0.733333 // buy
							if( Discount_Zone > 18.3452 )
								if( Internal_Swing_Low <= 22.55 )
									ret := 0.879310 // buy
								if( Internal_Swing_Low > 22.55 )
									ret := 0.400000
					if( Order_Block_High > 21.8005 )
						if( Equilibrium_Zone <= 20.9554 )
							ret := -0.500000
						if( Equilibrium_Zone > 20.9554 )
							ret := 0.000000
				if( Equilibrium_Zone > 21.7037 )
					if( Swing_Low <= 10.055 )
						ret := -1.000000 // sell
					if( Swing_Low > 10.055 )
						ret := 0.500000
		if( Discount_Zone > 18.7625 )
			if( atr <= 1.86128 )
				if( Discount_Zone <= 28.0083 )
					if( Equilibrium_Zone <= 28.9898 )
						if( Equilibrium_Zone <= 24.4657 )
							if( Equilibrium_Zone <= 24.4648 )
								if( Swing_Low <= 21.0934 )
									ret := 0.078575
								if( Swing_Low > 21.0934 )
									ret := 0.189907
							if( Equilibrium_Zone > 24.4648 )
								if( Premium_Zone <= 25.352 )
									ret := 0.951220 // buy
								if( Premium_Zone > 25.352 )
									ret := 0.333333
						if( Equilibrium_Zone > 24.4657 )
							if( Discount_Zone <= 25.5571 )
								if( Discount_Zone <= 25.3096 )
									ret := 0.017282
								if( Discount_Zone > 25.3096 )
									ret := -0.223669
							if( Discount_Zone > 25.5571 )
								if( Internal_Swing_Low <= 28.7006 )
									ret := 0.100993
								if( Internal_Swing_Low > 28.7006 )
									ret := -0.789474 // sell
					if( Equilibrium_Zone > 28.9898 )
						if( atr <= 1.63658 )
							if( atr <= 1.50465 )
								if( Internal_Swing_Low <= 14.2926 )
									ret := -0.700000 // sell
								if( Internal_Swing_Low > 14.2926 )
									ret := -0.200000
							if( atr > 1.50465 )
								if( Swing_Low <= 29.1253 )
									ret := -1.000000 // sell
								if( Swing_Low > 29.1253 )
									ret := -0.250000
						if( atr > 1.63658 )
							if( Swing_Low <= 14.075 )
								if( Discount_Zone <= 27.825 )
									ret := 0.090909
								if( Discount_Zone > 27.825 )
									ret := 0.636364
							if( Swing_Low > 14.075 )
								ret := -1.000000 // sell
				if( Discount_Zone > 28.0083 )
					if( Equilibrium_Zone <= 37.9764 )
						if( Equilibrium_Zone <= 30.145 )
							if( Discount_Zone <= 29.4084 )
								if( atr <= 1.7401 )
									ret := 0.478088
								if( atr > 1.7401 )
									ret := -0.333333
							if( Discount_Zone > 29.4084 )
								if( Internal_Swing_Low <= 30.1534 )
									ret := -0.222222
								if( Internal_Swing_Low > 30.1534 )
									ret := -0.500000
						if( Equilibrium_Zone > 30.145 )
							if( Premium_Zone <= 35.635 )
								if( atr <= 0.92975 )
									ret := 0.260372
								if( atr > 0.92975 )
									ret := 0.006761
							if( Premium_Zone > 35.635 )
								if( Premium_Zone <= 36.1815 )
									ret := 0.488127
								if( Premium_Zone > 36.1815 )
									ret := 0.169473
					if( Equilibrium_Zone > 37.9764 )
						if( Equilibrium_Zone <= 38.0452 )
							if( Premium_Zone <= 39.5971 )
								if( Equilibrium_Zone <= 37.9989 )
									ret := 0.875000 // buy
								if( Equilibrium_Zone > 37.9989 )
									ret := -0.132353
							if( Premium_Zone > 39.5971 )
								if( Internal_Swing_Low <= 37.1705 )
									ret := -0.860000 // sell
								if( Internal_Swing_Low > 37.1705 )
									ret := -0.434783
						if( Equilibrium_Zone > 38.0452 )
							if( atr <= 1.69782 )
								if( Order_Block_Low <= 41.575 )
									ret := 0.043226
								if( Order_Block_Low > 41.575 )
									ret := 0.645833
							if( atr > 1.69782 )
								if( Premium_Zone <= 42.3681 )
									ret := 0.100000
								if( Premium_Zone > 42.3681 )
									ret := 0.288160
			if( atr > 1.86128 )
				if( atr <= 4.45126 )
					if( Discount_Zone <= 19.5902 )
						if( Swing_Low <= 10.2596 )
							if( Internal_Swing_Low <= 20.89 )
								if( atr <= 3.1234 )
									ret := -0.758065 // sell
								if( atr > 3.1234 )
									ret := -0.047619
							if( Internal_Swing_Low > 20.89 )
								if( Internal_Swing_Low <= 22.1305 )
									ret := 0.388889
								if( Internal_Swing_Low > 22.1305 )
									ret := -0.933333 // sell
						if( Swing_Low > 10.2596 )
							if( Equilibrium_Zone <= 22.2975 )
								ret := -0.200000
							if( Equilibrium_Zone > 22.2975 )
								if( Order_Block_High <= 20.76 )
									ret := 0.545455
								if( Order_Block_High > 20.76 )
									ret := 1.000000 // buy
					if( Discount_Zone > 19.5902 )
						if( Discount_Zone <= 27.0022 )
							if( Discount_Zone <= 25.7713 )
								if( Premium_Zone <= 31.4427 )
									ret := 0.047638
								if( Premium_Zone > 31.4427 )
									ret := -0.770115 // sell
							if( Discount_Zone > 25.7713 )
								if( Discount_Zone <= 26.3852 )
									ret := 0.503067
								if( Discount_Zone > 26.3852 )
									ret := 0.113402
						if( Discount_Zone > 27.0022 )
							if( atr <= 4.00129 )
								if( atr <= 2.2399 )
									ret := -0.101154
								if( atr > 2.2399 )
									ret := 0.030849
							if( atr > 4.00129 )
								if( Premium_Zone <= 40.7647 )
									ret := -0.786667 // sell
								if( Premium_Zone > 40.7647 )
									ret := -0.148148
				if( atr > 4.45126 )
					if( atr <= 5.48943 )
						if( Discount_Zone <= 30.2701 )
							if( atr <= 5.40398 )
								if( Internal_Swing_Low <= 28.0148 )
									ret := 0.755102 // buy
								if( Internal_Swing_Low > 28.0148 )
									ret := 0.333333
							if( atr > 5.40398 )
								if( Premium_Zone <= 41.0867 )
									ret := 1.000000 // buy
								if( Premium_Zone > 41.0867 )
									ret := 0.500000
						if( Discount_Zone > 30.2701 )
							if( Equilibrium_Zone <= 37.0716 )
								if( atr <= 4.88605 )
									ret := -0.280000
								if( atr > 4.88605 )
									ret := 0.325000
							if( Equilibrium_Zone > 37.0716 )
								if( Equilibrium_Zone <= 54.5394 )
									ret := 0.851064 // buy
								if( Equilibrium_Zone > 54.5394 )
									ret := 0.266667
					if( atr > 5.48943 )
						if( Swing_Low <= 11.935 )
							if( atr <= 5.4906 )
								if( Discount_Zone <= 31.7251 )
									ret := -0.270833
								if( Discount_Zone > 31.7251 )
									ret := -0.633333
							if( atr > 5.4906 )
								if( Equilibrium_Zone <= 26.6447 )
									ret := -0.234375
								if( Equilibrium_Zone > 26.6447 )
									ret := 0.250608
						if( Swing_Low > 11.935 )
							if( Internal_Swing_Low <= 53.185 )
								if( Discount_Zone <= 30.1168 )
									ret := 0.714286 // buy
								if( Discount_Zone > 30.1168 )
									ret := 1.000000 // buy
							if( Internal_Swing_Low > 53.185 )
								if( atr <= 7.59786 )
									ret := -0.285714
								if( atr > 7.59786 )
									ret := 0.750000 // buy
	if( Internal_Swing_High > 22.4775 )
		if( Equilibrium_Zone <= 27.9027 )
			if( Discount_Zone <= 24.7376 )
				if( Equilibrium_Zone <= 25.5543 )
					if( Swing_High <= 24.4862 )
						if( Premium_Zone <= 23.1852 )
							if( Discount_Zone <= 22.1058 )
								if( Premium_Zone <= 23.1002 )
									ret := -0.079872
								if( Premium_Zone > 23.1002 )
									ret := -0.494382
							if( Discount_Zone > 22.1058 )
								if( Premium_Zone <= 22.8241 )
									ret := -1.000000 // sell
								if( Premium_Zone > 22.8241 )
									ret := -0.833333 // sell
						if( Premium_Zone > 23.1852 )
							if( Internal_Swing_High <= 23.0413 )
								if( Equilibrium_Zone <= 22.3223 )
									ret := 0.507463
								if( Equilibrium_Zone > 22.3223 )
									ret := 0.092179
							if( Internal_Swing_High > 23.0413 )
								if( Premium_Zone <= 24.018 )
									ret := -0.120456
								if( Premium_Zone > 24.018 )
									ret := -0.003826
					if( Swing_High > 24.4862 )
						if( Discount_Zone <= 23.3128 )
							if( atr <= 1.65859 )
								if( Equilibrium_Zone <= 23.9325 )
									ret := 0.200000
								if( Equilibrium_Zone > 23.9325 )
									ret := -0.628866
							if( atr > 1.65859 )
								if( Premium_Zone <= 25.7692 )
									ret := 1.000000 // buy
								if( Premium_Zone > 25.7692 )
									ret := -0.294118
						if( Discount_Zone > 23.3128 )
							if( Swing_High <= 24.5001 )
								if( Premium_Zone <= 24.8312 )
									ret := -0.250000
								if( Premium_Zone > 24.8312 )
									ret := -0.875000 // sell
							if( Swing_High > 24.5001 )
								if( Discount_Zone <= 23.8005 )
									ret := 0.117647
								if( Discount_Zone > 23.8005 )
									ret := -0.183280
				if( Equilibrium_Zone > 25.5543 )
					if( Swing_High <= 26.4645 )
						if( Swing_High <= 25.896 )
							if( Internal_Swing_High <= 24.9092 )
								ret := 0.967742 // buy
							if( Internal_Swing_High > 24.9092 )
								if( Discount_Zone <= 23.8228 )
									ret := -0.304762
								if( Discount_Zone > 23.8228 )
									ret := 0.207547
						if( Swing_High > 25.896 )
							if( atr <= 1.22318 )
								if( Discount_Zone <= 24.523 )
									ret := 0.625000
								if( Discount_Zone > 24.523 )
									ret := 0.961538 // buy
							if( atr > 1.22318 )
								if( atr <= 1.77289 )
									ret := 0.045455
								if( atr > 1.77289 )
									ret := 1.000000 // buy
					if( Swing_High > 26.4645 )
						if( atr <= 1.86442 )
							if( Equilibrium_Zone <= 26.1387 )
								ret := 1.000000 // buy
							if( Equilibrium_Zone > 26.1387 )
								ret := -0.400000
						if( atr > 1.86442 )
							if( atr <= 2.25528 )
								if( atr <= 2.03348 )
									ret := -0.318182
								if( atr > 2.03348 )
									ret := -0.961538 // sell
							if( atr > 2.25528 )
								if( Equilibrium_Zone <= 26.3075 )
									ret := 0.600000
								if( Equilibrium_Zone > 26.3075 )
									ret := -0.516129
			if( Discount_Zone > 24.7376 )
				if( Premium_Zone <= 29.0842 )
					if( Equilibrium_Zone <= 25.6839 )
						if( Equilibrium_Zone <= 25.4736 )
							if( Discount_Zone <= 24.7416 )
								ret := -0.500000
							if( Discount_Zone > 24.7416 )
								if( atr <= 0.505401 )
									ret := 0.476190
								if( atr > 0.505401 )
									ret := 0.069767
						if( Equilibrium_Zone > 25.4736 )
							if( Internal_Swing_High <= 25.8029 )
								if( Internal_Swing_Low <= 25.256 )
									ret := -0.454545
								if( Internal_Swing_Low > 25.256 )
									ret := 0.384615
							if( Internal_Swing_High > 25.8029 )
								if( Swing_High <= 25.9024 )
									ret := -1.000000 // sell
								if( Swing_High > 25.9024 )
									ret := -0.625000
					if( Equilibrium_Zone > 25.6839 )
						if( atr <= 1.41268 )
							if( atr <= 1.28978 )
								if( Internal_Swing_High <= 26.3071 )
									ret := 0.050633
								if( Internal_Swing_High > 26.3071 )
									ret := -0.145069
							if( atr > 1.28978 )
								if( Discount_Zone <= 25.0866 )
									ret := -0.333333
								if( Discount_Zone > 25.0866 )
									ret := 0.666667
						if( atr > 1.41268 )
							if( atr <= 1.69771 )
								if( Swing_High <= 27.1682 )
									ret := -0.680412
								if( Swing_High > 27.1682 )
									ret := 0.400000
							if( atr > 1.69771 )
								if( Internal_Swing_High <= 25.7098 )
									ret := 0.928571 // buy
								if( Internal_Swing_High > 25.7098 )
									ret := -0.180952
				if( Premium_Zone > 29.0842 )
					if( Premium_Zone <= 29.1542 )
						if( Premium_Zone <= 29.1301 )
							if( Bullish_BOSInt <= 0.5 )
								ret := -0.666667
							if( Bullish_BOSInt > 0.5 )
								ret := -1.000000 // sell
						if( Premium_Zone > 29.1301 )
							ret := -1.000000 // sell
					if( Premium_Zone > 29.1542 )
						if( Equilibrium_Zone <= 27.6886 )
							if( Internal_Swing_High <= 27.8025 )
								if( Premium_Zone <= 29.7776 )
									ret := -0.521739
								if( Premium_Zone > 29.7776 )
									ret := 0.666667
							if( Internal_Swing_High > 27.8025 )
								if( Internal_Swing_High <= 27.865 )
									ret := -0.714286 // sell
								if( Internal_Swing_High > 27.865 )
									ret := -0.923077 // sell
						if( Equilibrium_Zone > 27.6886 )
							if( Swing_High <= 28.4223 )
								if( Equilibrium_Zone <= 27.784 )
									ret := 0.000000
								if( Equilibrium_Zone > 27.784 )
									ret := 0.684211
							if( Swing_High > 28.4223 )
								ret := -1.000000 // sell
		if( Equilibrium_Zone > 27.9027 )
			if( atr <= 1.04828 )
				if( Swing_High <= 28.3008 )
					if( Internal_Swing_High <= 42.8932 )
						if( Equilibrium_Zone <= 42.6204 )
							if( Internal_Swing_Low <= 33.7633 )
								if( Premium_Zone <= 39.7375 )
									ret := -0.032158
								if( Premium_Zone > 39.7375 )
									ret := -0.208661
							if( Internal_Swing_Low > 33.7633 )
								if( Equilibrium_Zone <= 37.3309 )
									ret := 0.526316
								if( Equilibrium_Zone > 37.3309 )
									ret := 0.050000
						if( Equilibrium_Zone > 42.6204 )
							if( Discount_Zone <= 41.7952 )
								ret := -0.400000
							if( Discount_Zone > 41.7952 )
								if( Equilibrium_Zone <= 42.9352 )
									ret := 0.964286 // buy
								if( Equilibrium_Zone > 42.9352 )
									ret := 0.000000
					if( Internal_Swing_High > 42.8932 )
						if( atr <= 0.911791 )
							if( Equilibrium_Zone <= 44.0217 )
								ret := 0.800000 // buy
							if( Equilibrium_Zone > 44.0217 )
								if( Internal_Swing_High <= 44.12 )
									ret := 0.100000
								if( Internal_Swing_High > 44.12 )
									ret := -0.250000
						if( atr > 0.911791 )
							if( Internal_Swing_High <= 43.8699 )
								if( Discount_Zone <= 41.9239 )
									ret := -0.600000
								if( Discount_Zone > 41.9239 )
									ret := -1.000000 // sell
							if( Internal_Swing_High > 43.8699 )
								if( Premium_Zone <= 45.906 )
									ret := 0.375000
								if( Premium_Zone > 45.906 )
									ret := -1.000000 // sell
				if( Swing_High > 28.3008 )
					if( Order_Block_Low <= 38.4533 )
						if( Discount_Zone <= 35.5081 )
							if( atr <= 0.617532 )
								if( Equilibrium_Zone <= 29.4768 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 29.4768 )
									ret := 0.294118
							if( atr > 0.617532 )
								if( Discount_Zone <= 27.2207 )
									ret := 0.500000
								if( Discount_Zone > 27.2207 )
									ret := -0.563218
						if( Discount_Zone > 35.5081 )
							if( Swing_High <= 36.7541 )
								if( Premium_Zone <= 37.142 )
									ret := 0.380952
								if( Premium_Zone > 37.142 )
									ret := 1.000000 // buy
							if( Swing_High > 36.7541 )
								if( Internal_Swing_Low <= 19.7363 )
									ret := -0.251534
								if( Internal_Swing_Low > 19.7363 )
									ret := 0.900000 // buy
					if( Order_Block_Low > 38.4533 )
						if( Internal_Swing_High <= 43.166 )
							if( Equilibrium_Zone <= 42.685 )
								if( atr <= 0.96758 )
									ret := -0.794872 // sell
								if( atr > 0.96758 )
									ret := -0.375000
							if( Equilibrium_Zone > 42.685 )
								ret := 0.000000
						if( Internal_Swing_High > 43.166 )
							ret := -1.000000 // sell
			if( atr > 1.04828 )
				if( Internal_Swing_High <= 28.6156 )
					if( Premium_Zone <= 32.945 )
						if( Equilibrium_Zone <= 28.2396 )
							if( Premium_Zone <= 29.7398 )
								if( Discount_Zone <= 26.8516 )
									ret := 0.807692 // buy
								if( Discount_Zone > 26.8516 )
									ret := 0.263158
							if( Premium_Zone > 29.7398 )
								if( Internal_Swing_High <= 27.7439 )
									ret := 0.692308
								if( Internal_Swing_High > 27.7439 )
									ret := -0.094118
						if( Equilibrium_Zone > 28.2396 )
							if( atr <= 1.14121 )
								if( Premium_Zone <= 29.5984 )
									ret := -0.555556
								if( Premium_Zone > 29.5984 )
									ret := 0.000000
							if( atr > 1.14121 )
								if( Discount_Zone <= 27.5289 )
									ret := 0.616216
								if( Discount_Zone > 27.5289 )
									ret := -0.266667
					if( Premium_Zone > 32.945 )
						ret := -1.000000 // sell
				if( Internal_Swing_High > 28.6156 )
					if( Swing_High <= 45.6032 )
						if( Order_Block_Low <= 42.3324 )
							if( Equilibrium_Zone <= 28.2131 )
								if( Premium_Zone <= 30.1542 )
									ret := 0.943396 // buy
								if( Premium_Zone > 30.1542 )
									ret := -0.384615
							if( Equilibrium_Zone > 28.2131 )
								if( Internal_Swing_High <= 54.7301 )
									ret := 0.049496
								if( Internal_Swing_High > 54.7301 )
									ret := -0.645833
						if( Order_Block_Low > 42.3324 )
							if( atr <= 2.1649 )
								if( atr <= 1.65304 )
									ret := -0.564516
								if( atr > 1.65304 )
									ret := 0.133333
							if( atr > 2.1649 )
								if( Equilibrium_Zone <= 42.8875 )
									ret := -0.428571
								if( Equilibrium_Zone > 42.8875 )
									ret := -1.000000 // sell
					if( Swing_High > 45.6032 )
						if( Discount_Zone <= 43.0733 )
							if( atr <= 2.4453 )
								ret := 0.250000
							if( atr > 2.4453 )
								ret := -0.833333 // sell
						if( Discount_Zone > 43.0733 )
							if( Order_Block_High <= 46.6391 )
								if( Equilibrium_Zone <= 53.9575 )
									ret := 0.722772 // buy
								if( Equilibrium_Zone > 53.9575 )
									ret := 0.000000
							if( Order_Block_High > 46.6391 )
								if( Discount_Zone <= 44.1736 )
									ret := -0.600000
								if( Discount_Zone > 44.1736 )
									ret := 0.326923
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Smart_Money_Concepts 
//@version=5
//indicator "Smart Money Concepts - Pine Script Version", overlay=true)

// Constants
SWING_LENGTH = 50
INTERNAL_SWING_LENGTH = 5
ATR_PERIOD = 200

// ATR Calculation
atr = ta.sma(ta.tr, ATR_PERIOD)

// Swings Detection
var float Swing_High = na
var float Swing_Low = na
Swing_High := ta.highest(high, SWING_LENGTH) == high ? high : na
Swing_Low := ta.lowest(low, SWING_LENGTH) == low ? low : na

var float Internal_Swing_High = na
var float Internal_Swing_Low = na
Internal_Swing_High := ta.highest(high, INTERNAL_SWING_LENGTH) == high ? high : na
Internal_Swing_Low := ta.lowest(low, INTERNAL_SWING_LENGTH) == low ? low : na

// Market Structure Detection
Bullish_BOS = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and not na(Swing_High[1])
Bearish_BOS = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and not na(Swing_Low[1])

Bullish_CHoCH = (close > ta.valuewhen(Swing_High, Swing_High, 1)) and (close[1] < ta.valuewhen(Swing_Low, Swing_Low, 1))
Bearish_CHoCH = (close < ta.valuewhen(Swing_Low, Swing_Low, 1)) and (close[1] > ta.valuewhen(Swing_High, Swing_High, 1))

Bullish_BOSInt = Bullish_BOS ? 1 : 0
Bearish_BOSInt = Bearish_BOS ? 1 : 0
Bullish_CHoCHInt = Bullish_CHoCH ? 1 : 0
Bearish_CHoCHInt = Bearish_CHoCH ? 1 : 0

// Order Blocks Detection
var float Order_Block_High = na
var float Order_Block_Low = na

threshold = atr
if Bullish_BOS
    Order_Block_High := high
    Order_Block_Low := low
if Bearish_BOS
    Order_Block_High := high
    Order_Block_Low := low

if math.abs(Order_Block_High - Order_Block_Low) > threshold
    Order_Block_High := na
    Order_Block_Low := na

// Fair Value Gaps (FVG) Detection
delta_per = (close - open) / open * 100
FVG_Up = (low > high[2]) and (close > high[2]) and (delta_per > atr)
FVG_Down = (high < low[2]) and (close < low[2]) and (-delta_per > atr)

FVG_UpInt = FVG_Up ? 1 : 0
FVG_DownInt = FVG_Down ? 1 : 0

// Premium/Discount Zones Calculation
avg_price = (ta.valuewhen(Swing_High, Swing_High, 0) + ta.valuewhen(Swing_Low, Swing_Low, 0)) / 2
var float Premium_Zone = avg_price + atr
var float Discount_Zone = avg_price - atr
var float Equilibrium_Zone = avg_price

// Plotting
plot(close, title="Close", color=color.black)

plotshape(series=Swing_High, location=location.abovebar, color=color.green, style=shape.triangledown, title="Swing High")
plotshape(series=Swing_Low, location=location.belowbar, color=color.red, style=shape.triangleup, title="Swing Low")

plotshape(series=Bullish_BOS, location=location.belowbar, color=color.blue, style=shape.circle, title="Bullish BOS")
plotshape(series=Bearish_BOS, location=location.abovebar, color=color.orange, style=shape.circle, title="Bearish BOS")
plotshape(series=Bullish_CHoCH, location=location.belowbar, color=color.aqua, style=shape.square, title="Bullish CHoCH")
plotshape(series=Bearish_CHoCH, location=location.abovebar, color=color.purple, style=shape.square, title="Bearish CHoCH")

plot(Order_Block_High, title="Order Block High", color=color.yellow, style=plot.style_linebr)
plot(Order_Block_Low, title="Order Block Low", color=color.yellow, style=plot.style_linebr)

bgcolor(FVG_Up ? color.new(color.green, 80) : na, title="Bullish FVG")
bgcolor(FVG_Down ? color.new(color.red, 80) : na, title="Bearish FVG")

plot(Premium_Zone, "Premium Zone", color=color.red)
plot(Discount_Zone, "Discount Zone", color=color.green)
plot(Equilibrium_Zone, "Equilibrium Zone", color=color.gray)

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
float op_operation = decision_tree_0_UPST_1Min_f7a78d53(Equilibrium_Zone, Internal_Swing_Low, Swing_Low, Bullish_BOSInt, Internal_Swing_High, atr, Order_Block_Low, Bullish_CHoCHInt, Premium_Zone, Swing_High, Discount_Zone, Order_Block_High, FVG_DownInt, Bearish_BOSInt, Bearish_CHoCHInt, FVG_UpInt)

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


