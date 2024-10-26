//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: NIO_5Min_2ST0_e2d0dd01 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_5Min_2ST0_e2d0dd01", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_5Min_e2d0dd01(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 49.8588 )
		if( ema3 <= 5.61151 )
			if( ema12 <= -0.034333 )
				if( d_k <= 12.646 )
					if( d_k <= 0.357268 )
						if( rsi1 <= 27.8469 )
							if( smoothD_d <= 3.06941 )
								if( smoothD_d <= 0.76368 )
									ret := -0.098039
								if( smoothD_d > 0.76368 )
									ret := 0.581818
							if( smoothD_d > 3.06941 )
								if( smoothD_d <= 28.8251 )
									ret := -0.408759
								if( smoothD_d > 28.8251 )
									ret := 0.203704
						if( rsi1 > 27.8469 )
							if( rsi1 <= 32.384 )
								if( rsi1 <= 29.9875 )
									ret := 0.440000
								if( rsi1 > 29.9875 )
									ret := 0.812500 // buy
							if( rsi1 > 32.384 )
								if( ema3 <= 5.01281 )
									ret := 0.600000
								if( ema3 > 5.01281 )
									ret := -0.363636
					if( d_k > 0.357268 )
						if( rsi1 <= 10.1647 )
							if( ema1 <= 5.45156 )
								if( d <= 6.80625 )
									ret := -1.000000 // sell
								if( d > 6.80625 )
									ret := -0.750000 // sell
							if( ema1 > 5.45156 )
								ret := -0.250000
						if( rsi1 > 10.1647 )
							if( tema <= 4.95624 )
								if( smoothD_d <= 11.0838 )
									ret := -0.250000
								if( smoothD_d > 11.0838 )
									ret := 0.550000
							if( tema > 4.95624 )
								if( d <= 7.50683 )
									ret := 0.000000
								if( d > 7.50683 )
									ret := -0.587629
				if( d_k > 12.646 )
					if( tema <= 5.27226 )
						if( rsi1 <= 25.5289 )
							if( smoothK_k <= -0.242498 )
								if( ema12 <= -0.039982 )
									ret := 0.875000 // buy
								if( ema12 > -0.039982 )
									ret := 0.000000
							if( smoothK_k > -0.242498 )
								ret := 1.000000 // buy
						if( rsi1 > 25.5289 )
							if( smoothD_d <= 26.0796 )
								ret := 0.250000
							if( smoothD_d > 26.0796 )
								ret := -1.000000 // sell
					if( tema > 5.27226 )
						if( ema12 <= -0.044061 )
							ret := 0.571429
						if( ema12 > -0.044061 )
							if( d_k <= 23.771 )
								ret := -1.000000 // sell
							if( d_k > 23.771 )
								ret := -0.750000 // sell
			if( ema12 > -0.034333 )
				if( d_k <= 1.17542 )
					if( smoothK_k <= 89.0019 )
						if( d <= 76.7257 )
							if( tema <= 4.43076 )
								if( rsi1 <= 24.3974 )
									ret := 0.359420
								if( rsi1 > 24.3974 )
									ret := 0.126877
							if( tema > 4.43076 )
								if( smoothK_k <= 9.73741 )
									ret := 0.157018
								if( smoothK_k > 9.73741 )
									ret := 0.032164
						if( d > 76.7257 )
							if( smoothK_k <= 82.21 )
								if( ema13 <= -0.012269 )
									ret := 0.528302
								if( ema13 > -0.012269 )
									ret := -0.225000
							if( smoothK_k > 82.21 )
								if( smoothK_k <= 84.0309 )
									ret := 0.872727 // buy
								if( smoothK_k > 84.0309 )
									ret := 0.454545
					if( smoothK_k > 89.0019 )
						if( d <= 97.1569 )
							if( rsi1 <= 43.0313 )
								if( smoothD_d <= 87.31 )
									ret := -0.111111
								if( smoothD_d > 87.31 )
									ret := -0.647059
							if( rsi1 > 43.0313 )
								if( smoothK_k <= 94.6894 )
									ret := -0.214876
								if( smoothK_k > 94.6894 )
									ret := 0.392857
						if( d > 97.1569 )
							if( rsi1 <= 47.0722 )
								if( rsi1 <= 34.3013 )
									ret := 0.666667
								if( rsi1 > 34.3013 )
									ret := -0.062500
							if( rsi1 > 47.0722 )
								if( smoothK_k <= 96.9263 )
									ret := 0.916667 // buy
								if( smoothK_k > 96.9263 )
									ret := 0.500000
				if( d_k > 1.17542 )
					if( d <= 93.3472 )
						if( tema <= 4.14556 )
							if( smoothK_k <= 8.07014 )
								if( ema12 <= -0.001888 )
									ret := 0.303030
								if( ema12 > -0.001888 )
									ret := -0.097222
							if( smoothK_k > 8.07014 )
								if( ema12 <= -0.019985 )
									ret := -0.612903
								if( ema12 > -0.019985 )
									ret := 0.041237
						if( tema > 4.14556 )
							if( ema1 <= 5.59129 )
								if( d <= 88.9257 )
									ret := 0.197885
								if( d > 88.9257 )
									ret := -0.173077
							if( ema1 > 5.59129 )
								if( rsi1 <= 37.1249 )
									ret := 0.625000
								if( rsi1 > 37.1249 )
									ret := 0.952381 // buy
					if( d > 93.3472 )
						if( ema2 <= 3.96434 )
							if( smoothK_k <= 90.0986 )
								ret := -0.250000
							if( smoothK_k > 90.0986 )
								ret := -0.714286 // sell
						if( ema2 > 3.96434 )
							if( k <= 85.7329 )
								if( k <= 83.4552 )
									ret := 0.666667
								if( k > 83.4552 )
									ret := -0.833333 // sell
							if( k > 85.7329 )
								if( smoothD_d <= 95.2213 )
									ret := 0.700000 // buy
								if( smoothD_d > 95.2213 )
									ret := -0.090909
		if( ema3 > 5.61151 )
			if( smoothD_d <= -2.16252 )
				if( rsi1 <= 21.4607 )
					if( ema13 <= -0.145834 )
						if( d <= 0.082038 )
							if( ema2 <= 9.06148 )
								if( rsi1 <= 6.34003 )
									ret := 1.000000 // buy
								if( rsi1 > 6.34003 )
									ret := 0.666667
							if( ema2 > 9.06148 )
								ret := 0.000000
						if( d > 0.082038 )
							if( ema12 <= -0.101011 )
								if( d_k <= -0.383484 )
									ret := 0.600000
								if( d_k > -0.383484 )
									ret := 1.000000 // buy
							if( ema12 > -0.101011 )
								if( ema1 <= 7.91166 )
									ret := 0.166667
								if( ema1 > 7.91166 )
									ret := 1.000000 // buy
					if( ema13 > -0.145834 )
						if( d_k <= 0.01079 )
							if( rsi1 <= 5.02203 )
								if( ema1 <= 5.99922 )
									ret := -0.166667
								if( ema1 > 5.99922 )
									ret := 0.777778 // buy
							if( rsi1 > 5.02203 )
								if( ema13 <= -0.036713 )
									ret := -0.215789
								if( ema13 > -0.036713 )
									ret := 0.290323
						if( d_k > 0.01079 )
							if( tema <= 8.51484 )
								if( rsi1 <= 19.9962 )
									ret := 0.706897 // buy
								if( rsi1 > 19.9962 )
									ret := -0.666667
							if( tema > 8.51484 )
								if( ema13 <= -0.059958 )
									ret := -0.818182 // sell
								if( ema13 > -0.059958 )
									ret := 0.500000
				if( rsi1 > 21.4607 )
					if( ema3 <= 12.8906 )
						if( ema12 <= -0.027516 )
							if( smoothD_d <= -2.97809 )
								if( ema12 <= -0.065888 )
									ret := -1.000000 // sell
								if( ema12 > -0.065888 )
									ret := 0.636364
							if( smoothD_d > -2.97809 )
								if( d_k <= -1.08168 )
									ret := -0.250000
								if( d_k > -1.08168 )
									ret := 0.863014 // buy
						if( ema12 > -0.027516 )
							if( ema2 <= 6.14079 )
								if( ema12 <= -0.00113 )
									ret := 0.655738
								if( ema12 > -0.00113 )
									ret := 0.000000
							if( ema2 > 6.14079 )
								if( d_k <= 0.468074 )
									ret := 0.306630
								if( d_k > 0.468074 )
									ret := -0.227273
					if( ema3 > 12.8906 )
						if( ema13 <= -0.026113 )
							if( rsi1 <= 24.7444 )
								ret := 0.000000
							if( rsi1 > 24.7444 )
								if( rsi1 <= 28.1394 )
									ret := -0.909091 // sell
								if( rsi1 > 28.1394 )
									ret := -0.375000
						if( ema13 > -0.026113 )
							if( tema <= 14.9574 )
								ret := 0.000000
							if( tema > 14.9574 )
								ret := 1.000000 // buy
			if( smoothD_d > -2.16252 )
				if( ema1 <= 15.0915 )
					if( smoothK_k <= 85.9237 )
						if( d_k <= -10.506 )
							if( ema2 <= 7.48768 )
								if( rsi1 <= 23.789 )
									ret := -0.446809
								if( rsi1 > 23.789 )
									ret := 0.058960
							if( ema2 > 7.48768 )
								if( ema12 <= 0.008492 )
									ret := -0.116197
								if( ema12 > 0.008492 )
									ret := 0.736842 // buy
						if( d_k > -10.506 )
							if( k <= 20.5924 )
								if( ema1 <= 5.63624 )
									ret := -0.290323
								if( ema1 > 5.63624 )
									ret := 0.034161
							if( k > 20.5924 )
								if( d <= 72.0395 )
									ret := 0.120796
								if( d > 72.0395 )
									ret := -0.016622
					if( smoothK_k > 85.9237 )
						if( k <= 98.575 )
							if( ema13 <= -0.043895 )
								if( ema2 <= 8.51705 )
									ret := 0.531250
								if( ema2 > 8.51705 )
									ret := 0.131250
							if( ema13 > -0.043895 )
								if( d_k <= -16.0484 )
									ret := 0.564103
								if( d_k > -16.0484 )
									ret := 0.086242
						if( k > 98.575 )
							if( ema1 <= 10.7296 )
								if( d_k <= -8.40897 )
									ret := 0.083333
								if( d_k > -8.40897 )
									ret := -0.277027
							if( ema1 > 10.7296 )
								if( d_k <= -12.7728 )
									ret := -0.333333
								if( d_k > -12.7728 )
									ret := 0.514286
				if( ema1 > 15.0915 )
					if( smoothK_k <= 73.9387 )
						if( k <= 65.2865 )
							if( ema12 <= -0.051294 )
								if( tema <= 15.0145 )
									ret := -0.200000
								if( tema > 15.0145 )
									ret := -1.000000 // sell
							if( ema12 > -0.051294 )
								if( d <= 4.59138 )
									ret := 0.666667
								if( d > 4.59138 )
									ret := -0.250000
						if( k > 65.2865 )
							if( d <= 70.9305 )
								ret := -1.000000 // sell
							if( d > 70.9305 )
								ret := -0.750000 // sell
					if( smoothK_k > 73.9387 )
						if( rsi1 <= 39.2902 )
							ret := -0.500000
						if( rsi1 > 39.2902 )
							if( tema <= 15.3801 )
								ret := 1.000000 // buy
							if( tema > 15.3801 )
								ret := 0.500000
	if( rsi1 > 49.8588 )
		if( ema13 <= 0.120162 )
			if( rsi1 <= 75.2835 )
				if( tema <= 11.6252 )
					if( tema <= 10.8168 )
						if( d_k <= 7.58124 )
							if( ema2 <= 6.33859 )
								if( d_k <= 2.34662 )
									ret := -0.040223
								if( d_k > 2.34662 )
									ret := 0.015427
							if( ema2 > 6.33859 )
								if( tema <= 7.72666 )
									ret := 0.082698
								if( tema > 7.72666 )
									ret := -0.001483
						if( d_k > 7.58124 )
							if( ema12 <= 0.043792 )
								if( smoothD_d <= 73.4968 )
									ret := 0.026509
								if( smoothD_d > 73.4968 )
									ret := 0.132627
							if( ema12 > 0.043792 )
								if( tema <= 5.2924 )
									ret := 0.500000
								if( tema > 5.2924 )
									ret := -0.420561
					if( tema > 10.8168 )
						if( ema12 <= 0.022179 )
							if( rsi1 <= 55.737 )
								if( d <= 89.0633 )
									ret := -0.166667
								if( d > 89.0633 )
									ret := -0.677419
							if( rsi1 > 55.737 )
								if( smoothK_k <= 20.4605 )
									ret := -0.384615
								if( smoothK_k > 20.4605 )
									ret := 0.013453
						if( ema12 > 0.022179 )
							if( d_k <= -0.191708 )
								if( rsi1 <= 67.9144 )
									ret := -0.488372
								if( rsi1 > 67.9144 )
									ret := -0.880000 // sell
							if( d_k > -0.191708 )
								if( k <= 79.9266 )
									ret := -0.050847
								if( k > 79.9266 )
									ret := -0.530303
				if( tema > 11.6252 )
					if( ema12 <= 0.036176 )
						if( rsi1 <= 56.7084 )
							if( d_k <= 0.712595 )
								if( smoothD_d <= 94.9733 )
									ret := -0.189781
								if( smoothD_d > 94.9733 )
									ret := 0.900000 // buy
							if( d_k > 0.712595 )
								if( d_k <= 22.7326 )
									ret := 0.305310
								if( d_k > 22.7326 )
									ret := -0.384615
						if( rsi1 > 56.7084 )
							if( smoothD_d <= 82.5612 )
								if( smoothK_k <= 53.4207 )
									ret := 0.139241
								if( smoothK_k > 53.4207 )
									ret := 0.490358
							if( smoothD_d > 82.5612 )
								if( ema13 <= -0.004235 )
									ret := 0.584615
								if( ema13 > -0.004235 )
									ret := -0.066946
					if( ema12 > 0.036176 )
						if( ema13 <= 0.060801 )
							if( rsi1 <= 64.6565 )
								ret := -1.000000 // sell
							if( rsi1 > 64.6565 )
								if( ema13 <= 0.05722 )
									ret := -0.230769
								if( ema13 > 0.05722 )
									ret := -0.857143 // sell
						if( ema13 > 0.060801 )
							if( d_k <= 6.52452 )
								if( smoothK_k <= 95.5473 )
									ret := 0.150685
								if( smoothK_k > 95.5473 )
									ret := -0.642857
							if( d_k > 6.52452 )
								if( k <= 80.8572 )
									ret := -0.480000
								if( k > 80.8572 )
									ret := -1.000000 // sell
			if( rsi1 > 75.2835 )
				if( rsi1 <= 77.3966 )
					if( smoothD_d <= 95.7495 )
						if( tema <= 4.29897 )
							if( smoothD_d <= 84.6692 )
								if( d_k <= -6.28352 )
									ret := -0.923077 // sell
								if( d_k > -6.28352 )
									ret := -0.130435
							if( smoothD_d > 84.6692 )
								if( ema12 <= 0.012555 )
									ret := -0.230769
								if( ema12 > 0.012555 )
									ret := 0.500000
						if( tema > 4.29897 )
							if( d_k <= 4.72216 )
								if( d_k <= 2.10026 )
									ret := 0.276051
								if( d_k > 2.10026 )
									ret := 0.563910
							if( d_k > 4.72216 )
								if( ema1 <= 5.73235 )
									ret := 0.384615
								if( ema1 > 5.73235 )
									ret := -0.038462
					if( smoothD_d > 95.7495 )
						if( ema3 <= 5.15984 )
							if( ema3 <= 4.84454 )
								ret := 0.500000
							if( ema3 > 4.84454 )
								ret := 1.000000 // buy
						if( ema3 > 5.15984 )
							if( d_k <= 0.007271 )
								if( ema13 <= 0.015724 )
									ret := 0.250000
								if( ema13 > 0.015724 )
									ret := -0.638298
							if( d_k > 0.007271 )
								if( smoothK_k <= 95.7691 )
									ret := -0.307692
								if( smoothK_k > 95.7691 )
									ret := 0.687500
				if( rsi1 > 77.3966 )
					if( d <= 99.9349 )
						if( ema13 <= 0.098326 )
							if( ema2 <= 8.18841 )
								if( rsi1 <= 83.2277 )
									ret := 0.115758
								if( rsi1 > 83.2277 )
									ret := -0.059253
							if( ema2 > 8.18841 )
								if( smoothK_k <= 95.4483 )
									ret := -0.163569
								if( smoothK_k > 95.4483 )
									ret := 0.069565
						if( ema13 > 0.098326 )
							if( d <= 90.4794 )
								if( ema12 <= 0.049499 )
									ret := 0.545455
								if( ema12 > 0.049499 )
									ret := -0.226087
							if( d > 90.4794 )
								if( ema3 <= 10.1705 )
									ret := 0.291667
								if( ema3 > 10.1705 )
									ret := 0.759036 // buy
					if( d > 99.9349 )
						if( ema3 <= 4.49416 )
							if( ema12 <= 0.013913 )
								if( tema <= 4.24882 )
									ret := -0.333333
								if( tema > 4.24882 )
									ret := 0.750000 // buy
							if( ema12 > 0.013913 )
								if( ema13 <= 0.021443 )
									ret := 0.400000
								if( ema13 > 0.021443 )
									ret := 0.896552 // buy
						if( ema3 > 4.49416 )
							if( rsi1 <= 89.0238 )
								if( d <= 99.9988 )
									ret := 0.589744
								if( d > 99.9988 )
									ret := -0.104575
							if( rsi1 > 89.0238 )
								if( tema <= 6.22422 )
									ret := -0.344828
								if( tema > 6.22422 )
									ret := 0.694444
		if( ema13 > 0.120162 )
			if( smoothD_d <= 31.4194 )
				if( ema12 <= 0.062395 )
					if( d_k <= -10.1957 )
						ret := 1.000000 // buy
					if( d_k > -10.1957 )
						if( d_k <= 11.4561 )
							if( ema12 <= 0.059548 )
								if( ema2 <= 13.6886 )
									ret := -1.000000 // sell
								if( ema2 > 13.6886 )
									ret := -0.500000
							if( ema12 > 0.059548 )
								ret := -0.333333
						if( d_k > 11.4561 )
							if( ema1 <= 10.0928 )
								ret := 0.000000
							if( ema1 > 10.0928 )
								ret := 0.800000 // buy
				if( ema12 > 0.062395 )
					if( smoothD_d <= 9.82373 )
						ret := -0.750000 // sell
					if( smoothD_d > 9.82373 )
						if( k <= 9.75025 )
							ret := 0.000000
						if( k > 9.75025 )
							if( ema13 <= 0.212587 )
								if( smoothD_d <= 14.5514 )
									ret := 0.200000
								if( smoothD_d > 14.5514 )
									ret := 0.926829 // buy
							if( ema13 > 0.212587 )
								ret := -0.200000
			if( smoothD_d > 31.4194 )
				if( smoothD_d <= 43.4848 )
					if( ema2 <= 9.9116 )
						if( ema3 <= 8.36952 )
							ret := -1.000000 // sell
						if( ema3 > 8.36952 )
							if( smoothK_k <= 36.2249 )
								ret := -0.400000
							if( smoothK_k > 36.2249 )
								ret := -1.000000 // sell
					if( ema2 > 9.9116 )
						if( tema <= 13.0876 )
							if( ema13 <= 0.184556 )
								if( ema1 <= 12.2555 )
									ret := 0.500000
								if( ema1 > 12.2555 )
									ret := 1.000000 // buy
							if( ema13 > 0.184556 )
								if( ema12 <= 0.138279 )
									ret := -1.000000 // sell
								if( ema12 > 0.138279 )
									ret := 0.400000
						if( tema > 13.0876 )
							if( ema1 <= 14.812 )
								if( rsi1 <= 76.7963 )
									ret := -1.000000 // sell
								if( rsi1 > 76.7963 )
									ret := -0.750000 // sell
							if( ema1 > 14.812 )
								ret := -0.250000
				if( smoothD_d > 43.4848 )
					if( d <= 49.8963 )
						if( ema3 <= 11.5232 )
							if( smoothK_k <= 30.0039 )
								ret := 0.750000 // buy
							if( smoothK_k > 30.0039 )
								ret := 1.000000 // buy
						if( ema3 > 11.5232 )
							if( smoothD_d <= 45.9707 )
								ret := 0.000000
							if( smoothD_d > 45.9707 )
								ret := 0.857143 // buy
					if( d > 49.8963 )
						if( rsi1 <= 81.1601 )
							if( d <= 86.1139 )
								if( k <= 77.7984 )
									ret := -0.215962
								if( k > 77.7984 )
									ret := 0.545455
							if( d > 86.1139 )
								if( smoothD_d <= 88.7024 )
									ret := -0.715686 // sell
								if( smoothD_d > 88.7024 )
									ret := -0.233918
						if( rsi1 > 81.1601 )
							if( rsi1 <= 88.4649 )
								if( smoothD_d <= 89.2855 )
									ret := -0.137755
								if( smoothD_d > 89.2855 )
									ret := 0.275281
							if( rsi1 > 88.4649 )
								if( smoothK_k <= 86.0656 )
									ret := -0.894737 // sell
								if( smoothK_k > 86.0656 )
									ret := -0.224806
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

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
float op_operation = decision_tree_0_NIO_5Min_e2d0dd01(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


