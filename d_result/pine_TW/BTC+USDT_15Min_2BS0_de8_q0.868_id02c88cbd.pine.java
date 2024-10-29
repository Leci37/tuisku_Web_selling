//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Stochastic_RSI
// ID_model: BTCUSDT_15Min_2BS0_02c88cbd Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_BTCUSDT_15Min_2BS0_02c88cbd", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_BTCUSDT_15Min_02c88cbd(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( smoothK_k <= 55.2109 )
		if( rsi1 <= 38.142 )
			if( bullPower <= 37.5765 )
				if( rsi1 <= 24.5808 )
					if( bullPower <= -48.2501 )
						if( bbm <= 107.125 )
							if( d_k <= 2.51725 )
								if( bearPower <= -171.092 )
									ret := -0.259446
								if( bearPower > -171.092 )
									ret := -0.039427
							if( d_k > 2.51725 )
								if( bbp <= -200.001 )
									ret := 0.391304
								if( bbp > -200.001 )
									ret := -0.240000
						if( bbm > 107.125 )
							if( bearPower <= -3176.31 )
								ret := 1.000000 // buy
							if( bearPower > -3176.31 )
								if( d <= 5.68269 )
									ret := -0.493506
								if( d > 5.68269 )
									ret := -0.301872
					if( bullPower > -48.2501 )
						if( d <= 3.74912 )
							if( bullPower <= -6.72184 )
								if( rsi1 <= 22.6601 )
									ret := -0.743017 // sell
								if( rsi1 > 22.6601 )
									ret := -0.428571
							if( bullPower > -6.72184 )
								if( bearPower <= -53.7286 )
									ret := -0.928144 // sell
								if( bearPower > -53.7286 )
									ret := -0.738095 // sell
						if( d > 3.74912 )
							if( bbm <= 44.075 )
								if( bearPower <= -10.3499 )
									ret := -0.242105
								if( bearPower > -10.3499 )
									ret := -0.758621 // sell
							if( bbm > 44.075 )
								if( bbm <= 125.399 )
									ret := -0.601240
								if( bbm > 125.399 )
									ret := -0.359589
				if( rsi1 > 24.5808 )
					if( bullPower <= -72.6324 )
						if( d_k <= -3.86593 )
							if( smoothK_k <= 19.944 )
								if( rsi1 <= 36.0174 )
									ret := -0.448101
								if( rsi1 > 36.0174 )
									ret := 0.156250
							if( smoothK_k > 19.944 )
								if( d_k <= -8.92358 )
									ret := -0.198218
								if( d_k > -8.92358 )
									ret := 0.268293
						if( d_k > -3.86593 )
							if( rsi1 <= 29.0615 )
								if( d_k <= -0.383373 )
									ret := -0.190217
								if( d_k > -0.383373 )
									ret := 0.100955
							if( rsi1 > 29.0615 )
								if( bearPower <= -639.545 )
									ret := 0.446494
								if( bearPower > -639.545 )
									ret := 0.153846
					if( bullPower > -72.6324 )
						if( d_k <= 0.192901 )
							if( smoothD_d <= 14.4925 )
								if( bearPower <= -323.536 )
									ret := -0.729167 // sell
								if( bearPower > -323.536 )
									ret := -0.351403
							if( smoothD_d > 14.4925 )
								if( bbp <= -42.3502 )
									ret := -0.241948
								if( bbp > -42.3502 )
									ret := -0.029674
						if( d_k > 0.192901 )
							if( rsi1 <= 29.7174 )
								if( bearPower <= -220.939 )
									ret := -0.471366
								if( bearPower > -220.939 )
									ret := -0.219554
							if( rsi1 > 29.7174 )
								if( bullPower <= 16.1257 )
									ret := -0.024375
								if( bullPower > 16.1257 )
									ret := -0.279113
			if( bullPower > 37.5765 )
				if( rsi1 <= 28.808 )
					if( bullPower <= 39.8965 )
						if( bullPower <= 39.5402 )
							if( smoothK_k <= 2.57787 )
								ret := -0.142857
							if( smoothK_k > 2.57787 )
								if( bearPower <= -81.6369 )
									ret := -1.000000 // sell
								if( bearPower > -81.6369 )
									ret := -0.714286 // sell
						if( bullPower > 39.5402 )
							ret := 0.250000
					if( bullPower > 39.8965 )
						if( d <= 7.42411 )
							if( d <= 0.000273 )
								if( rsi1 <= 20.0494 )
									ret := -1.000000 // sell
								if( rsi1 > 20.0494 )
									ret := -0.684211
							if( d > 0.000273 )
								if( rsi1 <= 25.8801 )
									ret := -0.976654 // sell
								if( rsi1 > 25.8801 )
									ret := -0.905556 // sell
						if( d > 7.42411 )
							if( d_k <= 3.19058 )
								if( rsi1 <= 26.4994 )
									ret := -0.902439 // sell
								if( rsi1 > 26.4994 )
									ret := -0.333333
							if( d_k > 3.19058 )
								if( smoothD_d <= 61.4227 )
									ret := -0.908257 // sell
								if( smoothD_d > 61.4227 )
									ret := -0.500000
				if( rsi1 > 28.808 )
					if( bearPower <= 12.1895 )
						if( k <= 43.4658 )
							if( bullPower <= 79.7107 )
								if( d <= 3.78585 )
									ret := -0.772222 // sell
								if( d > 3.78585 )
									ret := -0.456916
							if( bullPower > 79.7107 )
								if( BBPower_Color <= 0.5 )
									ret := -0.635484
								if( BBPower_Color > 0.5 )
									ret := -0.803863 // sell
						if( k > 43.4658 )
							if( smoothD_d <= 49.8806 )
								if( bbp <= 51.6427 )
									ret := 0.117647
								if( bbp > 51.6427 )
									ret := 0.692308
							if( smoothD_d > 49.8806 )
								if( bbp <= -93.355 )
									ret := 0.272727
								if( bbp > -93.355 )
									ret := -0.727273 // sell
					if( bearPower > 12.1895 )
						if( k <= 21.6997 )
							if( bullPower <= 317.886 )
								if( d_k <= 5.51403 )
									ret := -0.911538 // sell
								if( d_k > 5.51403 )
									ret := -0.809859 // sell
							if( bullPower > 317.886 )
								ret := -1.000000 // sell
						if( k > 21.6997 )
							if( k <= 28.2728 )
								if( d_k <= 17.4221 )
									ret := -0.714286 // sell
								if( d_k > 17.4221 )
									ret := 0.400000
							if( k > 28.2728 )
								if( d <= 34.9944 )
									ret := -0.250000
								if( d > 34.9944 )
									ret := -0.904762 // sell
		if( rsi1 > 38.142 )
			if( bearPower <= -41.0282 )
				if( rsi1 <= 53.3434 )
					if( bbp <= -137.622 )
						if( bullPower <= -99.7639 )
							if( smoothD_d <= 4.90666 )
								if( rsi1 <= 41.4853 )
									ret := -0.500000
								if( rsi1 > 41.4853 )
									ret := 0.545455
							if( smoothD_d > 4.90666 )
								if( bearPower <= -273.168 )
									ret := 0.644094
								if( bearPower > -273.168 )
									ret := 0.280374
						if( bullPower > -99.7639 )
							if( d <= 26.8747 )
								if( rsi1 <= 42.2995 )
									ret := -0.016568
								if( rsi1 > 42.2995 )
									ret := 0.239501
							if( d > 26.8747 )
								if( bbp <= -181.108 )
									ret := 0.370000
								if( bbp > -181.108 )
									ret := 0.156306
					if( bbp > -137.622 )
						if( bbp <= -4.31424 )
							if( rsi1 <= 45.6315 )
								if( bearPower <= -99.0049 )
									ret := -0.145931
								if( bearPower > -99.0049 )
									ret := 0.020579
							if( rsi1 > 45.6315 )
								if( k <= 6.05782 )
									ret := 0.306533
								if( k > 6.05782 )
									ret := 0.060758
						if( bbp > -4.31424 )
							if( bbm <= 272.937 )
								if( bearPower <= -61.6417 )
									ret := -0.355401
								if( bearPower > -61.6417 )
									ret := -0.141914
							if( bbm > 272.937 )
								if( smoothK_k <= 55.1273 )
									ret := -0.479339
								if( smoothK_k > 55.1273 )
									ret := 1.000000 // buy
				if( rsi1 > 53.3434 )
					if( bbp <= -255.297 )
						if( d_k <= -13.6166 )
							if( rsi1 <= 56.1352 )
								if( rsi1 <= 54.8332 )
									ret := 0.750000 // buy
								if( rsi1 > 54.8332 )
									ret := -0.166667
							if( rsi1 > 56.1352 )
								if( smoothD_d <= 24.1431 )
									ret := 0.600000
								if( smoothD_d > 24.1431 )
									ret := 1.000000 // buy
						if( d_k > -13.6166 )
							if( d <= 54.283 )
								if( smoothD_d <= 31.1268 )
									ret := 0.852941 // buy
								if( smoothD_d > 31.1268 )
									ret := 0.970149 // buy
							if( d > 54.283 )
								ret := 0.250000
					if( bbp > -255.297 )
						if( bbm <= 205.752 )
							if( rsi1 <= 60.0922 )
								if( bullPower <= -74.3521 )
									ret := -1.000000 // sell
								if( bullPower > -74.3521 )
									ret := 0.270219
							if( rsi1 > 60.0922 )
								if( d_k <= -7.39359 )
									ret := 0.701754 // buy
								if( d_k > -7.39359 )
									ret := 0.433862
						if( bbm > 205.752 )
							if( bbp <= 260.219 )
								if( d <= 65.2812 )
									ret := 0.633333
								if( d > 65.2812 )
									ret := -0.047619
							if( bbp > 260.219 )
								if( bbm <= 402.36 )
									ret := 0.937500 // buy
								if( bbm > 402.36 )
									ret := 0.013333
			if( bearPower > -41.0282 )
				if( rsi1 <= 58.7481 )
					if( bbp <= 217.282 )
						if( rsi1 <= 49.9356 )
							if( bullPower <= 35.9327 )
								if( bbm <= 49.835 )
									ret := -0.008072
								if( bbm > 49.835 )
									ret := -0.180498
							if( bullPower > 35.9327 )
								if( bbp <= 69.4438 )
									ret := -0.248107
								if( bbp > 69.4438 )
									ret := -0.467742
						if( rsi1 > 49.9356 )
							if( smoothD_d <= 39.606 )
								if( bbp <= 160.403 )
									ret := -0.046964
								if( bbp > 160.403 )
									ret := -0.339332
							if( smoothD_d > 39.606 )
								if( smoothD_d <= 66.3151 )
									ret := 0.033666
								if( smoothD_d > 66.3151 )
									ret := 0.319149
					if( bbp > 217.282 )
						if( d_k <= -14.8719 )
							if( bbm <= 150.742 )
								if( bullPower <= 183.361 )
									ret := 0.000000
								if( bullPower > 183.361 )
									ret := 0.882353 // buy
							if( bbm > 150.742 )
								if( bullPower <= 443.265 )
									ret := -0.629630
								if( bullPower > 443.265 )
									ret := 0.600000
						if( d_k > -14.8719 )
							if( rsi1 <= 48.3837 )
								if( d_k <= -6.35362 )
									ret := -0.454545
								if( d_k > -6.35362 )
									ret := -0.797398 // sell
							if( rsi1 > 48.3837 )
								if( bearPower <= 80.7371 )
									ret := -0.429523
								if( bearPower > 80.7371 )
									ret := -0.660520
				if( rsi1 > 58.7481 )
					if( bbp <= 635.066 )
						if( rsi1 <= 64.6825 )
							if( bbp <= 262.964 )
								if( bbm <= 168.759 )
									ret := 0.115784
								if( bbm > 168.759 )
									ret := 0.464567
							if( bbp > 262.964 )
								if( bullPower <= 288.432 )
									ret := -0.263456
								if( bullPower > 288.432 )
									ret := -0.010753
						if( rsi1 > 64.6825 )
							if( bbp <= 31.4094 )
								if( bullPower <= 31.896 )
									ret := 0.037500
								if( bullPower > 31.896 )
									ret := -0.290323
							if( bbp > 31.4094 )
								if( bbm <= 191.051 )
									ret := 0.264650
								if( bbm > 191.051 )
									ret := 0.585082
					if( bbp > 635.066 )
						if( rsi1 <= 69.4272 )
							if( d_k <= 20.6345 )
								if( rsi1 <= 67.4044 )
									ret := -0.601831
								if( rsi1 > 67.4044 )
									ret := -0.306122
							if( d_k > 20.6345 )
								if( smoothK_k <= 23.7117 )
									ret := -0.068966
								if( smoothK_k > 23.7117 )
									ret := 0.535714
						if( rsi1 > 69.4272 )
							if( bearPower <= 539.597 )
								if( bullPower <= 467.585 )
									ret := -0.287500
								if( bullPower > 467.585 )
									ret := 0.400000
							if( bearPower > 539.597 )
								if( d_k <= 17.0293 )
									ret := -0.803922 // sell
								if( d_k > 17.0293 )
									ret := 0.000000
	if( smoothK_k > 55.2109 )
		if( bearPower <= -79.1449 )
			if( k <= 85.949 )
				if( bbp <= -258.541 )
					if( rsi1 <= 39.4969 )
						if( bullPower <= -304.182 )
							if( bbm <= 304.776 )
								if( bbp <= -936.848 )
									ret := -0.555556
								if( bbp > -936.848 )
									ret := 0.703704 // buy
							if( bbm > 304.776 )
								if( bbm <= 697.838 )
									ret := 0.821782 // buy
								if( bbm > 697.838 )
									ret := 0.272727
						if( bullPower > -304.182 )
							if( bullPower <= -40.5434 )
								if( rsi1 <= 33.3344 )
									ret := -0.234177
								if( rsi1 > 33.3344 )
									ret := 0.167123
							if( bullPower > -40.5434 )
								if( d_k <= -7.34342 )
									ret := 0.000000
								if( d_k > -7.34342 )
									ret := -0.682353
					if( rsi1 > 39.4969 )
						if( rsi1 <= 45.9374 )
							if( bullPower <= -13.6322 )
								if( d <= 46.8376 )
									ret := 0.131579
								if( d > 46.8376 )
									ret := 0.622505
							if( bullPower > -13.6322 )
								if( bbp <= -398.84 )
									ret := -0.600000
								if( bbp > -398.84 )
									ret := 0.062500
						if( rsi1 > 45.9374 )
							if( d_k <= -28.3014 )
								if( smoothK_k <= 63.3823 )
									ret := -0.500000
								if( smoothK_k > 63.3823 )
									ret := 0.000000
							if( d_k > -28.3014 )
								if( rsi1 <= 56.3579 )
									ret := 0.737265 // buy
								if( rsi1 > 56.3579 )
									ret := 0.915152 // buy
				if( bbp > -258.541 )
					if( rsi1 <= 46.9568 )
						if( bbm <= 181.732 )
							if( rsi1 <= 40.6756 )
								if( d <= 73.4223 )
									ret := -0.208920
								if( d > 73.4223 )
									ret := 0.115183
							if( rsi1 > 40.6756 )
								if( bbp <= -49.2358 )
									ret := 0.194643
								if( bbp > -49.2358 )
									ret := -0.380952
						if( bbm > 181.732 )
							if( smoothK_k <= 80.3468 )
								if( bearPower <= -239.152 )
									ret := -0.777778 // sell
								if( bearPower > -239.152 )
									ret := -0.408946
							if( smoothK_k > 80.3468 )
								if( smoothD_d <= 87.3681 )
									ret := -0.125000
								if( smoothD_d > 87.3681 )
									ret := 0.666667
					if( rsi1 > 46.9568 )
						if( rsi1 <= 53.2142 )
							if( bullPower <= 77.8971 )
								if( bbp <= -191.606 )
									ret := 0.647436
								if( bbp > -191.606 )
									ret := 0.313600
							if( bullPower > 77.8971 )
								if( bearPower <= -95.6668 )
									ret := -0.221622
								if( bearPower > -95.6668 )
									ret := 0.382979
						if( rsi1 > 53.2142 )
							if( bbm <= 590.835 )
								if( rsi1 <= 63.4535 )
									ret := 0.558442
								if( rsi1 > 63.4535 )
									ret := 0.775087 // buy
							if( bbm > 590.835 )
								if( bbm <= 633.59 )
									ret := -0.800000 // sell
								if( bbm > 633.59 )
									ret := 0.358025
			if( k > 85.949 )
				if( rsi1 <= 46.1272 )
					if( bbp <= -98.8133 )
						if( rsi1 <= 37.3215 )
							if( rsi1 <= 33.6604 )
								if( bearPower <= -192.827 )
									ret := -0.457627
								if( bearPower > -192.827 )
									ret := 0.046512
							if( rsi1 > 33.6604 )
								if( bbm <= 365.547 )
									ret := 0.104000
								if( bbm > 365.547 )
									ret := -0.571429
						if( rsi1 > 37.3215 )
							if( bearPower <= -380.542 )
								if( bullPower <= -127.682 )
									ret := 0.700855 // buy
								if( bullPower > -127.682 )
									ret := 0.220779
							if( bearPower > -380.542 )
								if( bbm <= 150.878 )
									ret := 0.411003
								if( bbm > 150.878 )
									ret := 0.057325
					if( bbp > -98.8133 )
						if( bullPower <= 95.7546 )
							if( smoothK_k <= 96.3812 )
								if( rsi1 <= 35.2397 )
									ret := 0.625000
								if( rsi1 > 35.2397 )
									ret := -0.197802
							if( smoothK_k > 96.3812 )
								if( bullPower <= 20.8947 )
									ret := 0.500000
								if( bullPower > 20.8947 )
									ret := 1.000000 // buy
						if( bullPower > 95.7546 )
							if( bbm <= 323.06 )
								if( bbm <= 281.601 )
									ret := -0.857143 // sell
								if( bbm > 281.601 )
									ret := -0.250000
							if( bbm > 323.06 )
								ret := -1.000000 // sell
				if( rsi1 > 46.1272 )
					if( rsi1 <= 56.7922 )
						if( bullPower <= -30.7754 )
							if( bearPower <= -452.886 )
								if( d <= 94.1582 )
									ret := 0.954839 // buy
								if( d > 94.1582 )
									ret := 0.855072 // buy
							if( bearPower > -452.886 )
								if( bearPower <= -444.757 )
									ret := -0.400000
								if( bearPower > -444.757 )
									ret := 0.704893 // buy
						if( bullPower > -30.7754 )
							if( bbp <= -225.761 )
								if( rsi1 <= 49.6714 )
									ret := 0.511628
								if( rsi1 > 49.6714 )
									ret := 0.843972 // buy
							if( bbp > -225.761 )
								if( rsi1 <= 50.3914 )
									ret := 0.025974
								if( rsi1 > 50.3914 )
									ret := 0.309568
					if( rsi1 > 56.7922 )
						if( rsi1 <= 64.7204 )
							if( bbp <= -18.3156 )
								if( bbp <= -154.107 )
									ret := 0.869362 // buy
								if( bbp > -154.107 )
									ret := 0.686120
							if( bbp > -18.3156 )
								if( d <= 95.0857 )
									ret := 0.275168
								if( d > 95.0857 )
									ret := 0.709677 // buy
						if( rsi1 > 64.7204 )
							if( d_k <= 3.90897 )
								if( k <= 99.9986 )
									ret := 0.911641 // buy
								if( k > 99.9986 )
									ret := 0.750000 // buy
							if( d_k > 3.90897 )
								if( bullPower <= 82.099 )
									ret := 0.818182 // buy
								if( bullPower > 82.099 )
									ret := 0.142857
		if( bearPower > -79.1449 )
			if( rsi1 <= 67.0191 )
				if( rsi1 <= 59.3485 )
					if( bullPower <= 140.763 )
						if( bbp <= 159.152 )
							if( rsi1 <= 49.4406 )
								if( bbp <= 29.5186 )
									ret := -0.028756
								if( bbp > 29.5186 )
									ret := -0.150418
							if( rsi1 > 49.4406 )
								if( bearPower <= -28.667 )
									ret := 0.188748
								if( bearPower > -28.667 )
									ret := 0.039389
						if( bbp > 159.152 )
							if( bullPower <= 116.17 )
								if( d <= 65.1853 )
									ret := 0.857143 // buy
								if( d > 65.1853 )
									ret := -0.090909
							if( bullPower > 116.17 )
								if( smoothD_d <= 75.1592 )
									ret := -0.577778
								if( smoothD_d > 75.1592 )
									ret := -0.020000
					if( bullPower > 140.763 )
						if( d <= 94.6788 )
							if( bearPower <= 76.3022 )
								if( d_k <= 9.80566 )
									ret := -0.242124
								if( d_k > 9.80566 )
									ret := 0.047368
							if( bearPower > 76.3022 )
								if( rsi1 <= 56.9117 )
									ret := -0.658147
								if( rsi1 > 56.9117 )
									ret := -0.246914
						if( d > 94.6788 )
							if( bbp <= 204.608 )
								if( bbm <= 210.09 )
									ret := 0.000000
								if( bbm > 210.09 )
									ret := -0.785714 // sell
							if( bbp > 204.608 )
								if( bbm <= 159.215 )
									ret := -0.045455
								if( bbm > 159.215 )
									ret := 0.602740
				if( rsi1 > 59.3485 )
					if( bearPower <= -6.45727 )
						if( bbp <= -27.5461 )
							if( rsi1 <= 63.5862 )
								if( bearPower <= -31.8226 )
									ret := 0.544218
								if( bearPower > -31.8226 )
									ret := 0.111111
							if( rsi1 > 63.5862 )
								if( bbm <= 21.855 )
									ret := 0.000000
								if( bbm > 21.855 )
									ret := 0.742081 // buy
						if( bbp > -27.5461 )
							if( bearPower <= -43.5162 )
								if( smoothD_d <= 65.8876 )
									ret := 0.657407
								if( smoothD_d > 65.8876 )
									ret := 0.377880
							if( bearPower > -43.5162 )
								if( rsi1 <= 64.0323 )
									ret := 0.201133
								if( rsi1 > 64.0323 )
									ret := 0.342932
					if( bearPower > -6.45727 )
						if( bearPower <= 130.565 )
							if( d_k <= 4.51774 )
								if( bbm <= 137.995 )
									ret := -0.009819
								if( bbm > 137.995 )
									ret := 0.170025
							if( d_k > 4.51774 )
								if( bbp <= 84.8633 )
									ret := 0.037313
								if( bbp > 84.8633 )
									ret := 0.325530
						if( bearPower > 130.565 )
							if( smoothD_d <= 77.2259 )
								if( d <= 57.5616 )
									ret := 0.238095
								if( d > 57.5616 )
									ret := -0.541237
							if( smoothD_d > 77.2259 )
								if( d_k <= -1.153 )
									ret := -0.421053
								if( d_k > -1.153 )
									ret := 0.093023
			if( rsi1 > 67.0191 )
				if( rsi1 <= 78.2574 )
					if( bearPower <= -7.51711 )
						if( bearPower <= -29.4444 )
							if( k <= 74.4362 )
								if( d_k <= 7.6587 )
									ret := 0.500000
								if( d_k > 7.6587 )
									ret := -0.800000 // sell
							if( k > 74.4362 )
								if( rsi1 <= 68.0915 )
									ret := 0.565789
								if( rsi1 > 68.0915 )
									ret := 0.789409 // buy
						if( bearPower > -29.4444 )
							if( bullPower <= 148.006 )
								if( smoothK_k <= 96.602 )
									ret := 0.524766
								if( smoothK_k > 96.602 )
									ret := 0.096386
							if( bullPower > 148.006 )
								if( smoothD_d <= 53.4205 )
									ret := -0.125000
								if( smoothD_d > 53.4205 )
									ret := 0.807107 // buy
					if( bearPower > -7.51711 )
						if( smoothK_k <= 90.4323 )
							if( bullPower <= 817.742 )
								if( bbm <= 247.198 )
									ret := 0.346283
								if( bbm > 247.198 )
									ret := 0.594982
							if( bullPower > 817.742 )
								if( smoothD_d <= 89.3943 )
									ret := -0.309392
								if( smoothD_d > 89.3943 )
									ret := 0.736842 // buy
						if( smoothK_k > 90.4323 )
							if( k <= 99.8428 )
								if( bbm <= 238.661 )
									ret := 0.180098
								if( bbm > 238.661 )
									ret := 0.532394
							if( k > 99.8428 )
								if( bearPower <= 32.0814 )
									ret := 0.128342
								if( bearPower > 32.0814 )
									ret := -0.080645
				if( rsi1 > 78.2574 )
					if( bbp <= 269.078 )
						if( rsi1 <= 83.8149 )
							if( bbm <= 83.331 )
								if( bearPower <= 4.04431 )
									ret := 0.742105 // buy
								if( bearPower > 4.04431 )
									ret := 0.443564
							if( bbm > 83.331 )
								if( smoothK_k <= 68.5447 )
									ret := 0.083333
								if( smoothK_k > 68.5447 )
									ret := 0.740648 // buy
						if( rsi1 > 83.8149 )
							if( smoothK_k <= 92.7273 )
								if( d_k <= -0.049251 )
									ret := 0.777778 // buy
								if( d_k > -0.049251 )
									ret := 0.339286
							if( smoothK_k > 92.7273 )
								if( bearPower <= 25.4139 )
									ret := 0.928000 // buy
								if( bearPower > 25.4139 )
									ret := 0.782946 // buy
					if( bbp > 269.078 )
						if( bearPower <= 61.3405 )
							if( rsi1 <= 82.3096 )
								if( bearPower <= 32.7923 )
									ret := 0.755556 // buy
								if( bearPower > 32.7923 )
									ret := 0.294118
							if( rsi1 > 82.3096 )
								if( rsi1 <= 87.1252 )
									ret := 0.970588 // buy
								if( rsi1 > 87.1252 )
									ret := 0.846154 // buy
						if( bearPower > 61.3405 )
							if( bbm <= 199.93 )
								if( bullPower <= 414.241 )
									ret := 0.429931
								if( bullPower > 414.241 )
									ret := 0.105727
							if( bbm > 199.93 )
								if( d_k <= 1.33701 )
									ret := 0.474930
								if( d_k > 1.33701 )
									ret := 0.793349 // buy
	
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
float op_operation = decision_tree_0_BTCUSDT_15Min_02c88cbd(bullPower, bbp, bearPower, bbm, BBPower_Color, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


