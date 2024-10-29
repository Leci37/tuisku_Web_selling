//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: DOGEUSDT_15Min_1S00_7fe42a8a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_15Min_1S00_7fe42a8a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_15Min_7fe42a8a(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 33.6065 )
		if( d <= 8.9907 )
			if( rsi1 <= 32.8331 )
				if( rsi1 <= 23.748 )
					if( d_k <= -1.06494 )
						if( k <= 2.21556 )
							if( smoothK_k <= -1.06306 )
								if( d_k <= -1.14343 )
									ret := -0.500000
								if( d_k > -1.14343 )
									ret := -0.750000 // sell
							if( smoothK_k > -1.06306 )
								if( smoothD_d <= -2.22675 )
									ret := -1.000000 // sell
								if( smoothD_d > -2.22675 )
									ret := -0.888889 // sell
						if( k > 2.21556 )
							if( rsi1 <= 12.6436 )
								if( d <= 1.58398 )
									ret := 0.538462
								if( d > 1.58398 )
									ret := -0.411765
							if( rsi1 > 12.6436 )
								if( rsi1 <= 22.306 )
									ret := -0.703911 // sell
								if( rsi1 > 22.306 )
									ret := -0.541176
					if( d_k > -1.06494 )
						if( smoothK_k <= -2.73394 )
							if( smoothD_d <= -1.52355 )
								if( rsi1 <= 13.4447 )
									ret := -0.805668 // sell
								if( rsi1 > 13.4447 )
									ret := -0.531390
							if( smoothD_d > -1.52355 )
								if( d <= 4.85793 )
									ret := -0.328767
								if( d > 4.85793 )
									ret := -0.733333 // sell
						if( smoothK_k > -2.73394 )
							if( d_k <= 5.22923 )
								if( smoothD_d <= -0.79695 )
									ret := -0.179167
								if( smoothD_d > -0.79695 )
									ret := -0.397117
							if( d_k > 5.22923 )
								if( k <= 1.46538 )
									ret := -0.358974
								if( k > 1.46538 )
									ret := 0.740741 // buy
				if( rsi1 > 23.748 )
					if( d_k <= 0.865747 )
						if( d_k <= -6.88992 )
							if( smoothK_k <= 9.01563 )
								ret := 0.000000
							if( smoothK_k > 9.01563 )
								if( rsi1 <= 28.2506 )
									ret := -0.606061
								if( rsi1 > 28.2506 )
									ret := -0.843478 // sell
						if( d_k > -6.88992 )
							if( rsi1 <= 27.6955 )
								if( d <= 2.30118 )
									ret := -0.560209
								if( d > 2.30118 )
									ret := -0.397709
							if( rsi1 > 27.6955 )
								if( rsi1 <= 27.7841 )
									ret := 0.222222
								if( rsi1 > 27.7841 )
									ret := -0.354117
					if( d_k > 0.865747 )
						if( d_k <= 4.99136 )
							if( rsi1 <= 24.2125 )
								if( smoothK_k <= 0.908322 )
									ret := 0.475000
								if( smoothK_k > 0.908322 )
									ret := -0.750000 // sell
							if( rsi1 > 24.2125 )
								if( smoothD_d <= -0.325895 )
									ret := -0.080357
								if( smoothD_d > -0.325895 )
									ret := -0.256822
						if( d_k > 4.99136 )
							if( rsi1 <= 29.053 )
								if( rsi1 <= 28.3035 )
									ret := -0.608696
								if( rsi1 > 28.3035 )
									ret := -0.892857 // sell
							if( rsi1 > 29.053 )
								if( smoothK_k <= -2.99128 )
									ret := 0.214286
								if( smoothK_k > -2.99128 )
									ret := -0.321429
			if( rsi1 > 32.8331 )
				if( rsi1 <= 48.7788 )
					if( smoothD_d <= 3.79555 )
						if( smoothD_d <= 3.24393 )
							if( d_k <= -7.04209 )
								if( d <= 4.05029 )
									ret := 0.565217
								if( d > 4.05029 )
									ret := -0.117647
							if( d_k > -7.04209 )
								if( d_k <= -0.596919 )
									ret := -0.349797
								if( d_k > -0.596919 )
									ret := -0.252944
						if( smoothD_d > 3.24393 )
							if( k <= 1.02823 )
								if( d_k <= 5.66348 )
									ret := 0.600000
								if( d_k > 5.66348 )
									ret := -0.121212
							if( k > 1.02823 )
								if( rsi1 <= 44.2054 )
									ret := -0.404651
								if( rsi1 > 44.2054 )
									ret := -0.706522 // sell
					if( smoothD_d > 3.79555 )
						if( k <= 12.5763 )
							if( k <= 0.041652 )
								if( d_k <= 7.10514 )
									ret := 0.235294
								if( d_k > 7.10514 )
									ret := -0.604396
							if( k > 0.041652 )
								if( d_k <= 8.1329 )
									ret := -0.118717
								if( d_k > 8.1329 )
									ret := 0.928571 // buy
						if( k > 12.5763 )
							if( smoothD_d <= 5.48192 )
								if( d_k <= -5.05121 )
									ret := -0.234043
								if( d_k > -5.05121 )
									ret := -0.777778 // sell
							if( smoothD_d > 5.48192 )
								if( rsi1 <= 40.1419 )
									ret := -0.736111 // sell
								if( rsi1 > 40.1419 )
									ret := -0.403509
				if( rsi1 > 48.7788 )
					if( rsi1 <= 65.7917 )
						if( d <= 0.233911 )
							if( d_k <= -0.002428 )
								if( smoothK_k <= -2.88224 )
									ret := -0.500000
								if( smoothK_k > -2.88224 )
									ret := -0.894737 // sell
							if( d_k > -0.002428 )
								if( smoothK_k <= -2.98569 )
									ret := -0.282051
								if( smoothK_k > -2.98569 )
									ret := 0.400000
						if( d > 0.233911 )
							if( d_k <= -0.478393 )
								if( d <= 3.22331 )
									ret := 0.000000
								if( d > 3.22331 )
									ret := -0.198006
							if( d_k > -0.478393 )
								if( d_k <= 0.768269 )
									ret := 0.273171
								if( d_k > 0.768269 )
									ret := -0.065719
					if( rsi1 > 65.7917 )
						if( smoothK_k <= 3.98458 )
							if( d <= 2.75182 )
								ret := 0.500000
							if( d > 2.75182 )
								if( rsi1 <= 68.3992 )
									ret := -0.285714
								if( rsi1 > 68.3992 )
									ret := 0.250000
						if( smoothK_k > 3.98458 )
							if( d_k <= -6.3733 )
								ret := 0.142857
							if( d_k > -6.3733 )
								if( k <= 11.8168 )
									ret := 0.600000
								if( k > 11.8168 )
									ret := 1.000000 // buy
		if( d > 8.9907 )
			if( rsi1 <= 42.5713 )
				if( d_k <= 8.821 )
					if( rsi1 <= 20.6808 )
						if( d <= 19.9585 )
							if( d_k <= -1.50637 )
								if( k <= 14.0864 )
									ret := -0.280000
								if( k > 14.0864 )
									ret := -0.777108 // sell
							if( d_k > -1.50637 )
								if( d_k <= 5.08754 )
									ret := -0.234637
								if( d_k > 5.08754 )
									ret := -0.633803
						if( d > 19.9585 )
							if( smoothK_k <= 13.1668 )
								if( d <= 22.1689 )
									ret := -0.750000 // sell
								if( d > 22.1689 )
									ret := -1.000000 // sell
							if( smoothK_k > 13.1668 )
								if( k <= 23.3278 )
									ret := 0.366667
								if( k > 23.3278 )
									ret := -0.319588
					if( rsi1 > 20.6808 )
						if( d_k <= -4.24884 )
							if( d <= 14.022 )
								if( smoothD_d <= 7.07903 )
									ret := -0.216783
								if( smoothD_d > 7.07903 )
									ret := -0.436768
							if( d > 14.022 )
								if( d_k <= -7.78975 )
									ret := -0.242026
								if( d_k > -7.78975 )
									ret := -0.089374
						if( d_k > -4.24884 )
							if( smoothK_k <= 17.501 )
								if( d_k <= -0.766352 )
									ret := -0.219000
								if( d_k > -0.766352 )
									ret := -0.108125
							if( smoothK_k > 17.501 )
								if( d_k <= 4.65164 )
									ret := -0.012858
								if( d_k > 4.65164 )
									ret := -0.246753
				if( d_k > 8.821 )
					if( rsi1 <= 35.4245 )
						if( smoothD_d <= 23.5184 )
							if( k <= 0.035171 )
								if( d <= 22.5533 )
									ret := -0.359184
								if( d > 22.5533 )
									ret := 0.333333
							if( k > 0.035171 )
								if( rsi1 <= 21.9154 )
									ret := -0.720588 // sell
								if( rsi1 > 21.9154 )
									ret := -0.464923
						if( smoothD_d > 23.5184 )
							if( smoothD_d <= 28.7975 )
								if( k <= 6.41669 )
									ret := -0.611111
								if( k > 6.41669 )
									ret := -0.081356
							if( smoothD_d > 28.7975 )
								if( k <= 25.1169 )
									ret := -0.400353
								if( k > 25.1169 )
									ret := -0.227368
					if( rsi1 > 35.4245 )
						if( smoothK_k <= 2.79635 )
							if( rsi1 <= 36.7833 )
								if( d <= 11.6091 )
									ret := 0.416667
								if( d > 11.6091 )
									ret := -0.512500
							if( rsi1 > 36.7833 )
								if( smoothD_d <= 6.39417 )
									ret := 0.909091 // buy
								if( smoothD_d > 6.39417 )
									ret := -0.033505
						if( smoothK_k > 2.79635 )
							if( d <= 27.227 )
								if( smoothK_k <= 10.8602 )
									ret := -0.346304
								if( smoothK_k > 10.8602 )
									ret := -0.600000
							if( d > 27.227 )
								if( k <= 7.66448 )
									ret := -0.782609 // sell
								if( k > 7.66448 )
									ret := -0.188363
			if( rsi1 > 42.5713 )
				if( smoothK_k <= 25.3695 )
					if( rsi1 <= 66.8882 )
						if( rsi1 <= 52.89 )
							if( d_k <= 5.51037 )
								if( d_k <= -1.18349 )
									ret := -0.108774
								if( d_k > -1.18349 )
									ret := 0.034199
							if( d_k > 5.51037 )
								if( smoothD_d <= 39.3127 )
									ret := -0.195988
								if( smoothD_d > 39.3127 )
									ret := 0.089974
						if( rsi1 > 52.89 )
							if( d_k <= 27.4172 )
								if( smoothK_k <= 18.3146 )
									ret := 0.009631
								if( smoothK_k > 18.3146 )
									ret := -0.112304
							if( d_k > 27.4172 )
								if( smoothD_d <= 46.6919 )
									ret := 0.270833
								if( smoothD_d > 46.6919 )
									ret := 0.628571
					if( rsi1 > 66.8882 )
						if( smoothK_k <= 19.7861 )
							if( d <= 42.1357 )
								if( smoothD_d <= 32.4236 )
									ret := 0.398601
								if( smoothD_d > 32.4236 )
									ret := -0.280000
							if( d > 42.1357 )
								ret := 1.000000 // buy
						if( smoothK_k > 19.7861 )
							if( rsi1 <= 68.9842 )
								if( d <= 18.0819 )
									ret := 0.333333
								if( d > 18.0819 )
									ret := -0.395349
							if( rsi1 > 68.9842 )
								if( d_k <= 5.33999 )
									ret := -0.176471
								if( d_k > 5.33999 )
									ret := 0.454545
				if( smoothK_k > 25.3695 )
					if( rsi1 <= 55.2786 )
						if( k <= 32.709 )
							if( d_k <= -12.0732 )
								if( rsi1 <= 54.1369 )
									ret := -0.280576
								if( rsi1 > 54.1369 )
									ret := 0.285714
							if( d_k > -12.0732 )
								if( rsi1 <= 47.9409 )
									ret := 0.132150
								if( rsi1 > 47.9409 )
									ret := -0.042230
						if( k > 32.709 )
							if( d_k <= -10.5339 )
								if( d <= 16.8895 )
									ret := 0.066667
								if( d > 16.8895 )
									ret := -0.387435
							if( d_k > -10.5339 )
								if( rsi1 <= 44.654 )
									ret := -0.380952
								if( rsi1 > 44.654 )
									ret := -0.024967
					if( rsi1 > 55.2786 )
						if( d_k <= 25.1105 )
							if( d <= 52.1775 )
								if( rsi1 <= 66.9646 )
									ret := 0.217241
								if( rsi1 > 66.9646 )
									ret := -0.061321
							if( d > 52.1775 )
								if( smoothD_d <= 52.5648 )
									ret := -0.472727
								if( smoothD_d > 52.5648 )
									ret := 0.111111
						if( d_k > 25.1105 )
							if( k <= 31.2797 )
								if( k <= 29.7944 )
									ret := 0.428571
								if( k > 29.7944 )
									ret := 0.964286 // buy
							if( k > 31.2797 )
								if( smoothD_d <= 60.8233 )
									ret := 0.133333
								if( smoothD_d > 60.8233 )
									ret := 0.750000 // buy
	if( smoothK_k > 33.6065 )
		if( smoothK_k <= 80.2175 )
			if( rsi1 <= 62.5908 )
				if( rsi1 <= 42.3361 )
					if( d <= 29.9111 )
						if( d_k <= -14.8634 )
							if( rsi1 <= 32.8399 )
								if( k <= 53.1563 )
									ret := -0.647727
								if( k > 53.1563 )
									ret := -1.000000 // sell
							if( rsi1 > 32.8399 )
								if( d_k <= -26.9412 )
									ret := 0.800000 // buy
								if( d_k > -26.9412 )
									ret := -0.295238
						if( d_k > -14.8634 )
							if( d <= 28.9562 )
								if( k <= 40.9866 )
									ret := -0.093750
								if( k > 40.9866 )
									ret := 0.250000
							if( d > 28.9562 )
								if( k <= 38.8751 )
									ret := -0.791667 // sell
								if( k > 38.8751 )
									ret := -0.314286
					if( d > 29.9111 )
						if( smoothD_d <= 60.8854 )
							if( d_k <= 2.55454 )
								if( d_k <= -22.3548 )
									ret := -0.231441
								if( d_k > -22.3548 )
									ret := 0.105663
							if( d_k > 2.55454 )
								if( k <= 45.0064 )
									ret := -0.263258
								if( k > 45.0064 )
									ret := -0.050000
						if( smoothD_d > 60.8854 )
							if( k <= 50.1518 )
								if( smoothK_k <= 37.0638 )
									ret := 0.304348
								if( smoothK_k > 37.0638 )
									ret := -0.353774
							if( k > 50.1518 )
								if( k <= 57.2311 )
									ret := 0.154150
								if( k > 57.2311 )
									ret := -0.088624
				if( rsi1 > 42.3361 )
					if( k <= 78.0496 )
						if( d <= 52.5922 )
							if( d_k <= 1.51084 )
								if( d_k <= -10.9638 )
									ret := 0.101652
								if( d_k > -10.9638 )
									ret := 0.230800
							if( d_k > 1.51084 )
								if( k <= 42.5666 )
									ret := 0.040119
								if( k > 42.5666 )
									ret := -0.106870
						if( d > 52.5922 )
							if( k <= 66.7895 )
								if( rsi1 <= 49.1564 )
									ret := -0.046696
								if( rsi1 > 49.1564 )
									ret := 0.040054
							if( k > 66.7895 )
								if( smoothK_k <= 67.9353 )
									ret := 0.174562
								if( smoothK_k > 67.9353 )
									ret := 0.087437
					if( k > 78.0496 )
						if( rsi1 <= 52.8903 )
							if( d <= 83.1591 )
								if( smoothK_k <= 76.9477 )
									ret := 0.320144
								if( smoothK_k > 76.9477 )
									ret := 0.090909
							if( d > 83.1591 )
								if( d <= 91.1136 )
									ret := -0.077778
								if( d > 91.1136 )
									ret := 0.340426
						if( rsi1 > 52.8903 )
							if( d <= 48.9921 )
								ret := -1.000000 // sell
							if( d > 48.9921 )
								if( d <= 53.7352 )
									ret := 0.785714 // buy
								if( d > 53.7352 )
									ret := 0.279482
			if( rsi1 > 62.5908 )
				if( d_k <= 10.5241 )
					if( d_k <= -14.3866 )
						if( d <= 65.0763 )
							if( smoothD_d <= 52.6907 )
								if( d_k <= -24.0301 )
									ret := 0.199482
								if( d_k > -24.0301 )
									ret := 0.377419
							if( smoothD_d > 52.6907 )
								if( d <= 58.5238 )
									ret := 0.686957
								if( d > 58.5238 )
									ret := 0.439394
						if( d > 65.0763 )
							if( rsi1 <= 69.4768 )
								if( rsi1 <= 65.7272 )
									ret := -0.363636
								if( rsi1 > 65.7272 )
									ret := 0.666667
							if( rsi1 > 69.4768 )
								if( k <= 82.7267 )
									ret := -1.000000 // sell
								if( k > 82.7267 )
									ret := -0.500000
					if( d_k > -14.3866 )
						if( d <= 75.4314 )
							if( smoothD_d <= 50.3944 )
								if( smoothK_k <= 33.7991 )
									ret := 0.933333 // buy
								if( smoothK_k > 33.7991 )
									ret := 0.202403
							if( smoothD_d > 50.3944 )
								if( d_k <= 6.32986 )
									ret := 0.116990
								if( d_k > 6.32986 )
									ret := -0.080868
						if( d > 75.4314 )
							if( smoothD_d <= 84.1887 )
								if( smoothD_d <= 83.3297 )
									ret := 0.279814
								if( smoothD_d > 83.3297 )
									ret := -0.068182
							if( smoothD_d > 84.1887 )
								if( d <= 90.6885 )
									ret := 0.480565
								if( d > 90.6885 )
									ret := 0.190476
				if( d_k > 10.5241 )
					if( k <= 60.0035 )
						if( smoothD_d <= 69.8847 )
							if( d <= 72.5505 )
								if( d_k <= 21.9781 )
									ret := 0.134191
								if( d_k > 21.9781 )
									ret := 0.529412
							if( d > 72.5505 )
								if( d <= 72.6822 )
									ret := -1.000000 // sell
								if( d > 72.6822 )
									ret := -0.375000
						if( smoothD_d > 69.8847 )
							if( smoothK_k <= 52.9076 )
								if( smoothD_d <= 73.0559 )
									ret := 0.925926 // buy
								if( smoothD_d > 73.0559 )
									ret := 0.578947
							if( smoothK_k > 52.9076 )
								if( smoothK_k <= 53.9137 )
									ret := -0.750000 // sell
								if( smoothK_k > 53.9137 )
									ret := 0.414634
					if( k > 60.0035 )
						if( k <= 65.5771 )
							if( d <= 73.5938 )
								if( smoothK_k <= 57.5852 )
									ret := 0.600000
								if( smoothK_k > 57.5852 )
									ret := -0.100000
							if( d > 73.5938 )
								if( d_k <= 18.0901 )
									ret := 0.650538
								if( d_k > 18.0901 )
									ret := 0.902439 // buy
						if( k > 65.5771 )
							if( smoothD_d <= 78.6953 )
								if( rsi1 <= 76.3998 )
									ret := 0.125000
								if( rsi1 > 76.3998 )
									ret := 0.631579
							if( smoothD_d > 78.6953 )
								if( d_k <= 17.5022 )
									ret := 0.580336
								if( d_k > 17.5022 )
									ret := -0.125000
		if( smoothK_k > 80.2175 )
			if( d <= 97.657 )
				if( smoothD_d <= 82.3695 )
					if( rsi1 <= 62.3919 )
						if( rsi1 <= 35.7805 )
							if( smoothK_k <= 87.9782 )
								if( k <= 90.3289 )
									ret := 0.036364
								if( k > 90.3289 )
									ret := 0.750000 // buy
							if( smoothK_k > 87.9782 )
								if( d <= 78.0394 )
									ret := 0.058824
								if( d > 78.0394 )
									ret := -0.636364
						if( rsi1 > 35.7805 )
							if( d_k <= -9.03265 )
								if( smoothD_d <= 77.3015 )
									ret := 0.207759
								if( smoothD_d > 77.3015 )
									ret := 0.361062
							if( d_k > -9.03265 )
								if( rsi1 <= 46.1978 )
									ret := 0.358824
								if( rsi1 > 46.1978 )
									ret := 0.052948
					if( rsi1 > 62.3919 )
						if( rsi1 <= 81.3799 )
							if( smoothD_d <= 65.2275 )
								if( rsi1 <= 75.4927 )
									ret := 0.625954
								if( rsi1 > 75.4927 )
									ret := -0.086957
							if( smoothD_d > 65.2275 )
								if( d <= 80.4269 )
									ret := 0.228880
								if( d > 80.4269 )
									ret := 0.383642
						if( rsi1 > 81.3799 )
							if( smoothK_k <= 88.3873 )
								if( k <= 85.4624 )
									ret := 0.920000 // buy
								if( k > 85.4624 )
									ret := 0.313725
							if( smoothK_k > 88.3873 )
								if( smoothD_d <= 69.3234 )
									ret := 0.375000
								if( smoothD_d > 69.3234 )
									ret := 0.860000 // buy
				if( smoothD_d > 82.3695 )
					if( k <= 98.9905 )
						if( rsi1 <= 67.4309 )
							if( rsi1 <= 31.0785 )
								if( d_k <= -1.65794 )
									ret := -0.600000
								if( d_k > -1.65794 )
									ret := 0.074074
							if( rsi1 > 31.0785 )
								if( smoothD_d <= 93.6741 )
									ret := 0.292420
								if( smoothD_d > 93.6741 )
									ret := 0.136704
						if( rsi1 > 67.4309 )
							if( rsi1 <= 74.6202 )
								if( d_k <= 4.56599 )
									ret := 0.346549
								if( d_k > 4.56599 )
									ret := 0.598253
							if( rsi1 > 74.6202 )
								if( smoothD_d <= 89.816 )
									ret := 0.440928
								if( smoothD_d > 89.816 )
									ret := 0.598703
					if( k > 98.9905 )
						if( smoothD_d <= 87.7826 )
							if( rsi1 <= 67.9293 )
								if( rsi1 <= 50.6665 )
									ret := 0.686047
								if( rsi1 > 50.6665 )
									ret := 0.376344
							if( rsi1 > 67.9293 )
								if( smoothD_d <= 86.1125 )
									ret := 0.534884
								if( smoothD_d > 86.1125 )
									ret := 0.808989 // buy
						if( smoothD_d > 87.7826 )
							if( d <= 96.5255 )
								if( rsi1 <= 81.7481 )
									ret := 0.290414
								if( rsi1 > 81.7481 )
									ret := 0.647059
							if( d > 96.5255 )
								if( rsi1 <= 50.7473 )
									ret := 0.777778 // buy
								if( rsi1 > 50.7473 )
									ret := 0.437673
			if( d > 97.657 )
				if( rsi1 <= 73.7977 )
					if( smoothD_d <= 96.9424 )
						if( rsi1 <= 36.3203 )
							if( k <= 99.4265 )
								if( d_k <= -0.124163 )
									ret := -1.000000 // sell
								if( d_k > -0.124163 )
									ret := -0.750000 // sell
							if( k > 99.4265 )
								ret := 0.800000 // buy
						if( rsi1 > 36.3203 )
							if( d_k <= -0.681354 )
								if( rsi1 <= 72.3589 )
									ret := 0.526442
								if( rsi1 > 72.3589 )
									ret := -0.318182
							if( d_k > -0.681354 )
								if( rsi1 <= 39.716 )
									ret := 0.789474 // buy
								if( rsi1 > 39.716 )
									ret := 0.359838
					if( smoothD_d > 96.9424 )
						if( d <= 99.9782 )
							if( d_k <= 0.066489 )
								if( d_k <= -0.050952 )
									ret := 0.750000 // buy
								if( d_k > -0.050952 )
									ret := 1.000000 // buy
							if( d_k > 0.066489 )
								ret := 0.500000
						if( d > 99.9782 )
							if( rsi1 <= 67.9826 )
								if( rsi1 <= 47.0178 )
									ret := 0.181818
								if( rsi1 > 47.0178 )
									ret := 0.618557
							if( rsi1 > 67.9826 )
								if( d_k <= -0.001735 )
									ret := -0.250000
								if( d_k > -0.001735 )
									ret := 0.414894
				if( rsi1 > 73.7977 )
					if( d <= 99.9272 )
						if( d <= 99.4927 )
							if( d <= 98.7939 )
								if( rsi1 <= 78.0409 )
									ret := 0.386598
								if( rsi1 > 78.0409 )
									ret := 0.621951
							if( d > 98.7939 )
								if( k <= 99.0393 )
									ret := 0.791469 // buy
								if( k > 99.0393 )
									ret := 0.608209
						if( d > 99.4927 )
							if( smoothD_d <= 96.5104 )
								ret := -0.571429
							if( smoothD_d > 96.5104 )
								if( rsi1 <= 90.9071 )
									ret := 0.455752
								if( rsi1 > 90.9071 )
									ret := -0.066667
					if( d > 99.9272 )
						if( k <= 99.9999 )
							if( d_k <= 0.048306 )
								ret := 1.000000 // buy
							if( d_k > 0.048306 )
								if( k <= 99.9189 )
									ret := 1.000000 // buy
								if( k > 99.9189 )
									ret := 0.750000 // buy
						if( k > 99.9999 )
							if( rsi1 <= 85.4356 )
								if( rsi1 <= 83.2868 )
									ret := 0.610465
								if( rsi1 > 83.2868 )
									ret := 0.111111
							if( rsi1 > 85.4356 )
								if( smoothD_d <= 96.9955 )
									ret := 1.000000 // buy
								if( smoothD_d > 96.9955 )
									ret := 0.792453 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_DOGEUSDT_15Min_7fe42a8a(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


