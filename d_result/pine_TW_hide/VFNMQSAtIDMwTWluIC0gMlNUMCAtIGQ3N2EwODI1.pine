//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: TSLA_30Min_2ST0_d77a0825 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TSLA_30Min_2ST0_d77a0825", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TSLA_30Min_d77a0825(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= 5.16224 )
		if( smoothD_d <= 57.5448 )
			if( rsi1 <= 37.0554 )
				if( tema <= 1501.39 )
					if( ema3 <= 1167.04 )
						if( ema2 <= 1136.37 )
							if( tema <= 106.665 )
								if( rsi1 <= 14.3625 )
									ret := 1.000000 // buy
								if( rsi1 > 14.3625 )
									ret := 0.640000
							if( tema > 106.665 )
								if( ema12 <= -12.1728 )
									ret := -0.197292
								if( ema12 > -12.1728 )
									ret := 0.023644
						if( ema2 > 1136.37 )
							if( ema2 <= 1157.67 )
								if( ema2 <= 1142.52 )
									ret := -0.500000
								if( ema2 > 1142.52 )
									ret := -1.000000 // sell
							if( ema2 > 1157.67 )
								ret := 0.000000
					if( ema3 > 1167.04 )
						if( ema13 <= -11.774 )
							if( d <= 2.0841 )
								if( ema13 <= -900.944 )
									ret := -0.500000
								if( ema13 > -900.944 )
									ret := 0.929412 // buy
							if( d > 2.0841 )
								if( ema3 <= 1683.29 )
									ret := 0.361905
								if( ema3 > 1683.29 )
									ret := -0.875000 // sell
						if( ema13 > -11.774 )
							if( k <= 24.2696 )
								if( d_k <= 0.262215 )
									ret := 0.277778
								if( d_k > 0.262215 )
									ret := -0.581395
							if( k > 24.2696 )
								if( ema13 <= -6.31858 )
									ret := 0.875000 // buy
								if( ema13 > -6.31858 )
									ret := 0.000000
				if( tema > 1501.39 )
					if( tema <= 2010.1 )
						if( rsi1 <= 23.9467 )
							if( d <= 0.008079 )
								ret := -0.250000
							if( d > 0.008079 )
								if( ema3 <= 1596.21 )
									ret := -1.000000 // sell
								if( ema3 > 1596.21 )
									ret := -0.714286 // sell
						if( rsi1 > 23.9467 )
							if( smoothD_d <= 5.1783 )
								if( ema3 <= 1629.05 )
									ret := 0.250000
								if( ema3 > 1629.05 )
									ret := -0.800000 // sell
							if( smoothD_d > 5.1783 )
								if( ema2 <= 2000.4 )
									ret := 0.473684
								if( ema2 > 2000.4 )
									ret := -0.555556
					if( tema > 2010.1 )
						ret := -1.000000 // sell
			if( rsi1 > 37.0554 )
				if( tema <= 171.681 )
					if( ema2 <= 165.592 )
						if( rsi1 <= 67.5087 )
							if( ema1 <= 161.706 )
								if( ema12 <= -0.998243 )
									ret := 0.787879 // buy
								if( ema12 > -0.998243 )
									ret := 0.089520
							if( ema1 > 161.706 )
								if( ema12 <= -0.292 )
									ret := 0.642857
								if( ema12 > -0.292 )
									ret := -0.471264
						if( rsi1 > 67.5087 )
							if( k <= 24.5264 )
								if( ema1 <= 135.012 )
									ret := -0.500000
								if( ema1 > 135.012 )
									ret := 0.285714
							if( k > 24.5264 )
								if( ema13 <= 2.9119 )
									ret := 0.866667 // buy
								if( ema13 > 2.9119 )
									ret := 0.250000
					if( ema2 > 165.592 )
						if( ema13 <= 0.032481 )
							if( d_k <= -6.65004 )
								if( ema13 <= -1.31088 )
									ret := 0.700000 // buy
								if( ema13 > -1.31088 )
									ret := -0.428571
							if( d_k > -6.65004 )
								if( rsi1 <= 37.6633 )
									ret := -0.222222
								if( rsi1 > 37.6633 )
									ret := 0.566265
						if( ema13 > 0.032481 )
							if( ema2 <= 168.402 )
								if( d_k <= -8.98077 )
									ret := 0.000000
								if( d_k > -8.98077 )
									ret := 0.625000
							if( ema2 > 168.402 )
								if( ema3 <= 169.648 )
									ret := 0.909091 // buy
								if( ema3 > 169.648 )
									ret := 0.552632
				if( tema > 171.681 )
					if( ema13 <= 2.79458 )
						if( ema3 <= 2168.84 )
							if( ema12 <= 0.222805 )
								if( ema3 <= 1454.79 )
									ret := 0.101107
								if( ema3 > 1454.79 )
									ret := 0.322870
							if( ema12 > 0.222805 )
								if( ema3 <= 375.3 )
									ret := 0.023640
								if( ema3 > 375.3 )
									ret := 0.146075
						if( ema3 > 2168.84 )
							ret := -1.000000 // sell
					if( ema13 > 2.79458 )
						if( ema3 <= 1009.59 )
							if( tema <= 1002.89 )
								if( d <= 15.8625 )
									ret := 0.351103
								if( d > 15.8625 )
									ret := 0.164850
							if( tema > 1002.89 )
								if( ema13 <= 3.07946 )
									ret := 0.750000 // buy
								if( ema13 > 3.07946 )
									ret := 1.000000 // buy
						if( ema3 > 1009.59 )
							if( tema <= 1231.07 )
								if( ema13 <= 4.7027 )
									ret := -0.506494
								if( ema13 > 4.7027 )
									ret := 0.157895
							if( tema > 1231.07 )
								if( smoothK_k <= 54.2522 )
									ret := 0.188679
								if( smoothK_k > 54.2522 )
									ret := -0.727273 // sell
		if( smoothD_d > 57.5448 )
			if( rsi1 <= 76.6756 )
				if( smoothK_k <= 90.0771 )
					if( smoothD_d <= 89.5996 )
						if( ema3 <= 1519.76 )
							if( smoothK_k <= 83.8835 )
								if( tema <= 289.514 )
									ret := -0.035630
								if( tema > 289.514 )
									ret := 0.028368
							if( smoothK_k > 83.8835 )
								if( ema1 <= 1019.06 )
									ret := 0.096386
								if( ema1 > 1019.06 )
									ret := -0.348624
						if( ema3 > 1519.76 )
							if( ema12 <= -0.16588 )
								if( rsi1 <= 38.0176 )
									ret := -0.500000
								if( rsi1 > 38.0176 )
									ret := 0.266667
							if( ema12 > -0.16588 )
								if( ema13 <= 3.75126 )
									ret := 1.000000 // buy
								if( ema13 > 3.75126 )
									ret := -0.250000
					if( smoothD_d > 89.5996 )
						if( tema <= 201.267 )
							if( ema2 <= 181.11 )
								if( ema13 <= 2.78389 )
									ret := -0.084112
								if( ema13 > 2.78389 )
									ret := -1.000000 // sell
							if( ema2 > 181.11 )
								if( d_k <= 4.90313 )
									ret := 0.425532
								if( d_k > 4.90313 )
									ret := 0.019231
						if( tema > 201.267 )
							if( d_k <= 6.42049 )
								if( tema <= 1446.79 )
									ret := -0.247874
								if( tema > 1446.79 )
									ret := 0.875000 // buy
							if( d_k > 6.42049 )
								if( ema3 <= 801.869 )
									ret := 0.068493
								if( ema3 > 801.869 )
									ret := -0.615385
				if( smoothK_k > 90.0771 )
					if( ema2 <= 681.984 )
						if( ema2 <= 668.731 )
							if( ema2 <= 346.686 )
								if( tema <= 314.337 )
									ret := -0.060146
								if( tema > 314.337 )
									ret := 0.170825
							if( ema2 > 346.686 )
								if( d <= 76.6066 )
									ret := 0.369231
								if( d > 76.6066 )
									ret := -0.198267
						if( ema2 > 668.731 )
							if( ema12 <= 1.63534 )
								if( ema1 <= 670.248 )
									ret := 0.000000
								if( ema1 > 670.248 )
									ret := 0.761194 // buy
							if( ema12 > 1.63534 )
								if( ema3 <= 672.629 )
									ret := 0.684211
								if( ema3 > 672.629 )
									ret := -0.583333
					if( ema2 > 681.984 )
						if( tema <= 1453.59 )
							if( ema13 <= -26.824 )
								if( d_k <= -7.68766 )
									ret := -0.750000 // sell
								if( d_k > -7.68766 )
									ret := 0.833333 // buy
							if( ema13 > -26.824 )
								if( tema <= 898.225 )
									ret := -0.220317
								if( tema > 898.225 )
									ret := -0.501818
						if( tema > 1453.59 )
							if( ema13 <= 3.33214 )
								if( k <= 95.6525 )
									ret := 1.000000 // buy
								if( k > 95.6525 )
									ret := 0.375000
							if( ema13 > 3.33214 )
								if( ema12 <= 2.75217 )
									ret := -0.750000 // sell
								if( ema12 > 2.75217 )
									ret := 0.166667
			if( rsi1 > 76.6756 )
				if( tema <= 136.559 )
					if( rsi1 <= 84.3254 )
						if( ema3 <= 117.867 )
							ret := 1.000000 // buy
						if( ema3 > 117.867 )
							if( d_k <= -8.7954 )
								ret := 0.200000
							if( d_k > -8.7954 )
								if( smoothD_d <= 95.801 )
									ret := 0.895833 // buy
								if( smoothD_d > 95.801 )
									ret := 0.500000
					if( rsi1 > 84.3254 )
						if( smoothD_d <= 88.0338 )
							if( ema1 <= 118.757 )
								ret := 0.250000
							if( ema1 > 118.757 )
								ret := 0.000000
						if( smoothD_d > 88.0338 )
							ret := 0.714286 // buy
				if( tema > 136.559 )
					if( ema13 <= -14.5699 )
						if( tema <= 532.821 )
							ret := 1.000000 // buy
						if( tema > 532.821 )
							ret := 0.750000 // buy
					if( ema13 > -14.5699 )
						if( smoothD_d <= 94.2591 )
							if( ema2 <= 169.431 )
								if( k <= 97.4519 )
									ret := 0.548673
								if( k > 97.4519 )
									ret := -0.238095
							if( ema2 > 169.431 )
								if( tema <= 183.235 )
									ret := -0.311377
								if( tema > 183.235 )
									ret := 0.023355
						if( smoothD_d > 94.2591 )
							if( ema1 <= 160.128 )
								if( smoothK_k <= 96.5083 )
									ret := -1.000000 // sell
								if( smoothK_k > 96.5083 )
									ret := -0.571429
							if( ema1 > 160.128 )
								if( ema2 <= 196.01 )
									ret := -0.081481
								if( ema2 > 196.01 )
									ret := 0.215980
	if( ema13 > 5.16224 )
		if( tema <= 772.023 )
			if( smoothK_k <= 92.56 )
				if( ema13 <= 15.3578 )
					if( smoothD_d <= 82.9656 )
						if( ema13 <= 8.98603 )
							if( ema13 <= 7.11117 )
								if( ema12 <= 4.70825 )
									ret := 0.175719
								if( ema12 > 4.70825 )
									ret := -0.275862
							if( ema13 > 7.11117 )
								if( smoothD_d <= 64.4533 )
									ret := 0.424342
								if( smoothD_d > 64.4533 )
									ret := 0.090909
						if( ema13 > 8.98603 )
							if( rsi1 <= 69.3645 )
								if( ema1 <= 601.161 )
									ret := -0.495495
								if( ema1 > 601.161 )
									ret := 0.000000
							if( rsi1 > 69.3645 )
								if( tema <= 689.737 )
									ret := 0.311765
								if( tema > 689.737 )
									ret := -0.216667
					if( smoothD_d > 82.9656 )
						if( d_k <= -1.22917 )
							if( rsi1 <= 72.043 )
								if( ema13 <= 6.3863 )
									ret := -0.333333
								if( ema13 > 6.3863 )
									ret := 0.769231 // buy
							if( rsi1 > 72.043 )
								if( ema1 <= 683.508 )
									ret := 0.033333
								if( ema1 > 683.508 )
									ret := -0.833333 // sell
						if( d_k > -1.22917 )
							if( ema12 <= 2.35111 )
								ret := -0.833333 // sell
							if( ema12 > 2.35111 )
								if( d_k <= 7.82055 )
									ret := 0.409524
								if( d_k > 7.82055 )
									ret := 0.095890
				if( ema13 > 15.3578 )
					if( tema <= 737.061 )
						if( tema <= 429.495 )
							if( rsi1 <= 84.0555 )
								if( ema2 <= 406.249 )
									ret := 1.000000 // buy
								if( ema2 > 406.249 )
									ret := 0.750000 // buy
							if( rsi1 > 84.0555 )
								ret := 0.200000
						if( tema > 429.495 )
							if( ema3 <= 418.62 )
								ret := -1.000000 // sell
							if( ema3 > 418.62 )
								if( rsi1 <= 83.0401 )
									ret := 0.027778
								if( rsi1 > 83.0401 )
									ret := 0.594203
					if( tema > 737.061 )
						if( d <= 89.0354 )
							if( ema3 <= 719.667 )
								if( d_k <= -8.16818 )
									ret := 0.750000 // buy
								if( d_k > -8.16818 )
									ret := 1.000000 // buy
							if( ema3 > 719.667 )
								if( tema <= 757.513 )
									ret := 0.285714
								if( tema > 757.513 )
									ret := 0.885714 // buy
						if( d > 89.0354 )
							if( k <= 93.699 )
								if( ema2 <= 728.324 )
									ret := 0.250000
								if( ema2 > 728.324 )
									ret := -0.500000
							if( k > 93.699 )
								if( d_k <= 1.07352 )
									ret := 1.000000 // buy
								if( d_k > 1.07352 )
									ret := 0.750000 // buy
			if( smoothK_k > 92.56 )
				if( ema3 <= 447.823 )
					if( ema1 <= 278.453 )
						if( ema2 <= 251.421 )
							if( ema3 <= 172.468 )
								ret := 0.857143 // buy
							if( ema3 > 172.468 )
								if( tema <= 224.851 )
									ret := -0.304348
								if( tema > 224.851 )
									ret := 0.145455
						if( ema2 > 251.421 )
							if( rsi1 <= 81.932 )
								ret := 1.000000 // buy
							if( rsi1 > 81.932 )
								if( ema1 <= 255.296 )
									ret := 1.000000 // buy
								if( ema1 > 255.296 )
									ret := -0.181818
					if( ema1 > 278.453 )
						if( ema13 <= 17.8377 )
							if( ema12 <= 3.4496 )
								if( rsi1 <= 85.5723 )
									ret := -0.068966
								if( rsi1 > 85.5723 )
									ret := -0.833333 // sell
							if( ema12 > 3.4496 )
								if( rsi1 <= 96.2077 )
									ret := -0.160714
								if( rsi1 > 96.2077 )
									ret := 0.833333 // buy
						if( ema13 > 17.8377 )
							if( rsi1 <= 88.642 )
								ret := -0.500000
							if( rsi1 > 88.642 )
								ret := -1.000000 // sell
				if( ema3 > 447.823 )
					if( ema3 <= 672.604 )
						if( rsi1 <= 86.3989 )
							if( ema13 <= 22.4278 )
								if( d_k <= -3.25659 )
									ret := 0.552632
								if( d_k > -3.25659 )
									ret := 0.089041
							if( ema13 > 22.4278 )
								if( k <= 99.9397 )
									ret := -0.941176 // sell
								if( k > 99.9397 )
									ret := -0.250000
						if( rsi1 > 86.3989 )
							if( d_k <= 1.45395 )
								if( ema13 <= 7.24252 )
									ret := -0.200000
								if( ema13 > 7.24252 )
									ret := 0.666667
							if( d_k > 1.45395 )
								ret := -0.714286 // sell
					if( ema3 > 672.604 )
						if( ema12 <= 4.28801 )
							if( d_k <= -1.64976 )
								if( tema <= 704.643 )
									ret := 1.000000 // buy
								if( tema > 704.643 )
									ret := 0.500000
							if( d_k > -1.64976 )
								if( rsi1 <= 76.6045 )
									ret := -0.800000 // sell
								if( rsi1 > 76.6045 )
									ret := 0.285714
						if( ema12 > 4.28801 )
							if( tema <= 754.806 )
								if( rsi1 <= 70.2069 )
									ret := -0.960000 // sell
								if( rsi1 > 70.2069 )
									ret := -0.300000
							if( tema > 754.806 )
								if( ema13 <= 14.9027 )
									ret := 0.640000
								if( ema13 > 14.9027 )
									ret := -0.090909
		if( tema > 772.023 )
			if( ema1 <= 796.84 )
				if( smoothK_k <= 81.025 )
					if( ema12 <= 5.79183 )
						if( ema2 <= 778.465 )
							if( k <= 28.8222 )
								if( d <= 6.30815 )
									ret := -0.857143 // sell
								if( d > 6.30815 )
									ret := -1.000000 // sell
							if( k > 28.8222 )
								if( ema12 <= 5.16064 )
									ret := -0.181818
								if( ema12 > 5.16064 )
									ret := -1.000000 // sell
						if( ema2 > 778.465 )
							if( ema1 <= 792.415 )
								if( ema12 <= 1.71313 )
									ret := 0.500000
								if( ema12 > 1.71313 )
									ret := 0.000000
							if( ema1 > 792.415 )
								if( d_k <= -1.5846 )
									ret := -0.142857
								if( d_k > -1.5846 )
									ret := -0.928571 // sell
					if( ema12 > 5.79183 )
						if( d_k <= 13.8477 )
							if( tema <= 774.522 )
								ret := 1.000000 // buy
							if( tema > 774.522 )
								if( rsi1 <= 78.0381 )
									ret := -0.242857
								if( rsi1 > 78.0381 )
									ret := -0.821429 // sell
						if( d_k > 13.8477 )
							if( rsi1 <= 68.7597 )
								ret := 1.000000 // buy
							if( rsi1 > 68.7597 )
								if( ema2 <= 766.586 )
									ret := 0.750000 // buy
								if( ema2 > 766.586 )
									ret := -0.200000
				if( smoothK_k > 81.025 )
					if( tema <= 796.709 )
						if( ema13 <= 14.4198 )
							if( smoothD_d <= 92.1492 )
								if( d_k <= -7.59923 )
									ret := 0.000000
								if( d_k > -7.59923 )
									ret := 0.933333 // buy
							if( smoothD_d > 92.1492 )
								if( rsi1 <= 76.6868 )
									ret := 0.727273 // buy
								if( rsi1 > 76.6868 )
									ret := -0.307692
						if( ema13 > 14.4198 )
							if( d_k <= -8.66278 )
								ret := 1.000000 // buy
							if( d_k > -8.66278 )
								if( ema1 <= 777.372 )
									ret := -0.515152
								if( ema1 > 777.372 )
									ret := 1.000000 // buy
					if( tema > 796.709 )
						if( d_k <= -0.852361 )
							if( smoothK_k <= 92.235 )
								ret := 0.285714
							if( smoothK_k > 92.235 )
								if( smoothK_k <= 95.5478 )
									ret := -0.833333 // sell
								if( smoothK_k > 95.5478 )
									ret := 0.000000
						if( d_k > -0.852361 )
							if( ema1 <= 790.73 )
								if( d_k <= 2.71129 )
									ret := 0.000000
								if( d_k > 2.71129 )
									ret := -0.500000
							if( ema1 > 790.73 )
								if( tema <= 800.625 )
									ret := -0.666667
								if( tema > 800.625 )
									ret := -0.956522 // sell
			if( ema1 > 796.84 )
				if( ema13 <= 16.549 )
					if( tema <= 903.685 )
						if( ema1 <= 848.047 )
							if( d <= 64.256 )
								if( ema1 <= 817.117 )
									ret := 0.614458
								if( ema1 > 817.117 )
									ret := 0.101010
							if( d > 64.256 )
								if( ema1 <= 829.328 )
									ret := -0.037634
								if( ema1 > 829.328 )
									ret := -0.406250
						if( ema1 > 848.047 )
							if( ema1 <= 864.758 )
								if( ema13 <= 5.76287 )
									ret := -0.133333
								if( ema13 > 5.76287 )
									ret := 0.666667
							if( ema1 > 864.758 )
								if( smoothD_d <= 74.5756 )
									ret := 0.052632
								if( smoothD_d > 74.5756 )
									ret := 0.500000
					if( tema > 903.685 )
						if( ema1 <= 1592.78 )
							if( tema <= 1506.37 )
								if( d <= 7.20853 )
									ret := -0.710145 // sell
								if( d > 7.20853 )
									ret := -0.003001
							if( tema > 1506.37 )
								if( smoothK_k <= 55.0074 )
									ret := 0.000000
								if( smoothK_k > 55.0074 )
									ret := -0.865854 // sell
						if( ema1 > 1592.78 )
							if( tema <= 1641.55 )
								if( ema12 <= 4.31478 )
									ret := 1.000000 // buy
								if( ema12 > 4.31478 )
									ret := 0.500000
							if( tema > 1641.55 )
								if( ema1 <= 2015.56 )
									ret := -0.031746
								if( ema1 > 2015.56 )
									ret := 0.852941 // buy
				if( ema13 > 16.549 )
					if( ema13 <= 78.9905 )
						if( ema12 <= 34.1135 )
							if( smoothK_k <= 54.3436 )
								if( d <= 13.4711 )
									ret := 0.052632
								if( d > 13.4711 )
									ret := 0.522013
							if( smoothK_k > 54.3436 )
								if( d <= 95.6524 )
									ret := 0.103077
								if( d > 95.6524 )
									ret := 0.374486
						if( ema12 > 34.1135 )
							if( tema <= 1660.11 )
								if( tema <= 1524.96 )
									ret := 0.500000
								if( tema > 1524.96 )
									ret := 1.000000 // buy
							if( tema > 1660.11 )
								if( k <= 96.8341 )
									ret := 1.000000 // buy
								if( k > 96.8341 )
									ret := 0.000000
					if( ema13 > 78.9905 )
						if( ema2 <= 1635.19 )
							ret := -0.500000
						if( ema2 > 1635.19 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_TSLA_30Min_d77a0825(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


