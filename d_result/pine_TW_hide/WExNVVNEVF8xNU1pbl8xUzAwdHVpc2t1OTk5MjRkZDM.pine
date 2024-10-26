//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: XLMUSDT_15Min_1S00_99924dd3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_1S00_99924dd3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_99924dd3(smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothK_k <= 41.5861 )
		if( smoothD_d <= 8.36414 )
			if( smoothD_d <= 2.35985 )
				if( smoothD_d <= -2.16675 )
					if( smoothK_k <= -2.6673 )
						if( rsi1 <= 36.9913 )
							if( smoothD_d <= -2.99532 )
								if( rsi1 <= 16.2782 )
									ret := -0.418440
								if( rsi1 > 16.2782 )
									ret := -0.634940
							if( smoothD_d > -2.99532 )
								if( smoothD_d <= -2.97839 )
									ret := 0.296296
								if( smoothD_d > -2.97839 )
									ret := -0.410256
						if( rsi1 > 36.9913 )
							if( rsi1 <= 39.7607 )
								if( d <= 0.026964 )
									ret := -0.208333
								if( d > 0.026964 )
									ret := 0.666667
							if( rsi1 > 39.7607 )
								if( smoothD_d <= -2.99968 )
									ret := -0.166667
								if( smoothD_d > -2.99968 )
									ret := -0.482456
					if( smoothK_k > -2.6673 )
						if( smoothK_k <= -0.670942 )
							if( rsi1 <= 26.3672 )
								if( d <= 0.242252 )
									ret := -0.416667
								if( d > 0.242252 )
									ret := -0.845912 // sell
							if( rsi1 > 26.3672 )
								if( smoothD_d <= -2.81375 )
									ret := -1.000000 // sell
								if( smoothD_d > -2.81375 )
									ret := -0.526042
						if( smoothK_k > -0.670942 )
							ret := -0.230769
				if( smoothD_d > -2.16675 )
					if( rsi1 <= 41.3598 )
						if( smoothK_k <= 2.05756 )
							if( rsi1 <= 32.7838 )
								if( d <= 2.12368 )
									ret := -0.386606
								if( d > 2.12368 )
									ret := -0.497195
							if( rsi1 > 32.7838 )
								if( rsi1 <= 34.7158 )
									ret := -0.201258
								if( rsi1 > 34.7158 )
									ret := -0.392922
						if( smoothK_k > 2.05756 )
							if( rsi1 <= 29.9749 )
								if( k <= 9.44361 )
									ret := -0.668780
								if( k > 9.44361 )
									ret := -0.898089 // sell
							if( rsi1 > 29.9749 )
								if( smoothD_d <= -1.22483 )
									ret := 0.076923
								if( smoothD_d > -1.22483 )
									ret := -0.550415
					if( rsi1 > 41.3598 )
						if( d <= 3.83255 )
							if( smoothD_d <= -1.0173 )
								if( smoothD_d <= -1.25249 )
									ret := -0.201389
								if( smoothD_d > -1.25249 )
									ret := 0.160377
							if( smoothD_d > -1.0173 )
								if( smoothK_k <= 3.80471 )
									ret := -0.340599
								if( smoothK_k > 3.80471 )
									ret := -0.103627
						if( d > 3.83255 )
							if( d_k <= -3.0163 )
								if( k <= 8.19006 )
									ret := -1.000000 // sell
								if( k > 8.19006 )
									ret := -0.280193
							if( d_k > -3.0163 )
								if( k <= 1.12699 )
									ret := -0.329341
								if( k > 1.12699 )
									ret := 0.132432
			if( smoothD_d > 2.35985 )
				if( rsi1 <= 49.5515 )
					if( k <= 15.3466 )
						if( d <= 10.544 )
							if( rsi1 <= 48.5877 )
								if( d <= 9.64452 )
									ret := -0.272369
								if( d > 9.64452 )
									ret := -0.147561
							if( rsi1 > 48.5877 )
								if( smoothD_d <= 3.90636 )
									ret := -0.200000
								if( smoothD_d > 3.90636 )
									ret := -0.859155 // sell
						if( d > 10.544 )
							if( smoothK_k <= 6.83515 )
								if( rsi1 <= 33.405 )
									ret := -0.435028
								if( rsi1 > 33.405 )
									ret := -0.689076
							if( smoothK_k > 6.83515 )
								if( smoothK_k <= 7.20303 )
									ret := 0.782609 // buy
								if( smoothK_k > 7.20303 )
									ret := -0.395604
					if( k > 15.3466 )
						if( smoothK_k <= 13.2597 )
							if( d_k <= -5.41703 )
								if( d_k <= -9.51982 )
									ret := -0.214286
								if( d_k > -9.51982 )
									ret := -0.718045 // sell
							if( d_k > -5.41703 )
								if( d_k <= -4.97331 )
									ret := 0.000000
								if( d_k > -4.97331 )
									ret := -0.550000
						if( smoothK_k > 13.2597 )
							if( k <= 17.0277 )
								if( d <= 9.9494 )
									ret := 0.030928
								if( d > 9.9494 )
									ret := -0.437500
							if( k > 17.0277 )
								if( rsi1 <= 29.4987 )
									ret := -0.088000
								if( rsi1 > 29.4987 )
									ret := -0.548209
				if( rsi1 > 49.5515 )
					if( d <= 10.1929 )
						if( rsi1 <= 68.5342 )
							if( d_k <= -8.39133 )
								if( rsi1 <= 56.2754 )
									ret := -0.133333
								if( rsi1 > 56.2754 )
									ret := 0.288136
							if( d_k > -8.39133 )
								if( smoothK_k <= 13.3049 )
									ret := -0.186222
								if( smoothK_k > 13.3049 )
									ret := -0.692308
						if( rsi1 > 68.5342 )
							if( smoothK_k <= 4.7219 )
								if( d_k <= 4.39732 )
									ret := 0.833333 // buy
								if( d_k > 4.39732 )
									ret := 1.000000 // buy
							if( smoothK_k > 4.7219 )
								ret := 0.000000
					if( d > 10.1929 )
						if( d_k <= 0.091075 )
							if( d_k <= -0.935134 )
								if( smoothK_k <= 14.9385 )
									ret := 0.350877
								if( smoothK_k > 14.9385 )
									ret := 0.066667
							if( d_k > -0.935134 )
								ret := 0.814815 // buy
						if( d_k > 0.091075 )
							if( rsi1 <= 50.7623 )
								if( smoothK_k <= 2.92952 )
									ret := -0.214286
								if( smoothK_k > 2.92952 )
									ret := -0.794118 // sell
							if( rsi1 > 50.7623 )
								if( smoothK_k <= -2.6822 )
									ret := 0.941176 // buy
								if( smoothK_k > -2.6822 )
									ret := -0.203390
		if( smoothD_d > 8.36414 )
			if( smoothD_d <= 20.5924 )
				if( smoothK_k <= 4.78692 )
					if( rsi1 <= 35.4329 )
						if( d_k <= 14.4624 )
							if( d_k <= 10.9521 )
								if( k <= 6.33645 )
									ret := -0.392086
								if( k > 6.33645 )
									ret := -0.658635
							if( d_k > 10.9521 )
								if( d_k <= 12.8282 )
									ret := 0.012821
								if( d_k > 12.8282 )
									ret := -0.400000
						if( d_k > 14.4624 )
							if( d_k <= 16.1924 )
								if( smoothD_d <= 12.2131 )
									ret := -0.346154
								if( smoothD_d > 12.2131 )
									ret := -0.833333 // sell
							if( d_k > 16.1924 )
								if( smoothD_d <= 14.5715 )
									ret := 0.114286
								if( smoothD_d > 14.5715 )
									ret := -0.623457
					if( rsi1 > 35.4329 )
						if( smoothD_d <= 12.8733 )
							if( k <= 7.66911 )
								if( d <= 11.8402 )
									ret := 0.090909
								if( d > 11.8402 )
									ret := -0.154131
							if( k > 7.66911 )
								if( smoothK_k <= 4.73694 )
									ret := -0.875000 // sell
								if( smoothK_k > 4.73694 )
									ret := -0.750000 // sell
						if( smoothD_d > 12.8733 )
							if( d <= 22.8605 )
								if( k <= 0.009495 )
									ret := -0.165468
								if( k > 0.009495 )
									ret := -0.394243
							if( d > 22.8605 )
								if( rsi1 <= 49.709 )
									ret := 0.615385
								if( rsi1 > 49.709 )
									ret := -0.344828
				if( smoothK_k > 4.78692 )
					if( d_k <= 11.2642 )
						if( d_k <= -15.7657 )
							if( smoothK_k <= 30.6503 )
								if( rsi1 <= 43.8578 )
									ret := -0.218750
								if( rsi1 > 43.8578 )
									ret := 0.563025
							if( smoothK_k > 30.6503 )
								if( k <= 42.8422 )
									ret := -0.190871
								if( k > 42.8422 )
									ret := 0.371795
						if( d_k > -15.7657 )
							if( rsi1 <= 34.781 )
								if( d <= 19.8974 )
									ret := -0.377296
								if( d > 19.8974 )
									ret := -0.252083
							if( rsi1 > 34.781 )
								if( rsi1 <= 47.9644 )
									ret := -0.147282
								if( rsi1 > 47.9644 )
									ret := 0.015006
					if( d_k > 11.2642 )
						if( smoothK_k <= 5.24552 )
							if( d <= 19.8668 )
								ret := -0.812500 // sell
							if( d > 19.8668 )
								if( d_k <= 13.7564 )
									ret := 0.884615 // buy
								if( d_k > 13.7564 )
									ret := -0.545455
						if( smoothK_k > 5.24552 )
							if( d <= 22.5886 )
								if( k <= 8.80771 )
									ret := -0.500000
								if( k > 8.80771 )
									ret := -0.814815 // sell
							if( d > 22.5886 )
								if( d_k <= 14.093 )
									ret := -0.397727
								if( d_k > 14.093 )
									ret := 0.277778
			if( smoothD_d > 20.5924 )
				if( k <= 31.9266 )
					if( d_k <= 4.95275 )
						if( k <= 20.7026 )
							if( d <= 23.7141 )
								ret := 0.250000
							if( d > 23.7141 )
								if( d_k <= 4.11647 )
									ret := 0.782609 // buy
								if( d_k > 4.11647 )
									ret := 0.491803
						if( k > 20.7026 )
							if( rsi1 <= 44.1488 )
								if( d <= 28.8623 )
									ret := -0.183696
								if( d > 28.8623 )
									ret := -0.430952
							if( rsi1 > 44.1488 )
								if( rsi1 <= 57.2179 )
									ret := 0.003559
								if( rsi1 > 57.2179 )
									ret := 0.330798
					if( d_k > 4.95275 )
						if( d <= 61.2945 )
							if( k <= 12.9374 )
								if( rsi1 <= 41.3757 )
									ret := -0.503090
								if( rsi1 > 41.3757 )
									ret := -0.099379
							if( k > 12.9374 )
								if( smoothD_d <= 27.2943 )
									ret := -0.091298
								if( smoothD_d > 27.2943 )
									ret := -0.206681
						if( d > 61.2945 )
							if( rsi1 <= 32.1495 )
								ret := 0.833333 // buy
							if( rsi1 > 32.1495 )
								ret := -0.444444
				if( k > 31.9266 )
					if( rsi1 <= 73.1163 )
						if( d_k <= 2.49959 )
							if( rsi1 <= 30.1397 )
								if( d_k <= -4.36064 )
									ret := -0.412811
								if( d_k > -4.36064 )
									ret := 0.189024
							if( rsi1 > 30.1397 )
								if( smoothK_k <= 29.607 )
									ret := 0.403846
								if( smoothK_k > 29.607 )
									ret := 0.041639
						if( d_k > 2.49959 )
							if( smoothK_k <= 39.5286 )
								if( smoothD_d <= 51.1054 )
									ret := -0.172840
								if( smoothD_d > 51.1054 )
									ret := 0.025605
							if( smoothK_k > 39.5286 )
								if( d <= 58.1915 )
									ret := -0.448819
								if( d > 58.1915 )
									ret := -0.141732
					if( rsi1 > 73.1163 )
						if( d <= 65.6627 )
							if( d <= 59.7371 )
								if( d_k <= 7.84242 )
									ret := 0.465517
								if( d_k > 7.84242 )
									ret := 0.862745 // buy
							if( d > 59.7371 )
								ret := -0.200000
						if( d > 65.6627 )
							ret := 1.000000 // buy
	if( smoothK_k > 41.5861 )
		if( smoothK_k <= 74.7824 )
			if( rsi1 <= 52.7606 )
				if( smoothD_d <= 24.9538 )
					if( d <= 25.1653 )
						if( smoothK_k <= 42.9246 )
							if( smoothK_k <= 42.4274 )
								if( k <= 45.1043 )
									ret := 0.250000
								if( k > 45.1043 )
									ret := -0.785714 // sell
							if( smoothK_k > 42.4274 )
								ret := 0.866667 // buy
						if( smoothK_k > 42.9246 )
							if( k <= 48.3774 )
								if( rsi1 <= 41.3467 )
									ret := -0.692308
								if( rsi1 > 41.3467 )
									ret := -0.117647
							if( k > 48.3774 )
								ret := -0.769231 // sell
					if( d > 25.1653 )
						if( smoothK_k <= 43.7876 )
							if( d_k <= -19.0067 )
								if( k <= 45.809 )
									ret := -0.800000 // sell
								if( k > 45.809 )
									ret := -0.968750 // sell
							if( d_k > -19.0067 )
								ret := -0.600000
						if( smoothK_k > 43.7876 )
							if( d_k <= -20.906 )
								if( smoothK_k <= 46.1383 )
									ret := -0.208333
								if( smoothK_k > 46.1383 )
									ret := -0.545455
							if( d_k > -20.906 )
								ret := -0.800000 // sell
				if( smoothD_d > 24.9538 )
					if( smoothD_d <= 54.5394 )
						if( rsi1 <= 39.6206 )
							if( smoothD_d <= 52.5141 )
								if( rsi1 <= 28.2691 )
									ret := -0.311355
								if( rsi1 > 28.2691 )
									ret := -0.061698
							if( smoothD_d > 52.5141 )
								if( d_k <= 4.32278 )
									ret := 0.373626
								if( d_k > 4.32278 )
									ret := -0.411765
						if( rsi1 > 39.6206 )
							if( smoothD_d <= 29.7288 )
								if( smoothK_k <= 42.5478 )
									ret := -0.750000 // sell
								if( smoothK_k > 42.5478 )
									ret := -0.018587
							if( smoothD_d > 29.7288 )
								if( k <= 65.4893 )
									ret := 0.073497
								if( k > 65.4893 )
									ret := 0.206024
					if( smoothD_d > 54.5394 )
						if( d <= 74.1245 )
							if( k <= 75.372 )
								if( d_k <= -8.20122 )
									ret := 0.112676
								if( d_k > -8.20122 )
									ret := -0.132623
							if( k > 75.372 )
								if( d_k <= -4.63256 )
									ret := 0.085409
								if( d_k > -4.63256 )
									ret := 0.416667
						if( d > 74.1245 )
							if( d_k <= 10.1078 )
								if( k <= 73.3307 )
									ret := 0.012295
								if( k > 73.3307 )
									ret := -0.175355
							if( d_k > 10.1078 )
								if( rsi1 <= 50.1023 )
									ret := 0.055039
								if( rsi1 > 50.1023 )
									ret := 0.428571
			if( rsi1 > 52.7606 )
				if( rsi1 <= 65.5316 )
					if( d_k <= -25.4017 )
						if( d <= 49.0453 )
							if( k <= 52.088 )
								ret := -0.750000 // sell
							if( k > 52.088 )
								if( rsi1 <= 64.4982 )
									ret := -0.011236
								if( rsi1 > 64.4982 )
									ret := -0.464286
						if( d > 49.0453 )
							ret := -0.904762 // sell
					if( d_k > -25.4017 )
						if( d_k <= 20.4062 )
							if( d <= 61.4719 )
								if( d_k <= -6.33643 )
									ret := 0.216981
								if( d_k > -6.33643 )
									ret := 0.099890
							if( d > 61.4719 )
								if( smoothD_d <= 71.5885 )
									ret := 0.023923
								if( smoothD_d > 71.5885 )
									ret := 0.185867
						if( d_k > 20.4062 )
							if( d_k <= 28.3243 )
								if( smoothK_k <= 45.34 )
									ret := 0.200000
								if( smoothK_k > 45.34 )
									ret := 0.521008
							if( d_k > 28.3243 )
								ret := 1.000000 // buy
				if( rsi1 > 65.5316 )
					if( d <= 50.3631 )
						if( d <= 31.8174 )
							if( smoothK_k <= 45.7882 )
								if( d <= 28.3031 )
									ret := 0.181818
								if( d > 28.3031 )
									ret := 0.666667
							if( smoothK_k > 45.7882 )
								if( d_k <= -24.3304 )
									ret := 0.538462
								if( d_k > -24.3304 )
									ret := -0.653846
						if( d > 31.8174 )
							if( smoothD_d <= 42.4804 )
								if( k <= 50.6035 )
									ret := 0.398305
								if( k > 50.6035 )
									ret := 0.580977
							if( smoothD_d > 42.4804 )
								if( smoothD_d <= 46.4363 )
									ret := 0.293333
								if( smoothD_d > 46.4363 )
									ret := 0.676471
					if( d > 50.3631 )
						if( d <= 82.3242 )
							if( d <= 57.2279 )
								if( k <= 69.6862 )
									ret := -0.081545
								if( k > 69.6862 )
									ret := 0.571429
							if( d > 57.2279 )
								if( d_k <= 21.1329 )
									ret := 0.209338
								if( d_k > 21.1329 )
									ret := 0.807692 // buy
						if( d > 82.3242 )
							if( k <= 77.2985 )
								if( k <= 71.2607 )
									ret := 0.313253
								if( k > 71.2607 )
									ret := 0.579439
							if( k > 77.2985 )
								if( smoothK_k <= 74.4725 )
									ret := -0.315789
								if( smoothK_k > 74.4725 )
									ret := 0.380952
		if( smoothK_k > 74.7824 )
			if( smoothD_d <= 90.0036 )
				if( d_k <= -7.07916 )
					if( smoothD_d <= 53.3128 )
						if( rsi1 <= 64.8993 )
							if( d_k <= -27.2014 )
								if( k <= 81.2345 )
									ret := -0.494737
								if( k > 81.2345 )
									ret := -0.107527
							if( d_k > -27.2014 )
								if( smoothD_d <= 51.2663 )
									ret := 0.276596
								if( smoothD_d > 51.2663 )
									ret := -0.148936
						if( rsi1 > 64.8993 )
							if( k <= 84.0555 )
								if( smoothD_d <= 48.8715 )
									ret := 0.086957
								if( smoothD_d > 48.8715 )
									ret := 0.214286
							if( k > 84.0555 )
								if( rsi1 <= 65.9704 )
									ret := 1.000000 // buy
								if( rsi1 > 65.9704 )
									ret := 0.916667 // buy
					if( smoothD_d > 53.3128 )
						if( smoothD_d <= 76.9217 )
							if( rsi1 <= 42.2785 )
								if( smoothK_k <= 84.193 )
									ret := 0.026247
								if( smoothK_k > 84.193 )
									ret := -0.318021
							if( rsi1 > 42.2785 )
								if( smoothD_d <= 71.3837 )
									ret := 0.371344
								if( smoothD_d > 71.3837 )
									ret := 0.195409
						if( smoothD_d > 76.9217 )
							if( d_k <= -11.0952 )
								if( smoothK_k <= 90.9878 )
									ret := 0.705556 // buy
								if( smoothK_k > 90.9878 )
									ret := 0.428472
							if( d_k > -11.0952 )
								if( rsi1 <= 58.8668 )
									ret := 0.179954
								if( rsi1 > 58.8668 )
									ret := 0.389395
				if( d_k > -7.07916 )
					if( d_k <= 0.692544 )
						if( rsi1 <= 69.6274 )
							if( d_k <= -0.659576 )
								if( k <= 97.5984 )
									ret := 0.108605
								if( k > 97.5984 )
									ret := 0.418605
							if( d_k > -0.659576 )
								if( smoothD_d <= 76.6298 )
									ret := -0.625000
								if( smoothD_d > 76.6298 )
									ret := -0.090361
						if( rsi1 > 69.6274 )
							if( smoothD_d <= 75.8699 )
								if( d <= 78.4574 )
									ret := 0.200000
								if( d > 78.4574 )
									ret := -0.489796
							if( smoothD_d > 75.8699 )
								if( rsi1 <= 80.5537 )
									ret := 0.387917
								if( rsi1 > 80.5537 )
									ret := 0.140000
					if( d_k > 0.692544 )
						if( d_k <= 10.1769 )
							if( d <= 90.7585 )
								if( rsi1 <= 67.8555 )
									ret := 0.137058
								if( rsi1 > 67.8555 )
									ret := 0.370727
							if( d > 90.7585 )
								if( rsi1 <= 66.5634 )
									ret := 0.313313
								if( rsi1 > 66.5634 )
									ret := 0.575284
						if( d_k > 10.1769 )
							if( d <= 92.2191 )
								if( smoothK_k <= 75.0485 )
									ret := 0.929825 // buy
								if( smoothK_k > 75.0485 )
									ret := 0.556522
							if( d > 92.2191 )
								if( d <= 92.464 )
									ret := -0.444444
								if( d > 92.464 )
									ret := 0.444444
			if( smoothD_d > 90.0036 )
				if( rsi1 <= 58.0754 )
					if( d_k <= 2.32333 )
						if( d <= 97.1234 )
							if( smoothD_d <= 93.5407 )
								if( d_k <= -1.87556 )
									ret := 0.232346
								if( d_k > -1.87556 )
									ret := 0.022071
							if( smoothD_d > 93.5407 )
								if( d_k <= -3.03936 )
									ret := 0.166667
								if( d_k > -3.03936 )
									ret := -0.441441
						if( d > 97.1234 )
							if( k <= 97.5369 )
								if( k <= 95.7918 )
									ret := 0.700000 // buy
								if( k > 95.7918 )
									ret := 0.048000
							if( k > 97.5369 )
								if( rsi1 <= 46.8408 )
									ret := 0.586207
								if( rsi1 > 46.8408 )
									ret := 0.286561
					if( d_k > 2.32333 )
						if( k <= 86.8676 )
							if( rsi1 <= 42.338 )
								if( d <= 93.5159 )
									ret := -0.562500
								if( d > 93.5159 )
									ret := -0.857143 // sell
							if( rsi1 > 42.338 )
								if( k <= 86.6916 )
									ret := 0.269841
								if( k > 86.6916 )
									ret := -0.473684
						if( k > 86.8676 )
							if( d <= 96.0445 )
								if( d_k <= 3.58723 )
									ret := 0.270677
								if( d_k > 3.58723 )
									ret := 0.605187
							if( d > 96.0445 )
								if( d <= 96.6717 )
									ret := -0.179245
								if( d > 96.6717 )
									ret := 0.504386
				if( rsi1 > 58.0754 )
					if( rsi1 <= 77.2273 )
						if( smoothD_d <= 90.2159 )
							if( d_k <= 6.22218 )
								if( smoothK_k <= 85.015 )
									ret := 1.000000 // buy
								if( smoothK_k > 85.015 )
									ret := 0.680851
							if( d_k > 6.22218 )
								ret := 0.105263
						if( smoothD_d > 90.2159 )
							if( d_k <= 0.345951 )
								if( d_k <= -0.94211 )
									ret := 0.443019
								if( d_k > -0.94211 )
									ret := 0.264569
							if( d_k > 0.345951 )
								if( smoothD_d <= 92.218 )
									ret := 0.333986
								if( smoothD_d > 92.218 )
									ret := 0.489269
					if( rsi1 > 77.2273 )
						if( d_k <= 8.44237 )
							if( k <= 98.7677 )
								if( rsi1 <= 91.0102 )
									ret := 0.459897
								if( rsi1 > 91.0102 )
									ret := 0.776224 // buy
							if( k > 98.7677 )
								if( d <= 99.5186 )
									ret := 0.527014
								if( d > 99.5186 )
									ret := 0.717060 // buy
						if( d_k > 8.44237 )
							if( d <= 95.1443 )
								ret := -0.571429
							if( d > 95.1443 )
								ret := 0.333333
	
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
float op_operation = decision_tree_0_XLMUSDT_15Min_99924dd3(smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


