//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: APPS_15Min_2BS0_9015a0a2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2BS0_9015a0a2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_9015a0a2(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bearPower <= -0.000177 )
		if( k <= 20.4387 )
			if( rsi1 <= 18.9733 )
				if( bbp <= -0.911724 )
					if( smoothD_d <= -2.0526 )
						if( d <= 0.273373 )
							if( bbm <= 0.614084 )
								if( bearPower <= -1.65512 )
									ret := -0.200000
								if( bearPower > -1.65512 )
									ret := -0.717391 // sell
							if( bbm > 0.614084 )
								if( rsi1 <= 4.87589 )
									ret := 0.812500 // buy
								if( rsi1 > 4.87589 )
									ret := -0.464286
						if( d > 0.273373 )
							if( smoothK_k <= -2.02756 )
								if( smoothK_k <= -2.89425 )
									ret := -0.611111
								if( smoothK_k > -2.89425 )
									ret := -0.945455 // sell
							if( smoothK_k > -2.02756 )
								ret := -0.357143
					if( smoothD_d > -2.0526 )
						if( smoothD_d <= 5.51942 )
							if( d <= 2.55459 )
								if( bullPower <= -0.719613 )
									ret := -0.241379
								if( bullPower > -0.719613 )
									ret := 0.611111
							if( d > 2.55459 )
								if( bullPower <= -1.23266 )
									ret := -0.072727
								if( bullPower > -1.23266 )
									ret := 0.600000
						if( smoothD_d > 5.51942 )
							if( bullPower <= -0.260885 )
								if( k <= 16.1345 )
									ret := -0.373418
								if( k > 16.1345 )
									ret := 0.405405
							if( bullPower > -0.260885 )
								if( d_k <= 10.7943 )
									ret := 0.666667
								if( d_k > 10.7943 )
									ret := 0.750000 // buy
				if( bbp > -0.911724 )
					if( bullPower <= -0.011331 )
						if( smoothK_k <= -2.82813 )
							if( rsi1 <= 18.4772 )
								if( bullPower <= -0.220559 )
									ret := 0.232558
								if( bullPower > -0.220559 )
									ret := 0.648936
							if( rsi1 > 18.4772 )
								ret := -0.600000
						if( smoothK_k > -2.82813 )
							if( d_k <= -4.22585 )
								if( smoothD_d <= 6.2145 )
									ret := 0.800000 // buy
								if( smoothD_d > 6.2145 )
									ret := -0.086957
							if( d_k > -4.22585 )
								if( bearPower <= -0.047566 )
									ret := 0.190123
								if( bearPower > -0.047566 )
									ret := 0.413223
					if( bullPower > -0.011331 )
						if( smoothD_d <= 1.0917 )
							if( d_k <= -1.30715 )
								ret := 0.833333 // buy
							if( d_k > -1.30715 )
								if( bbm <= 0.0104 )
									ret := -0.240000
								if( bbm > 0.0104 )
									ret := 0.428571
						if( smoothD_d > 1.0917 )
							if( k <= 2.00932 )
								if( bbm <= 0.04135 )
									ret := 0.000000
								if( bbm > 0.04135 )
									ret := 0.736842 // buy
							if( k > 2.00932 )
								if( bullPower <= 0.008346 )
									ret := -0.371681
								if( bullPower > 0.008346 )
									ret := 0.428571
			if( rsi1 > 18.9733 )
				if( bearPower <= -0.008973 )
					if( smoothK_k <= 16.4518 )
						if( k <= 17.5906 )
							if( bullPower <= -1.6505 )
								if( d_k <= -1.84904 )
									ret := -0.392857
								if( d_k > -1.84904 )
									ret := 0.660714
							if( bullPower > -1.6505 )
								if( k <= 14.8634 )
									ret := 0.066089
								if( k > 14.8634 )
									ret := 0.220731
						if( k > 17.5906 )
							if( d_k <= 8.41433 )
								if( bearPower <= -0.383031 )
									ret := -0.296089
								if( bearPower > -0.383031 )
									ret := 0.088536
							if( d_k > 8.41433 )
								if( bullPower <= -0.184407 )
									ret := 0.282609
								if( bullPower > -0.184407 )
									ret := -0.231250
					if( smoothK_k > 16.4518 )
						if( bbp <= -0.254495 )
							if( bbm <= 0.002223 )
								ret := 0.687500
							if( bbm > 0.002223 )
								if( smoothK_k <= 17.2982 )
									ret := -0.183333
								if( smoothK_k > 17.2982 )
									ret := 0.500000
						if( bbp > -0.254495 )
							if( rsi1 <= 50.2928 )
								if( smoothK_k <= 17.183 )
									ret := 0.487252
								if( smoothK_k > 17.183 )
									ret := 0.181818
							if( rsi1 > 50.2928 )
								if( k <= 19.5833 )
									ret := 0.823529 // buy
								if( k > 19.5833 )
									ret := -0.236842
				if( bearPower > -0.008973 )
					if( d <= 29.7149 )
						if( d_k <= 11.7157 )
							if( d_k <= 7.83242 )
								if( d_k <= 6.34315 )
									ret := -0.049638
								if( d_k > 6.34315 )
									ret := -0.385965
							if( d_k > 7.83242 )
								if( smoothD_d <= 25.8868 )
									ret := 0.223881
								if( smoothD_d > 25.8868 )
									ret := -0.700000 // sell
						if( d_k > 11.7157 )
							if( bullPower <= 0.044232 )
								if( bbm <= 0.011582 )
									ret := -0.474576
								if( bbm > 0.011582 )
									ret := -0.057692
							if( bullPower > 0.044232 )
								ret := -0.818182 // sell
					if( d > 29.7149 )
						if( bbp <= -0.008629 )
							ret := 0.833333 // buy
						if( bbp > -0.008629 )
							if( bbp <= 0.006546 )
								if( d <= 36.0221 )
									ret := 0.130435
								if( d > 36.0221 )
									ret := -0.264706
							if( bbp > 0.006546 )
								if( k <= 17.6227 )
									ret := 0.666667
								if( k > 17.6227 )
									ret := 0.000000
		if( k > 20.4387 )
			if( bbm <= 0.008986 )
				if( bbp <= -0.015371 )
					if( bearPower <= -0.16742 )
						if( k <= 26.5665 )
							if( smoothD_d <= 37.0845 )
								if( k <= 21.1762 )
									ret := -0.714286 // sell
								if( k > 21.1762 )
									ret := 0.062500
							if( smoothD_d > 37.0845 )
								ret := -0.782609 // sell
						if( k > 26.5665 )
							if( rsi1 <= 48.2048 )
								if( rsi1 <= 22.5658 )
									ret := 0.923077 // buy
								if( rsi1 > 22.5658 )
									ret := 0.296296
							if( rsi1 > 48.2048 )
								if( rsi1 <= 50.5898 )
									ret := -0.629630
								if( rsi1 > 50.5898 )
									ret := -0.106383
					if( bearPower > -0.16742 )
						if( smoothK_k <= 95.1282 )
							if( bbp <= -0.295563 )
								if( bbp <= -0.303186 )
									ret := 0.523077
								if( bbp > -0.303186 )
									ret := 0.909091 // buy
							if( bbp > -0.295563 )
								if( d <= 82.6721 )
									ret := 0.274927
								if( d > 82.6721 )
									ret := 0.432671
						if( smoothK_k > 95.1282 )
							if( d_k <= -1.05158 )
								if( d <= 93.912 )
									ret := -0.200000
								if( d > 93.912 )
									ret := 0.300000
							if( d_k > -1.05158 )
								ret := -0.818182 // sell
				if( bbp > -0.015371 )
					if( d_k <= 8.79178 )
						if( d_k <= 4.52766 )
							if( k <= 72.667 )
								if( smoothD_d <= 56.6391 )
									ret := 0.051163
								if( smoothD_d > 56.6391 )
									ret := 0.490741
							if( k > 72.667 )
								if( rsi1 <= 61.6246 )
									ret := -0.168865
								if( rsi1 > 61.6246 )
									ret := 0.310345
						if( d_k > 4.52766 )
							if( smoothK_k <= 63.2485 )
								if( smoothD_d <= 60.3455 )
									ret := -0.222222
								if( smoothD_d > 60.3455 )
									ret := 0.565217
							if( smoothK_k > 63.2485 )
								if( rsi1 <= 56.3222 )
									ret := -0.757576 // sell
								if( rsi1 > 56.3222 )
									ret := 0.133333
					if( d_k > 8.79178 )
						if( smoothD_d <= 65.557 )
							if( smoothD_d <= 40.7296 )
								if( d_k <= 12.3051 )
									ret := 0.777778 // buy
								if( d_k > 12.3051 )
									ret := 0.200000
							if( smoothD_d > 40.7296 )
								if( bearPower <= -0.007724 )
									ret := -0.631579
								if( bearPower > -0.007724 )
									ret := 0.000000
						if( smoothD_d > 65.557 )
							if( k <= 51.8177 )
								ret := 1.000000 // buy
							if( k > 51.8177 )
								if( rsi1 <= 43.1347 )
									ret := -0.294118
								if( rsi1 > 43.1347 )
									ret := 0.377358
			if( bbm > 0.008986 )
				if( bearPower <= -0.240623 )
					if( bbp <= -2.7459 )
						if( smoothK_k <= 18.8152 )
							ret := -0.384615
						if( smoothK_k > 18.8152 )
							if( smoothD_d <= 32.7646 )
								if( smoothD_d <= 30.1686 )
									ret := 0.612245
								if( smoothD_d > 30.1686 )
									ret := 1.000000 // buy
							if( smoothD_d > 32.7646 )
								if( smoothD_d <= 48.1471 )
									ret := -0.148148
								if( smoothD_d > 48.1471 )
									ret := 0.471264
					if( bbp > -2.7459 )
						if( d_k <= -11.4473 )
							if( smoothD_d <= 77.8098 )
								if( bullPower <= 0.064258 )
									ret := -0.143939
								if( bullPower > 0.064258 )
									ret := -0.364312
							if( smoothD_d > 77.8098 )
								if( d_k <= -14.332 )
									ret := 0.250000
								if( d_k > -14.332 )
									ret := 0.550000
						if( d_k > -11.4473 )
							if( bullPower <= -0.082475 )
								if( smoothK_k <= 18.8384 )
									ret := -0.331522
								if( smoothK_k > 18.8384 )
									ret := 0.054389
							if( bullPower > -0.082475 )
								if( d <= 79.9426 )
									ret := -0.159647
								if( d > 79.9426 )
									ret := 0.029630
				if( bearPower > -0.240623 )
					if( rsi1 <= 42.8741 )
						if( bbm <= 0.204638 )
							if( smoothK_k <= 41.0246 )
								if( smoothK_k <= 17.6811 )
									ret := 0.500000
								if( smoothK_k > 17.6811 )
									ret := 0.050505
							if( smoothK_k > 41.0246 )
								if( d_k <= -10.1794 )
									ret := 0.015441
								if( d_k > -10.1794 )
									ret := 0.235356
						if( bbm > 0.204638 )
							if( rsi1 <= 28.1718 )
								if( d_k <= -0.584611 )
									ret := -0.833333 // sell
								if( d_k > -0.584611 )
									ret := -0.571429
							if( rsi1 > 28.1718 )
								if( smoothK_k <= 56.6397 )
									ret := 0.121662
								if( smoothK_k > 56.6397 )
									ret := -0.224299
					if( rsi1 > 42.8741 )
						if( d_k <= -7.37051 )
							if( smoothD_d <= 85.3828 )
								if( bullPower <= 0.776766 )
									ret := -0.116279
								if( bullPower > 0.776766 )
									ret := 0.223214
							if( smoothD_d > 85.3828 )
								if( BBPower_Color <= 0.5 )
									ret := -0.759259 // sell
								if( BBPower_Color > 0.5 )
									ret := -0.166667
						if( d_k > -7.37051 )
							if( smoothD_d <= 46.8008 )
								if( d_k <= 19.9737 )
									ret := -0.026516
								if( d_k > 19.9737 )
									ret := -0.436090
							if( smoothD_d > 46.8008 )
								if( k <= 89.7804 )
									ret := 0.069913
								if( k > 89.7804 )
									ret := -0.044700
	if( bearPower > -0.000177 )
		if( bearPower <= 0.045794 )
			if( rsi1 <= 97.0144 )
				if( rsi1 <= 65.9519 )
					if( smoothD_d <= 96.4309 )
						if( d <= 21.9004 )
							if( smoothK_k <= 12.2727 )
								if( bearPower <= -1.1e-05 )
									ret := -0.846154 // sell
								if( bearPower > -1.1e-05 )
									ret := -0.017707
							if( smoothK_k > 12.2727 )
								if( k <= 19.075 )
									ret := -0.328125
								if( k > 19.075 )
									ret := -0.132394
						if( d > 21.9004 )
							if( bbm <= 0.08425 )
								if( rsi1 <= 61.5514 )
									ret := -0.041971
								if( rsi1 > 61.5514 )
									ret := 0.061531
							if( bbm > 0.08425 )
								if( rsi1 <= 62.4511 )
									ret := -0.177665
								if( rsi1 > 62.4511 )
									ret := 0.060423
					if( smoothD_d > 96.4309 )
						if( bbp <= 0.02396 )
							if( rsi1 <= 60.1735 )
								if( bullPower <= 0.008979 )
									ret := 0.750000 // buy
								if( bullPower > 0.008979 )
									ret := 1.000000 // buy
							if( rsi1 > 60.1735 )
								ret := 0.333333
						if( bbp > 0.02396 )
							if( d <= 99.8565 )
								if( smoothD_d <= 96.5204 )
									ret := 0.200000
								if( smoothD_d > 96.5204 )
									ret := 0.600000
							if( d > 99.8565 )
								ret := -0.277778
				if( rsi1 > 65.9519 )
					if( d_k <= -7.59407 )
						if( bearPower <= 0.011989 )
							if( d <= 71.4248 )
								if( bullPower <= 0.034387 )
									ret := -0.077670
								if( bullPower > 0.034387 )
									ret := -0.504065
							if( d > 71.4248 )
								if( smoothK_k <= 90.047 )
									ret := -0.629630
								if( smoothK_k > 90.047 )
									ret := -0.345679
						if( bearPower > 0.011989 )
							if( d_k <= -30.5951 )
								if( d <= 53.9068 )
									ret := -0.200000
								if( d > 53.9068 )
									ret := 0.625000
							if( d_k > -30.5951 )
								if( smoothD_d <= 32.4322 )
									ret := -0.474576
								if( smoothD_d > 32.4322 )
									ret := -0.178344
					if( d_k > -7.59407 )
						if( bullPower <= 0.071884 )
							if( smoothK_k <= 96.9069 )
								if( bearPower <= 0.001999 )
									ret := -0.370130
								if( bearPower > 0.001999 )
									ret := -0.103755
							if( smoothK_k > 96.9069 )
								if( bullPower <= 0.010002 )
									ret := -0.800000 // sell
								if( bullPower > 0.010002 )
									ret := -0.356589
						if( bullPower > 0.071884 )
							if( bbp <= 0.535274 )
								if( smoothD_d <= 92.8835 )
									ret := 0.027254
								if( smoothD_d > 92.8835 )
									ret := 0.224199
							if( bbp > 0.535274 )
								if( d_k <= 1.76423 )
									ret := -0.592593
								if( d_k > 1.76423 )
									ret := 0.000000
			if( rsi1 > 97.0144 )
				if( rsi1 <= 97.526 )
					ret := 1.000000 // buy
				if( rsi1 > 97.526 )
					if( bbp <= 0.033514 )
						if( smoothD_d <= 96.5155 )
							ret := 0.416667
						if( smoothD_d > 96.5155 )
							ret := 0.941176 // buy
					if( bbp > 0.033514 )
						ret := -0.153846
		if( bearPower > 0.045794 )
			if( d <= 91.9445 )
				if( bbp <= 0.26055 )
					if( rsi1 <= 50.6565 )
						if( d <= 18.6067 )
							if( d <= 3.31456 )
								ret := 0.272727
							if( d > 3.31456 )
								if( d_k <= -11.9151 )
									ret := -0.875000 // sell
								if( d_k > -11.9151 )
									ret := -0.296296
						if( d > 18.6067 )
							if( d <= 19.7489 )
								ret := 0.666667
							if( d > 19.7489 )
								if( k <= 63.9321 )
									ret := 0.194872
								if( k > 63.9321 )
									ret := -0.271186
					if( rsi1 > 50.6565 )
						if( d_k <= 4.38043 )
							if( bbm <= 0.028346 )
								if( rsi1 <= 58.8008 )
									ret := -0.539855
								if( rsi1 > 58.8008 )
									ret := -0.355932
							if( bbm > 0.028346 )
								if( rsi1 <= 51.3348 )
									ret := -0.807692 // sell
								if( rsi1 > 51.3348 )
									ret := -0.172920
						if( d_k > 4.38043 )
							if( k <= 82.4278 )
								if( d <= 83.5787 )
									ret := -0.067358
								if( d > 83.5787 )
									ret := -0.365385
							if( k > 82.4278 )
								if( bbm <= 0.068714 )
									ret := 0.516129
								if( bbm > 0.068714 )
									ret := -0.333333
				if( bbp > 0.26055 )
					if( k <= 8.77733 )
						if( d <= 34.2904 )
							if( k <= 3.62402 )
								if( bearPower <= 0.067417 )
									ret := 0.263158
								if( bearPower > 0.067417 )
									ret := -0.232143
							if( k > 3.62402 )
								if( bbp <= 0.331601 )
									ret := 0.090909
								if( bbp > 0.331601 )
									ret := 0.524823
						if( d > 34.2904 )
							ret := -1.000000 // sell
					if( k > 8.77733 )
						if( smoothK_k <= 96.8848 )
							if( bbm <= 0.036706 )
								if( bbm <= 0.000638 )
									ret := -0.146608
								if( bbm > 0.000638 )
									ret := -0.364256
							if( bbm > 0.036706 )
								if( bullPower <= 0.171139 )
									ret := 0.387097
								if( bullPower > 0.171139 )
									ret := -0.093133
						if( smoothK_k > 96.8848 )
							if( d_k <= -12.5488 )
								if( bearPower <= 0.172751 )
									ret := -0.432432
								if( bearPower > 0.172751 )
									ret := 0.042254
							if( d_k > -12.5488 )
								if( bbp <= 2.44686 )
									ret := 0.666667
								if( bbp > 2.44686 )
									ret := 0.000000
			if( d > 91.9445 )
				if( smoothK_k <= 89.2787 )
					if( smoothD_d <= 90.165 )
						if( rsi1 <= 76.6359 )
							if( smoothK_k <= 84.6152 )
								if( bbp <= 0.774413 )
									ret := 0.210526
								if( bbp > 0.774413 )
									ret := 0.954545 // buy
							if( smoothK_k > 84.6152 )
								if( smoothK_k <= 87.2847 )
									ret := -0.344828
								if( smoothK_k > 87.2847 )
									ret := 0.230769
						if( rsi1 > 76.6359 )
							if( rsi1 <= 79.4471 )
								if( rsi1 <= 78.6059 )
									ret := -1.000000 // sell
								if( rsi1 > 78.6059 )
									ret := -0.545455
							if( rsi1 > 79.4471 )
								if( k <= 87.3514 )
									ret := 0.550000
								if( k > 87.3514 )
									ret := -0.333333
					if( smoothD_d > 90.165 )
						if( smoothD_d <= 90.6087 )
							if( bbm <= 0.690329 )
								if( k <= 86.2601 )
									ret := 0.000000
								if( k > 86.2601 )
									ret := 0.741935 // buy
							if( bbm > 0.690329 )
								ret := -0.117647
						if( smoothD_d > 90.6087 )
							if( d <= 94.2603 )
								if( bbm <= 0.195 )
									ret := -0.339623
								if( bbm > 0.195 )
									ret := 0.120690
							if( d > 94.2603 )
								if( smoothK_k <= 86.3129 )
									ret := -0.100000
								if( smoothK_k > 86.3129 )
									ret := 0.346405
				if( smoothK_k > 89.2787 )
					if( bbm <= 0.100588 )
						if( bbm <= 0.059907 )
							if( rsi1 <= 59.9781 )
								if( smoothD_d <= 90.3046 )
									ret := -0.888889 // sell
								if( smoothD_d > 90.3046 )
									ret := 0.304878
							if( rsi1 > 59.9781 )
								if( rsi1 <= 72.1224 )
									ret := -0.375286
								if( rsi1 > 72.1224 )
									ret := -0.141919
						if( bbm > 0.059907 )
							if( k <= 96.0574 )
								if( k <= 93.473 )
									ret := 0.027027
								if( k > 93.473 )
									ret := -0.463158
							if( k > 96.0574 )
								if( bbm <= 0.0802 )
									ret := 0.181818
								if( bbm > 0.0802 )
									ret := -0.178899
					if( bbm > 0.100588 )
						if( rsi1 <= 86.9027 )
							if( smoothD_d <= 96.9315 )
								if( bearPower <= 0.052346 )
									ret := 0.657143
								if( bearPower > 0.052346 )
									ret := 0.087760
							if( smoothD_d > 96.9315 )
								if( bearPower <= 0.296365 )
									ret := 0.227273
								if( bearPower > 0.296365 )
									ret := 0.719512 // buy
						if( rsi1 > 86.9027 )
							if( rsi1 <= 96.9997 )
								if( bullPower <= 0.254507 )
									ret := 0.846154 // buy
								if( bullPower > 0.254507 )
									ret := -0.227451
							if( rsi1 > 96.9997 )
								if( bbm <= 0.243426 )
									ret := -0.785714 // sell
								if( bbm > 0.243426 )
									ret := -1.000000 // sell
	
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
float op_operation = decision_tree_0_APPS_15Min_9015a0a2(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


