//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: ADBE_15Min_2BS0_ebacc35c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADBE_15Min_2BS0_ebacc35c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADBE_15Min_ebacc35c(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bullPower <= 0.26154 )
		if( d <= 5.30411 )
			if( bbp <= -17.6891 )
				if( bullPower <= -19.0437 )
					if( rsi1 <= 10.2445 )
						ret := 1.000000 // buy
					if( rsi1 > 10.2445 )
						ret := 0.750000 // buy
				if( bullPower > -19.0437 )
					if( d_k <= 2.2735 )
						if( bbm <= 5.88885 )
							if( bbp <= -26.7478 )
								if( bullPower <= -11.103 )
									ret := -0.200000
								if( bullPower > -11.103 )
									ret := 1.000000 // buy
							if( bbp > -26.7478 )
								if( d_k <= -3.23232 )
									ret := 0.500000
								if( d_k > -3.23232 )
									ret := -0.626866
						if( bbm > 5.88885 )
							if( smoothK_k <= -1.01667 )
								if( smoothD_d <= -2.13305 )
									ret := -0.727273 // sell
								if( smoothD_d > -2.13305 )
									ret := -1.000000 // sell
							if( smoothK_k > -1.01667 )
								if( k <= 2.39032 )
									ret := 0.000000
								if( k > 2.39032 )
									ret := -0.809524 // sell
					if( d_k > 2.2735 )
						if( bullPower <= -7.39038 )
							if( bullPower <= -10.1606 )
								ret := 0.666667
							if( bullPower > -10.1606 )
								ret := -0.250000
						if( bullPower > -7.39038 )
							ret := 1.000000 // buy
			if( bbp > -17.6891 )
				if( bullPower <= -3.12861 )
					if( rsi1 <= 6.51915 )
						if( d_k <= 0.260646 )
							if( bullPower <= -3.84343 )
								if( rsi1 <= 2.41235 )
									ret := 0.500000
								if( rsi1 > 2.41235 )
									ret := 0.962963 // buy
							if( bullPower > -3.84343 )
								ret := 0.166667
						if( d_k > 0.260646 )
							ret := 0.000000
					if( rsi1 > 6.51915 )
						if( rsi1 <= 11.6241 )
							if( bearPower <= -8.75319 )
								if( bullPower <= -6.95816 )
									ret := -0.400000
								if( bullPower > -6.95816 )
									ret := -0.941176 // sell
							if( bearPower > -8.75319 )
								if( d <= 0.854865 )
									ret := 0.458333
								if( d > 0.854865 )
									ret := -0.410714
						if( rsi1 > 11.6241 )
							if( bbm <= 0.49385 )
								if( bearPower <= -4.84813 )
									ret := 0.740741 // buy
								if( bearPower > -4.84813 )
									ret := 0.270000
							if( bbm > 0.49385 )
								if( bullPower <= -3.58862 )
									ret := 0.062500
								if( bullPower > -3.58862 )
									ret := 0.329341
				if( bullPower > -3.12861 )
					if( bbm <= 0.077074 )
						if( k <= 7.20724 )
							if( bearPower <= -0.449493 )
								if( bearPower <= -2.00285 )
									ret := 0.064815
								if( bearPower > -2.00285 )
									ret := 0.348837
							if( bearPower > -0.449493 )
								if( smoothK_k <= 3.85875 )
									ret := -0.043478
								if( smoothK_k > 3.85875 )
									ret := 0.714286 // buy
						if( k > 7.20724 )
							if( smoothD_d <= 0.494696 )
								if( k <= 7.74911 )
									ret := 1.000000 // buy
								if( k > 7.74911 )
									ret := -0.090909
							if( smoothD_d > 0.494696 )
								if( bbp <= -0.87422 )
									ret := -0.666667
								if( bbp > -0.87422 )
									ret := -0.181818
					if( bbm > 0.077074 )
						if( bullPower <= 0.144782 )
							if( d_k <= -0.023406 )
								if( bearPower <= -5.46102 )
									ret := 0.339623
								if( bearPower > -5.46102 )
									ret := -0.101397
							if( d_k > -0.023406 )
								if( rsi1 <= 22.6506 )
									ret := 0.154093
								if( rsi1 > 22.6506 )
									ret := -0.020072
						if( bullPower > 0.144782 )
							if( smoothD_d <= -1.11455 )
								if( smoothD_d <= -2.20456 )
									ret := 0.181818
								if( smoothD_d > -2.20456 )
									ret := 0.656250
							if( smoothD_d > -1.11455 )
								if( d_k <= -5.29686 )
									ret := 0.750000 // buy
								if( d_k > -5.29686 )
									ret := 0.032787
		if( d > 5.30411 )
			if( rsi1 <= 28.6837 )
				if( k <= 18.5654 )
					if( k <= 7.94658 )
						if( d_k <= 3.02734 )
							if( bbp <= -23.6344 )
								ret := -1.000000 // sell
							if( bbp > -23.6344 )
								if( rsi1 <= 22.0984 )
									ret := 0.649573
								if( rsi1 > 22.0984 )
									ret := 0.303867
						if( d_k > 3.02734 )
							if( bbm <= 3.20002 )
								if( bbm <= 1.84383 )
									ret := 0.254386
								if( bbm > 1.84383 )
									ret := 0.049834
							if( bbm > 3.20002 )
								if( d_k <= 6.11028 )
									ret := -0.825000 // sell
								if( d_k > 6.11028 )
									ret := -0.053846
					if( k > 7.94658 )
						if( bbm <= 0.572063 )
							if( d_k <= -0.704351 )
								if( k <= 10.7275 )
									ret := 0.611111
								if( k > 10.7275 )
									ret := 0.294521
							if( d_k > -0.704351 )
								if( smoothD_d <= 14.5512 )
									ret := -0.256198
								if( smoothD_d > 14.5512 )
									ret := 0.281250
						if( bbm > 0.572063 )
							if( smoothD_d <= 42.547 )
								if( bullPower <= -9.76879 )
									ret := -0.875000 // sell
								if( bullPower > -9.76879 )
									ret := -0.109047
							if( smoothD_d > 42.547 )
								ret := 1.000000 // buy
				if( k > 18.5654 )
					if( bearPower <= -4.38499 )
						if( d <= 89.002 )
							if( d_k <= -6.63204 )
								if( rsi1 <= 25.8643 )
									ret := -0.322835
								if( rsi1 > 25.8643 )
									ret := 0.243243
							if( d_k > -6.63204 )
								if( bbm <= 6.66172 )
									ret := 0.188259
								if( bbm > 6.66172 )
									ret := -0.500000
						if( d > 89.002 )
							if( rsi1 <= 26.739 )
								if( smoothD_d <= 93.7001 )
									ret := 0.666667
								if( smoothD_d > 93.7001 )
									ret := 1.000000 // buy
							if( rsi1 > 26.739 )
								ret := 1.000000 // buy
					if( bearPower > -4.38499 )
						if( smoothD_d <= 29.1058 )
							if( bullPower <= -1.06484 )
								if( bearPower <= -3.23783 )
									ret := 0.292308
								if( bearPower > -3.23783 )
									ret := 0.613636
							if( bullPower > -1.06484 )
								if( d_k <= -5.18055 )
									ret := 0.454545
								if( d_k > -5.18055 )
									ret := 0.060000
						if( smoothD_d > 29.1058 )
							if( bullPower <= -2.43918 )
								if( smoothD_d <= 48.1962 )
									ret := 0.340909
								if( smoothD_d > 48.1962 )
									ret := 0.838710 // buy
							if( bullPower > -2.43918 )
								if( bearPower <= -2.38152 )
									ret := 0.008696
								if( bearPower > -2.38152 )
									ret := 0.234266
			if( rsi1 > 28.6837 )
				if( bbm <= 0.06887 )
					if( bullPower <= -0.380966 )
						if( bearPower <= -7.91859 )
							if( smoothK_k <= 24.9354 )
								ret := -0.500000
							if( smoothK_k > 24.9354 )
								ret := -1.000000 // sell
						if( bearPower > -7.91859 )
							if( d_k <= 11.4906 )
								if( smoothD_d <= 18.4964 )
									ret := 0.121739
								if( smoothD_d > 18.4964 )
									ret := 0.342730
							if( d_k > 11.4906 )
								if( smoothD_d <= 74.5822 )
									ret := 0.076482
								if( smoothD_d > 74.5822 )
									ret := 0.343750
					if( bullPower > -0.380966 )
						if( d_k <= 1.86862 )
							if( bullPower <= -0.027875 )
								if( rsi1 <= 37.7179 )
									ret := -0.100000
								if( rsi1 > 37.7179 )
									ret := 0.149362
							if( bullPower > -0.027875 )
								if( rsi1 <= 53.8824 )
									ret := -0.114219
								if( rsi1 > 53.8824 )
									ret := 0.037879
						if( d_k > 1.86862 )
							if( rsi1 <= 71.4993 )
								if( bbp <= -0.746151 )
									ret := -0.529412
								if( bbp > -0.746151 )
									ret := 0.170464
							if( rsi1 > 71.4993 )
								if( bullPower <= 0.112574 )
									ret := 0.000000
								if( bullPower > 0.112574 )
									ret := -0.520000
				if( bbm > 0.06887 )
					if( bullPower <= -1.38819 )
						if( bullPower <= -5.89776 )
							if( d <= 50.504 )
								if( d_k <= 3.68208 )
									ret := 0.214286
								if( d_k > 3.68208 )
									ret := 0.846154 // buy
							if( d > 50.504 )
								if( bullPower <= -6.73584 )
									ret := -1.000000 // sell
								if( bullPower > -6.73584 )
									ret := -0.200000
						if( bullPower > -5.89776 )
							if( smoothK_k <= 35.9508 )
								if( k <= 12.5936 )
									ret := 0.049159
								if( k > 12.5936 )
									ret := -0.122151
							if( smoothK_k > 35.9508 )
								if( d_k <= 12.422 )
									ret := 0.135903
								if( d_k > 12.422 )
									ret := -0.153465
					if( bullPower > -1.38819 )
						if( k <= 80.7179 )
							if( smoothK_k <= 30.2744 )
								if( smoothK_k <= 5.27925 )
									ret := 0.146747
								if( smoothK_k > 5.27925 )
									ret := 0.037678
							if( smoothK_k > 30.2744 )
								if( rsi1 <= 53.7571 )
									ret := 0.148892
								if( rsi1 > 53.7571 )
									ret := 0.020319
						if( k > 80.7179 )
							if( rsi1 <= 40.1519 )
								if( d <= 66.2083 )
									ret := -0.729730 // sell
								if( d > 66.2083 )
									ret := -0.070136
							if( rsi1 > 40.1519 )
								if( bbp <= -6.0425 )
									ret := 0.571429
								if( bbp > -6.0425 )
									ret := 0.034747
	if( bullPower > 0.26154 )
		if( bearPower <= 2.76508 )
			if( bbm <= 0.098704 )
				if( smoothD_d <= 59.0771 )
					if( d_k <= -1.01272 )
						if( bbm <= 0.003555 )
							if( rsi1 <= 59.4442 )
								if( d <= 40.0313 )
									ret := -0.162437
								if( d > 40.0313 )
									ret := 0.030303
							if( rsi1 > 59.4442 )
								if( bearPower <= 1.23428 )
									ret := -0.339207
								if( bearPower > 1.23428 )
									ret := -0.161677
						if( bbm > 0.003555 )
							if( d_k <= -12.3472 )
								if( smoothK_k <= 70.2644 )
									ret := -0.738636 // sell
								if( smoothK_k > 70.2644 )
									ret := -0.153846
							if( d_k > -12.3472 )
								if( d <= 56.0875 )
									ret := -0.235294
								if( d > 56.0875 )
									ret := -0.937500 // sell
					if( d_k > -1.01272 )
						if( smoothD_d <= 0.175679 )
							if( smoothD_d <= -0.812668 )
								if( rsi1 <= 49.9924 )
									ret := -0.666667
								if( rsi1 > 49.9924 )
									ret := 0.100000
							if( smoothD_d > -0.812668 )
								if( d_k <= 0.631156 )
									ret := -0.750000 // sell
								if( d_k > 0.631156 )
									ret := -1.000000 // sell
						if( smoothD_d > 0.175679 )
							if( rsi1 <= 64.5778 )
								if( d <= 51.6523 )
									ret := 0.115632
								if( d > 51.6523 )
									ret := -0.125000
							if( rsi1 > 64.5778 )
								if( bearPower <= 1.27433 )
									ret := -0.291667
								if( bearPower > 1.27433 )
									ret := 0.084507
				if( smoothD_d > 59.0771 )
					if( smoothD_d <= 64.5539 )
						if( bbm <= 0.004288 )
							if( bbm <= 3.7e-05 )
								if( d_k <= 3.48692 )
									ret := 0.244755
								if( d_k > 3.48692 )
									ret := -0.092593
							if( bbm > 3.7e-05 )
								ret := -0.833333 // sell
						if( bbm > 0.004288 )
							if( smoothK_k <= 69.0422 )
								if( smoothD_d <= 61.8729 )
									ret := 0.266667
								if( smoothD_d > 61.8729 )
									ret := 0.777778 // buy
							if( smoothK_k > 69.0422 )
								if( d <= 63.8154 )
									ret := 1.000000 // buy
								if( d > 63.8154 )
									ret := -0.384615
					if( smoothD_d > 64.5539 )
						if( d_k <= 14.9959 )
							if( smoothK_k <= 68.4387 )
								if( k <= 54.7684 )
									ret := 0.714286 // buy
								if( k > 54.7684 )
									ret := -0.269388
							if( smoothK_k > 68.4387 )
								if( d_k <= 7.40283 )
									ret := -0.054554
								if( d_k > 7.40283 )
									ret := 0.324324
						if( d_k > 14.9959 )
							if( d_k <= 23.7238 )
								if( d <= 82.2294 )
									ret := 0.578947
								if( d > 82.2294 )
									ret := -0.250000
							if( d_k > 23.7238 )
								if( bullPower <= 0.919174 )
									ret := 0.250000
								if( bullPower > 0.919174 )
									ret := -0.750000 // sell
			if( bbm > 0.098704 )
				if( rsi1 <= 27.9048 )
					if( bullPower <= 1.31227 )
						if( rsi1 <= 22.6331 )
							if( d <= 5.9617 )
								if( k <= 3.36199 )
									ret := 0.250000
								if( k > 3.36199 )
									ret := 0.833333 // buy
							if( d > 5.9617 )
								if( smoothD_d <= 42.8081 )
									ret := -0.689655
								if( smoothD_d > 42.8081 )
									ret := 0.000000
						if( rsi1 > 22.6331 )
							if( smoothK_k <= 15.5164 )
								if( bullPower <= 1.05025 )
									ret := 0.179104
								if( bullPower > 1.05025 )
									ret := -0.625000
							if( smoothK_k > 15.5164 )
								if( d <= 83.6767 )
									ret := 0.607843
								if( d > 83.6767 )
									ret := -0.600000
					if( bullPower > 1.31227 )
						if( rsi1 <= 19.2679 )
							if( smoothD_d <= 6.6491 )
								if( k <= 3.71915 )
									ret := -0.250000
								if( k > 3.71915 )
									ret := 0.777778 // buy
							if( smoothD_d > 6.6491 )
								if( bbp <= -2.28334 )
									ret := -1.000000 // sell
								if( bbp > -2.28334 )
									ret := -0.400000
						if( rsi1 > 19.2679 )
							if( bearPower <= -12.6282 )
								if( bbp <= -18.2741 )
									ret := 0.571429
								if( bbp > -18.2741 )
									ret := 1.000000 // buy
							if( bearPower > -12.6282 )
								if( bbp <= 1.64185 )
									ret := 0.597015
								if( bbp > 1.64185 )
									ret := -0.500000
				if( rsi1 > 27.9048 )
					if( bearPower <= 0.59125 )
						if( rsi1 <= 45.096 )
							if( smoothD_d <= 73.4802 )
								if( smoothD_d <= 17.2971 )
									ret := 0.035469
								if( smoothD_d > 17.2971 )
									ret := 0.121040
							if( smoothD_d > 73.4802 )
								if( smoothD_d <= 76.9081 )
									ret := -0.427184
								if( smoothD_d > 76.9081 )
									ret := -0.027473
						if( rsi1 > 45.096 )
							if( smoothD_d <= 71.8176 )
								if( d_k <= -10.6036 )
									ret := -0.076180
								if( d_k > -10.6036 )
									ret := 0.011365
							if( smoothD_d > 71.8176 )
								if( bullPower <= 8.86196 )
									ret := 0.047028
								if( bullPower > 8.86196 )
									ret := -0.717949 // sell
					if( bearPower > 0.59125 )
						if( rsi1 <= 93.9915 )
							if( d_k <= -26.1998 )
								if( d <= 40.4505 )
									ret := 0.116279
								if( d > 40.4505 )
									ret := -0.275641
							if( d_k > -26.1998 )
								if( bbm <= 1.84024 )
									ret := 0.052195
								if( bbm > 1.84024 )
									ret := 0.128946
						if( rsi1 > 93.9915 )
							if( bbp <= 2.59159 )
								if( bbp <= 1.75382 )
									ret := 0.250000
								if( bbp > 1.75382 )
									ret := 0.500000
							if( bbp > 2.59159 )
								if( d_k <= -0.157699 )
									ret := -0.181818
								if( d_k > -0.157699 )
									ret := -0.720930 // sell
		if( bearPower > 2.76508 )
			if( bbp <= 14.1918 )
				if( d <= 76.9268 )
					if( k <= 10.0601 )
						if( bbm <= 0.380147 )
							if( smoothD_d <= 1.89067 )
								ret := 0.500000
							if( smoothD_d > 1.89067 )
								ret := 0.000000
						if( bbm > 0.380147 )
							if( smoothK_k <= -0.537592 )
								ret := 0.750000 // buy
							if( smoothK_k > -0.537592 )
								ret := 1.000000 // buy
					if( k > 10.0601 )
						if( k <= 69.9607 )
							if( bbm <= 2.10158 )
								if( bbp <= 7.41679 )
									ret := -0.186747
								if( bbp > 7.41679 )
									ret := -0.449827
							if( bbm > 2.10158 )
								if( k <= 52.4775 )
									ret := 0.181818
								if( k > 52.4775 )
									ret := -0.243590
						if( k > 69.9607 )
							if( rsi1 <= 83.1391 )
								if( bbm <= 3.20462 )
									ret := 0.034483
								if( bbm > 3.20462 )
									ret := -0.391304
							if( rsi1 > 83.1391 )
								if( bbm <= 1.82745 )
									ret := -0.655172
								if( bbm > 1.82745 )
									ret := 0.333333
				if( d > 76.9268 )
					if( d_k <= 6.47203 )
						if( bullPower <= 6.31836 )
							if( k <= 95.1789 )
								if( bullPower <= 5.07466 )
									ret := -0.328076
								if( bullPower > 5.07466 )
									ret := -0.020725
							if( k > 95.1789 )
								if( d_k <= 1.50164 )
									ret := 0.005517
								if( d_k > 1.50164 )
									ret := -0.393939
						if( bullPower > 6.31836 )
							if( rsi1 <= 68.0783 )
								if( bearPower <= 3.45175 )
									ret := 0.000000
								if( bearPower > 3.45175 )
									ret := -0.721311 // sell
							if( rsi1 > 68.0783 )
								if( bbp <= 11.2081 )
									ret := -0.110294
								if( bbp > 11.2081 )
									ret := 0.320872
					if( d_k > 6.47203 )
						if( bullPower <= 4.04169 )
							if( d_k <= 10.3662 )
								if( d <= 85.321 )
									ret := 0.400000
								if( d > 85.321 )
									ret := 0.000000
							if( d_k > 10.3662 )
								ret := -0.571429
						if( bullPower > 4.04169 )
							if( bbm <= 4.77303 )
								if( rsi1 <= 71.715 )
									ret := 0.000000
								if( rsi1 > 71.715 )
									ret := 0.761905 // buy
							if( bbm > 4.77303 )
								ret := -0.500000
			if( bbp > 14.1918 )
				if( rsi1 <= 68.9389 )
					if( d <= 80.0734 )
						if( bbm <= 4.57639 )
							if( smoothD_d <= 44.4022 )
								if( d_k <= -9.35612 )
									ret := -1.000000 // sell
								if( d_k > -9.35612 )
									ret := -0.750000 // sell
							if( smoothD_d > 44.4022 )
								ret := -0.500000
						if( bbm > 4.57639 )
							if( bearPower <= 4.56629 )
								ret := -1.000000 // sell
							if( bearPower > 4.56629 )
								if( bullPower <= 10.7892 )
									ret := 1.000000 // buy
								if( bullPower > 10.7892 )
									ret := 0.250000
					if( d > 80.0734 )
						ret := -1.000000 // sell
				if( rsi1 > 68.9389 )
					if( d_k <= -17.0786 )
						if( bbp <= 19.1677 )
							if( bullPower <= 8.27296 )
								ret := -0.833333 // sell
							if( bullPower > 8.27296 )
								if( rsi1 <= 73.1768 )
									ret := 0.857143 // buy
								if( rsi1 > 73.1768 )
									ret := -0.166667
						if( bbp > 19.1677 )
							if( d_k <= -24.1597 )
								ret := 0.750000 // buy
							if( d_k > -24.1597 )
								ret := 1.000000 // buy
					if( d_k > -17.0786 )
						if( smoothD_d <= 95.771 )
							if( smoothD_d <= 80.2107 )
								if( bullPower <= 11.0321 )
									ret := -0.470588
								if( bullPower > 11.0321 )
									ret := -0.900000 // sell
							if( smoothD_d > 80.2107 )
								if( d_k <= -8.10038 )
									ret := 0.650000
								if( d_k > -8.10038 )
									ret := -0.100592
						if( smoothD_d > 95.771 )
							if( smoothK_k <= 96.8696 )
								if( d <= 99.8512 )
									ret := -0.542857
								if( d > 99.8512 )
									ret := 0.125000
							if( smoothK_k > 96.8696 )
								if( bbm <= 6.83774 )
									ret := -0.771930 // sell
								if( bbm > 6.83774 )
									ret := 0.500000
	
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
float op_operation = decision_tree_0_ADBE_15Min_ebacc35c(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


