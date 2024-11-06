//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: AMZN_30Min_1WAV_503e0089 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_1WAV_503e0089", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_503e0089(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_tci <= -34.4653 )
		if( d_tci <= -66.8617 )
			if( esa <= 125.485 )
				if( d <= 1.06774 )
					if( ci <= 79.8118 )
						if( d_tci <= -74.3955 )
							if( d <= 0.955287 )
								if( tci <= 78.0229 )
									ret := 0.000000
								if( tci > 78.0229 )
									ret := -0.500000
							if( d > 0.955287 )
								if( ap <= 102.12 )
									ret := 0.750000 // buy
								if( ap > 102.12 )
									ret := 0.250000
						if( d_tci > -74.3955 )
							if( d <= 0.762035 )
								if( ap <= 93.3699 )
									ret := -0.666667
								if( ap > 93.3699 )
									ret := 0.034483
							if( d > 0.762035 )
								if( esa <= 116.789 )
									ret := -0.787234 // sell
								if( esa > 116.789 )
									ret := 0.285714
					if( ci > 79.8118 )
						if( ci_wt2 <= 36.4409 )
							if( wt2 <= 74.7064 )
								if( tci <= 70.4367 )
									ret := 1.000000 // buy
								if( tci > 70.4367 )
									ret := 0.678571
							if( wt2 > 74.7064 )
								ret := 0.000000
						if( ci_wt2 > 36.4409 )
							if( ci_wt2 <= 49.0263 )
								if( ci <= 103.959 )
									ret := 0.000000
								if( ci > 103.959 )
									ret := -0.823529 // sell
							if( ci_wt2 > 49.0263 )
								if( esa <= 96.5565 )
									ret := -0.833333 // sell
								if( esa > 96.5565 )
									ret := 0.500000
				if( d > 1.06774 )
					if( d_tci <= -76.9784 )
						ret := -0.250000
					if( d_tci > -76.9784 )
						if( tci <= 71.9475 )
							if( wt2 <= 68.6257 )
								if( wt2 <= 64.1169 )
									ret := -0.750000 // sell
								if( wt2 > 64.1169 )
									ret := -1.000000 // sell
							if( wt2 > 68.6257 )
								ret := 0.000000
						if( tci > 71.9475 )
							ret := -1.000000 // sell
			if( esa > 125.485 )
				if( ci_wt2 <= 47.6692 )
					if( d <= 3.18187 )
						if( d_tci <= -81.5244 )
							if( d <= 1.11139 )
								if( ci <= 87.1826 )
									ret := 0.777778 // buy
								if( ci > 87.1826 )
									ret := 1.000000 // buy
							if( d > 1.11139 )
								ret := 0.400000
						if( d_tci > -81.5244 )
							if( ci <= 41.1755 )
								if( ap <= 145.842 )
									ret := 0.833333 // buy
								if( ap > 145.842 )
									ret := 0.409091
							if( ci > 41.1755 )
								if( esa <= 981.444 )
									ret := 0.042471
								if( esa > 981.444 )
									ret := 0.463415
					if( d > 3.18187 )
						if( esa <= 757.221 )
							if( ci <= 93.9592 )
								if( d <= 3.95308 )
									ret := -0.357143
								if( d > 3.95308 )
									ret := -0.800000 // sell
							if( ci > 93.9592 )
								ret := 0.000000
						if( esa > 757.221 )
							if( wt2 <= 76.0306 )
								if( ap <= 1052.12 )
									ret := -0.204082
								if( ap > 1052.12 )
									ret := 0.061856
							if( wt2 > 76.0306 )
								if( ap <= 1805.56 )
									ret := 0.277778
								if( ap > 1805.56 )
									ret := -0.125000
				if( ci_wt2 > 47.6692 )
					if( wt2 <= 59.337 )
						if( d <= 0.518248 )
							ret := 0.250000
						if( d > 0.518248 )
							if( d <= 1.0911 )
								if( ap <= 179.249 )
									ret := -1.000000 // sell
								if( ap > 179.249 )
									ret := -0.750000 // sell
							if( d > 1.0911 )
								ret := 0.000000
					if( wt2 > 59.337 )
						if( tci <= 69.668 )
							if( tci <= 68.7185 )
								ret := -0.571429
							if( tci > 68.7185 )
								ret := -1.000000 // sell
						if( tci > 69.668 )
							if( ap <= 180.057 )
								if( esa <= 155.203 )
									ret := 0.071429
								if( esa > 155.203 )
									ret := 0.714286 // buy
							if( ap > 180.057 )
								if( ap <= 181.923 )
									ret := -1.000000 // sell
								if( ap > 181.923 )
									ret := -0.147059
		if( d_tci > -66.8617 )
			if( ap <= 953.419 )
				if( ap <= 116.456 )
					if( ap <= 105.104 )
						if( esa <= 100.653 )
							if( d_tci <= -38.6333 )
								if( ci_wt2 <= 33.3049 )
									ret := 0.303483
								if( ci_wt2 > 33.3049 )
									ret := -0.048649
							if( d_tci > -38.6333 )
								if( ci <= -74.752 )
									ret := 1.000000 // buy
								if( ci > -74.752 )
									ret := -0.235714
						if( esa > 100.653 )
							if( ci_wt2 <= -94.481 )
								if( tci <= 45.9385 )
									ret := -0.600000
								if( tci > 45.9385 )
									ret := 1.000000 // buy
							if( ci_wt2 > -94.481 )
								if( ci <= 67.3869 )
									ret := -0.476190
								if( ci > 67.3869 )
									ret := -0.118280
					if( ap > 105.104 )
						if( d_tci <= -50.2768 )
							if( ci <= 46.3379 )
								if( ci <= 35.7364 )
									ret := 0.203125
								if( ci > 35.7364 )
									ret := -0.560000
							if( ci > 46.3379 )
								if( ci <= 143.948 )
									ret := 0.509709
								if( ci > 143.948 )
									ret := -0.260870
						if( d_tci > -50.2768 )
							if( d <= 0.322947 )
								if( ci <= 35.6449 )
									ret := 0.511111
								if( ci > 35.6449 )
									ret := -0.068182
							if( d > 0.322947 )
								if( d <= 0.618619 )
									ret := 0.612403
								if( d > 0.618619 )
									ret := 0.843750 // buy
				if( ap > 116.456 )
					if( ci <= 193.578 )
						if( ci <= 151.088 )
							if( d <= 2.14373 )
								if( d_tci <= -48.7981 )
									ret := -0.042955
								if( d_tci > -48.7981 )
									ret := 0.074452
							if( d > 2.14373 )
								if( ap <= 557.976 )
									ret := 0.508065
								if( ap > 557.976 )
									ret := 0.111111
						if( ci > 151.088 )
							if( esa <= 178.538 )
								if( ap <= 122.525 )
									ret := 0.333333
								if( ap > 122.525 )
									ret := -0.666667
							if( esa > 178.538 )
								if( tci <= 45.7771 )
									ret := -0.323529
								if( tci > 45.7771 )
									ret := 0.148148
					if( ci > 193.578 )
						if( ci <= 213.35 )
							if( esa <= 373.602 )
								if( ci_wt2 <= 159.757 )
									ret := 0.714286 // buy
								if( ci_wt2 > 159.757 )
									ret := 0.964286 // buy
							if( esa > 373.602 )
								if( esa <= 767.464 )
									ret := 0.000000
								if( esa > 767.464 )
									ret := 0.750000 // buy
						if( ci > 213.35 )
							if( d <= 0.745224 )
								if( d <= 0.383666 )
									ret := 0.250000
								if( d > 0.383666 )
									ret := -0.166667
							if( d > 0.745224 )
								if( wt2 <= 43.803 )
									ret := 1.000000 // buy
								if( wt2 > 43.803 )
									ret := 0.200000
			if( ap > 953.419 )
				if( ap <= 1758.42 )
					if( d <= 3.06521 )
						if( ci_wt2 <= 52.9285 )
							if( ap <= 979.622 )
								if( d_tci <= -43.1355 )
									ret := 0.125000
								if( d_tci > -43.1355 )
									ret := 0.574257
							if( ap > 979.622 )
								if( esa <= 1711.02 )
									ret := 0.092659
								if( esa > 1711.02 )
									ret := 0.471698
						if( ci_wt2 > 52.9285 )
							if( esa <= 1533.79 )
								if( d <= 1.1661 )
									ret := 0.130435
								if( d > 1.1661 )
									ret := -0.272727
							if( esa > 1533.79 )
								if( ap <= 1746.63 )
									ret := 0.114286
								if( ap > 1746.63 )
									ret := 0.500000
					if( d > 3.06521 )
						if( d <= 11.8647 )
							if( d_tci <= -56.367 )
								if( esa <= 1452.79 )
									ret := 0.000000
								if( esa > 1452.79 )
									ret := 0.362007
							if( d_tci > -56.367 )
								if( ap <= 1746.99 )
									ret := 0.380714
								if( ap > 1746.99 )
									ret := 0.666667
						if( d > 11.8647 )
							if( esa <= 1596.03 )
								if( ci_wt2 <= 24.9642 )
									ret := 0.156863
								if( ci_wt2 > 24.9642 )
									ret := 0.730769 // buy
							if( esa > 1596.03 )
								if( esa <= 1702.68 )
									ret := -0.428571
								if( esa > 1702.68 )
									ret := 0.647059
				if( ap > 1758.42 )
					if( ap <= 2073.91 )
						if( esa <= 1999.72 )
							if( ci <= -15.6006 )
								if( esa <= 1766.23 )
									ret := 0.500000
								if( esa > 1766.23 )
									ret := -0.407895
							if( ci > -15.6006 )
								if( d_tci <= -55.704 )
									ret := -0.132890
								if( d_tci > -55.704 )
									ret := 0.087217
						if( esa > 1999.72 )
							if( tci <= 41.6507 )
								if( ap <= 2018.65 )
									ret := -0.500000
								if( ap > 2018.65 )
									ret := 0.888889 // buy
							if( tci > 41.6507 )
								if( esa <= 2047.18 )
									ret := -0.280303
								if( esa > 2047.18 )
									ret := -0.800000 // sell
					if( ap > 2073.91 )
						if( ap <= 2229.9 )
							if( tci <= 49.6827 )
								if( esa <= 2148.57 )
									ret := 1.000000 // buy
								if( esa > 2148.57 )
									ret := -0.222222
							if( tci > 49.6827 )
								if( d <= 12.4151 )
									ret := 0.346939
								if( d > 12.4151 )
									ret := 0.906977 // buy
						if( ap > 2229.9 )
							if( ci <= 73.4541 )
								if( wt2 <= 50.1486 )
									ret := 0.226496
								if( wt2 > 50.1486 )
									ret := 0.031447
							if( ci > 73.4541 )
								if( wt2 <= 69.1555 )
									ret := 0.211111
								if( wt2 > 69.1555 )
									ret := 0.554878
	if( d_tci > -34.4653 )
		if( ap <= 3283.61 )
			if( ci_wt2 <= 11.8329 )
				if( ci_wt2 <= -132.874 )
					if( ci <= -206.459 )
						if( ap <= 162.492 )
							if( tci <= -18.7676 )
								if( ap <= 118.221 )
									ret := 0.681818
								if( ap > 118.221 )
									ret := -0.062500
							if( tci > -18.7676 )
								if( d <= 0.310528 )
									ret := -0.250000
								if( d > 0.310528 )
									ret := -0.750000 // sell
						if( ap > 162.492 )
							if( esa <= 185.966 )
								if( wt2 <= -10.2878 )
									ret := 0.750000 // buy
								if( wt2 > -10.2878 )
									ret := 1.000000 // buy
							if( esa > 185.966 )
								if( ap <= 2606.38 )
									ret := 0.216783
								if( ap > 2606.38 )
									ret := 0.857143 // buy
					if( ci > -206.459 )
						if( esa <= 3286.53 )
							if( ap <= 3205.26 )
								if( d <= 0.442977 )
									ret := -0.165254
								if( d > 0.442977 )
									ret := -0.007139
							if( ap > 3205.26 )
								if( ap <= 3252.46 )
									ret := -0.904762 // sell
								if( ap > 3252.46 )
									ret := 0.125000
						if( esa > 3286.53 )
							if( ap <= 3281.78 )
								if( d_tci <= 5.04449 )
									ret := 0.571429
								if( d_tci > 5.04449 )
									ret := 0.928571 // buy
							if( ap > 3281.78 )
								ret := 0.000000
				if( ci_wt2 > -132.874 )
					if( d <= 27.3304 )
						if( ap <= 3210.6 )
							if( esa <= 3181.54 )
								if( esa <= 3134.47 )
									ret := 0.083098
								if( esa > 3134.47 )
									ret := -0.127854
							if( esa > 3181.54 )
								if( ap <= 3166.53 )
									ret := -0.513514
								if( ap > 3166.53 )
									ret := 0.315789
						if( ap > 3210.6 )
							if( wt2 <= 47.46 )
								if( d <= 11.4215 )
									ret := 0.076768
								if( d > 11.4215 )
									ret := -0.283784
							if( wt2 > 47.46 )
								if( wt2 <= 59.3334 )
									ret := -0.783784 // sell
								if( wt2 > 59.3334 )
									ret := 0.400000
					if( d > 27.3304 )
						if( esa <= 3062.44 )
							if( ap <= 1639.35 )
								if( esa <= 1618.7 )
									ret := 0.153846
								if( esa > 1618.7 )
									ret := 0.833333 // buy
							if( ap > 1639.35 )
								if( d <= 76.2069 )
									ret := -0.473529
								if( d > 76.2069 )
									ret := 1.000000 // buy
						if( esa > 3062.44 )
							if( ci_wt2 <= -1.65265 )
								if( tci <= -56.7872 )
									ret := 0.000000
								if( tci > -56.7872 )
									ret := 0.620155
							if( ci_wt2 > -1.65265 )
								if( esa <= 3113.31 )
									ret := -0.900000 // sell
								if( esa > 3113.31 )
									ret := 0.052632
			if( ci_wt2 > 11.8329 )
				if( esa <= 89.6922 )
					if( ci <= 60.1957 )
						if( ci_wt2 <= 13.4756 )
							if( wt2 <= -38.1253 )
								ret := 0.200000
							if( wt2 > -38.1253 )
								if( wt2 <= -28.598 )
									ret := -1.000000 // sell
								if( wt2 > -28.598 )
									ret := -0.500000
						if( ci_wt2 > 13.4756 )
							if( d <= 0.17744 )
								if( tci <= -29.2956 )
									ret := -0.800000 // sell
								if( tci > -29.2956 )
									ret := 0.000000
							if( d > 0.17744 )
								if( ap <= 89.0215 )
									ret := 0.233645
								if( ap > 89.0215 )
									ret := 0.833333 // buy
					if( ci > 60.1957 )
						if( d <= 0.346228 )
							if( ci <= 155.849 )
								if( d_tci <= 13.4827 )
									ret := 0.263158
								if( d_tci > 13.4827 )
									ret := 0.666667
							if( ci > 155.849 )
								ret := -0.750000 // sell
						if( d > 0.346228 )
							if( ci <= 91.9128 )
								if( ap <= 89.5937 )
									ret := 1.000000 // buy
								if( ap > 89.5937 )
									ret := 0.750000 // buy
							if( ci > 91.9128 )
								if( tci <= 17.0521 )
									ret := 0.937500 // buy
								if( tci > 17.0521 )
									ret := -0.142857
				if( esa > 89.6922 )
					if( ap <= 3250.38 )
						if( tci <= -130.528 )
							if( ci_wt2 <= 123.367 )
								if( ci <= -58.3519 )
									ret := -0.500000
								if( ci > -58.3519 )
									ret := -1.000000 // sell
							if( ci_wt2 > 123.367 )
								ret := -1.000000 // sell
						if( tci > -130.528 )
							if( esa <= 3160.52 )
								if( esa <= 2993.85 )
									ret := -0.007201
								if( esa > 2993.85 )
									ret := 0.104651
							if( esa > 3160.52 )
								if( wt2 <= -8.91091 )
									ret := -0.250916
								if( wt2 > -8.91091 )
									ret := 0.037422
					if( ap > 3250.38 )
						if( ap <= 3269.67 )
							if( tci <= 45.1449 )
								if( d <= 8.87481 )
									ret := 0.360000
								if( d > 8.87481 )
									ret := 0.730769 // buy
							if( tci > 45.1449 )
								ret := -0.666667
						if( ap > 3269.67 )
							if( d_tci <= 20.0012 )
								if( ci_wt2 <= 22.6111 )
									ret := 0.916667 // buy
								if( ci_wt2 > 22.6111 )
									ret := 0.191489
							if( d_tci > 20.0012 )
								if( wt2 <= -24.3149 )
									ret := 0.020000
								if( wt2 > -24.3149 )
									ret := -0.875000 // sell
		if( ap > 3283.61 )
			if( ci <= 45.4852 )
				if( ci_wt2 <= -42.6815 )
					if( d <= 8.61058 )
						if( ci_wt2 <= -154.618 )
							if( ci_wt2 <= -197.65 )
								ret := -0.333333
							if( ci_wt2 > -197.65 )
								if( ap <= 3498.4 )
									ret := 0.290323
								if( ap > 3498.4 )
									ret := 1.000000 // buy
						if( ci_wt2 > -154.618 )
							if( ci <= -74.3739 )
								if( ap <= 3375.48 )
									ret := -0.315068
								if( ap > 3375.48 )
									ret := 0.018692
							if( ci > -74.3739 )
								if( wt2 <= 42.3546 )
									ret := 0.142857
								if( wt2 > 42.3546 )
									ret := -0.342857
					if( d > 8.61058 )
						if( wt2 <= 39.0723 )
							if( ci_wt2 <= -137.809 )
								if( ci <= -134.105 )
									ret := -0.173913
								if( ci > -134.105 )
									ret := 0.600000
							if( ci_wt2 > -137.809 )
								if( esa <= 3308.07 )
									ret := 0.437500
								if( esa > 3308.07 )
									ret := -0.466368
						if( wt2 > 39.0723 )
							if( ap <= 3701.81 )
								if( ci <= -60.6273 )
									ret := 0.629630
								if( ci > -60.6273 )
									ret := 0.022222
							if( ap > 3701.81 )
								ret := -1.000000 // sell
				if( ci_wt2 > -42.6815 )
					if( d <= 6.0475 )
						if( esa <= 3689.47 )
							if( ap <= 3290.88 )
								if( ap <= 3284.96 )
									ret := 0.500000
								if( ap > 3284.96 )
									ret := -0.578947
							if( ap > 3290.88 )
								if( ci <= 39.4403 )
									ret := 0.189394
								if( ci > 39.4403 )
									ret := -0.233333
						if( esa > 3689.47 )
							if( esa <= 3700.51 )
								if( esa <= 3696.07 )
									ret := -0.750000 // sell
								if( esa > 3696.07 )
									ret := -1.000000 // sell
							if( esa > 3700.51 )
								ret := 0.000000
					if( d > 6.0475 )
						if( ap <= 3462.47 )
							if( ap <= 3353.91 )
								if( d_tci <= 63.7062 )
									ret := -0.140811
								if( d_tci > 63.7062 )
									ret := 0.329670
							if( ap > 3353.91 )
								if( d <= 14.7872 )
									ret := -0.127036
								if( d > 14.7872 )
									ret := -0.592814
						if( ap > 3462.47 )
							if( esa <= 3566.27 )
								if( ci_wt2 <= -17.7421 )
									ret := -0.208333
								if( ci_wt2 > -17.7421 )
									ret := 0.428571
							if( esa > 3566.27 )
								if( esa <= 3613.04 )
									ret := -0.441558
								if( esa > 3613.04 )
									ret := 0.119658
			if( ci > 45.4852 )
				if( ap <= 3581.13 )
					if( ap <= 3309.1 )
						if( d_tci <= -2.30151 )
							if( ci <= 118.752 )
								if( esa <= 3279.45 )
									ret := -0.720000 // sell
								if( esa > 3279.45 )
									ret := -0.035714
							if( ci > 118.752 )
								if( tci <= 18.194 )
									ret := 1.000000 // buy
								if( tci > 18.194 )
									ret := 0.400000
						if( d_tci > -2.30151 )
							if( ci <= 68.6595 )
								if( esa <= 3291.77 )
									ret := -0.966667 // sell
								if( esa > 3291.77 )
									ret := -0.700000 // sell
							if( ci > 68.6595 )
								if( ap <= 3301.72 )
									ret := -0.208333
								if( ap > 3301.72 )
									ret := -0.904762 // sell
					if( ap > 3309.1 )
						if( ci_wt2 <= 91.3913 )
							if( d <= 6.43774 )
								if( wt2 <= 21.8722 )
									ret := -0.523810
								if( wt2 > 21.8722 )
									ret := -0.104167
							if( d > 6.43774 )
								if( wt2 <= 9.96176 )
									ret := 0.159091
								if( wt2 > 9.96176 )
									ret := -0.163636
						if( ci_wt2 > 91.3913 )
							if( ci <= 132.994 )
								if( d <= 9.48753 )
									ret := -0.015625
								if( d > 9.48753 )
									ret := 0.404762
							if( ci > 132.994 )
								if( esa <= 3495.48 )
									ret := -0.095238
								if( esa > 3495.48 )
									ret := -0.631579
				if( ap > 3581.13 )
					if( esa <= 3641.54 )
						if( wt2 <= 45.8468 )
							if( ci_wt2 <= 160.132 )
								if( esa <= 3576.77 )
									ret := -0.918919 // sell
								if( esa > 3576.77 )
									ret := -0.755556 // sell
							if( ci_wt2 > 160.132 )
								ret := -0.200000
						if( wt2 > 45.8468 )
							ret := 0.000000
					if( esa > 3641.54 )
						if( esa <= 3679.01 )
							ret := 0.571429
						if( esa > 3679.01 )
							if( d <= 9.23219 )
								if( ap <= 3716.89 )
									ret := -0.761905 // sell
								if( ap > 3716.89 )
									ret := 0.200000
							if( d > 9.23219 )
								if( esa <= 3695.98 )
									ret := 0.000000
								if( esa > 3695.98 )
									ret := -0.937500 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_AMZN_30Min_503e0089(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


