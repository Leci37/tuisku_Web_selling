//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: TSLA_5Min_1T00_7487dc5d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_5Min_1T00_7487dc5d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_5Min_7487dc5d(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.007854 )
		if( ema12 <= -0.8643 )
			if( ema2 <= 250.696 )
				if( tema <= 240.579 )
					if( ema13 <= -3.14596 )
						if( tema <= 192.094 )
							if( ema12 <= -2.26897 )
								if( ema1 <= 168.602 )
									ret := 0.923077 // buy
								if( ema1 > 168.602 )
									ret := -0.250000
							if( ema12 > -2.26897 )
								if( ema12 <= -1.56751 )
									ret := 1.000000 // buy
								if( ema12 > -1.56751 )
									ret := 0.750000 // buy
						if( tema > 192.094 )
							if( ema12 <= -3.35355 )
								if( ema1 <= 229.205 )
									ret := 0.250000
								if( ema1 > 229.205 )
									ret := 0.944444 // buy
							if( ema12 > -3.35355 )
								if( ema13 <= -4.36343 )
									ret := -0.797619 // sell
								if( ema13 > -4.36343 )
									ret := -0.282297
					if( ema13 > -3.14596 )
						if( ema12 <= -1.09555 )
							if( ema2 <= 242.244 )
								if( ema13 <= -2.09026 )
									ret := 0.490566
								if( ema13 > -2.09026 )
									ret := 0.192727
							if( ema2 > 242.244 )
								if( ema3 <= 244.462 )
									ret := -1.000000 // sell
								if( ema3 > 244.462 )
									ret := -0.500000
						if( ema12 > -1.09555 )
							if( ema1 <= 241.058 )
								if( tema <= 168.62 )
									ret := 0.409091
								if( tema > 168.62 )
									ret := 0.020263
							if( ema1 > 241.058 )
								if( ema2 <= 242.298 )
									ret := -1.000000 // sell
								if( ema2 > 242.298 )
									ret := -0.250000
				if( tema > 240.579 )
					if( ema1 <= 245.296 )
						if( ema12 <= -0.895046 )
							if( ema13 <= -1.94059 )
								if( ema12 <= -1.08168 )
									ret := 0.958333 // buy
								if( ema12 > -1.08168 )
									ret := 0.692308
							if( ema13 > -1.94059 )
								if( ema13 <= -1.83497 )
									ret := 0.416667
								if( ema13 > -1.83497 )
									ret := 0.833333 // buy
						if( ema12 > -0.895046 )
							if( ema12 <= -0.87483 )
								ret := -0.250000
							if( ema12 > -0.87483 )
								ret := 0.500000
					if( ema1 > 245.296 )
						if( ema13 <= -2.21684 )
							if( tema <= 246.006 )
								if( ema3 <= 248.939 )
									ret := -0.500000
								if( ema3 > 248.939 )
									ret := 0.684211
							if( tema > 246.006 )
								if( ema12 <= -1.17907 )
									ret := 0.000000
								if( ema12 > -1.17907 )
									ret := -0.840000 // sell
						if( ema13 > -2.21684 )
							if( ema3 <= 250.282 )
								if( ema12 <= -1.0701 )
									ret := 0.757576 // buy
								if( ema12 > -1.0701 )
									ret := 0.034091
							if( ema3 > 250.282 )
								if( ema13 <= -1.38651 )
									ret := 0.864865 // buy
								if( ema13 > -1.38651 )
									ret := -0.250000
			if( ema2 > 250.696 )
				if( ema2 <= 254.871 )
					if( ema2 <= 252.425 )
						if( tema <= 248.086 )
							if( ema13 <= -4.25797 )
								ret := -1.000000 // sell
							if( ema13 > -4.25797 )
								if( tema <= 247.798 )
									ret := 0.850000 // buy
								if( tema > 247.798 )
									ret := 0.000000
						if( tema > 248.086 )
							if( ema12 <= -1.10701 )
								if( tema <= 248.437 )
									ret := -0.571429
								if( tema > 248.437 )
									ret := -0.925926 // sell
							if( ema12 > -1.10701 )
								if( ema3 <= 251.959 )
									ret := 0.125000
								if( ema3 > 251.959 )
									ret := -0.709677 // sell
					if( ema2 > 252.425 )
						if( ema1 <= 252.172 )
							if( ema12 <= -1.17436 )
								if( tema <= 248.862 )
									ret := 0.343750
								if( tema > 248.862 )
									ret := -0.411765
							if( ema12 > -1.17436 )
								if( ema3 <= 253.879 )
									ret := 0.500000
								if( ema3 > 253.879 )
									ret := 0.937500 // buy
						if( ema1 > 252.172 )
							if( ema1 <= 252.727 )
								if( ema2 <= 254.114 )
									ret := -0.914286 // sell
								if( ema2 > 254.114 )
									ret := -0.400000
							if( ema1 > 252.727 )
								if( ema13 <= -1.6572 )
									ret := -0.057692
								if( ema13 > -1.6572 )
									ret := -0.833333 // sell
				if( ema2 > 254.871 )
					if( tema <= 269.669 )
						if( tema <= 265.962 )
							if( tema <= 263.104 )
								if( ema3 <= 261.706 )
									ret := 0.189759
								if( ema3 > 261.706 )
									ret := -0.266304
							if( tema > 263.104 )
								if( ema12 <= -1.89881 )
									ret := 0.200000
								if( ema12 > -1.89881 )
									ret := 0.786885 // buy
						if( tema > 265.962 )
							if( ema12 <= -1.99658 )
								ret := 0.000000
							if( ema12 > -1.99658 )
								if( ema12 <= -1.05669 )
									ret := -0.981132 // sell
								if( ema12 > -1.05669 )
									ret := -0.600000
					if( tema > 269.669 )
						if( ema2 <= 281.523 )
							if( ema13 <= -1.46312 )
								if( ema13 <= -2.65934 )
									ret := 0.322581
								if( ema13 > -2.65934 )
									ret := 0.752941 // buy
							if( ema13 > -1.46312 )
								if( tema <= 273.961 )
									ret := -0.600000
								if( tema > 273.961 )
									ret := 0.500000
						if( ema2 > 281.523 )
							if( ema12 <= -1.13439 )
								if( ema13 <= -5.36019 )
									ret := -0.750000 // sell
								if( ema13 > -5.36019 )
									ret := -1.000000 // sell
							if( ema12 > -1.13439 )
								if( ema2 <= 284.41 )
									ret := -0.166667
								if( ema2 > 284.41 )
									ret := 0.720000 // buy
		if( ema12 > -0.8643 )
			if( tema <= 172.942 )
				if( tema <= 141.913 )
					if( ema2 <= 142.08 )
						if( ema1 <= 140.861 )
							if( ema2 <= 141.02 )
								ret := 1.000000 // buy
							if( ema2 > 141.02 )
								if( ema13 <= -0.734256 )
									ret := 0.750000 // buy
								if( ema13 > -0.734256 )
									ret := 0.500000
						if( ema1 > 140.861 )
							if( tema <= 141.238 )
								if( ema2 <= 141.806 )
									ret := -0.142857
								if( ema2 > 141.806 )
									ret := -1.000000 // sell
							if( tema > 141.238 )
								if( ema2 <= 141.564 )
									ret := 1.000000 // buy
								if( ema2 > 141.564 )
									ret := 0.064516
					if( ema2 > 142.08 )
						if( ema1 <= 142.144 )
							if( ema13 <= -0.336587 )
								ret := 1.000000 // buy
							if( ema13 > -0.336587 )
								ret := 0.750000 // buy
						if( ema1 > 142.144 )
							if( ema13 <= -0.411057 )
								ret := 0.000000
							if( ema13 > -0.411057 )
								ret := 0.714286 // buy
				if( tema > 141.913 )
					if( ema2 <= 159.166 )
						if( tema <= 158.02 )
							if( ema1 <= 157.526 )
								if( ema1 <= 146.669 )
									ret := 0.201754
								if( ema1 > 146.669 )
									ret := -0.097561
							if( ema1 > 157.526 )
								if( ema12 <= -0.083597 )
									ret := 0.565217
								if( ema12 > -0.083597 )
									ret := -0.666667
						if( tema > 158.02 )
							if( ema13 <= -0.174112 )
								if( tema <= 158.329 )
									ret := -0.500000
								if( tema > 158.329 )
									ret := -0.157895
							if( ema13 > -0.174112 )
								if( ema2 <= 159.075 )
									ret := -0.891892 // sell
								if( ema2 > 159.075 )
									ret := 0.000000
					if( ema2 > 159.166 )
						if( ema2 <= 160.117 )
							if( ema3 <= 160.143 )
								if( ema13 <= -0.840822 )
									ret := -0.750000 // sell
								if( ema13 > -0.840822 )
									ret := 0.597561
							if( ema3 > 160.143 )
								if( ema2 <= 159.913 )
									ret := 1.000000 // buy
								if( ema2 > 159.913 )
									ret := 0.656250
						if( ema2 > 160.117 )
							if( ema3 <= 162.965 )
								if( ema2 <= 162.308 )
									ret := 0.085714
								if( ema2 > 162.308 )
									ret := -0.630435
							if( ema3 > 162.965 )
								if( ema1 <= 163.042 )
									ret := 0.603604
								if( ema1 > 163.042 )
									ret := 0.107378
			if( tema > 172.942 )
				if( tema <= 271.587 )
					if( ema1 <= 174.363 )
						if( ema13 <= -0.447249 )
							if( ema2 <= 174.409 )
								if( ema12 <= -0.243401 )
									ret := 0.200000
								if( ema12 > -0.243401 )
									ret := 0.766667 // buy
							if( ema2 > 174.409 )
								if( tema <= 173.218 )
									ret := -0.857143 // sell
								if( tema > 173.218 )
									ret := -0.150000
						if( ema13 > -0.447249 )
							if( ema12 <= -0.109198 )
								if( ema3 <= 174.349 )
									ret := -0.563636
								if( ema3 > 174.349 )
									ret := -0.200000
							if( ema12 > -0.109198 )
								if( ema3 <= 174.525 )
									ret := -0.125000
								if( ema3 > 174.525 )
									ret := -1.000000 // sell
					if( ema1 > 174.363 )
						if( ema12 <= -0.715907 )
							if( ema1 <= 259.425 )
								if( tema <= 254.323 )
									ret := -0.090105
								if( tema > 254.323 )
									ret := 0.365385
							if( ema1 > 259.425 )
								if( ema1 <= 271.016 )
									ret := -0.418033
								if( ema1 > 271.016 )
									ret := 0.750000 // buy
						if( ema12 > -0.715907 )
							if( ema13 <= -0.279533 )
								if( ema13 <= -0.708981 )
									ret := 0.051795
								if( ema13 > -0.708981 )
									ret := -0.026451
							if( ema13 > -0.279533 )
								if( ema1 <= 196.364 )
									ret := -0.015364
								if( ema1 > 196.364 )
									ret := 0.058666
				if( tema > 271.587 )
					if( ema2 <= 272.564 )
						if( ema13 <= -0.402807 )
							if( ema12 <= -0.242362 )
								if( ema2 <= 272.131 )
									ret := -1.000000 // sell
								if( ema2 > 272.131 )
									ret := -0.200000
							if( ema12 > -0.242362 )
								ret := -1.000000 // sell
						if( ema13 > -0.402807 )
							if( tema <= 271.872 )
								if( ema3 <= 271.876 )
									ret := 0.750000 // buy
								if( ema3 > 271.876 )
									ret := 0.090909
							if( tema > 271.872 )
								if( ema12 <= -0.08502 )
									ret := 0.000000
								if( ema12 > -0.08502 )
									ret := -0.823529 // sell
					if( ema2 > 272.564 )
						if( ema1 <= 277.317 )
							if( tema <= 276.108 )
								if( ema3 <= 277.68 )
									ret := -0.027397
								if( ema3 > 277.68 )
									ret := -0.937500 // sell
							if( tema > 276.108 )
								if( ema2 <= 277.173 )
									ret := 0.062500
								if( ema2 > 277.173 )
									ret := 0.545455
						if( ema1 > 277.317 )
							if( ema2 <= 284.652 )
								if( ema1 <= 280.274 )
									ret := -0.202055
								if( ema1 > 280.274 )
									ret := -0.761194 // sell
							if( ema2 > 284.652 )
								if( ema1 <= 287.69 )
									ret := 0.580000
								if( ema1 > 287.69 )
									ret := -0.166667
	if( ema12 > -0.007854 )
		if( ema2 <= 217.641 )
			if( ema2 <= 217.267 )
				if( tema <= 218.341 )
					if( ema1 <= 216.772 )
						if( tema <= 191.333 )
							if( tema <= 181.477 )
								if( ema13 <= 2.55301 )
									ret := 0.089882
								if( ema13 > 2.55301 )
									ret := 0.687500
							if( tema > 181.477 )
								if( ema13 <= 0.571025 )
									ret := 0.043860
								if( ema13 > 0.571025 )
									ret := -0.154478
						if( tema > 191.333 )
							if( ema3 <= 189.068 )
								if( ema12 <= 1.7242 )
									ret := 0.947368 // buy
								if( ema12 > 1.7242 )
									ret := -0.200000
							if( ema3 > 189.068 )
								if( ema3 <= 189.814 )
									ret := -0.631579
								if( ema3 > 189.814 )
									ret := 0.127812
					if( ema1 > 216.772 )
						if( ema13 <= 0.657136 )
							if( ema12 <= 0.193385 )
								if( tema <= 217.414 )
									ret := -0.080645
								if( tema > 217.414 )
									ret := -0.485714
							if( ema12 > 0.193385 )
								if( ema2 <= 216.876 )
									ret := 0.215686
								if( ema2 > 216.876 )
									ret := 0.782609 // buy
						if( ema13 > 0.657136 )
							if( ema3 <= 215.887 )
								if( ema13 <= 1.63975 )
									ret := -0.666667
								if( ema13 > 1.63975 )
									ret := -1.000000 // sell
							if( ema3 > 215.887 )
								if( tema <= 218.078 )
									ret := -0.661765
								if( tema > 218.078 )
									ret := 0.071429
				if( tema > 218.341 )
					if( ema12 <= 1.66504 )
						if( ema2 <= 217.216 )
							if( ema3 <= 214.722 )
								ret := 0.000000
							if( ema3 > 214.722 )
								if( ema3 <= 215.872 )
									ret := 0.968750 // buy
								if( ema3 > 215.872 )
									ret := 0.633333
						if( ema2 > 217.216 )
							ret := 0.142857
					if( ema12 > 1.66504 )
						if( ema13 <= 4.19734 )
							if( tema <= 219.261 )
								ret := 0.500000
							if( tema > 219.261 )
								if( ema13 <= 3.7421 )
									ret := -0.900000 // sell
								if( ema13 > 3.7421 )
									ret := -0.200000
						if( ema13 > 4.19734 )
							if( ema2 <= 212.636 )
								ret := -0.250000
							if( ema2 > 212.636 )
								ret := 1.000000 // buy
			if( ema2 > 217.267 )
				if( ema13 <= 3.20178 )
					if( ema1 <= 217.438 )
						if( ema12 <= 0.132846 )
							if( tema <= 217.481 )
								if( ema13 <= 0.184597 )
									ret := 0.000000
								if( ema13 > 0.184597 )
									ret := 0.250000
							if( tema > 217.481 )
								if( ema12 <= 0.087265 )
									ret := 0.714286 // buy
								if( ema12 > 0.087265 )
									ret := 0.200000
						if( ema12 > 0.132846 )
							ret := -0.500000
					if( ema1 > 217.438 )
						if( tema <= 217.552 )
							if( ema2 <= 217.382 )
								ret := 0.750000 // buy
							if( ema2 > 217.382 )
								if( ema1 <= 217.581 )
									ret := 1.000000 // buy
								if( ema1 > 217.581 )
									ret := 0.750000 // buy
						if( tema > 217.552 )
							if( ema1 <= 218.314 )
								if( ema13 <= 1.27883 )
									ret := 0.565657
								if( ema13 > 1.27883 )
									ret := -1.000000 // sell
							if( ema1 > 218.314 )
								ret := 1.000000 // buy
				if( ema13 > 3.20178 )
					ret := -0.500000
		if( ema2 > 217.641 )
			if( ema3 <= 227.808 )
				if( ema3 <= 227.162 )
					if( ema1 <= 219.314 )
						if( ema13 <= 0.608848 )
							if( ema3 <= 218.134 )
								if( tema <= 218.002 )
									ret := -0.307692
								if( tema > 218.002 )
									ret := 0.466667
							if( ema3 > 218.134 )
								if( ema2 <= 218.254 )
									ret := -0.909091 // sell
								if( ema2 > 218.254 )
									ret := -0.292857
						if( ema13 > 0.608848 )
							if( ema13 <= 0.980307 )
								if( ema12 <= 0.623295 )
									ret := -0.681159
								if( ema12 > 0.623295 )
									ret := 0.200000
							if( ema13 > 0.980307 )
								if( ema1 <= 218.84 )
									ret := -0.517241
								if( ema1 > 218.84 )
									ret := 0.240000
					if( ema1 > 219.314 )
						if( ema1 <= 219.904 )
							if( tema <= 221.015 )
								if( tema <= 220.122 )
									ret := 0.283582
								if( tema > 220.122 )
									ret := 0.742424 // buy
							if( tema > 221.015 )
								if( ema1 <= 219.871 )
									ret := -0.761905 // sell
								if( ema1 > 219.871 )
									ret := 0.833333 // buy
						if( ema1 > 219.904 )
							if( ema12 <= 0.153813 )
								if( tema <= 220.769 )
									ret := 0.012605
								if( tema > 220.769 )
									ret := -0.198758
							if( ema12 > 0.153813 )
								if( ema3 <= 222.636 )
									ret := -0.076832
								if( ema3 > 222.636 )
									ret := 0.140884
				if( ema3 > 227.162 )
					if( ema13 <= 1.12597 )
						if( ema12 <= 0.037354 )
							if( ema3 <= 227.556 )
								if( ema2 <= 227.165 )
									ret := -1.000000 // sell
								if( ema2 > 227.165 )
									ret := -0.500000
							if( ema3 > 227.556 )
								if( ema13 <= 0.030616 )
									ret := 0.000000
								if( ema13 > 0.030616 )
									ret := 0.875000 // buy
						if( ema12 > 0.037354 )
							if( ema2 <= 227.874 )
								if( ema2 <= 227.493 )
									ret := 0.187500
								if( ema2 > 227.493 )
									ret := -0.551724
							if( ema2 > 227.874 )
								if( ema12 <= 0.364973 )
									ret := 0.363636
								if( ema12 > 0.364973 )
									ret := -0.142857
					if( ema13 > 1.12597 )
						if( ema13 <= 1.84601 )
							if( ema2 <= 228.044 )
								ret := -0.750000 // sell
							if( ema2 > 228.044 )
								ret := -1.000000 // sell
						if( ema13 > 1.84601 )
							if( ema13 <= 3.78404 )
								ret := 0.250000
							if( ema13 > 3.78404 )
								ret := -1.000000 // sell
			if( ema3 > 227.808 )
				if( ema2 <= 238.642 )
					if( tema <= 237.118 )
						if( ema13 <= 2.52116 )
							if( ema3 <= 236.654 )
								if( ema1 <= 228.856 )
									ret := 0.321429
								if( ema1 > 228.856 )
									ret := 0.089152
							if( ema3 > 236.654 )
								if( ema1 <= 236.788 )
									ret := -1.000000 // sell
								if( ema1 > 236.788 )
									ret := -0.111111
						if( ema13 > 2.52116 )
							if( ema2 <= 230.677 )
								if( ema12 <= 1.64579 )
									ret := 0.000000
								if( ema12 > 1.64579 )
									ret := 0.250000
							if( ema2 > 230.677 )
								if( ema13 <= 2.63263 )
									ret := -0.666667
								if( ema13 > 2.63263 )
									ret := -0.954545 // sell
					if( tema > 237.118 )
						if( ema13 <= 1.47929 )
							if( ema12 <= 0.259213 )
								if( ema2 <= 238.368 )
									ret := 0.484615
								if( ema2 > 238.368 )
									ret := 0.062500
							if( ema12 > 0.259213 )
								if( ema3 <= 236.203 )
									ret := 0.573171
								if( ema3 > 236.203 )
									ret := -0.225108
						if( ema13 > 1.47929 )
							if( ema3 <= 236.898 )
								if( ema12 <= 1.07128 )
									ret := 0.510204
								if( ema12 > 1.07128 )
									ret := 0.815126 // buy
							if( ema3 > 236.898 )
								if( ema12 <= 1.06395 )
									ret := 0.641026
								if( ema12 > 1.06395 )
									ret := -0.545455
				if( ema2 > 238.642 )
					if( ema12 <= 1.20043 )
						if( ema12 <= 0.886287 )
							if( ema13 <= 1.37136 )
								if( tema <= 240.824 )
									ret := -0.092994
								if( tema > 240.824 )
									ret := 0.060000
							if( ema13 > 1.37136 )
								if( tema <= 262.015 )
									ret := -0.054893
								if( tema > 262.015 )
									ret := -0.500000
						if( ema12 > 0.886287 )
							if( ema1 <= 240.86 )
								if( ema1 <= 240.687 )
									ret := 1.000000 // buy
								if( ema1 > 240.687 )
									ret := 0.750000 // buy
							if( ema1 > 240.86 )
								if( ema2 <= 249.878 )
									ret := -0.023041
								if( ema2 > 249.878 )
									ret := 0.270270
					if( ema12 > 1.20043 )
						if( ema13 <= 2.41702 )
							if( ema1 <= 253.49 )
								if( ema2 <= 249.009 )
									ret := -0.528571
								if( ema2 > 249.009 )
									ret := 0.276596
							if( ema1 > 253.49 )
								if( tema <= 267.64 )
									ret := -0.686441
								if( tema > 267.64 )
									ret := -0.156250
						if( ema13 > 2.41702 )
							if( tema <= 257.623 )
								if( ema2 <= 246.245 )
									ret := -0.056338
								if( ema2 > 246.245 )
									ret := 0.427632
							if( tema > 257.623 )
								if( tema <= 264.892 )
									ret := -0.537736
								if( tema > 264.892 )
									ret := 0.130952
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_TSLA_5Min_7487dc5d(ema2, ema1, ema12, ema3, ema13, tema)

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


