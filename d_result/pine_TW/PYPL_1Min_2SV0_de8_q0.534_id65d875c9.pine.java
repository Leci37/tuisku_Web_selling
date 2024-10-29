//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: PYPL_1Min_2SV0_65d875c9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2SV0_65d875c9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_65d875c9(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 54.5014 )
		if( VIP <= 1.07885 )
			if( rsi1 <= 27.0324 )
				if( k <= 42.511 )
					if( d_k <= 3.86482 )
						if( d_k <= -1.60487 )
							if( rsi1 <= 15.9402 )
								if( smoothD_d <= 16.607 )
									ret := 0.551948
								if( smoothD_d > 16.607 )
									ret := -0.153846
							if( rsi1 > 15.9402 )
								if( smoothK_k <= 8.55589 )
									ret := 0.206972
								if( smoothK_k > 8.55589 )
									ret := 0.022624
						if( d_k > -1.60487 )
							if( rsi1 <= 26.1239 )
								if( d_k <= -0.282708 )
									ret := -0.098039
								if( d_k > -0.282708 )
									ret := 0.052770
							if( rsi1 > 26.1239 )
								if( VIM <= 1.3737 )
									ret := 0.147541
								if( VIM > 1.3737 )
									ret := 0.933333 // buy
					if( d_k > 3.86482 )
						if( VIM <= 1.94228 )
							if( d <= 26.6588 )
								if( smoothD_d <= 15.5853 )
									ret := 0.188235
								if( smoothD_d > 15.5853 )
									ret := 0.477778
							if( d > 26.6588 )
								if( d_k <= 21.3266 )
									ret := 0.126168
								if( d_k > 21.3266 )
									ret := -0.176471
						if( VIM > 1.94228 )
							if( rsi1 <= 12.6852 )
								ret := 0.000000
							if( rsi1 > 12.6852 )
								if( VIP_VIM <= -1.65048 )
									ret := 0.500000
								if( VIP_VIM > -1.65048 )
									ret := 0.931034 // buy
				if( k > 42.511 )
					if( k <= 63.5448 )
						if( smoothD_d <= 31.7261 )
							if( VIM <= 1.35743 )
								if( smoothD_d <= 30.0655 )
									ret := -0.428571
								if( smoothD_d > 30.0655 )
									ret := 0.125000
							if( VIM > 1.35743 )
								if( d <= 29.0015 )
									ret := 1.000000 // buy
								if( d > 29.0015 )
									ret := 0.250000
						if( smoothD_d > 31.7261 )
							if( d <= 72.5171 )
								if( VIP_VIM <= -0.583528 )
									ret := 0.750000 // buy
								if( VIP_VIM > -0.583528 )
									ret := 0.436893
							if( d > 72.5171 )
								if( d_k <= 20.4895 )
									ret := -0.800000 // sell
								if( d_k > 20.4895 )
									ret := 0.285714
					if( k > 63.5448 )
						if( d_k <= -17.2365 )
							if( rsi1 <= 22.7716 )
								if( smoothD_d <= 50.5163 )
									ret := 0.400000
								if( smoothD_d > 50.5163 )
									ret := 0.833333 // buy
							if( rsi1 > 22.7716 )
								ret := 1.000000 // buy
						if( d_k > -17.2365 )
							if( d <= 87.4735 )
								if( smoothD_d <= 64.519 )
									ret := -0.413793
								if( smoothD_d > 64.519 )
									ret := -0.065217
							if( d > 87.4735 )
								if( rsi1 <= 23.1205 )
									ret := 0.000000
								if( rsi1 > 23.1205 )
									ret := 0.800000 // buy
			if( rsi1 > 27.0324 )
				if( d <= 93.8452 )
					if( d_k <= -16.9161 )
						if( rsi1 <= 30.0597 )
							if( VIP <= 0.795205 )
								if( d_k <= -25.4272 )
									ret := -0.250000
								if( d_k > -25.4272 )
									ret := 0.512195
							if( VIP > 0.795205 )
								if( k <= 55.3792 )
									ret := -0.500000
								if( k > 55.3792 )
									ret := 0.000000
						if( rsi1 > 30.0597 )
							if( VIP_VIM <= -0.546632 )
								if( smoothK_k <= 60.2717 )
									ret := -0.947368 // sell
								if( smoothK_k > 60.2717 )
									ret := -0.266667
							if( VIP_VIM > -0.546632 )
								if( d_k <= -22.4824 )
									ret := 0.027314
								if( d_k > -22.4824 )
									ret := -0.109229
					if( d_k > -16.9161 )
						if( VIP <= 1.01177 )
							if( d <= 0.00073 )
								if( rsi1 <= 44.1001 )
									ret := 0.361111
								if( rsi1 > 44.1001 )
									ret := -0.500000
							if( d > 0.00073 )
								if( d_k <= -6.10178 )
									ret := 0.074067
								if( d_k > -6.10178 )
									ret := 0.003891
						if( VIP > 1.01177 )
							if( d_k <= -6.16363 )
								if( k <= 87.5211 )
									ret := 0.248207
								if( k > 87.5211 )
									ret := 0.005814
							if( d_k > -6.16363 )
								if( rsi1 <= 54.0768 )
									ret := 0.049597
								if( rsi1 > 54.0768 )
									ret := 0.256831
				if( d > 93.8452 )
					if( VIM <= 1.09937 )
						if( VIP_VIM <= -0.168456 )
							if( VIP_VIM <= -0.218471 )
								ret := 0.500000
							if( VIP_VIM > -0.218471 )
								if( d <= 96.3259 )
									ret := -0.809524 // sell
								if( d > 96.3259 )
									ret := 0.000000
						if( VIP_VIM > -0.168456 )
							if( d_k <= 3.88533 )
								if( smoothD_d <= 95.7749 )
									ret := 0.032338
								if( smoothD_d > 95.7749 )
									ret := 0.278195
							if( d_k > 3.88533 )
								if( VIP <= 1.01904 )
									ret := 0.650000
								if( VIP > 1.01904 )
									ret := 0.038462
					if( VIM > 1.09937 )
						if( VIP_VIM <= -0.196794 )
							if( VIM <= 1.24361 )
								if( VIP <= 0.814633 )
									ret := 0.700000 // buy
								if( VIP > 0.814633 )
									ret := 0.186916
							if( VIM > 1.24361 )
								if( VIP <= 1.06546 )
									ret := 0.795455 // buy
								if( VIP > 1.06546 )
									ret := 0.000000
						if( VIP_VIM > -0.196794 )
							if( VIP <= 0.952446 )
								if( d_k <= 0.934454 )
									ret := 1.000000 // buy
								if( d_k > 0.934454 )
									ret := 0.750000 // buy
							if( VIP > 0.952446 )
								if( VIP <= 0.985398 )
									ret := 0.125000
								if( VIP > 0.985398 )
									ret := 0.894737 // buy
		if( VIP > 1.07885 )
			if( d_k <= 3.22236 )
				if( VIP <= 13.9404 )
					if( k <= 88.2082 )
						if( d_k <= -2.07782 )
							if( smoothD_d <= 70.4435 )
								if( smoothD_d <= 66.7081 )
									ret := 0.034146
								if( smoothD_d > 66.7081 )
									ret := 0.372340
							if( smoothD_d > 70.4435 )
								if( smoothD_d <= 75.7306 )
									ret := -0.500000
								if( smoothD_d > 75.7306 )
									ret := 0.131579
						if( d_k > -2.07782 )
							if( d_k <= 1.21073 )
								if( d_k <= -0.581291 )
									ret := 0.103079
								if( d_k > -0.581291 )
									ret := 0.282667
							if( d_k > 1.21073 )
								if( smoothK_k <= -1.62467 )
									ret := -0.361702
								if( smoothK_k > -1.62467 )
									ret := 0.036570
					if( k > 88.2082 )
						if( rsi1 <= 51.7511 )
							if( smoothD_d <= 95.7296 )
								if( VIM <= 1.32286 )
									ret := 0.211111
								if( VIM > 1.32286 )
									ret := 0.566154
							if( smoothD_d > 95.7296 )
								if( d <= 99.537 )
									ret := -0.600000
								if( d > 99.537 )
									ret := 0.142857
						if( rsi1 > 51.7511 )
							if( d_k <= -2.87486 )
								if( VIP_VIM <= 0.274998 )
									ret := 0.055556
								if( VIP_VIM > 0.274998 )
									ret := 0.875000 // buy
							if( d_k > -2.87486 )
								if( VIP_VIM <= 0.173179 )
									ret := -0.014706
								if( VIP_VIM > 0.173179 )
									ret := -0.720930 // sell
				if( VIP > 13.9404 )
					if( smoothD_d <= 27.4576 )
						if( VIM <= 40.0836 )
							if( smoothD_d <= 2.90747 )
								if( smoothD_d <= -1.0798 )
									ret := 0.266667
								if( smoothD_d > -1.0798 )
									ret := 0.741379 // buy
							if( smoothD_d > 2.90747 )
								if( smoothD_d <= 12.8881 )
									ret := 0.064103
								if( smoothD_d > 12.8881 )
									ret := 0.520548
						if( VIM > 40.0836 )
							if( d_k <= -11.3762 )
								if( smoothD_d <= 16.3521 )
									ret := -0.400000
								if( smoothD_d > 16.3521 )
									ret := 0.692308
							if( d_k > -11.3762 )
								if( VIP <= 160.98 )
									ret := 0.857143 // buy
								if( VIP > 160.98 )
									ret := 0.272727
					if( smoothD_d > 27.4576 )
						if( VIM <= 18.3918 )
							if( smoothD_d <= 51.4547 )
								if( k <= 34.8121 )
									ret := 0.714286 // buy
								if( k > 34.8121 )
									ret := 0.038462
							if( smoothD_d > 51.4547 )
								if( rsi1 <= 47.8375 )
									ret := 0.357143
								if( rsi1 > 47.8375 )
									ret := 0.872340 // buy
						if( VIM > 18.3918 )
							if( VIP_VIM <= 0.020661 )
								if( d <= 94.9568 )
									ret := 0.083700
								if( d > 94.9568 )
									ret := 1.000000 // buy
							if( VIP_VIM > 0.020661 )
								if( k <= 58.6485 )
									ret := -0.557143
								if( k > 58.6485 )
									ret := 0.000000
			if( d_k > 3.22236 )
				if( rsi1 <= 46.1963 )
					if( VIP_VIM <= -0.428113 )
						if( d <= 7.5703 )
							if( VIM <= 11.5061 )
								if( smoothD_d <= 3.40006 )
									ret := -0.208333
								if( smoothD_d > 3.40006 )
									ret := -0.866667 // sell
							if( VIM > 11.5061 )
								ret := 0.800000 // buy
						if( d > 7.5703 )
							if( rsi1 <= 29.0254 )
								if( d <= 26.5216 )
									ret := 0.718750 // buy
								if( d > 26.5216 )
									ret := 0.144330
							if( rsi1 > 29.0254 )
								if( d <= 20.4287 )
									ret := -0.061224
								if( d > 20.4287 )
									ret := 0.273973
					if( VIP_VIM > -0.428113 )
						if( smoothK_k <= 10.3219 )
							if( d_k <= 4.42744 )
								if( d_k <= 3.4636 )
									ret := 0.352941
								if( d_k > 3.4636 )
									ret := 0.793814 // buy
							if( d_k > 4.42744 )
								if( rsi1 <= 26.266 )
									ret := -0.129032
								if( rsi1 > 26.266 )
									ret := 0.482838
						if( smoothK_k > 10.3219 )
							if( smoothD_d <= 51.0297 )
								if( d <= 50.4741 )
									ret := 0.271667
								if( d > 50.4741 )
									ret := -0.323077
							if( smoothD_d > 51.0297 )
								if( smoothD_d <= 65.3768 )
									ret := 0.570833
								if( smoothD_d > 65.3768 )
									ret := 0.352713
				if( rsi1 > 46.1963 )
					if( VIM <= 4.16113 )
						if( VIM <= 2.06785 )
							if( d_k <= 25.9408 )
								if( d <= 85.7123 )
									ret := 0.164621
								if( d > 85.7123 )
									ret := -0.008734
							if( d_k > 25.9408 )
								if( d_k <= 32.483 )
									ret := 0.578947
								if( d_k > 32.483 )
									ret := -0.600000
						if( VIM > 2.06785 )
							if( VIM <= 2.08798 )
								if( d <= 65.483 )
									ret := -0.400000
								if( d > 65.483 )
									ret := -0.833333 // sell
							if( VIM > 2.08798 )
								if( d_k <= 15.8408 )
									ret := -0.014052
								if( d_k > 15.8408 )
									ret := 0.231481
					if( VIM > 4.16113 )
						if( d_k <= 6.06445 )
							if( VIM <= 6.20583 )
								if( rsi1 <= 47.2867 )
									ret := -0.750000 // sell
								if( rsi1 > 47.2867 )
									ret := 0.645161
							if( VIM > 6.20583 )
								if( d <= 22.1602 )
									ret := -0.357143
								if( d > 22.1602 )
									ret := 0.189189
						if( d_k > 6.06445 )
							if( VIP_VIM <= 3.67066 )
								if( d_k <= 9.0563 )
									ret := 0.598837
								if( d_k > 9.0563 )
									ret := 0.337386
							if( VIP_VIM > 3.67066 )
								ret := -0.833333 // sell
	if( rsi1 > 54.5014 )
		if( VIP <= 1.51533 )
			if( d_k <= -16.9091 )
				if( VIP <= 1.2772 )
					if( smoothK_k <= 63.8364 )
						if( d <= 24.3168 )
							if( VIP <= 0.955101 )
								ret := -1.000000 // sell
							if( VIP > 0.955101 )
								if( VIM <= 1.13231 )
									ret := 0.260870
								if( VIM > 1.13231 )
									ret := -0.857143 // sell
						if( d > 24.3168 )
							if( d <= 44.0341 )
								if( d <= 40.317 )
									ret := -0.289286
								if( d > 40.317 )
									ret := 0.322581
							if( d > 44.0341 )
								if( d_k <= -18.8952 )
									ret := -0.214286
								if( d_k > -18.8952 )
									ret := -0.766667 // sell
					if( smoothK_k > 63.8364 )
						if( smoothD_d <= 43.3945 )
							if( d_k <= -26.7437 )
								if( d_k <= -27.3666 )
									ret := 0.470588
								if( d_k > -27.3666 )
									ret := 1.000000 // buy
							if( d_k > -26.7437 )
								if( rsi1 <= 55.2289 )
									ret := 0.833333 // buy
								if( rsi1 > 55.2289 )
									ret := 0.000000
						if( smoothD_d > 43.3945 )
							if( VIP <= 1.09802 )
								if( VIP <= 1.09412 )
									ret := -0.096463
								if( VIP > 1.09412 )
									ret := -0.739130 // sell
							if( VIP > 1.09802 )
								if( VIM <= 0.856793 )
									ret := -0.058140
								if( VIM > 0.856793 )
									ret := 0.182371
				if( VIP > 1.2772 )
					if( d <= 22.9499 )
						if( rsi1 <= 72.3269 )
							ret := 1.000000 // buy
						if( rsi1 > 72.3269 )
							ret := 0.000000
					if( d > 22.9499 )
						if( d_k <= -31.2346 )
							if( VIP_VIM <= 0.666981 )
								ret := 0.000000
							if( VIP_VIM > 0.666981 )
								ret := 1.000000 // buy
						if( d_k > -31.2346 )
							if( d_k <= -17.5885 )
								if( VIP <= 1.31425 )
									ret := -0.594595
								if( VIP > 1.31425 )
									ret := -0.372414
							if( d_k > -17.5885 )
								if( VIM <= 0.997212 )
									ret := -0.250000
								if( VIM > 0.997212 )
									ret := 0.600000
			if( d_k > -16.9091 )
				if( k <= 94.9464 )
					if( smoothD_d <= 93.4432 )
						if( VIP_VIM <= -0.054728 )
							if( rsi1 <= 73.831 )
								if( d_k <= 7.73409 )
									ret := -0.256579
								if( d_k > 7.73409 )
									ret := 0.343750
							if( rsi1 > 73.831 )
								if( smoothK_k <= 68.4904 )
									ret := -1.000000 // sell
								if( smoothK_k > 68.4904 )
									ret := -0.750000 // sell
						if( VIP_VIM > -0.054728 )
							if( smoothK_k <= 89.1958 )
								if( VIP <= 1.0124 )
									ret := -0.113074
								if( VIP > 1.0124 )
									ret := 0.050698
							if( smoothK_k > 89.1958 )
								if( d <= 90.2188 )
									ret := 0.119792
								if( d > 90.2188 )
									ret := -0.132979
					if( smoothD_d > 93.4432 )
						if( VIP <= 1.05073 )
							if( k <= 94.2484 )
								ret := -0.750000 // sell
							if( k > 94.2484 )
								ret := -1.000000 // sell
						if( VIP > 1.05073 )
							if( rsi1 <= 75.0156 )
								if( rsi1 <= 65.4411 )
									ret := 0.402878
								if( rsi1 > 65.4411 )
									ret := -0.023438
							if( rsi1 > 75.0156 )
								if( d <= 97.1022 )
									ret := 0.657143
								if( d > 97.1022 )
									ret := 0.189189
				if( k > 94.9464 )
					if( rsi1 <= 95.9481 )
						if( VIP_VIM <= -0.039195 )
							if( smoothD_d <= 95.0765 )
								if( d_k <= -2.63057 )
									ret := 0.000000
								if( d_k > -2.63057 )
									ret := -0.250000
							if( smoothD_d > 95.0765 )
								if( VIP_VIM <= -0.059201 )
									ret := 0.956522 // buy
								if( VIP_VIM > -0.059201 )
									ret := 0.400000
						if( VIP_VIM > -0.039195 )
							if( smoothK_k <= 92.356 )
								if( VIM <= 0.994084 )
									ret := -0.199029
								if( VIM > 0.994084 )
									ret := -1.000000 // sell
							if( smoothK_k > 92.356 )
								if( d <= 95.196 )
									ret := 0.037061
								if( d > 95.196 )
									ret := -0.054772
					if( rsi1 > 95.9481 )
						if( smoothK_k <= 96.9911 )
							if( VIP_VIM <= 0.914168 )
								if( smoothK_k <= 95.5364 )
									ret := 1.000000 // buy
								if( smoothK_k > 95.5364 )
									ret := 0.000000
							if( VIP_VIM > 0.914168 )
								ret := 1.000000 // buy
						if( smoothK_k > 96.9911 )
							if( VIP <= 1.47822 )
								ret := 0.000000
							if( VIP > 1.47822 )
								ret := 0.666667
		if( VIP > 1.51533 )
			if( d_k <= -1.35432 )
				if( rsi1 <= 72.4132 )
					if( VIP_VIM <= 0.801795 )
						if( smoothK_k <= 95.9035 )
							if( k <= 96.7637 )
								if( smoothK_k <= 89.7225 )
									ret := -0.208650
								if( smoothK_k > 89.7225 )
									ret := 0.071429
							if( k > 96.7637 )
								if( rsi1 <= 63.9436 )
									ret := -0.660714
								if( rsi1 > 63.9436 )
									ret := -0.157895
						if( smoothK_k > 95.9035 )
							if( VIP <= 2.55797 )
								if( rsi1 <= 63.3556 )
									ret := 0.357143
								if( rsi1 > 63.3556 )
									ret := -0.433333
							if( VIP > 2.55797 )
								if( VIM <= 5.27764 )
									ret := 0.512195
								if( VIM > 5.27764 )
									ret := -0.133333
					if( VIP_VIM > 0.801795 )
						if( VIM <= 0.878014 )
							if( smoothK_k <= 64.4293 )
								ret := 0.142857
							if( smoothK_k > 64.4293 )
								if( d <= 77.5009 )
									ret := 1.000000 // buy
								if( d > 77.5009 )
									ret := 0.545455
						if( VIM > 0.878014 )
							if( VIM <= 3.53439 )
								if( VIP_VIM <= 0.905486 )
									ret := 0.083333
								if( VIP_VIM > 0.905486 )
									ret := -0.269231
							if( VIM > 3.53439 )
								if( VIM <= 47.4768 )
									ret := 0.183453
								if( VIM > 47.4768 )
									ret := -0.395833
				if( rsi1 > 72.4132 )
					if( VIP_VIM <= 1.70437 )
						if( d <= 79.0257 )
							if( k <= 98.1822 )
								if( d_k <= -21.1733 )
									ret := -0.650602
								if( d_k > -21.1733 )
									ret := -0.207865
							if( k > 98.1822 )
								if( rsi1 <= 81.798 )
									ret := 0.937500 // buy
								if( rsi1 > 81.798 )
									ret := -0.750000 // sell
						if( d > 79.0257 )
							if( VIP <= 24.995 )
								if( rsi1 <= 94.4503 )
									ret := -0.550820
								if( rsi1 > 94.4503 )
									ret := 0.076923
							if( VIP > 24.995 )
								if( rsi1 <= 81.6981 )
									ret := -0.111111
								if( rsi1 > 81.6981 )
									ret := 1.000000 // buy
					if( VIP_VIM > 1.70437 )
						if( rsi1 <= 77.0863 )
							if( VIP_VIM <= 1.76256 )
								ret := 0.166667
							if( VIP_VIM > 1.76256 )
								if( rsi1 <= 75.8887 )
									ret := -0.400000
								if( rsi1 > 75.8887 )
									ret := -1.000000 // sell
						if( rsi1 > 77.0863 )
							if( smoothD_d <= 51.2238 )
								ret := 1.000000 // buy
							if( smoothD_d > 51.2238 )
								if( d <= 76.4785 )
									ret := -0.571429
								if( d > 76.4785 )
									ret := 0.320000
			if( d_k > -1.35432 )
				if( VIP_VIM <= 1.46339 )
					if( smoothK_k <= 29.4899 )
						if( VIM <= 1.06701 )
							if( k <= 16.5923 )
								if( VIP <= 1.68003 )
									ret := 0.375000
								if( VIP > 1.68003 )
									ret := 0.933333 // buy
							if( k > 16.5923 )
								if( VIM <= 0.960309 )
									ret := 0.333333
								if( VIM > 0.960309 )
									ret := -0.200000
						if( VIM > 1.06701 )
							if( rsi1 <= 61.1965 )
								if( d <= 44.3447 )
									ret := 0.003968
								if( d > 44.3447 )
									ret := -0.617021
							if( rsi1 > 61.1965 )
								if( d <= 38.7024 )
									ret := -0.626087
								if( d > 38.7024 )
									ret := -0.954545 // sell
					if( smoothK_k > 29.4899 )
						if( k <= 72.8103 )
							if( VIM <= 1.58205 )
								if( d <= 43.2112 )
									ret := -0.714286 // sell
								if( d > 43.2112 )
									ret := 0.282322
							if( VIM > 1.58205 )
								if( k <= 63.1593 )
									ret := -0.106339
								if( k > 63.1593 )
									ret := 0.163880
						if( k > 72.8103 )
							if( d_k <= 9.54675 )
								if( VIM <= 0.485393 )
									ret := 0.294118
								if( VIM > 0.485393 )
									ret := -0.177215
							if( d_k > 9.54675 )
								if( smoothD_d <= 83.8306 )
									ret := -0.142857
								if( smoothD_d > 83.8306 )
									ret := 0.567568
				if( VIP_VIM > 1.46339 )
					if( VIM <= 4.47917 )
						if( VIM <= 3.04768 )
							if( VIP_VIM <= 1.78922 )
								if( rsi1 <= 67.9144 )
									ret := 0.153846
								if( rsi1 > 67.9144 )
									ret := 0.677419
							if( VIP_VIM > 1.78922 )
								if( VIM <= 1.65578 )
									ret := -0.333333
								if( VIM > 1.65578 )
									ret := 0.181818
						if( VIM > 3.04768 )
							if( smoothD_d <= 88.1869 )
								if( VIM <= 3.45596 )
									ret := 1.000000 // buy
								if( VIM > 3.45596 )
									ret := 0.444444
							if( smoothD_d > 88.1869 )
								ret := 1.000000 // buy
					if( VIM > 4.47917 )
						if( smoothD_d <= 58.9685 )
							if( rsi1 <= 60.5556 )
								if( smoothD_d <= 48.1043 )
									ret := 0.000000
								if( smoothD_d > 48.1043 )
									ret := 0.500000
							if( rsi1 > 60.5556 )
								if( d_k <= 18.2659 )
									ret := 1.000000 // buy
								if( d_k > 18.2659 )
									ret := 0.500000
						if( smoothD_d > 58.9685 )
							if( d_k <= 1.70362 )
								if( rsi1 <= 69.0423 )
									ret := 0.636364
								if( rsi1 > 69.0423 )
									ret := -0.107143
							if( d_k > 1.70362 )
								if( k <= 69.8113 )
									ret := -0.388889
								if( k > 69.8113 )
									ret := -0.085106
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_65d875c9(d, d_k, smoothK_k, k, rsi1, smoothD_d, VIP, VIP_VIM, VIM)

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


