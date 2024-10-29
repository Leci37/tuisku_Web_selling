//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Smart_Money_Concepts
// ID_model: NVDA_5Min_1SMA_96408d41 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NVDA_5Min_1SMA_96408d41", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NVDA_5Min_96408d41(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( atr <= 12.2893 )
		if( Premium_Zone <= 131.929 )
			if( Swing_High <= 117.348 )
				if( Swing_Low <= 112.678 )
					if( Premium_Zone <= 130.587 )
						if( Discount_Zone <= 121.759 )
							if( atr <= 12.115 )
								if( Swing_High <= 115.358 )
									ret := 0.032871
								if( Swing_High > 115.358 )
									ret := -0.410526
							if( atr > 12.115 )
								if( Discount_Zone <= 105.674 )
									ret := -0.777778 // sell
								if( Discount_Zone > 105.674 )
									ret := 0.500000
						if( Discount_Zone > 121.759 )
							if( atr <= 3.96958 )
								if( atr <= 3.12746 )
									ret := -0.742857 // sell
								if( atr > 3.12746 )
									ret := -0.315385
							if( atr > 3.96958 )
								if( atr <= 3.99328 )
									ret := 0.366667
								if( atr > 3.99328 )
									ret := -1.000000 // sell
					if( Premium_Zone > 130.587 )
						if( Equilibrium_Zone <= 124.19 )
							if( atr <= 12.2073 )
								if( atr <= 6.9726 )
									ret := 0.636364
								if( atr > 6.9726 )
									ret := -0.218391
							if( atr > 12.2073 )
								ret := 1.000000 // buy
						if( Equilibrium_Zone > 124.19 )
							if( atr <= 3.78003 )
								if( Discount_Zone <= 124.216 )
									ret := 0.053691
								if( Discount_Zone > 124.216 )
									ret := -0.219512
							if( atr > 3.78003 )
								if( Discount_Zone <= 120.111 )
									ret := 0.482625
								if( Discount_Zone > 120.111 )
									ret := 0.261838
				if( Swing_Low > 112.678 )
					if( Swing_Low <= 117.8 )
						if( Swing_Low <= 114.363 )
							if( Premium_Zone <= 118.741 )
								if( atr <= 3.62448 )
									ret := 0.500000
								if( atr > 3.62448 )
									ret := -0.142857
							if( Premium_Zone > 118.741 )
								if( Order_Block_High <= 113.942 )
									ret := 0.973684 // buy
								if( Order_Block_High > 113.942 )
									ret := -0.500000
						if( Swing_Low > 114.363 )
							if( Equilibrium_Zone <= 115.836 )
								if( Premium_Zone <= 119.028 )
									ret := -1.000000 // sell
								if( Premium_Zone > 119.028 )
									ret := -0.125000
							if( Equilibrium_Zone > 115.836 )
								if( Equilibrium_Zone <= 117.173 )
									ret := 0.870968 // buy
								if( Equilibrium_Zone > 117.173 )
									ret := 0.339181
					if( Swing_Low > 117.8 )
						if( atr <= 8.22664 )
							if( Discount_Zone <= 123.975 )
								if( Swing_Low <= 118.126 )
									ret := -0.619048
								if( Swing_Low > 118.126 )
									ret := 0.216763
							if( Discount_Zone > 123.975 )
								if( Swing_Low <= 126.351 )
									ret := -0.857143 // sell
								if( Swing_Low > 126.351 )
									ret := -0.200000
						if( atr > 8.22664 )
							ret := -1.000000 // sell
			if( Swing_High > 117.348 )
				if( Swing_High <= 121.446 )
					if( Premium_Zone <= 124.091 )
						if( Internal_Swing_High <= 117.503 )
							if( Equilibrium_Zone <= 115.684 )
								ret := 1.000000 // buy
							if( Equilibrium_Zone > 115.684 )
								ret := 0.750000 // buy
						if( Internal_Swing_High > 117.503 )
							if( Internal_Swing_Low <= 57.6486 )
								if( Discount_Zone <= 108.898 )
									ret := -0.642857
								if( Discount_Zone > 108.898 )
									ret := 0.272727
							if( Internal_Swing_Low > 57.6486 )
								if( atr <= 3.93001 )
									ret := -0.428571
								if( atr > 3.93001 )
									ret := 0.807692 // buy
					if( Premium_Zone > 124.091 )
						if( Premium_Zone <= 128.79 )
							if( Discount_Zone <= 107.409 )
								ret := 1.000000 // buy
							if( Discount_Zone > 107.409 )
								if( atr <= 6.72328 )
									ret := 0.920000 // buy
								if( atr > 6.72328 )
									ret := 0.266667
						if( Premium_Zone > 128.79 )
							if( Discount_Zone <= 106.246 )
								ret := -0.500000
							if( Discount_Zone > 106.246 )
								ret := 0.500000
				if( Swing_High > 121.446 )
					if( Equilibrium_Zone <= 125.119 )
						if( Discount_Zone <= 112.517 )
							if( Internal_Swing_High <= 122.228 )
								if( Premium_Zone <= 128.774 )
									ret := -0.500000
								if( Premium_Zone > 128.774 )
									ret := 0.500000
							if( Internal_Swing_High > 122.228 )
								if( Equilibrium_Zone <= 120.32 )
									ret := -0.884615 // sell
								if( Equilibrium_Zone > 120.32 )
									ret := -0.444444
						if( Discount_Zone > 112.517 )
							if( Premium_Zone <= 129.67 )
								if( Swing_High <= 125.793 )
									ret := 0.032407
								if( Swing_High > 125.793 )
									ret := 0.680851
							if( Premium_Zone > 129.67 )
								if( Swing_High <= 124.748 )
									ret := 0.625000
								if( Swing_High > 124.748 )
									ret := -0.545455
					if( Equilibrium_Zone > 125.119 )
						if( Discount_Zone <= 122.319 )
							if( Equilibrium_Zone <= 125.436 )
								if( Internal_Swing_High <= 127.825 )
									ret := 0.437500
								if( Internal_Swing_High > 127.825 )
									ret := 1.000000 // buy
							if( Equilibrium_Zone > 125.436 )
								if( Discount_Zone <= 122.124 )
									ret := 0.883721 // buy
								if( Discount_Zone > 122.124 )
									ret := 0.500000
						if( Discount_Zone > 122.319 )
							if( Order_Block_High <= 127.979 )
								if( Premium_Zone <= 131.19 )
									ret := -0.666667
								if( Premium_Zone > 131.19 )
									ret := 0.142857
							if( Order_Block_High > 127.979 )
								if( Swing_High <= 128.69 )
									ret := 1.000000 // buy
								if( Swing_High > 128.69 )
									ret := 0.666667
		if( Premium_Zone > 131.929 )
			if( Equilibrium_Zone <= 129.687 )
				if( Premium_Zone <= 138.422 )
					if( Internal_Swing_Low <= 129.68 )
						if( Premium_Zone <= 135.605 )
							if( Premium_Zone <= 133.039 )
								if( Equilibrium_Zone <= 124.338 )
									ret := -0.333333
								if( Equilibrium_Zone > 124.338 )
									ret := 0.095116
							if( Premium_Zone > 133.039 )
								if( atr <= 9.34995 )
									ret := -0.200290
								if( atr > 9.34995 )
									ret := 0.232759
						if( Premium_Zone > 135.605 )
							if( Premium_Zone <= 136.065 )
								if( Equilibrium_Zone <= 127.149 )
									ret := 0.000000
								if( Equilibrium_Zone > 127.149 )
									ret := 0.669118
							if( Premium_Zone > 136.065 )
								if( Equilibrium_Zone <= 128.697 )
									ret := -0.203008
								if( Equilibrium_Zone > 128.697 )
									ret := 0.240506
					if( Internal_Swing_Low > 129.68 )
						if( Premium_Zone <= 135.083 )
							if( Premium_Zone <= 134.105 )
								if( Equilibrium_Zone <= 129.416 )
									ret := -0.450000
								if( Equilibrium_Zone > 129.416 )
									ret := -1.000000 // sell
							if( Premium_Zone > 134.105 )
								if( Equilibrium_Zone <= 128.219 )
									ret := -0.750000 // sell
								if( Equilibrium_Zone > 128.219 )
									ret := -0.972973 // sell
						if( Premium_Zone > 135.083 )
							if( atr <= 5.89935 )
								ret := 0.000000
							if( atr > 5.89935 )
								if( Internal_Swing_Low <= 129.775 )
									ret := 0.250000
								if( Internal_Swing_Low > 129.775 )
									ret := 0.500000
				if( Premium_Zone > 138.422 )
					if( Premium_Zone <= 140.044 )
						if( atr <= 11.0229 )
							if( Discount_Zone <= 119.488 )
								if( Premium_Zone <= 139.859 )
									ret := -0.956522 // sell
								if( Premium_Zone > 139.859 )
									ret := -0.750000 // sell
							if( Discount_Zone > 119.488 )
								ret := -0.714286 // sell
						if( atr > 11.0229 )
							if( Discount_Zone <= 116.971 )
								if( Equilibrium_Zone <= 127.571 )
									ret := -0.691176
								if( Equilibrium_Zone > 127.571 )
									ret := -1.000000 // sell
							if( Discount_Zone > 116.971 )
								if( Discount_Zone <= 117.312 )
									ret := 1.000000 // buy
								if( Discount_Zone > 117.312 )
									ret := 0.500000
					if( Premium_Zone > 140.044 )
						if( atr <= 11.5823 )
							if( atr <= 11.0169 )
								if( Internal_Swing_High <= 126.38 )
									ret := 0.000000
								if( Internal_Swing_High > 126.38 )
									ret := -0.500000
							if( atr > 11.0169 )
								ret := 0.857143 // buy
						if( atr > 11.5823 )
							ret := -1.000000 // sell
			if( Equilibrium_Zone > 129.687 )
				if( Equilibrium_Zone <= 132.066 )
					if( Discount_Zone <= 128.258 )
						if( Discount_Zone <= 125.421 )
							if( atr <= 11.0226 )
								if( Internal_Swing_High <= 130.06 )
									ret := 0.351536
								if( Internal_Swing_High > 130.06 )
									ret := 0.011111
							if( atr > 11.0226 )
								ret := -1.000000 // sell
						if( Discount_Zone > 125.421 )
							if( Equilibrium_Zone <= 130.14 )
								if( Premium_Zone <= 134.073 )
									ret := -0.081633
								if( Premium_Zone > 134.073 )
									ret := 0.933333 // buy
							if( Equilibrium_Zone > 130.14 )
								if( Discount_Zone <= 126.153 )
									ret := -0.220126
								if( Discount_Zone > 126.153 )
									ret := 0.088889
					if( Discount_Zone > 128.258 )
						if( Discount_Zone <= 128.409 )
							if( atr <= 3.34298 )
								if( Premium_Zone <= 134.667 )
									ret := 0.750000 // buy
								if( Premium_Zone > 134.667 )
									ret := 1.000000 // buy
							if( atr > 3.34298 )
								if( Discount_Zone <= 128.264 )
									ret := 0.923077 // buy
								if( Discount_Zone > 128.264 )
									ret := 0.641026
						if( Discount_Zone > 128.409 )
							if( Swing_High <= 132.815 )
								if( atr <= 3.2533 )
									ret := 0.221239
								if( atr > 3.2533 )
									ret := 0.771429 // buy
							if( Swing_High > 132.815 )
								if( atr <= 3.20365 )
									ret := 0.000000
								if( atr > 3.20365 )
									ret := -1.000000 // sell
				if( Equilibrium_Zone > 132.066 )
					if( Discount_Zone <= 127.968 )
						if( Swing_Low <= 63.525 )
							if( atr <= 9.07475 )
								if( Internal_Swing_Low <= 132.856 )
									ret := -0.608333
								if( Internal_Swing_Low > 132.856 )
									ret := 0.250000
							if( atr > 9.07475 )
								if( Internal_Swing_High <= 129.523 )
									ret := -0.146119
								if( Internal_Swing_High > 129.523 )
									ret := -0.537037
						if( Swing_Low > 63.525 )
							if( Premium_Zone <= 140.551 )
								ret := -0.500000
							if( Premium_Zone > 140.551 )
								if( atr <= 8.83058 )
									ret := 0.500000
								if( atr > 8.83058 )
									ret := 1.000000 // buy
					if( Discount_Zone > 127.968 )
						if( Discount_Zone <= 128.69 )
							if( Swing_High <= 66.6857 )
								if( Premium_Zone <= 138.295 )
									ret := 0.638889
								if( Premium_Zone > 138.295 )
									ret := 0.258621
							if( Swing_High > 66.6857 )
								if( Internal_Swing_High <= 134.72 )
									ret := -0.400000
								if( Internal_Swing_High > 134.72 )
									ret := -0.090909
						if( Discount_Zone > 128.69 )
							if( Swing_Low <= 475.475 )
								if( Discount_Zone <= 131.59 )
									ret := -0.111682
								if( Discount_Zone > 131.59 )
									ret := 0.023316
							if( Swing_Low > 475.475 )
								if( Equilibrium_Zone <= 504.578 )
									ret := -0.313043
								if( Equilibrium_Zone > 504.578 )
									ret := 0.684211
	if( atr > 12.2893 )
		if( Equilibrium_Zone <= 411.871 )
			if( Discount_Zone <= 394.015 )
				if( Equilibrium_Zone <= 408.742 )
					if( Discount_Zone <= -978.62 )
						if( Internal_Swing_High <= 121.486 )
							if( Equilibrium_Zone <= 119.519 )
								ret := 1.000000 // buy
							if( Equilibrium_Zone > 119.519 )
								if( Equilibrium_Zone <= 119.663 )
									ret := 0.750000 // buy
								if( Equilibrium_Zone > 119.663 )
									ret := 1.000000 // buy
						if( Internal_Swing_High > 121.486 )
							ret := 0.500000
					if( Discount_Zone > -978.62 )
						if( Premium_Zone <= 483.799 )
							if( Discount_Zone <= 85.6594 )
								if( Swing_High <= 51.08 )
									ret := 0.542289
								if( Swing_High > 51.08 )
									ret := -0.833333 // sell
							if( Discount_Zone > 85.6594 )
								if( Equilibrium_Zone <= 102.256 )
									ret := -0.462500
								if( Equilibrium_Zone > 102.256 )
									ret := 0.148646
						if( Premium_Zone > 483.799 )
							if( Internal_Swing_Low <= 20.501 )
								if( Equilibrium_Zone <= 120.06 )
									ret := -0.379747
								if( Equilibrium_Zone > 120.06 )
									ret := -0.833333 // sell
							if( Internal_Swing_Low > 20.501 )
								if( Internal_Swing_Low <= 121.605 )
									ret := 0.592593
								if( Internal_Swing_Low > 121.605 )
									ret := -0.275862
				if( Equilibrium_Zone > 408.742 )
					if( Internal_Swing_Low <= 402.54 )
						if( Equilibrium_Zone <= 410.245 )
							if( atr <= 34.1774 )
								if( Equilibrium_Zone <= 409.08 )
									ret := -0.428571
								if( Equilibrium_Zone > 409.08 )
									ret := 0.065789
							if( atr > 34.1774 )
								if( Internal_Swing_High <= 201.69 )
									ret := -0.500000
								if( Internal_Swing_High > 201.69 )
									ret := -0.933333 // sell
						if( Equilibrium_Zone > 410.245 )
							if( Swing_High <= 208.177 )
								if( atr <= 21.6388 )
									ret := -0.050847
								if( atr > 21.6388 )
									ret := 0.517857
							if( Swing_High > 208.177 )
								if( Order_Block_High <= 208.275 )
									ret := 1.000000 // buy
								if( Order_Block_High > 208.275 )
									ret := 0.400000
					if( Internal_Swing_Low > 402.54 )
						if( atr <= 21.2338 )
							if( atr <= 18.1237 )
								if( Internal_Swing_Low <= 405.441 )
									ret := 0.714286 // buy
								if( Internal_Swing_Low > 405.441 )
									ret := -0.568966
							if( atr > 18.1237 )
								if( atr <= 18.9812 )
									ret := 0.200000
								if( atr > 18.9812 )
									ret := 0.888889 // buy
						if( atr > 21.2338 )
							if( atr <= 21.8261 )
								if( Internal_Swing_Low <= 405.812 )
									ret := -0.966667 // sell
								if( Internal_Swing_Low > 405.812 )
									ret := -0.750000 // sell
							if( atr > 21.8261 )
								if( Discount_Zone <= 387.381 )
									ret := -0.800000 // sell
								if( Discount_Zone > 387.381 )
									ret := 0.750000 // buy
			if( Discount_Zone > 394.015 )
				if( atr <= 14.5168 )
					if( Discount_Zone <= 395.067 )
						ret := 1.000000 // buy
					if( Discount_Zone > 395.067 )
						if( Discount_Zone <= 395.808 )
							if( Internal_Swing_Low <= 203.356 )
								ret := -0.444444
							if( Internal_Swing_Low > 203.356 )
								ret := -0.500000
						if( Discount_Zone > 395.808 )
							if( Premium_Zone <= 424.032 )
								if( Internal_Swing_Low <= 405.82 )
									ret := 0.600000
								if( Internal_Swing_Low > 405.82 )
									ret := 0.000000
							if( Premium_Zone > 424.032 )
								if( Equilibrium_Zone <= 411.384 )
									ret := -0.115385
								if( Equilibrium_Zone > 411.384 )
									ret := 0.179487
				if( atr > 14.5168 )
					if( Internal_Swing_Low <= 406.999 )
						if( atr <= 15.8913 )
							if( Premium_Zone <= 424.769 )
								if( atr <= 14.805 )
									ret := 0.941176 // buy
								if( atr > 14.805 )
									ret := 0.250000
							if( Premium_Zone > 424.769 )
								ret := 1.000000 // buy
						if( atr > 15.8913 )
							if( Premium_Zone <= 427.526 )
								if( atr <= 16.128 )
									ret := -0.250000
								if( atr > 16.128 )
									ret := 0.312500
							if( Premium_Zone > 427.526 )
								if( Discount_Zone <= 394.854 )
									ret := 1.000000 // buy
								if( Discount_Zone > 394.854 )
									ret := 0.745455 // buy
					if( Internal_Swing_Low > 406.999 )
						if( Internal_Swing_Low <= 408.87 )
							ret := -0.833333 // sell
						if( Internal_Swing_Low > 408.87 )
							if( atr <= 15.9316 )
								if( Internal_Swing_Low <= 411.387 )
									ret := -0.142857
								if( Internal_Swing_Low > 411.387 )
									ret := -0.500000
							if( atr > 15.9316 )
								if( Internal_Swing_Low <= 409.4 )
									ret := 0.250000
								if( Internal_Swing_Low > 409.4 )
									ret := 0.916667 // buy
		if( Equilibrium_Zone > 411.871 )
			if( atr <= 125.33 )
				if( atr <= 27.8097 )
					if( Internal_Swing_Low <= 870.323 )
						if( atr <= 26.9903 )
							if( Equilibrium_Zone <= 412.292 )
								if( atr <= 17.0767 )
									ret := -0.457627
								if( atr > 17.0767 )
									ret := -0.051282
							if( Equilibrium_Zone > 412.292 )
								if( Discount_Zone <= 929.778 )
									ret := 0.057523
								if( Discount_Zone > 929.778 )
									ret := -0.230769
						if( atr > 26.9903 )
							if( Swing_Low <= 425.72 )
								if( Discount_Zone <= 404.306 )
									ret := -0.232283
								if( Discount_Zone > 404.306 )
									ret := 0.011527
							if( Swing_Low > 425.72 )
								if( Premium_Zone <= 609.009 )
									ret := -0.807018 // sell
								if( Premium_Zone > 609.009 )
									ret := 0.250000
					if( Internal_Swing_Low > 870.323 )
						if( Equilibrium_Zone <= 949.65 )
							if( Premium_Zone <= 904.264 )
								if( Equilibrium_Zone <= 875.645 )
									ret := -0.148148
								if( Equilibrium_Zone > 875.645 )
									ret := -0.587302
							if( Premium_Zone > 904.264 )
								if( Swing_High <= 908.842 )
									ret := -0.044843
								if( Swing_High > 908.842 )
									ret := -0.875000 // sell
						if( Equilibrium_Zone > 949.65 )
							if( Internal_Swing_Low <= 1132.96 )
								if( Internal_Swing_Low <= 941.78 )
									ret := -0.333333
								if( Internal_Swing_Low > 941.78 )
									ret := -0.701299 // sell
							if( Internal_Swing_Low > 1132.96 )
								ret := 0.800000 // buy
				if( atr > 27.8097 )
					if( Equilibrium_Zone <= 444.895 )
						if( Equilibrium_Zone <= 434.575 )
							if( Premium_Zone <= 468.295 )
								if( Equilibrium_Zone <= 419.607 )
									ret := -0.275862
								if( Equilibrium_Zone > 419.607 )
									ret := 0.181287
							if( Premium_Zone > 468.295 )
								if( Discount_Zone <= 381.172 )
									ret := -0.200000
								if( Discount_Zone > 381.172 )
									ret := -1.000000 // sell
						if( Equilibrium_Zone > 434.575 )
							if( Internal_Swing_Low <= 438.055 )
								if( atr <= 34.2028 )
									ret := 0.703518 // buy
								if( atr > 34.2028 )
									ret := 0.200000
							if( Internal_Swing_Low > 438.055 )
								if( Premium_Zone <= 473.888 )
									ret := 0.812500 // buy
								if( Premium_Zone > 473.888 )
									ret := -0.541667
					if( Equilibrium_Zone > 444.895 )
						if( Equilibrium_Zone <= 489.415 )
							if( Equilibrium_Zone <= 468.697 )
								if( Premium_Zone <= 493.892 )
									ret := -0.024528
								if( Premium_Zone > 493.892 )
									ret := 0.413127
							if( Equilibrium_Zone > 468.697 )
								if( Internal_Swing_Low <= 226.84 )
									ret := -0.349680
								if( Internal_Swing_Low > 226.84 )
									ret := 0.048128
						if( Equilibrium_Zone > 489.415 )
							if( Equilibrium_Zone <= 494.568 )
								if( atr <= 28.7599 )
									ret := 0.793103 // buy
								if( atr > 28.7599 )
									ret := 0.358491
							if( Equilibrium_Zone > 494.568 )
								if( Premium_Zone <= 540.16 )
									ret := 0.553191
								if( Premium_Zone > 540.16 )
									ret := 0.076095
			if( atr > 125.33 )
				if( Premium_Zone <= 1764.98 )
					if( atr <= 611.3 )
						if( Premium_Zone <= 1161.82 )
							if( Internal_Swing_Low <= 518.35 )
								ret := -1.000000 // sell
							if( Internal_Swing_Low > 518.35 )
								if( Internal_Swing_Low <= 1043.27 )
									ret := -0.750000 // sell
								if( Internal_Swing_Low > 1043.27 )
									ret := -1.000000 // sell
						if( Premium_Zone > 1161.82 )
							ret := -0.750000 // sell
					if( atr > 611.3 )
						if( Internal_Swing_Low <= 120.095 )
							if( Internal_Swing_High <= 103.835 )
								if( Internal_Swing_High <= 14.3997 )
									ret := -0.694444
								if( Internal_Swing_High > 14.3997 )
									ret := -1.000000 // sell
							if( Internal_Swing_High > 103.835 )
								ret := -0.357143
						if( Internal_Swing_Low > 120.095 )
							ret := 0.000000
				if( Premium_Zone > 1764.98 )
					if( Equilibrium_Zone <= 667.963 )
						if( Premium_Zone <= 1767.06 )
							ret := -0.666667
						if( Premium_Zone > 1767.06 )
							ret := 0.312500
					if( Equilibrium_Zone > 667.963 )
						if( Equilibrium_Zone <= 668.066 )
							ret := 1.000000 // buy
						if( Equilibrium_Zone > 668.066 )
							ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_NVDA_5Min_96408d41(Internal_Swing_High, Bearish_BOSInt, Bearish_CHoCHInt, Order_Block_Low, Equilibrium_Zone, Swing_High, Bullish_CHoCHInt, atr, Internal_Swing_Low, FVG_UpInt, Discount_Zone, Bullish_BOSInt, Premium_Zone, Swing_Low, FVG_DownInt, Order_Block_High)

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


