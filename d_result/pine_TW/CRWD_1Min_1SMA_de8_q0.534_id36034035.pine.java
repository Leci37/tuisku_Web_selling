//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: CRWD_1Min_1SMA_36034035 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_CRWD_1Min_1SMA_36034035", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_CRWD_1Min_36034035(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Internal_Swing_High <= 302.039 )
		if( atr <= 6.00997 )
			if( Internal_Swing_Low <= 227.67 )
				if( Internal_Swing_High <= 295.388 )
					if( atr <= 4.48907 )
						if( Discount_Zone <= 236.454 )
							if( Premium_Zone <= 219.679 )
								if( atr <= 2.95293 )
									ret := 0.063107
								if( atr > 2.95293 )
									ret := 0.377778
							if( Premium_Zone > 219.679 )
								if( Premium_Zone <= 220.4 )
									ret := -0.670732
								if( Premium_Zone > 220.4 )
									ret := -0.110420
						if( Discount_Zone > 236.454 )
							if( Equilibrium_Zone <= 239.497 )
								if( Discount_Zone <= 236.529 )
									ret := 0.900000 // buy
								if( Discount_Zone > 236.529 )
									ret := 0.545455
							if( Equilibrium_Zone > 239.497 )
								if( atr <= 4.48017 )
									ret := 0.043416
								if( atr > 4.48017 )
									ret := 0.612903
					if( atr > 4.48907 )
						if( atr <= 5.28683 )
							if( Equilibrium_Zone <= 247.463 )
								if( Discount_Zone <= 242.455 )
									ret := 0.058465
								if( Discount_Zone > 242.455 )
									ret := 0.625000
							if( Equilibrium_Zone > 247.463 )
								if( Discount_Zone <= 243.507 )
									ret := -0.459770
								if( Discount_Zone > 243.507 )
									ret := -0.092126
						if( atr > 5.28683 )
							if( Discount_Zone <= 235.478 )
								if( Premium_Zone <= 246.815 )
									ret := -0.074913
								if( Premium_Zone > 246.815 )
									ret := -0.833333 // sell
							if( Discount_Zone > 235.478 )
								if( Discount_Zone <= 236.439 )
									ret := 0.685714
								if( Discount_Zone > 236.439 )
									ret := 0.043109
				if( Internal_Swing_High > 295.388 )
					if( atr <= 3.42797 )
						if( Equilibrium_Zone <= 297.067 )
							if( Bullish_BOSInt <= 0.5 )
								if( Internal_Swing_High <= 296.842 )
									ret := 0.222222
								if( Internal_Swing_High > 296.842 )
									ret := -0.035714
							if( Bullish_BOSInt > 0.5 )
								if( Equilibrium_Zone <= 294.977 )
									ret := -0.500000
								if( Equilibrium_Zone > 294.977 )
									ret := 0.000000
						if( Equilibrium_Zone > 297.067 )
							ret := -0.833333 // sell
					if( atr > 3.42797 )
						if( Equilibrium_Zone <= 294.212 )
							if( Internal_Swing_High <= 295.828 )
								if( Internal_Swing_High <= 295.576 )
									ret := 0.500000
								if( Internal_Swing_High > 295.576 )
									ret := 0.200000
							if( Internal_Swing_High > 295.828 )
								if( Internal_Swing_High <= 296.571 )
									ret := 0.956522 // buy
								if( Internal_Swing_High > 296.571 )
									ret := 0.750000 // buy
						if( Equilibrium_Zone > 294.212 )
							if( Discount_Zone <= 297.001 )
								if( Discount_Zone <= 293.762 )
									ret := 0.343750
								if( Discount_Zone > 293.762 )
									ret := -0.104167
							if( Discount_Zone > 297.001 )
								if( Equilibrium_Zone <= 302.696 )
									ret := 0.409091
								if( Equilibrium_Zone > 302.696 )
									ret := 0.823529 // buy
			if( Internal_Swing_Low > 227.67 )
				if( Swing_Low <= 264.161 )
					if( Equilibrium_Zone <= 233.31 )
						if( Order_Block_Low <= 229.615 )
							if( Discount_Zone <= 228.911 )
								if( Equilibrium_Zone <= 227.73 )
									ret := 0.105263
								if( Equilibrium_Zone > 227.73 )
									ret := 0.582278
							if( Discount_Zone > 228.911 )
								if( Internal_Swing_Low <= 232.012 )
									ret := 0.277778
								if( Internal_Swing_Low > 232.012 )
									ret := -0.812500 // sell
						if( Order_Block_Low > 229.615 )
							if( Order_Block_High <= 230.318 )
								ret := -1.000000 // sell
							if( Order_Block_High > 230.318 )
								ret := -0.500000
					if( Equilibrium_Zone > 233.31 )
						if( Internal_Swing_Low <= 233.255 )
							if( Internal_Swing_Low <= 231.943 )
								if( atr <= 4.84523 )
									ret := -1.000000 // sell
								if( atr > 4.84523 )
									ret := 0.466667
							if( Internal_Swing_Low > 231.943 )
								if( Swing_Low <= 232.217 )
									ret := -0.588235
								if( Swing_Low > 232.217 )
									ret := -1.000000 // sell
						if( Internal_Swing_Low > 233.255 )
							if( Discount_Zone <= 255.168 )
								if( Discount_Zone <= 253.39 )
									ret := 0.068779
								if( Discount_Zone > 253.39 )
									ret := 0.439394
							if( Discount_Zone > 255.168 )
								if( Premium_Zone <= 269.608 )
									ret := -0.144177
								if( Premium_Zone > 269.608 )
									ret := 0.032141
				if( Swing_Low > 264.161 )
					if( Equilibrium_Zone <= 270.398 )
						if( Equilibrium_Zone <= 268.844 )
							if( Premium_Zone <= 273.393 )
								if( Swing_Low <= 264.914 )
									ret := 0.592593
								if( Swing_Low > 264.914 )
									ret := 0.131783
							if( Premium_Zone > 273.393 )
								if( Discount_Zone <= 261.965 )
									ret := -0.250000
								if( Discount_Zone > 261.965 )
									ret := -1.000000 // sell
						if( Equilibrium_Zone > 268.844 )
							if( Premium_Zone <= 272.297 )
								ret := -0.833333 // sell
							if( Premium_Zone > 272.297 )
								if( Swing_Low <= 269.005 )
									ret := 0.663717
								if( Swing_Low > 269.005 )
									ret := -0.111111
					if( Equilibrium_Zone > 270.398 )
						if( Equilibrium_Zone <= 271.792 )
							if( Premium_Zone <= 276.069 )
								if( Swing_Low <= 268.64 )
									ret := 0.571429
								if( Swing_Low > 268.64 )
									ret := -0.500000
							if( Premium_Zone > 276.069 )
								if( Discount_Zone <= 265.482 )
									ret := -0.500000
								if( Discount_Zone > 265.482 )
									ret := -1.000000 // sell
						if( Equilibrium_Zone > 271.792 )
							if( Internal_Swing_High <= 135.484 )
								if( Discount_Zone <= 271.601 )
									ret := -0.052632
								if( Discount_Zone > 271.601 )
									ret := 0.196429
							if( Internal_Swing_High > 135.484 )
								ret := 1.000000 // buy
		if( atr > 6.00997 )
			if( Equilibrium_Zone <= 238.144 )
				if( Discount_Zone <= 224.395 )
					if( Swing_High <= 229.241 )
						if( atr <= 27.1993 )
							if( Equilibrium_Zone <= 236.092 )
								if( Equilibrium_Zone <= 232.527 )
									ret := 0.149273
								if( Equilibrium_Zone > 232.527 )
									ret := -0.470588
							if( Equilibrium_Zone > 236.092 )
								if( Discount_Zone <= 223.923 )
									ret := 1.000000 // buy
								if( Discount_Zone > 223.923 )
									ret := 0.923077 // buy
						if( atr > 27.1993 )
							if( Premium_Zone <= 247.018 )
								if( Premium_Zone <= 246.543 )
									ret := -0.333333
								if( Premium_Zone > 246.543 )
									ret := -1.000000 // sell
							if( Premium_Zone > 247.018 )
								if( atr <= 27.8784 )
									ret := 0.500000
								if( atr > 27.8784 )
									ret := -0.370370
					if( Swing_High > 229.241 )
						if( Swing_High <= 232.815 )
							if( Premium_Zone <= 235.878 )
								if( Premium_Zone <= 235.42 )
									ret := 0.000000
								if( Premium_Zone > 235.42 )
									ret := -0.500000
							if( Premium_Zone > 235.878 )
								if( Equilibrium_Zone <= 230.796 )
									ret := -0.928571 // sell
								if( Equilibrium_Zone > 230.796 )
									ret := -0.250000
						if( Swing_High > 232.815 )
							if( atr <= 7.52729 )
								if( Internal_Swing_High <= 234.433 )
									ret := 0.833333 // buy
								if( Internal_Swing_High > 234.433 )
									ret := 0.500000
							if( atr > 7.52729 )
								if( atr <= 7.85735 )
									ret := -1.000000 // sell
								if( atr > 7.85735 )
									ret := -0.352941
				if( Discount_Zone > 224.395 )
					if( Internal_Swing_Low <= 228.585 )
						if( atr <= 6.13982 )
							if( Premium_Zone <= 237.891 )
								if( Internal_Swing_High <= 233.86 )
									ret := -0.375000
								if( Internal_Swing_High > 233.86 )
									ret := 0.250000
							if( Premium_Zone > 237.891 )
								if( Internal_Swing_High <= 234.428 )
									ret := 0.307692
								if( Internal_Swing_High > 234.428 )
									ret := -0.181818
						if( atr > 6.13982 )
							if( Premium_Zone <= 246.345 )
								if( Premium_Zone <= 240.357 )
									ret := 0.347170
								if( Premium_Zone > 240.357 )
									ret := 0.665414
							if( Premium_Zone > 246.345 )
								if( atr <= 9.815 )
									ret := -0.318182
								if( atr > 9.815 )
									ret := 0.347150
					if( Internal_Swing_Low > 228.585 )
						if( Discount_Zone <= 227.208 )
							if( Premium_Zone <= 240.263 )
								if( Swing_Low <= 229.793 )
									ret := -0.192308
								if( Swing_Low > 229.793 )
									ret := 0.812500 // buy
							if( Premium_Zone > 240.263 )
								if( atr <= 7.62568 )
									ret := 0.000000
								if( atr > 7.62568 )
									ret := 0.831169 // buy
						if( Discount_Zone > 227.208 )
							if( Swing_Low <= 230.55 )
								if( Discount_Zone <= 229.475 )
									ret := -0.621212
								if( Discount_Zone > 229.475 )
									ret := 0.800000 // buy
							if( Swing_Low > 230.55 )
								if( atr <= 6.23685 )
									ret := 1.000000 // buy
								if( atr > 6.23685 )
									ret := 0.500000
			if( Equilibrium_Zone > 238.144 )
				if( Order_Block_Low <= 377.792 )
					if( Discount_Zone <= 235.629 )
						if( Premium_Zone <= 357.72 )
							if( Swing_High <= 240.983 )
								if( Internal_Swing_High <= 244.107 )
									ret := -0.111285
								if( Internal_Swing_High > 244.107 )
									ret := 0.476636
							if( Swing_High > 240.983 )
								if( Order_Block_Low <= 248.959 )
									ret := -0.378947
								if( Order_Block_Low > 248.959 )
									ret := -0.947368 // sell
						if( Premium_Zone > 357.72 )
							if( Discount_Zone <= 214.787 )
								if( Discount_Zone <= 214.564 )
									ret := 0.791667 // buy
								if( Discount_Zone > 214.564 )
									ret := -0.625000
							if( Discount_Zone > 214.787 )
								if( Equilibrium_Zone <= 295.168 )
									ret := 1.000000 // buy
								if( Equilibrium_Zone > 295.168 )
									ret := 0.428571
					if( Discount_Zone > 235.629 )
						if( Discount_Zone <= 239.536 )
							if( Internal_Swing_High <= 282.215 )
								if( Discount_Zone <= 235.633 )
									ret := 0.888889 // buy
								if( Discount_Zone > 235.633 )
									ret := 0.275313
							if( Internal_Swing_High > 282.215 )
								if( Discount_Zone <= 235.664 )
									ret := -0.384615
								if( Discount_Zone > 235.664 )
									ret := -1.000000 // sell
						if( Discount_Zone > 239.536 )
							if( Discount_Zone <= 244.912 )
								if( Internal_Swing_Low <= 277.246 )
									ret := -0.059524
								if( Internal_Swing_Low > 277.246 )
									ret := -0.645833
							if( Discount_Zone > 244.912 )
								if( Premium_Zone <= 259.809 )
									ret := 0.561404
								if( Premium_Zone > 259.809 )
									ret := 0.070982
				if( Order_Block_Low > 377.792 )
					if( Discount_Zone <= 381.803 )
						if( Equilibrium_Zone <= 381.737 )
							ret := 0.285714
						if( Equilibrium_Zone > 381.737 )
							if( Internal_Swing_Low <= 383.352 )
								if( atr <= 6.7056 )
									ret := 0.400000
								if( atr > 6.7056 )
									ret := 0.920000 // buy
							if( Internal_Swing_Low > 383.352 )
								if( Order_Block_Low <= 385.905 )
									ret := 0.277778
								if( Order_Block_Low > 385.905 )
									ret := 1.000000 // buy
					if( Discount_Zone > 381.803 )
						ret := -0.166667
	if( Internal_Swing_High > 302.039 )
		if( Swing_High <= 385.863 )
			if( Discount_Zone <= 303.407 )
				if( Discount_Zone <= 300.802 )
					if( Order_Block_High <= 310.732 )
						if( Discount_Zone <= 257.071 )
							if( Equilibrium_Zone <= 291.333 )
								if( Swing_High <= 151.75 )
									ret := 0.375000
								if( Swing_High > 151.75 )
									ret := -0.400000
							if( Equilibrium_Zone > 291.333 )
								if( Swing_High <= 306.254 )
									ret := -0.891304 // sell
								if( Swing_High > 306.254 )
									ret := 0.000000
						if( Discount_Zone > 257.071 )
							if( Equilibrium_Zone <= 298.35 )
								if( Premium_Zone <= 311.83 )
									ret := 0.750000 // buy
								if( Premium_Zone > 311.83 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 298.35 )
								if( atr <= 7.48043 )
									ret := -0.174658
								if( atr > 7.48043 )
									ret := 0.028465
					if( Order_Block_High > 310.732 )
						if( Equilibrium_Zone <= 323.201 )
							if( Equilibrium_Zone <= 301.759 )
								ret := 0.250000
							if( Equilibrium_Zone > 301.759 )
								if( atr <= 15.5873 )
									ret := -1.000000 // sell
								if( atr > 15.5873 )
									ret := -0.700000 // sell
						if( Equilibrium_Zone > 323.201 )
							ret := 1.000000 // buy
				if( Discount_Zone > 300.802 )
					if( Internal_Swing_High <= 331.48 )
						if( Internal_Swing_High <= 306.649 )
							if( Premium_Zone <= 308.04 )
								ret := -1.000000 // sell
							if( Premium_Zone > 308.04 )
								if( atr <= 3.66703 )
									ret := 0.142857
								if( atr > 3.66703 )
									ret := -0.419355
						if( Internal_Swing_High > 306.649 )
							if( Internal_Swing_High <= 316.698 )
								if( Internal_Swing_High <= 315.725 )
									ret := -0.661616
								if( Internal_Swing_High > 315.725 )
									ret := 0.545455
							if( Internal_Swing_High > 316.698 )
								if( Equilibrium_Zone <= 313.796 )
									ret := -1.000000 // sell
								if( Equilibrium_Zone > 313.796 )
									ret := -0.782609 // sell
					if( Internal_Swing_High > 331.48 )
						if( Premium_Zone <= 347.59 )
							ret := 1.000000 // buy
						if( Premium_Zone > 347.59 )
							ret := -0.666667
			if( Discount_Zone > 303.407 )
				if( Internal_Swing_High <= 316.21 )
					if( Premium_Zone <= 312.946 )
						if( Discount_Zone <= 303.669 )
							if( Swing_High <= 155 )
								if( Internal_Swing_High <= 309.525 )
									ret := 0.000000
								if( Internal_Swing_High > 309.525 )
									ret := -0.909091 // sell
							if( Swing_High > 155 )
								ret := -1.000000 // sell
						if( Discount_Zone > 303.669 )
							if( Swing_High <= 309.844 )
								if( Internal_Swing_High <= 309.325 )
									ret := 0.103448
								if( Internal_Swing_High > 309.325 )
									ret := -0.240000
							if( Swing_High > 309.844 )
								if( Swing_High <= 311.082 )
									ret := 0.666667
								if( Swing_High > 311.082 )
									ret := -0.400000
					if( Premium_Zone > 312.946 )
						if( atr <= 12.2946 )
							if( atr <= 7.8339 )
								if( Premium_Zone <= 319.848 )
									ret := 0.392857
								if( Premium_Zone > 319.848 )
									ret := -0.128713
							if( atr > 7.8339 )
								if( Equilibrium_Zone <= 313.941 )
									ret := 0.774194 // buy
								if( Equilibrium_Zone > 313.941 )
									ret := 0.333333
						if( atr > 12.2946 )
							if( Equilibrium_Zone <= 317.14 )
								ret := -1.000000 // sell
							if( Equilibrium_Zone > 317.14 )
								if( Premium_Zone <= 330.074 )
									ret := 0.166667
								if( Premium_Zone > 330.074 )
									ret := -0.250000
				if( Internal_Swing_High > 316.21 )
					if( atr <= 14.1328 )
						if( Discount_Zone <= 336.912 )
							if( Equilibrium_Zone <= 326.134 )
								if( atr <= 2.5625 )
									ret := 0.916667 // buy
								if( atr > 2.5625 )
									ret := -0.034446
							if( Equilibrium_Zone > 326.134 )
								if( Swing_High <= 343.785 )
									ret := 0.282544
								if( Swing_High > 343.785 )
									ret := -0.228070
						if( Discount_Zone > 336.912 )
							if( Internal_Swing_High <= 344.732 )
								if( Swing_High <= 343.269 )
									ret := -0.310881
								if( Swing_High > 343.269 )
									ret := -0.846154 // sell
							if( Internal_Swing_High > 344.732 )
								if( Internal_Swing_Low <= 386 )
									ret := 0.000286
								if( Internal_Swing_Low > 386 )
									ret := -0.580645
					if( atr > 14.1328 )
						if( atr <= 25.592 )
							if( Internal_Swing_High <= 335.02 )
								if( Equilibrium_Zone <= 323.49 )
									ret := 0.250000
								if( Equilibrium_Zone > 323.49 )
									ret := -0.849315 // sell
							if( Internal_Swing_High > 335.02 )
								if( Swing_High <= 336.632 )
									ret := -0.089855
								if( Swing_High > 336.632 )
									ret := -0.477876
						if( atr > 25.592 )
							if( Internal_Swing_High <= 372.25 )
								if( Internal_Swing_High <= 322.18 )
									ret := -0.500000
								if( Internal_Swing_High > 322.18 )
									ret := 0.660377
							if( Internal_Swing_High > 372.25 )
								if( Discount_Zone <= 333.497 )
									ret := -0.750000 // sell
								if( Discount_Zone > 333.497 )
									ret := -0.500000
		if( Swing_High > 385.863 )
			if( Internal_Swing_High <= 391.473 )
				if( Premium_Zone <= 394.163 )
					if( Equilibrium_Zone <= 388.473 )
						if( atr <= 2.9325 )
							ret := 0.000000
						if( atr > 2.9325 )
							if( Discount_Zone <= 382.621 )
								if( Equilibrium_Zone <= 386.557 )
									ret := -0.488550
								if( Equilibrium_Zone > 386.557 )
									ret := 0.375000
							if( Discount_Zone > 382.621 )
								if( Premium_Zone <= 391.149 )
									ret := -0.750000 // sell
								if( Premium_Zone > 391.149 )
									ret := -0.937500 // sell
					if( Equilibrium_Zone > 388.473 )
						if( Equilibrium_Zone <= 388.735 )
							ret := 0.750000 // buy
						if( Equilibrium_Zone > 388.735 )
							if( Equilibrium_Zone <= 389.065 )
								ret := -0.250000
							if( Equilibrium_Zone > 389.065 )
								ret := 0.000000
				if( Premium_Zone > 394.163 )
					if( atr <= 8.2648 )
						if( Internal_Swing_High <= 390.993 )
							ret := 1.000000 // buy
						if( Internal_Swing_High > 390.993 )
							ret := -0.250000
					if( atr > 8.2648 )
						if( Internal_Swing_High <= 388.529 )
							if( Discount_Zone <= 373.622 )
								if( Premium_Zone <= 397.755 )
									ret := 0.214286
								if( Premium_Zone > 397.755 )
									ret := -0.076923
							if( Discount_Zone > 373.622 )
								ret := 0.750000 // buy
						if( Internal_Swing_High > 388.529 )
							if( Equilibrium_Zone <= 386.751 )
								if( Premium_Zone <= 395.664 )
									ret := 0.000000
								if( Premium_Zone > 395.664 )
									ret := -0.785714 // sell
							if( Equilibrium_Zone > 386.751 )
								if( Premium_Zone <= 397.389 )
									ret := 0.500000
								if( Premium_Zone > 397.389 )
									ret := -0.115385
			if( Internal_Swing_High > 391.473 )
				if( Equilibrium_Zone <= 389.521 )
					if( Equilibrium_Zone <= 389.199 )
						ret := -1.000000 // sell
					if( Equilibrium_Zone > 389.199 )
						if( Discount_Zone <= 382.444 )
							ret := -0.500000
						if( Discount_Zone > 382.444 )
							if( Internal_Swing_High <= 392.102 )
								ret := -0.750000 // sell
							if( Internal_Swing_High > 392.102 )
								ret := -1.000000 // sell
				if( Equilibrium_Zone > 389.521 )
					if( Equilibrium_Zone <= 390.523 )
						if( Internal_Swing_High <= 391.941 )
							if( atr <= 5.34844 )
								if( Swing_High <= 391.834 )
									ret := 0.000000
								if( Swing_High > 391.834 )
									ret := -0.600000
							if( atr > 5.34844 )
								ret := -1.000000 // sell
						if( Internal_Swing_High > 391.941 )
							if( atr <= 5.20958 )
								ret := -0.428571
							if( atr > 5.20958 )
								if( Order_Block_High <= 392.69 )
									ret := 0.214286
								if( Order_Block_High > 392.69 )
									ret := -0.500000
					if( Equilibrium_Zone > 390.523 )
						if( Equilibrium_Zone <= 390.858 )
							if( Discount_Zone <= 386.29 )
								ret := -0.500000
							if( Discount_Zone > 386.29 )
								ret := -1.000000 // sell
						if( Equilibrium_Zone > 390.858 )
							ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_CRWD_1Min_36034035(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


