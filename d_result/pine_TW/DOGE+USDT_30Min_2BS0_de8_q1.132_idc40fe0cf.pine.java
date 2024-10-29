//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: DOGEUSDT_30Min_2BS0_c40fe0cf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_2BS0_c40fe0cf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_c40fe0cf(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 41.6819 )
		if( d_k <= -3.46091 )
			if( bullPower <= -0.000555 )
				if( d <= 13.8393 )
					if( rsi1 <= 31.5253 )
						if( smoothK_k <= 23.5147 )
							if( k <= 16.4219 )
								if( d_k <= -5.97684 )
									ret := -0.637255
								if( d_k > -5.97684 )
									ret := -0.288889
							if( k > 16.4219 )
								if( smoothD_d <= 6.34552 )
									ret := -0.521739
								if( smoothD_d > 6.34552 )
									ret := 0.103226
						if( smoothK_k > 23.5147 )
							ret := -1.000000 // sell
					if( rsi1 > 31.5253 )
						if( k <= 7.40169 )
							if( smoothK_k <= 3.23467 )
								if( bbm <= 0.001903 )
									ret := -0.750000 // sell
								if( bbm > 0.001903 )
									ret := -1.000000 // sell
							if( smoothK_k > 3.23467 )
								if( bbp <= -0.003471 )
									ret := -0.500000
								if( bbp > -0.003471 )
									ret := -0.200000
						if( k > 7.40169 )
							if( smoothK_k <= 14.0264 )
								if( d <= 6.18872 )
									ret := 0.084337
								if( d > 6.18872 )
									ret := 0.629371
							if( smoothK_k > 14.0264 )
								if( d_k <= -13.8512 )
									ret := 0.782609 // buy
								if( d_k > -13.8512 )
									ret := -0.081967
				if( d > 13.8393 )
					if( rsi1 <= 31.8872 )
						if( bbp <= -0.006575 )
							if( smoothK_k <= 41.535 )
								if( rsi1 <= 21.3608 )
									ret := -0.230769
								if( rsi1 > 21.3608 )
									ret := 0.658120
							if( smoothK_k > 41.535 )
								if( k <= 47.449 )
									ret := -0.666667
								if( k > 47.449 )
									ret := 0.282258
						if( bbp > -0.006575 )
							if( rsi1 <= 26.0725 )
								if( smoothK_k <= 31.7568 )
									ret := -0.469136
								if( smoothK_k > 31.7568 )
									ret := -0.148148
							if( rsi1 > 26.0725 )
								if( rsi1 <= 26.3063 )
									ret := 0.666667
								if( rsi1 > 26.3063 )
									ret := 0.041534
					if( rsi1 > 31.8872 )
						if( bearPower <= -0.002088 )
							if( bullPower <= -0.001387 )
								if( bearPower <= -0.016256 )
									ret := 0.432749
								if( bearPower > -0.016256 )
									ret := 0.643185
							if( bullPower > -0.001387 )
								if( smoothD_d <= 74.0735 )
									ret := 0.421429
								if( smoothD_d > 74.0735 )
									ret := -0.042553
						if( bearPower > -0.002088 )
							if( d_k <= -24.9977 )
								if( d_k <= -27.8927 )
									ret := 0.250000
								if( d_k > -27.8927 )
									ret := 1.000000 // buy
							if( d_k > -24.9977 )
								if( smoothD_d <= 11.9633 )
									ret := -0.571429
								if( smoothD_d > 11.9633 )
									ret := 0.264615
			if( bullPower > -0.000555 )
				if( bullPower <= 1.8e-05 )
					if( d <= 10.7418 )
						if( rsi1 <= 35.2783 )
							if( bbm <= 0.000243 )
								if( rsi1 <= 27.9816 )
									ret := -0.444444
								if( rsi1 > 27.9816 )
									ret := 0.037975
							if( bbm > 0.000243 )
								if( bbm <= 0.000345 )
									ret := -0.392157
								if( bbm > 0.000345 )
									ret := -0.623907
						if( rsi1 > 35.2783 )
							if( bbm <= 0.0029 )
								if( k <= 21.6518 )
									ret := 0.052885
								if( k > 21.6518 )
									ret := -0.500000
							if( bbm > 0.0029 )
								if( k <= 10.7795 )
									ret := 1.000000 // buy
								if( k > 10.7795 )
									ret := 0.571429
					if( d > 10.7418 )
						if( bbp <= -0.004834 )
							if( k <= 59.5621 )
								if( smoothK_k <= 17.0731 )
									ret := 0.250000
								if( smoothK_k > 17.0731 )
									ret := 0.916667 // buy
							if( k > 59.5621 )
								if( d_k <= -14.8924 )
									ret := -0.750000 // sell
								if( d_k > -14.8924 )
									ret := 0.000000
						if( bbp > -0.004834 )
							if( rsi1 <= 32.1033 )
								if( smoothK_k <= 16.0374 )
									ret := 0.138889
								if( smoothK_k > 16.0374 )
									ret := -0.379775
							if( rsi1 > 32.1033 )
								if( bullPower <= -0.000311 )
									ret := 0.158590
								if( bullPower > -0.000311 )
									ret := -0.074792
				if( bullPower > 1.8e-05 )
					if( rsi1 <= 35.3769 )
						if( bullPower <= 0.000296 )
							if( d_k <= -5.33642 )
								if( smoothD_d <= 22.6056 )
									ret := -0.711538 // sell
								if( smoothD_d > 22.6056 )
									ret := -0.425926
							if( d_k > -5.33642 )
								if( rsi1 <= 33.5558 )
									ret := -0.551282
								if( rsi1 > 33.5558 )
									ret := 0.107143
						if( bullPower > 0.000296 )
							if( d <= 16.5467 )
								if( d <= 5.30956 )
									ret := -1.000000 // sell
								if( d > 5.30956 )
									ret := -0.814815 // sell
							if( d > 16.5467 )
								if( smoothK_k <= 22.5461 )
									ret := 0.714286 // buy
								if( smoothK_k > 22.5461 )
									ret := -0.766667 // sell
					if( rsi1 > 35.3769 )
						if( bullPower <= 0.000213 )
							if( rsi1 <= 35.5649 )
								if( smoothD_d <= 6.45543 )
									ret := 0.250000
								if( smoothD_d > 6.45543 )
									ret := 0.750000 // buy
							if( rsi1 > 35.5649 )
								if( bbm <= 0.001129 )
									ret := -0.252632
								if( bbm > 0.001129 )
									ret := 0.011236
						if( bullPower > 0.000213 )
							if( bbp <= -0.001153 )
								if( d_k <= -5.91403 )
									ret := 0.007937
								if( d_k > -5.91403 )
									ret := -0.608696
							if( bbp > -0.001153 )
								if( bullPower <= 0.00201 )
									ret := -0.544304
								if( bullPower > 0.00201 )
									ret := -0.871795 // sell
		if( d_k > -3.46091 )
			if( bullPower <= 0.00028 )
				if( rsi1 <= 29.3495 )
					if( bbm <= 0.000265 )
						if( bbm <= 0.000169 )
							if( rsi1 <= 18.4039 )
								if( bbm <= 2.9e-05 )
									ret := 0.307692
								if( bbm > 2.9e-05 )
									ret := -0.307692
							if( rsi1 > 18.4039 )
								if( bullPower <= -1.6e-05 )
									ret := 0.244048
								if( bullPower > -1.6e-05 )
									ret := 0.013889
						if( bbm > 0.000169 )
							if( rsi1 <= 20.901 )
								if( smoothK_k <= 8.1856 )
									ret := -0.600000
								if( smoothK_k > 8.1856 )
									ret := 0.000000
							if( rsi1 > 20.901 )
								if( bullPower <= -2.7e-05 )
									ret := -0.036036
								if( bullPower > -2.7e-05 )
									ret := -0.313253
					if( bbm > 0.000265 )
						if( rsi1 <= 22.6125 )
							if( rsi1 <= 17.4445 )
								if( bbm <= 0.00062 )
									ret := -0.735931 // sell
								if( bbm > 0.00062 )
									ret := -0.893229 // sell
							if( rsi1 > 17.4445 )
								if( bullPower <= -0.002193 )
									ret := -0.406250
								if( bullPower > -0.002193 )
									ret := -0.726968 // sell
						if( rsi1 > 22.6125 )
							if( d_k <= 6.87935 )
								if( bullPower <= -0.000105 )
									ret := -0.416335
								if( bullPower > -0.000105 )
									ret := -0.647525
							if( d_k > 6.87935 )
								if( bbm <= 0.000523 )
									ret := -0.496894
								if( bbm > 0.000523 )
									ret := -0.751712 // sell
				if( rsi1 > 29.3495 )
					if( bullPower <= 3.9e-05 )
						if( bbm <= 0.000314 )
							if( smoothD_d <= -0.601388 )
								if( smoothK_k <= -0.75841 )
									ret := 0.479167
								if( smoothK_k > -0.75841 )
									ret := 0.052632
							if( smoothD_d > -0.601388 )
								if( k <= 54.5709 )
									ret := 0.086104
								if( k > 54.5709 )
									ret := -0.060976
						if( bbm > 0.000314 )
							if( rsi1 <= 35.106 )
								if( bullPower <= -0.000498 )
									ret := -0.144362
								if( bullPower > -0.000498 )
									ret := -0.388523
							if( rsi1 > 35.106 )
								if( bullPower <= -0.000564 )
									ret := 0.208537
								if( bullPower > -0.000564 )
									ret := -0.078089
					if( bullPower > 3.9e-05 )
						if( bbm <= 0.000371 )
							if( rsi1 <= 36.1649 )
								if( rsi1 <= 33.5933 )
									ret := -0.162791
								if( rsi1 > 33.5933 )
									ret := -0.427419
							if( rsi1 > 36.1649 )
								if( smoothD_d <= 89.759 )
									ret := -0.103044
								if( smoothD_d > 89.759 )
									ret := -0.833333 // sell
						if( bbm > 0.000371 )
							if( d_k <= 9.82807 )
								if( rsi1 <= 35.4838 )
									ret := -0.504878
								if( rsi1 > 35.4838 )
									ret := -0.289855
							if( d_k > 9.82807 )
								if( rsi1 <= 35.2366 )
									ret := -0.743842 // sell
								if( rsi1 > 35.2366 )
									ret := -0.436364
			if( bullPower > 0.00028 )
				if( rsi1 <= 35.6976 )
					if( bbp <= 0.000673 )
						if( d_k <= 7.55717 )
							if( rsi1 <= 29.0906 )
								if( bullPower <= 0.000308 )
									ret := -0.590909
								if( bullPower > 0.000308 )
									ret := -0.869688 // sell
							if( rsi1 > 29.0906 )
								if( bbp <= -0.001309 )
									ret := -0.439490
								if( bbp > -0.001309 )
									ret := -0.681818
						if( d_k > 7.55717 )
							if( bbm <= 0.000652 )
								if( bbp <= 1e-05 )
									ret := 0.000000
								if( bbp > 1e-05 )
									ret := -0.704225 // sell
							if( bbm > 0.000652 )
								if( smoothD_d <= 81.9213 )
									ret := -0.893525 // sell
								if( smoothD_d > 81.9213 )
									ret := -0.363636
					if( bbp > 0.000673 )
						if( d_k <= 18.0465 )
							if( bbm <= 0.000503 )
								if( bullPower <= 0.00065 )
									ret := -1.000000 // sell
								if( bullPower > 0.00065 )
									ret := -0.500000
							if( bbm > 0.000503 )
								if( d <= 0.01297 )
									ret := -0.714286 // sell
								if( d > 0.01297 )
									ret := -0.943794 // sell
						if( d_k > 18.0465 )
							if( bearPower <= -0.000824 )
								if( bearPower <= -0.001288 )
									ret := -1.000000 // sell
								if( bearPower > -0.001288 )
									ret := 0.750000 // buy
							if( bearPower > -0.000824 )
								if( bullPower <= 0.000754 )
									ret := -0.333333
								if( bullPower > 0.000754 )
									ret := -0.930556 // sell
				if( rsi1 > 35.6976 )
					if( bullPower <= 0.001114 )
						if( bbp <= -0.001685 )
							if( bbp <= -0.005248 )
								if( k <= 68.0354 )
									ret := -0.904762 // sell
								if( k > 68.0354 )
									ret := 0.000000
							if( bbp > -0.005248 )
								if( d_k <= 6.41799 )
									ret := 0.354430
								if( d_k > 6.41799 )
									ret := -0.483871
						if( bbp > -0.001685 )
							if( BBPower_Color <= 0.5 )
								if( bbp <= 3e-06 )
									ret := -0.563910
								if( bbp > 3e-06 )
									ret := -0.944751 // sell
							if( BBPower_Color > 0.5 )
								if( bbp <= 0.000556 )
									ret := -0.399558
								if( bbp > 0.000556 )
									ret := -0.630573
					if( bullPower > 0.001114 )
						if( bbp <= -0.001249 )
							if( bullPower <= 0.004331 )
								if( smoothD_d <= 3.1298 )
									ret := 0.888889 // buy
								if( smoothD_d > 3.1298 )
									ret := -0.301205
							if( bullPower > 0.004331 )
								if( bullPower <= 0.011815 )
									ret := -0.900000 // sell
								if( bullPower > 0.011815 )
									ret := -0.250000
						if( bbp > -0.001249 )
							if( bbp <= 0.000755 )
								if( rsi1 <= 40.3139 )
									ret := -0.774725 // sell
								if( rsi1 > 40.3139 )
									ret := -0.462963
							if( bbp > 0.000755 )
								if( smoothK_k <= 89.0121 )
									ret := -0.861429 // sell
								if( smoothK_k > 89.0121 )
									ret := 0.000000
	if( rsi1 > 41.6819 )
		if( rsi1 <= 64.4806 )
			if( bearPower <= -0.000451 )
				if( bbp <= -0.000893 )
					if( rsi1 <= 49.3339 )
						if( bullPower <= -0.000413 )
							if( smoothD_d <= 92.4688 )
								if( d <= 4.57333 )
									ret := -0.156250
								if( d > 4.57333 )
									ret := 0.646853
							if( smoothD_d > 92.4688 )
								if( d <= 96.9575 )
									ret := -0.875000 // sell
								if( d > 96.9575 )
									ret := 0.380952
						if( bullPower > -0.000413 )
							if( rsi1 <= 45.386 )
								if( d_k <= -5.21179 )
									ret := 0.333333
								if( d_k > -5.21179 )
									ret := 0.084975
							if( rsi1 > 45.386 )
								if( d_k <= 1.82944 )
									ret := 0.506616
								if( d_k > 1.82944 )
									ret := 0.237852
					if( rsi1 > 49.3339 )
						if( d_k <= 8.77852 )
							if( bbp <= -0.001684 )
								if( d <= 9.78478 )
									ret := 0.480769
								if( d > 9.78478 )
									ret := 0.767496 // buy
							if( bbp > -0.001684 )
								if( rsi1 <= 55.4129 )
									ret := 0.545648
								if( rsi1 > 55.4129 )
									ret := 0.740146 // buy
						if( d_k > 8.77852 )
							if( bullPower <= 0.001584 )
								if( d <= 56.0755 )
									ret := 0.215686
								if( d > 56.0755 )
									ret := 0.681818
							if( bullPower > 0.001584 )
								if( d <= 27.6657 )
									ret := 0.500000
								if( d > 27.6657 )
									ret := -0.600000
				if( bbp > -0.000893 )
					if( d_k <= 6.53111 )
						if( rsi1 <= 54.4093 )
							if( bullPower <= 0.000211 )
								if( smoothD_d <= 16.6919 )
									ret := 0.084337
								if( smoothD_d > 16.6919 )
									ret := 0.256604
							if( bullPower > 0.000211 )
								if( BBPower_Color <= 0.5 )
									ret := 0.045402
								if( BBPower_Color > 0.5 )
									ret := -0.208054
						if( rsi1 > 54.4093 )
							if( bbp <= 0.001963 )
								if( BBPower_Color <= 0.5 )
									ret := 0.678683
								if( BBPower_Color > 0.5 )
									ret := 0.369338
							if( bbp > 0.001963 )
								if( BBPower_Color <= 0.5 )
									ret := 0.820896 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.125475
					if( d_k > 6.53111 )
						if( rsi1 <= 47.2857 )
							if( bullPower <= 0.000377 )
								if( k <= 15.4681 )
									ret := 0.269231
								if( k > 15.4681 )
									ret := -0.176471
							if( bullPower > 0.000377 )
								if( bbp <= 0.000489 )
									ret := -0.525000
								if( bbp > 0.000489 )
									ret := -0.817204 // sell
						if( rsi1 > 47.2857 )
							if( bullPower <= 0.001903 )
								if( d <= 54.32 )
									ret := -0.045872
								if( d > 54.32 )
									ret := 0.430657
							if( bullPower > 0.001903 )
								if( rsi1 <= 56.7371 )
									ret := -0.379167
								if( rsi1 > 56.7371 )
									ret := 0.176471
			if( bearPower > -0.000451 )
				if( bbp <= 0.001163 )
					if( rsi1 <= 52.2136 )
						if( bullPower <= 0.00031 )
							if( bbp <= 9e-06 )
								if( d_k <= 2.21302 )
									ret := 0.026661
								if( d_k > 2.21302 )
									ret := 0.107271
							if( bbp > 9e-06 )
								if( k <= 18.1717 )
									ret := 0.017766
								if( k > 18.1717 )
									ret := -0.087370
						if( bullPower > 0.00031 )
							if( bullPower <= 0.000535 )
								if( rsi1 <= 49.9461 )
									ret := -0.277837
								if( rsi1 > 49.9461 )
									ret := -0.068627
							if( bullPower > 0.000535 )
								if( rsi1 <= 48.778 )
									ret := -0.473938
								if( rsi1 > 48.778 )
									ret := -0.283892
					if( rsi1 > 52.2136 )
						if( bearPower <= -3.8e-05 )
							if( rsi1 <= 59.1564 )
								if( BBPower_Color <= 0.5 )
									ret := 0.251748
								if( BBPower_Color > 0.5 )
									ret := 0.080235
							if( rsi1 > 59.1564 )
								if( BBPower_Color <= 0.5 )
									ret := 0.500000
								if( BBPower_Color > 0.5 )
									ret := 0.263158
						if( bearPower > -3.8e-05 )
							if( BBPower_Color <= 0.5 )
								if( bbm <= 0.000111 )
									ret := 0.064935
								if( bbm > 0.000111 )
									ret := 0.372549
							if( BBPower_Color > 0.5 )
								if( rsi1 <= 58.1085 )
									ret := -0.051882
								if( rsi1 > 58.1085 )
									ret := 0.054471
				if( bbp > 0.001163 )
					if( rsi1 <= 55.6473 )
						if( d_k <= -3.38811 )
							if( d <= 41.648 )
								if( bbm <= 0.003478 )
									ret := -0.529730
								if( bbm > 0.003478 )
									ret := 0.000000
							if( d > 41.648 )
								if( bullPower <= 0.004473 )
									ret := 0.043011
								if( bullPower > 0.004473 )
									ret := -0.566667
						if( d_k > -3.38811 )
							if( rsi1 <= 45.8489 )
								if( smoothD_d <= 13.0465 )
									ret := -0.666667
								if( smoothD_d > 13.0465 )
									ret := -0.849642 // sell
							if( rsi1 > 45.8489 )
								if( bullPower <= 0.003134 )
									ret := -0.515882
								if( bullPower > 0.003134 )
									ret := -0.719792 // sell
					if( rsi1 > 55.6473 )
						if( bearPower <= 0.000629 )
							if( d_k <= -5.4551 )
								if( BBPower_Color <= 0.5 )
									ret := 0.735294 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.077859
							if( d_k > -5.4551 )
								if( BBPower_Color <= 0.5 )
									ret := 0.509091
								if( BBPower_Color > 0.5 )
									ret := -0.098857
						if( bearPower > 0.000629 )
							if( k <= 66.7548 )
								if( bearPower <= 0.00215 )
									ret := -0.476872
								if( bearPower > 0.00215 )
									ret := -0.736544 // sell
							if( k > 66.7548 )
								if( BBPower_Color <= 0.5 )
									ret := 0.700000 // buy
								if( BBPower_Color > 0.5 )
									ret := -0.246177
		if( rsi1 > 64.4806 )
			if( bearPower <= -0.000149 )
				if( bbm <= 0.000331 )
					if( rsi1 <= 78.6997 )
						if( d_k <= 2.71578 )
							if( bbp <= -1e-05 )
								if( bbm <= 0.000282 )
									ret := 0.274725
								if( bbm > 0.000282 )
									ret := 0.491803
							if( bbp > -1e-05 )
								ret := 0.833333 // buy
						if( d_k > 2.71578 )
							if( rsi1 <= 65.9622 )
								ret := 1.000000 // buy
							if( rsi1 > 65.9622 )
								if( rsi1 <= 70.3111 )
									ret := 0.428571
								if( rsi1 > 70.3111 )
									ret := 1.000000 // buy
					if( rsi1 > 78.6997 )
						if( smoothD_d <= 93.5976 )
							ret := 1.000000 // buy
						if( smoothD_d > 93.5976 )
							ret := 0.500000
				if( bbm > 0.000331 )
					if( rsi1 <= 74.3102 )
						if( BBPower_Color <= 0.5 )
							if( bbp <= -2e-06 )
								if( bbp <= -0.009314 )
									ret := -0.500000
								if( bbp > -0.009314 )
									ret := 0.788550 // buy
							if( bbp > -2e-06 )
								if( bearPower <= -0.002559 )
									ret := 0.538462
								if( bearPower > -0.002559 )
									ret := 0.988166 // buy
						if( BBPower_Color > 0.5 )
							if( rsi1 <= 64.8124 )
								if( k <= 99.3169 )
									ret := 0.516667
								if( k > 99.3169 )
									ret := -0.125000
							if( rsi1 > 64.8124 )
								if( bearPower <= -0.001038 )
									ret := 0.828794 // buy
								if( bearPower > -0.001038 )
									ret := 0.639764
					if( rsi1 > 74.3102 )
						if( bbm <= 0.000462 )
							if( d <= 87.1247 )
								if( bullPower <= 0.000169 )
									ret := 0.800000 // buy
								if( bullPower > 0.000169 )
									ret := 0.000000
							if( d > 87.1247 )
								if( rsi1 <= 80.9188 )
									ret := 0.666667
								if( rsi1 > 80.9188 )
									ret := 1.000000 // buy
						if( bbm > 0.000462 )
							if( BBPower_Color <= 0.5 )
								if( bbm <= 0.000522 )
									ret := 0.800000 // buy
								if( bbm > 0.000522 )
									ret := 0.960725 // buy
							if( BBPower_Color > 0.5 )
								if( rsi1 <= 79.5486 )
									ret := 0.806167 // buy
								if( rsi1 > 79.5486 )
									ret := 0.937888 // buy
			if( bearPower > -0.000149 )
				if( bbm <= 0.000261 )
					if( bbm <= 0.000141 )
						if( rsi1 <= 77.3535 )
							if( BBPower_Color <= 0.5 )
								if( bearPower <= -5.4e-05 )
									ret := 0.107143
								if( bearPower > -5.4e-05 )
									ret := 0.529412
							if( BBPower_Color > 0.5 )
								if( d <= 69.0926 )
									ret := 0.154229
								if( d > 69.0926 )
									ret := -0.091667
						if( rsi1 > 77.3535 )
							if( bearPower <= 6e-06 )
								if( bbp <= 8e-05 )
									ret := 0.208333
								if( bbp > 8e-05 )
									ret := -0.111111
							if( bearPower > 6e-06 )
								if( d_k <= -23.006 )
									ret := 0.750000 // buy
								if( d_k > -23.006 )
									ret := -0.490000
					if( bbm > 0.000141 )
						if( rsi1 <= 72.4256 )
							if( bbp <= 0.000244 )
								if( BBPower_Color <= 0.5 )
									ret := 0.428571
								if( BBPower_Color > 0.5 )
									ret := 0.166667
							if( bbp > 0.000244 )
								if( k <= 14.2201 )
									ret := 0.750000 // buy
								if( k > 14.2201 )
									ret := 0.007067
						if( rsi1 > 72.4256 )
							if( d_k <= -9.37054 )
								if( rsi1 <= 76.2549 )
									ret := 0.675676
								if( rsi1 > 76.2549 )
									ret := 0.280000
							if( d_k > -9.37054 )
								if( bbm <= 0.00019 )
									ret := 0.135922
								if( bbm > 0.00019 )
									ret := 0.314685
				if( bbm > 0.000261 )
					if( rsi1 <= 73.1107 )
						if( bearPower <= 0.001545 )
							if( rsi1 <= 67.665 )
								if( BBPower_Color <= 0.5 )
									ret := 0.958763 // buy
								if( BBPower_Color > 0.5 )
									ret := 0.253782
							if( rsi1 > 67.665 )
								if( d_k <= -9.59481 )
									ret := 0.595794
								if( d_k > -9.59481 )
									ret := 0.457087
						if( bearPower > 0.001545 )
							if( smoothK_k <= 77.423 )
								if( d_k <= 7.58468 )
									ret := -0.074661
								if( d_k > 7.58468 )
									ret := -0.554987
							if( smoothK_k > 77.423 )
								if( rsi1 <= 66.5481 )
									ret := -0.370370
								if( rsi1 > 66.5481 )
									ret := 0.442424
					if( rsi1 > 73.1107 )
						if( rsi1 <= 80.0981 )
							if( BBPower_Color <= 0.5 )
								ret := 1.000000 // buy
							if( BBPower_Color > 0.5 )
								if( d_k <= -2.25134 )
									ret := 0.674723
								if( d_k > -2.25134 )
									ret := 0.462293
						if( rsi1 > 80.0981 )
							if( bbm <= 0.00043 )
								if( bbp <= 0.000592 )
									ret := 0.750000 // buy
								if( bbp > 0.000592 )
									ret := 0.458333
							if( bbm > 0.00043 )
								if( d_k <= -0.748279 )
									ret := 0.838820 // buy
								if( d_k > -0.748279 )
									ret := 0.735113 // buy
	
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_c40fe0cf(bearPower, bbm, bbp, bullPower, BBPower_Color, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


