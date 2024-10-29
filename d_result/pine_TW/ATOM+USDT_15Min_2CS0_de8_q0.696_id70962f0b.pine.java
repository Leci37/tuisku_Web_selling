//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: ATOMUSDT_15Min_2CS0_70962f0b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2CS0_70962f0b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_70962f0b(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 30.1642 )
		if( d <= 15.3807 )
			if( mf <= -0.124549 )
				if( rsi1 <= 27.831 )
					if( ad_mf <= -22651.6 )
						if( d_k <= -1.20741 )
							if( d <= 13.7913 )
								if( d_k <= -2.13042 )
									ret := -0.386598
								if( d_k > -2.13042 )
									ret := -0.867647 // sell
							if( d > 13.7913 )
								if( mf <= -0.203444 )
									ret := 0.250000
								if( mf > -0.203444 )
									ret := 0.846154 // buy
						if( d_k > -1.20741 )
							if( ad_mf <= -24894.3 )
								if( d_k <= -0.920009 )
									ret := 0.606061
								if( d_k > -0.920009 )
									ret := -0.167558
							if( ad_mf > -24894.3 )
								if( ad_mf <= -22965.4 )
									ret := 0.333333
								if( ad_mf > -22965.4 )
									ret := 0.925926 // buy
					if( ad_mf > -22651.6 )
						if( smoothD_d <= 0.065746 )
							if( smoothK_k <= -1.9884 )
								if( rsi1 <= 25.9809 )
									ret := -0.444056
								if( rsi1 > 25.9809 )
									ret := 0.500000
							if( smoothK_k > -1.9884 )
								if( ad_mf <= 6407.96 )
									ret := -0.775000 // sell
								if( ad_mf > 6407.96 )
									ret := -0.376812
						if( smoothD_d > 0.065746 )
							if( mf <= -0.15715 )
								if( k <= 0.423891 )
									ret := -0.034483
								if( k > 0.423891 )
									ret := -0.370412
							if( mf > -0.15715 )
								if( rsi1 <= 25.8511 )
									ret := -0.669388
								if( rsi1 > 25.8511 )
									ret := -0.238095
				if( rsi1 > 27.831 )
					if( smoothK_k <= 3.78696 )
						if( ad_mf <= 10020.6 )
							if( d_k <= -1.93468 )
								if( smoothD_d <= -1.24902 )
									ret := 0.538462
								if( smoothD_d > -1.24902 )
									ret := -0.403226
							if( d_k > -1.93468 )
								if( rsi1 <= 32.7449 )
									ret := 0.056380
								if( rsi1 > 32.7449 )
									ret := 0.233831
						if( ad_mf > 10020.6 )
							if( smoothD_d <= -0.690416 )
								if( ad_mf <= 22004.7 )
									ret := 0.076923
								if( ad_mf > 22004.7 )
									ret := 0.687500
							if( smoothD_d > -0.690416 )
								if( smoothD_d <= 8.74141 )
									ret := -0.223684
								if( smoothD_d > 8.74141 )
									ret := -0.937500 // sell
					if( smoothK_k > 3.78696 )
						if( rsi1 <= 42.5678 )
							if( smoothD_d <= 1.27748 )
								if( rsi1 <= 28.9772 )
									ret := -0.928571 // sell
								if( rsi1 > 28.9772 )
									ret := -0.500000
							if( smoothD_d > 1.27748 )
								if( ad_mf <= 3815.92 )
									ret := -0.301075
								if( ad_mf > 3815.92 )
									ret := -0.088636
						if( rsi1 > 42.5678 )
							if( ad_mf <= 14523.4 )
								if( mf <= -0.162731 )
									ret := -0.025316
								if( mf > -0.162731 )
									ret := 0.225490
							if( ad_mf > 14523.4 )
								if( ad_mf <= 25374 )
									ret := -0.931034 // sell
								if( ad_mf > 25374 )
									ret := -0.133333
			if( mf > -0.124549 )
				if( d <= 7.23301 )
					if( rsi1 <= 36.7512 )
						if( smoothK_k <= -2.99944 )
							if( ad <= -12748.9 )
								if( rsi1 <= 22.9845 )
									ret := -0.550725
								if( rsi1 > 22.9845 )
									ret := -0.126582
							if( ad > -12748.9 )
								if( smoothD_d <= 0.83068 )
									ret := -0.423009
								if( smoothD_d > 0.83068 )
									ret := -0.601227
						if( smoothK_k > -2.99944 )
							if( rsi1 <= 29.165 )
								if( ad <= 21271.4 )
									ret := -0.695792
								if( ad > 21271.4 )
									ret := -0.459302
							if( rsi1 > 29.165 )
								if( mf <= 0.006793 )
									ret := -0.418860
								if( mf > 0.006793 )
									ret := -0.632982
					if( rsi1 > 36.7512 )
						if( ad_mf <= 5775.52 )
							if( ad <= 5239.46 )
								if( mf <= 0.073795 )
									ret := -0.133333
								if( mf > 0.073795 )
									ret := -0.349791
							if( ad > 5239.46 )
								if( mf <= 0.081195 )
									ret := 0.400000
								if( mf > 0.081195 )
									ret := -0.093750
						if( ad_mf > 5775.52 )
							if( d_k <= 1.43535 )
								if( rsi1 <= 48.7866 )
									ret := -0.567251
								if( rsi1 > 48.7866 )
									ret := -0.293515
							if( d_k > 1.43535 )
								if( rsi1 <= 51.7587 )
									ret := -0.392562
								if( rsi1 > 51.7587 )
									ret := 0.142857
				if( d > 7.23301 )
					if( mf <= 0.030449 )
						if( mf <= 0.029586 )
							if( ad <= -41301.7 )
								if( ad <= -42553.5 )
									ret := -0.194245
								if( ad > -42553.5 )
									ret := 0.875000 // buy
							if( ad > -41301.7 )
								if( rsi1 <= 36.585 )
									ret := -0.493372
								if( rsi1 > 36.585 )
									ret := -0.142066
						if( mf > 0.029586 )
							if( d_k <= 0.148643 )
								ret := -0.444444
							if( d_k > 0.148643 )
								ret := 0.708333 // buy
					if( mf > 0.030449 )
						if( mf <= 0.299024 )
							if( rsi1 <= 45.4054 )
								if( rsi1 <= 39.2186 )
									ret := -0.613014
								if( rsi1 > 39.2186 )
									ret := -0.421219
							if( rsi1 > 45.4054 )
								if( rsi1 <= 59.3289 )
									ret := -0.239238
								if( rsi1 > 59.3289 )
									ret := 0.148837
						if( mf > 0.299024 )
							if( ad <= -12077.1 )
								if( ad_mf <= -16467.6 )
									ret := -0.131579
								if( ad_mf > -16467.6 )
									ret := 0.687500
							if( ad > -12077.1 )
								if( mf <= 0.301991 )
									ret := 0.384615
								if( mf > 0.301991 )
									ret := -0.326923
		if( d > 15.3807 )
			if( k <= 9.59996 )
				if( ad <= 4487.41 )
					if( ad_mf <= -41487.1 )
						if( mf <= -0.051761 )
							if( smoothK_k <= 5.67344 )
								if( ad_mf <= -55177.8 )
									ret := 0.088235
								if( ad_mf > -55177.8 )
									ret := 0.769231 // buy
							if( smoothK_k > 5.67344 )
								if( mf <= -0.181983 )
									ret := 0.000000
								if( mf > -0.181983 )
									ret := -0.500000
						if( mf > -0.051761 )
							if( rsi1 <= 56.9835 )
								if( smoothK_k <= -1.09062 )
									ret := 0.000000
								if( smoothK_k > -1.09062 )
									ret := -0.555556
							if( rsi1 > 56.9835 )
								ret := 0.583333
					if( ad_mf > -41487.1 )
						if( rsi1 <= 45.0108 )
							if( ad_mf <= -29390.2 )
								if( ad <= -31856.5 )
									ret := -0.509434
								if( ad > -31856.5 )
									ret := -0.947368 // sell
							if( ad_mf > -29390.2 )
								if( rsi1 <= 35.169 )
									ret := -0.462963
								if( rsi1 > 35.169 )
									ret := -0.273159
						if( rsi1 > 45.0108 )
							if( ad_mf <= -14751.7 )
								if( rsi1 <= 57.2195 )
									ret := -0.534483
								if( rsi1 > 57.2195 )
									ret := 0.057143
							if( ad_mf > -14751.7 )
								if( ad <= -4893.04 )
									ret := 0.214286
								if( ad > -4893.04 )
									ret := -0.048544
				if( ad > 4487.41 )
					if( rsi1 <= 57.5513 )
						if( d_k <= 17.8137 )
							if( rsi1 <= 37.4426 )
								if( rsi1 <= 28.8672 )
									ret := -0.555556
								if( rsi1 > 28.8672 )
									ret := -0.863636 // sell
							if( rsi1 > 37.4426 )
								if( k <= 7.6779 )
									ret := -0.382488
								if( k > 7.6779 )
									ret := -0.734375 // sell
						if( d_k > 17.8137 )
							if( ad_mf <= 5955.01 )
								if( rsi1 <= 38.3273 )
									ret := -0.312500
								if( rsi1 > 38.3273 )
									ret := 0.214286
							if( ad_mf > 5955.01 )
								if( ad_mf <= 6838.46 )
									ret := -0.956522 // sell
								if( ad_mf > 6838.46 )
									ret := -0.376884
					if( rsi1 > 57.5513 )
						if( ad <= 39101.5 )
							if( smoothD_d <= 22.5922 )
								if( ad <= 26185.2 )
									ret := -0.125000
								if( ad > 26185.2 )
									ret := -0.812500 // sell
							if( smoothD_d > 22.5922 )
								ret := 0.666667
						if( ad > 39101.5 )
							if( ad <= 47743.3 )
								ret := 0.571429
							if( ad > 47743.3 )
								ret := -0.111111
			if( k > 9.59996 )
				if( rsi1 <= 46.904 )
					if( ad <= -6127.72 )
						if( rsi1 <= 36.3387 )
							if( ad_mf <= -35436.6 )
								if( ad_mf <= -36118.5 )
									ret := -0.004800
								if( ad_mf > -36118.5 )
									ret := 0.904762 // buy
							if( ad_mf > -35436.6 )
								if( ad_mf <= -6174.09 )
									ret := -0.274799
								if( ad_mf > -6174.09 )
									ret := 0.800000 // buy
						if( rsi1 > 36.3387 )
							if( k <= 29.3594 )
								if( mf <= -0.061962 )
									ret := 0.078910
								if( mf > -0.061962 )
									ret := -0.088393
							if( k > 29.3594 )
								if( d_k <= 3.29234 )
									ret := -0.125000
								if( d_k > 3.29234 )
									ret := -0.575000
					if( ad > -6127.72 )
						if( smoothK_k <= 18.6164 )
							if( mf <= -0.049499 )
								if( rsi1 <= 33.0318 )
									ret := -0.358834
								if( rsi1 > 33.0318 )
									ret := -0.097289
							if( mf > -0.049499 )
								if( d_k <= 4.75663 )
									ret := -0.325265
								if( d_k > 4.75663 )
									ret := -0.481884
						if( smoothK_k > 18.6164 )
							if( d_k <= 10.8828 )
								if( mf <= -0.199662 )
									ret := 0.088968
								if( mf > -0.199662 )
									ret := -0.219882
							if( d_k > 10.8828 )
								if( ad <= 16504.3 )
									ret := -0.279570
								if( ad > 16504.3 )
									ret := -0.717391 // sell
				if( rsi1 > 46.904 )
					if( ad <= 4738.35 )
						if( rsi1 <= 54.5099 )
							if( smoothD_d <= 26.1586 )
								if( smoothD_d <= 24.971 )
									ret := 0.068934
								if( smoothD_d > 24.971 )
									ret := 0.477273
							if( smoothD_d > 26.1586 )
								if( mf <= 0.221765 )
									ret := -0.070652
								if( mf > 0.221765 )
									ret := -0.443182
						if( rsi1 > 54.5099 )
							if( d_k <= 8.30871 )
								if( ad <= -7588.98 )
									ret := 0.449857
								if( ad > -7588.98 )
									ret := 0.093939
							if( d_k > 8.30871 )
								if( ad <= -109052 )
									ret := -1.000000 // sell
								if( ad > -109052 )
									ret := 0.162963
					if( ad > 4738.35 )
						if( ad <= 23781.1 )
							if( k <= 22.3407 )
								if( ad <= 4847.41 )
									ret := -0.875000 // sell
								if( ad > 4847.41 )
									ret := -0.173228
							if( k > 22.3407 )
								if( ad <= 6612.42 )
									ret := -0.213836
								if( ad > 6612.42 )
									ret := 0.054487
						if( ad > 23781.1 )
							if( k <= 25.9471 )
								if( rsi1 <= 56.3609 )
									ret := -0.512535
								if( rsi1 > 56.3609 )
									ret := -0.240506
							if( k > 25.9471 )
								if( mf <= -0.028921 )
									ret := 0.407407
								if( mf > -0.028921 )
									ret := -0.211957
	if( k > 30.1642 )
		if( k <= 80.6244 )
			if( rsi1 <= 50.0479 )
				if( ad <= -3368.03 )
					if( mf <= 0.03333 )
						if( ad_mf <= -54457.9 )
							if( d_k <= 1.19621 )
								if( ad <= -56368.1 )
									ret := 0.382406
								if( ad > -56368.1 )
									ret := 0.879310 // buy
							if( d_k > 1.19621 )
								if( smoothD_d <= 69.5874 )
									ret := -0.101156
								if( smoothD_d > 69.5874 )
									ret := 0.410256
						if( ad_mf > -54457.9 )
							if( ad_mf <= -52367.6 )
								if( k <= 48.6927 )
									ret := -0.450000
								if( k > 48.6927 )
									ret := -0.851852 // sell
							if( ad_mf > -52367.6 )
								if( smoothD_d <= 19.9188 )
									ret := -0.262097
								if( smoothD_d > 19.9188 )
									ret := 0.047403
					if( mf > 0.03333 )
						if( d <= 87.2008 )
							if( d_k <= -3.1917 )
								if( mf <= 0.047614 )
									ret := -0.375000
								if( mf > 0.047614 )
									ret := 0.008097
							if( d_k > -3.1917 )
								if( rsi1 <= 42.9756 )
									ret := -0.328767
								if( rsi1 > 42.9756 )
									ret := -0.103611
						if( d > 87.2008 )
							ret := 0.631579
				if( ad > -3368.03 )
					if( mf <= -0.007703 )
						if( d_k <= -4.05274 )
							if( ad_mf <= 26637.5 )
								if( smoothK_k <= 63.1606 )
									ret := -0.015683
								if( smoothK_k > 63.1606 )
									ret := -0.151090
							if( ad_mf > 26637.5 )
								if( k <= 39.3427 )
									ret := -0.190000
								if( k > 39.3427 )
									ret := 0.308585
						if( d_k > -4.05274 )
							if( rsi1 <= 36.968 )
								if( d_k <= 4.68539 )
									ret := -0.245763
								if( d_k > 4.68539 )
									ret := -0.414729
							if( rsi1 > 36.968 )
								if( smoothD_d <= 73.1152 )
									ret := -0.102736
								if( smoothD_d > 73.1152 )
									ret := 0.083333
					if( mf > -0.007703 )
						if( d_k <= -7.0237 )
							if( smoothD_d <= 23.6233 )
								if( rsi1 <= 33.5275 )
									ret := -0.675676
								if( rsi1 > 33.5275 )
									ret := -0.224551
							if( smoothD_d > 23.6233 )
								if( mf <= 0.013535 )
									ret := -0.264286
								if( mf > 0.013535 )
									ret := -0.009103
						if( d_k > -7.0237 )
							if( ad <= 17492.8 )
								if( rsi1 <= 44.1369 )
									ret := -0.325225
								if( rsi1 > 44.1369 )
									ret := -0.149883
							if( ad > 17492.8 )
								if( ad <= 78703 )
									ret := -0.450461
								if( ad > 78703 )
									ret := -0.058824
			if( rsi1 > 50.0479 )
				if( d_k <= -4.0782 )
					if( ad_mf <= -0.213904 )
						if( smoothK_k <= 61.0506 )
							if( ad_mf <= -9530.28 )
								if( rsi1 <= 64.7026 )
									ret := 0.351662
								if( rsi1 > 64.7026 )
									ret := 0.670968
							if( ad_mf > -9530.28 )
								if( d_k <= -17.6675 )
									ret := 0.005556
								if( d_k > -17.6675 )
									ret := 0.218405
						if( smoothK_k > 61.0506 )
							if( mf <= -0.157093 )
								if( smoothK_k <= 66.881 )
									ret := -0.083333
								if( smoothK_k > 66.881 )
									ret := 0.440000
							if( mf > -0.157093 )
								if( rsi1 <= 55.4164 )
									ret := 0.374439
								if( rsi1 > 55.4164 )
									ret := 0.537409
					if( ad_mf > -0.213904 )
						if( ad_mf <= 48700.9 )
							if( k <= 35.8834 )
								if( ad <= 9756.59 )
									ret := -0.246914
								if( ad > 9756.59 )
									ret := 0.108108
							if( k > 35.8834 )
								if( ad <= 6191.57 )
									ret := 0.107797
								if( ad > 6191.57 )
									ret := 0.202772
						if( ad_mf > 48700.9 )
							if( ad <= 53140.6 )
								if( rsi1 <= 54.0392 )
									ret := 0.166667
								if( rsi1 > 54.0392 )
									ret := -0.805556 // sell
							if( ad > 53140.6 )
								if( smoothD_d <= 58.7557 )
									ret := -0.023529
								if( smoothD_d > 58.7557 )
									ret := -0.327586
				if( d_k > -4.0782 )
					if( k <= 67.4465 )
						if( ad_mf <= 16678.3 )
							if( d <= 43.5742 )
								if( mf <= 0.150556 )
									ret := 0.274301
								if( mf > 0.150556 )
									ret := 0.091205
							if( d > 43.5742 )
								if( rsi1 <= 66.1306 )
									ret := 0.045910
								if( rsi1 > 66.1306 )
									ret := 0.306090
						if( ad_mf > 16678.3 )
							if( ad <= 20347.9 )
								if( mf <= 0.048582 )
									ret := -0.090164
								if( mf > 0.048582 )
									ret := -0.395652
							if( ad > 20347.9 )
								if( smoothD_d <= 34.8604 )
									ret := -0.432203
								if( smoothD_d > 34.8604 )
									ret := -0.013613
					if( k > 67.4465 )
						if( k <= 69.7349 )
							if( d_k <= -0.622048 )
								if( d_k <= -1.20878 )
									ret := 0.074766
								if( d_k > -1.20878 )
									ret := -0.400000
							if( d_k > -0.622048 )
								if( ad <= -4515.13 )
									ret := 0.456081
								if( ad > -4515.13 )
									ret := 0.191532
						if( k > 69.7349 )
							if( ad <= 62355.7 )
								if( ad_mf <= -22315.1 )
									ret := 0.275081
								if( ad_mf > -22315.1 )
									ret := 0.124525
							if( ad > 62355.7 )
								if( ad <= 123343 )
									ret := -0.317241
								if( ad > 123343 )
									ret := 0.250000
		if( k > 80.6244 )
			if( rsi1 <= 61.1115 )
				if( smoothK_k <= 90.7989 )
					if( mf <= -0.100197 )
						if( smoothD_d <= 90.4212 )
							if( mf <= -0.165185 )
								if( ad <= -13958.6 )
									ret := 0.675258
								if( ad > -13958.6 )
									ret := 0.231959
							if( mf > -0.165185 )
								if( ad <= -1543.94 )
									ret := 0.397341
								if( ad > -1543.94 )
									ret := 0.028481
						if( smoothD_d > 90.4212 )
							if( smoothD_d <= 93.3815 )
								if( rsi1 <= 42.5369 )
									ret := 0.140351
								if( rsi1 > 42.5369 )
									ret := 0.655319
							if( smoothD_d > 93.3815 )
								if( smoothK_k <= 89.8394 )
									ret := -0.031250
								if( smoothK_k > 89.8394 )
									ret := 0.428571
					if( mf > -0.100197 )
						if( ad <= 53462.3 )
							if( rsi1 <= 51.2881 )
								if( rsi1 <= 43.0327 )
									ret := -0.216061
								if( rsi1 > 43.0327 )
									ret := 0.012443
							if( rsi1 > 51.2881 )
								if( mf <= 0.129285 )
									ret := 0.200391
								if( mf > 0.129285 )
									ret := -0.059545
						if( ad > 53462.3 )
							if( smoothK_k <= 80.2495 )
								if( smoothD_d <= 75.2448 )
									ret := -0.466667
								if( smoothD_d > 75.2448 )
									ret := -0.837209 // sell
							if( smoothK_k > 80.2495 )
								if( d_k <= -0.356195 )
									ret := -0.250000
								if( d_k > -0.356195 )
									ret := 0.348485
				if( smoothK_k > 90.7989 )
					if( ad <= -4760.75 )
						if( rsi1 <= 48.5218 )
							if( ad <= -50386.3 )
								if( d <= 89.0717 )
									ret := 0.785714 // buy
								if( d > 89.0717 )
									ret := 1.000000 // buy
							if( ad > -50386.3 )
								if( d <= 72.6598 )
									ret := -0.625000
								if( d > 72.6598 )
									ret := 0.151613
						if( rsi1 > 48.5218 )
							if( ad_mf <= -117494 )
								ret := -0.062500
							if( ad_mf > -117494 )
								if( mf <= -0.053506 )
									ret := 0.649153
								if( mf > -0.053506 )
									ret := 0.449649
					if( ad > -4760.75 )
						if( ad_mf <= 20455 )
							if( d <= 90.9314 )
								if( rsi1 <= 48.5198 )
									ret := -0.221344
								if( rsi1 > 48.5198 )
									ret := 0.131119
							if( d > 90.9314 )
								if( smoothD_d <= 91.3423 )
									ret := 0.367677
								if( smoothD_d > 91.3423 )
									ret := 0.217839
						if( ad_mf > 20455 )
							if( k <= 99.9172 )
								if( rsi1 <= 40.7684 )
									ret := -0.171429
								if( rsi1 > 40.7684 )
									ret := 0.551253
							if( k > 99.9172 )
								if( d <= 87.1875 )
									ret := -0.565217
								if( d > 87.1875 )
									ret := 0.315068
			if( rsi1 > 61.1115 )
				if( mf <= 0.164242 )
					if( smoothK_k <= 90.5788 )
						if( ad_mf <= 986.397 )
							if( ad_mf <= -9388.61 )
								if( smoothD_d <= 72.9888 )
									ret := 0.727273 // buy
								if( smoothD_d > 72.9888 )
									ret := 0.376018
							if( ad_mf > -9388.61 )
								if( smoothD_d <= 79.3516 )
									ret := 0.394673
								if( smoothD_d > 79.3516 )
									ret := 0.567241
						if( ad_mf > 986.397 )
							if( smoothD_d <= 88.8618 )
								if( smoothD_d <= 82.0566 )
									ret := 0.234192
								if( smoothD_d > 82.0566 )
									ret := 0.370956
							if( smoothD_d > 88.8618 )
								if( smoothK_k <= 90.0685 )
									ret := 0.541274
								if( smoothK_k > 90.0685 )
									ret := 0.373832
					if( smoothK_k > 90.5788 )
						if( rsi1 <= 70.6312 )
							if( smoothD_d <= 96.499 )
								if( smoothK_k <= 96.7639 )
									ret := 0.504975
								if( smoothK_k > 96.7639 )
									ret := 0.311508
							if( smoothD_d > 96.499 )
								if( mf <= -0.018365 )
									ret := 0.325926
								if( mf > -0.018365 )
									ret := -0.053571
						if( rsi1 > 70.6312 )
							if( ad <= 54490.3 )
								if( smoothK_k <= 96.9909 )
									ret := 0.645067
								if( smoothK_k > 96.9909 )
									ret := 0.502290
							if( ad > 54490.3 )
								if( d_k <= -4.45004 )
									ret := -0.230769
								if( d_k > -4.45004 )
									ret := 0.440000
				if( mf > 0.164242 )
					if( ad <= 209774 )
						if( smoothD_d <= 84.3133 )
							if( k <= 86.7353 )
								if( ad_mf <= 11125.5 )
									ret := 0.201493
								if( ad_mf > 11125.5 )
									ret := -0.008475
							if( k > 86.7353 )
								if( rsi1 <= 76.3788 )
									ret := 0.131579
								if( rsi1 > 76.3788 )
									ret := 0.483146
						if( smoothD_d > 84.3133 )
							if( rsi1 <= 70.9706 )
								if( rsi1 <= 63.1889 )
									ret := -0.023622
								if( rsi1 > 63.1889 )
									ret := 0.187654
							if( rsi1 > 70.9706 )
								if( smoothD_d <= 96.8929 )
									ret := 0.481430
								if( smoothD_d > 96.8929 )
									ret := 0.068627
					if( ad > 209774 )
						if( ad <= 271639 )
							if( smoothD_d <= 86.374 )
								ret := -1.000000 // sell
							if( smoothD_d > 86.374 )
								ret := -0.777778 // sell
						if( ad > 271639 )
							ret := -0.636364
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_ATOMUSDT_15Min_70962f0b(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


