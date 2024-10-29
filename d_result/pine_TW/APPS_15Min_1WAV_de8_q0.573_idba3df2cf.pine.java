//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: APPS_15Min_1WAV_ba3df2cf Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_1WAV_ba3df2cf", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_ba3df2cf(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci_wt2 <= 1.07242 )
		if( ci <= -109.427 )
			if( esa <= 3.48123 )
				if( tci <= -62.2123 )
					if( d <= 0.01628 )
						if( ap <= 1.53165 )
							if( ap <= 0.772882 )
								if( ci <= -177.466 )
									ret := -0.600000
								if( ci > -177.466 )
									ret := 0.714286 // buy
							if( ap > 0.772882 )
								if( tci <= -65.5785 )
									ret := 0.615385
								if( tci > -65.5785 )
									ret := 0.851852 // buy
						if( ap > 1.53165 )
							if( ci_wt2 <= -75.1484 )
								ret := 0.285714
							if( ci_wt2 > -75.1484 )
								if( wt2 <= -57.6389 )
									ret := -0.750000 // sell
								if( wt2 > -57.6389 )
									ret := -0.500000
					if( d > 0.01628 )
						if( d <= 0.055275 )
							if( ci_wt2 <= -58.1412 )
								if( ci <= -125.205 )
									ret := 0.881579 // buy
								if( ci > -125.205 )
									ret := 0.384615
							if( ci_wt2 > -58.1412 )
								if( wt2 <= -64.4976 )
									ret := 0.600000
								if( wt2 > -64.4976 )
									ret := 1.000000 // buy
						if( d > 0.055275 )
							ret := -0.200000
				if( tci > -62.2123 )
					if( ci_wt2 <= -180.113 )
						if( wt2 <= 33.0779 )
							if( d <= 0.006653 )
								if( ap <= 1.596 )
									ret := 0.590909
								if( ap > 1.596 )
									ret := 0.000000
							if( d > 0.006653 )
								if( d <= 0.03437 )
									ret := 0.878788 // buy
								if( d > 0.03437 )
									ret := 0.285714
						if( wt2 > 33.0779 )
							if( wt2 <= 33.667 )
								ret := -0.600000
							if( wt2 > 33.667 )
								if( ci <= -165.976 )
									ret := 0.200000
								if( ci > -165.976 )
									ret := 0.900000 // buy
					if( ci_wt2 > -180.113 )
						if( esa <= 1.62397 )
							if( d <= 0.005201 )
								if( ci <= -118.155 )
									ret := 0.033058
								if( ci > -118.155 )
									ret := 0.529412
							if( d > 0.005201 )
								if( ci <= -168.614 )
									ret := -0.020833
								if( ci > -168.614 )
									ret := 0.623223
						if( esa > 1.62397 )
							if( d_tci <= -9.43322 )
								if( ci <= -124.151 )
									ret := 0.739130 // buy
								if( ci > -124.151 )
									ret := 0.151515
							if( d_tci > -9.43322 )
								if( ci <= -147.073 )
									ret := 0.386454
								if( ci > -147.073 )
									ret := 0.173352
			if( esa > 3.48123 )
				if( esa <= 24.4653 )
					if( ci <= -158.627 )
						if( ap <= 9.10993 )
							if( wt2 <= -7.56627 )
								if( ci_wt2 <= -158.951 )
									ret := -0.243590
								if( ci_wt2 > -158.951 )
									ret := 0.375000
							if( wt2 > -7.56627 )
								if( tci <= -2.14927 )
									ret := 0.681818
								if( tci > -2.14927 )
									ret := 0.297619
						if( ap > 9.10993 )
							if( ci_wt2 <= -108.975 )
								if( ci <= -232.014 )
									ret := -0.117647
								if( ci > -232.014 )
									ret := 0.645669
							if( ci_wt2 > -108.975 )
								ret := -1.000000 // sell
					if( ci > -158.627 )
						if( d_tci <= 61.4654 )
							if( d_tci <= 59.6 )
								if( ci_wt2 <= -68.3918 )
									ret := 0.233615
								if( ci_wt2 > -68.3918 )
									ret := -0.433333
							if( d_tci > 59.6 )
								if( esa <= 7.51462 )
									ret := 0.928571 // buy
								if( esa > 7.51462 )
									ret := 0.470588
						if( d_tci > 61.4654 )
							if( ap <= 19.4482 )
								if( ap <= 12.3501 )
									ret := 0.054348
								if( ap > 12.3501 )
									ret := -0.650000
							if( ap > 19.4482 )
								if( ci <= -119.801 )
									ret := 0.733333 // buy
								if( ci > -119.801 )
									ret := 0.000000
				if( esa > 24.4653 )
					if( wt2 <= 38.637 )
						if( esa <= 34.6357 )
							if( ci <= -183.832 )
								if( ci_wt2 <= -242.377 )
									ret := 0.000000
								if( ci_wt2 > -242.377 )
									ret := 0.909091 // buy
							if( ci > -183.832 )
								if( ci_wt2 <= -71.4698 )
									ret := -0.177885
								if( ci_wt2 > -71.4698 )
									ret := 0.413793
						if( esa > 34.6357 )
							if( esa <= 42.5195 )
								if( ci_wt2 <= -93.4738 )
									ret := 0.449198
								if( ci_wt2 > -93.4738 )
									ret := 0.100000
							if( esa > 42.5195 )
								if( ci <= -227.088 )
									ret := 0.625000
								if( ci > -227.088 )
									ret := 0.110092
					if( wt2 > 38.637 )
						if( ap <= 83.3422 )
							if( tci <= 20.5539 )
								if( d <= 0.397669 )
									ret := -1.000000 // sell
								if( d > 0.397669 )
									ret := -0.500000
							if( tci > 20.5539 )
								if( wt2 <= 44.2495 )
									ret := 0.333333
								if( wt2 > 44.2495 )
									ret := -0.370370
						if( ap > 83.3422 )
							if( ci <= -135.812 )
								ret := 1.000000 // buy
							if( ci > -135.812 )
								ret := 0.000000
		if( ci > -109.427 )
			if( ap <= 56.3596 )
				if( ap <= 1.44283 )
					if( ci <= -77.1946 )
						if( ci <= -80.2161 )
							if( ap <= 0.995792 )
								if( tci <= -31.1228 )
									ret := 0.241935
								if( tci > -31.1228 )
									ret := 0.717791 // buy
							if( ap > 0.995792 )
								if( tci <= 40.8985 )
									ret := 0.344519
								if( tci > 40.8985 )
									ret := -0.800000 // sell
						if( ci > -80.2161 )
							if( d <= 0.005689 )
								if( d_tci <= -6.34573 )
									ret := 0.583333
								if( d_tci > -6.34573 )
									ret := 0.157895
							if( d > 0.005689 )
								if( d_tci <= 35.7116 )
									ret := 1.000000 // buy
								if( d_tci > 35.7116 )
									ret := 0.714286 // buy
					if( ci > -77.1946 )
						if( ci <= 23.2103 )
							if( d <= 0.006065 )
								if( ap <= 1.15846 )
									ret := 0.076135
								if( ap > 1.15846 )
									ret := -0.082011
							if( d > 0.006065 )
								if( ci <= 20.9134 )
									ret := 0.264521
								if( ci > 20.9134 )
									ret := 0.794118 // buy
						if( ci > 23.2103 )
							if( tci <= 67.6683 )
								if( wt2 <= 64.8768 )
									ret := -0.108333
								if( wt2 > 64.8768 )
									ret := -0.833333 // sell
							if( tci > 67.6683 )
								if( ci <= 70.4702 )
									ret := 0.459459
								if( ci > 70.4702 )
									ret := -0.800000 // sell
				if( ap > 1.44283 )
					if( d_tci <= -44.2342 )
						if( d_tci <= -71.7746 )
							if( wt2 <= 80.3948 )
								if( ci <= 69.3305 )
									ret := -0.242424
								if( ci > 69.3305 )
									ret := -0.673077
							if( wt2 > 80.3948 )
								if( esa <= 5.01865 )
									ret := -0.206897
								if( esa > 5.01865 )
									ret := 0.611111
						if( d_tci > -71.7746 )
							if( ci_wt2 <= -84.8736 )
								if( wt2 <= 60.9499 )
									ret := 0.306452
								if( wt2 > 60.9499 )
									ret := 0.607692
							if( ci_wt2 > -84.8736 )
								if( wt2 <= 48.0202 )
									ret := 0.388140
								if( wt2 > 48.0202 )
									ret := 0.160335
					if( d_tci > -44.2342 )
						if( d <= 1.08757 )
							if( ci <= -70.1501 )
								if( ap <= 48.9016 )
									ret := 0.135601
								if( ap > 48.9016 )
									ret := -0.174033
							if( ci > -70.1501 )
								if( d <= 0.689945 )
									ret := 0.071751
								if( d > 0.689945 )
									ret := 0.467532
						if( d > 1.08757 )
							if( ap <= 55.831 )
								if( d_tci <= 47.9761 )
									ret := 0.700000 // buy
								if( d_tci > 47.9761 )
									ret := 1.000000 // buy
							if( ap > 55.831 )
								ret := 0.250000
			if( ap > 56.3596 )
				if( ci <= -79.0657 )
					if( d_tci <= 5.15144 )
						if( ci_wt2 <= -140.156 )
							if( ci_wt2 <= -147.697 )
								ret := -0.285714
							if( ci_wt2 > -147.697 )
								if( esa <= 78.3146 )
									ret := -0.500000
								if( esa > 78.3146 )
									ret := -1.000000 // sell
						if( ci_wt2 > -140.156 )
							if( tci <= 37.4175 )
								if( ci_wt2 <= -119.919 )
									ret := 0.058140
								if( ci_wt2 > -119.919 )
									ret := -0.262136
							if( tci > 37.4175 )
								ret := 1.000000 // buy
					if( d_tci > 5.15144 )
						if( tci <= -13.5186 )
							if( ap <= 69.6758 )
								if( ci <= -81.9099 )
									ret := 0.315634
								if( ci > -81.9099 )
									ret := -0.166667
							if( ap > 69.6758 )
								if( wt2 <= -57.7455 )
									ret := 0.454545
								if( wt2 > -57.7455 )
									ret := -0.110294
						if( tci > -13.5186 )
							if( d <= 0.329334 )
								if( ci_wt2 <= -89.2738 )
									ret := -0.045455
								if( ci_wt2 > -89.2738 )
									ret := 0.875000 // buy
							if( d > 0.329334 )
								if( ci <= -87.9882 )
									ret := 0.863636 // buy
								if( ci > -87.9882 )
									ret := 0.529412
				if( ci > -79.0657 )
					if( esa <= 78.005 )
						if( esa <= 71.6401 )
							if( wt2 <= -59.1676 )
								if( ci <= -67.1867 )
									ret := -0.461538
								if( ci > -67.1867 )
									ret := -0.857143 // sell
							if( wt2 > -59.1676 )
								if( ap <= 63.9233 )
									ret := 0.023326
								if( ap > 63.9233 )
									ret := -0.104663
						if( esa > 71.6401 )
							if( ci_wt2 <= -80.9468 )
								if( wt2 <= 39.6157 )
									ret := 0.725000 // buy
								if( wt2 > 39.6157 )
									ret := 0.208333
							if( ci_wt2 > -80.9468 )
								if( tci <= 55.6051 )
									ret := 0.056522
								if( tci > 55.6051 )
									ret := 0.348837
					if( esa > 78.005 )
						if( ci <= 43.9303 )
							if( tci <= -48.5419 )
								if( ap <= 77.7873 )
									ret := -0.615385
								if( ap > 77.7873 )
									ret := 0.545455
							if( tci > -48.5419 )
								if( d <= 1.94549 )
									ret := -0.075103
								if( d > 1.94549 )
									ret := -0.777778 // sell
						if( ci > 43.9303 )
							if( wt2 <= 55.6515 )
								if( d_tci <= -47.0727 )
									ret := -0.931034 // sell
								if( d_tci > -47.0727 )
									ret := -0.500000
							if( wt2 > 55.6515 )
								if( esa <= 87.0048 )
									ret := -0.521739
								if( esa > 87.0048 )
									ret := 0.058824
	if( ci_wt2 > 1.07242 )
		if( ci_wt2 <= 77.7039 )
			if( tci <= 63.2487 )
				if( ci <= -68.2081 )
					if( ci_wt2 <= 2.17541 )
						if( wt2 <= -70.4975 )
							if( ap <= 15.6858 )
								if( tci <= -78.7708 )
									ret := -1.000000 // sell
								if( tci > -78.7708 )
									ret := -0.750000 // sell
							if( ap > 15.6858 )
								ret := 0.333333
						if( wt2 > -70.4975 )
							if( tci <= -70.2406 )
								ret := 0.750000 // buy
							if( tci > -70.2406 )
								ret := 1.000000 // buy
					if( ci_wt2 > 2.17541 )
						if( ci <= -71.3898 )
							if( ci_wt2 <= 7.47164 )
								if( esa <= 1.36665 )
									ret := 0.750000 // buy
								if( esa > 1.36665 )
									ret := 1.000000 // buy
							if( ci_wt2 > 7.47164 )
								if( ci_wt2 <= 28.0786 )
									ret := 0.000000
								if( ci_wt2 > 28.0786 )
									ret := 1.000000 // buy
						if( ci > -71.3898 )
							if( ap <= 6.53092 )
								ret := 0.000000
							if( ap > 6.53092 )
								if( tci <= -74.6076 )
									ret := 0.285714
								if( tci > -74.6076 )
									ret := 0.909091 // buy
				if( ci > -68.2081 )
					if( d <= 0.009899 )
						if( ci_wt2 <= 5.16643 )
							if( esa <= 1.28722 )
								if( wt2 <= 24.8972 )
									ret := -0.490000
								if( wt2 > 24.8972 )
									ret := -0.095238
							if( esa > 1.28722 )
								if( d_tci <= 22.1387 )
									ret := 0.064516
								if( d_tci > 22.1387 )
									ret := -0.312500
						if( ci_wt2 > 5.16643 )
							if( d_tci <= 49.146 )
								if( ci_wt2 <= 52.6662 )
									ret := -0.033167
								if( ci_wt2 > 52.6662 )
									ret := -0.156168
							if( d_tci > 49.146 )
								if( ap <= 0.680517 )
									ret := -0.714286 // sell
								if( ap > 0.680517 )
									ret := 0.192593
					if( d > 0.009899 )
						if( wt2 <= 20.2894 )
							if( esa <= 16.3686 )
								if( ci <= -63.5544 )
									ret := -0.480000
								if( ci > -63.5544 )
									ret := 0.078838
							if( esa > 16.3686 )
								if( tci <= -26.7803 )
									ret := -0.079624
								if( tci > -26.7803 )
									ret := 0.069258
						if( wt2 > 20.2894 )
							if( tci <= 60.0485 )
								if( esa <= 86.4752 )
									ret := -0.020770
								if( esa > 86.4752 )
									ret := -0.359155
							if( tci > 60.0485 )
								if( ci_wt2 <= 4.91366 )
									ret := -0.234043
								if( ci_wt2 > 4.91366 )
									ret := 0.231068
			if( tci > 63.2487 )
				if( tci <= 70.3863 )
					if( ci_wt2 <= 54.8551 )
						if( d <= 0.044077 )
							if( esa <= 1.68484 )
								if( ci <= 113.537 )
									ret := -0.320988
								if( ci > 113.537 )
									ret := 0.625000
							if( esa > 1.68484 )
								if( ci <= 98.8167 )
									ret := 0.450549
								if( ci > 98.8167 )
									ret := -0.189189
						if( d > 0.044077 )
							if( ap <= 16.427 )
								if( ci <= 77.7913 )
									ret := -0.658120
								if( ci > 77.7913 )
									ret := -0.229814
							if( ap > 16.427 )
								if( ap <= 84.2979 )
									ret := -0.082677
								if( ap > 84.2979 )
									ret := -0.650000
					if( ci_wt2 > 54.8551 )
						if( ap <= 71.1827 )
							if( ci_wt2 <= 63.3767 )
								if( tci <= 68.2655 )
									ret := -0.795918 // sell
								if( tci > 68.2655 )
									ret := -0.222222
							if( ci_wt2 > 63.3767 )
								if( ci_wt2 <= 72.1277 )
									ret := -0.282609
								if( ci_wt2 > 72.1277 )
									ret := -0.782609 // sell
						if( ap > 71.1827 )
							if( ci_wt2 <= 62.612 )
								ret := 0.750000 // buy
							if( ci_wt2 > 62.612 )
								ret := 0.000000
				if( tci > 70.3863 )
					if( d <= 0.024674 )
						if( ap <= 1.08179 )
							if( tci <= 74.2405 )
								ret := -0.500000
							if( tci > 74.2405 )
								ret := -1.000000 // sell
						if( ap > 1.08179 )
							if( wt2 <= 79.7182 )
								if( tci <= 76.4381 )
									ret := 0.458333
								if( tci > 76.4381 )
									ret := 0.958333 // buy
							if( wt2 > 79.7182 )
								ret := -0.500000
					if( d > 0.024674 )
						if( ap <= 2.14659 )
							if( ci_wt2 <= 17.4183 )
								if( tci <= 77.3225 )
									ret := -0.750000 // sell
								if( tci > 77.3225 )
									ret := -1.000000 // sell
							if( ci_wt2 > 17.4183 )
								if( ci_wt2 <= 42.8215 )
									ret := 0.181818
								if( ci_wt2 > 42.8215 )
									ret := -0.875000 // sell
						if( ap > 2.14659 )
							if( d <= 0.032557 )
								ret := 1.000000 // buy
							if( d > 0.032557 )
								if( tci <= 71.8215 )
									ret := 0.270000
								if( tci > 71.8215 )
									ret := -0.081871
		if( ci_wt2 > 77.7039 )
			if( ci <= 179.319 )
				if( ap <= 37.3061 )
					if( d_tci <= 67.3833 )
						if( ci_wt2 <= 152.191 )
							if( wt2 <= -13.8339 )
								if( tci <= -24.5124 )
									ret := -0.172003
								if( tci > -24.5124 )
									ret := -0.004690
							if( wt2 > -13.8339 )
								if( tci <= 2.97036 )
									ret := -0.340496
								if( tci > 2.97036 )
									ret := -0.148504
						if( ci_wt2 > 152.191 )
							if( tci <= 5.25633 )
								if( wt2 <= -10.6479 )
									ret := -0.301413
								if( wt2 > -10.6479 )
									ret := -0.872340 // sell
							if( tci > 5.25633 )
								if( ci_wt2 <= 155.456 )
									ret := -0.476190
								if( ci_wt2 > 155.456 )
									ret := 0.055556
					if( d_tci > 67.3833 )
						if( esa <= 0.856132 )
							if( wt2 <= -139.911 )
								ret := -0.250000
							if( wt2 > -139.911 )
								ret := -1.000000 // sell
						if( esa > 0.856132 )
							ret := -1.000000 // sell
				if( ap > 37.3061 )
					if( esa <= 85.1606 )
						if( tci <= -6.65721 )
							if( esa <= 71.0007 )
								if( tci <= -40.9184 )
									ret := 0.483333
								if( tci > -40.9184 )
									ret := -0.087041
							if( esa > 71.0007 )
								if( d_tci <= 37.57 )
									ret := -0.192308
								if( d_tci > 37.57 )
									ret := -0.566038
						if( tci > -6.65721 )
							if( esa <= 79.757 )
								if( d <= 0.392102 )
									ret := -0.030343
								if( d > 0.392102 )
									ret := 0.175365
							if( esa > 79.757 )
								if( ci_wt2 <= 79.7552 )
									ret := -0.625000
								if( ci_wt2 > 79.7552 )
									ret := 0.460432
					if( esa > 85.1606 )
						if( d <= 0.90639 )
							if( d <= 0.220088 )
								if( ap <= 87.275 )
									ret := 0.250000
								if( ap > 87.275 )
									ret := 0.000000
							if( d > 0.220088 )
								if( ci_wt2 <= 85.6975 )
									ret := 0.076923
								if( ci_wt2 > 85.6975 )
									ret := -0.465753
						if( d > 0.90639 )
							if( wt2 <= -15.7361 )
								if( tci <= -24.548 )
									ret := -0.777778 // sell
								if( tci > -24.548 )
									ret := -1.000000 // sell
							if( wt2 > -15.7361 )
								if( esa <= 88.9867 )
									ret := 0.000000
								if( esa > 88.9867 )
									ret := -0.875000 // sell
			if( ci > 179.319 )
				if( d <= 0.063587 )
					if( wt2 <= -47.2276 )
						ret := 0.666667
					if( wt2 > -47.2276 )
						if( tci <= -4.56381 )
							if( wt2 <= -37.3648 )
								if( tci <= -15.9302 )
									ret := -0.696970
								if( tci > -15.9302 )
									ret := 1.000000 // buy
							if( wt2 > -37.3648 )
								if( ci <= 187.462 )
									ret := -0.777778 // sell
								if( ci > 187.462 )
									ret := -0.959184 // sell
						if( tci > -4.56381 )
							if( esa <= 1.96821 )
								if( ap <= 0.7207 )
									ret := 0.400000
								if( ap > 0.7207 )
									ret := -0.693252
							if( esa > 1.96821 )
								if( ci_wt2 <= 233.884 )
									ret := -0.248826
								if( ci_wt2 > 233.884 )
									ret := -0.772727 // sell
				if( d > 0.063587 )
					if( wt2 <= 33.7705 )
						if( tci <= 23.0124 )
							if( d_tci <= -0.473597 )
								if( esa <= 43.6442 )
									ret := -0.400000
								if( esa > 43.6442 )
									ret := -0.750000 // sell
							if( d_tci > -0.473597 )
								if( ci <= 192.527 )
									ret := 0.500000
								if( ci > 192.527 )
									ret := -0.214286
						if( tci > 23.0124 )
							if( tci <= 35.2105 )
								if( wt2 <= 15.8124 )
									ret := 0.626667
								if( wt2 > 15.8124 )
									ret := -0.411765
							if( tci > 35.2105 )
								if( ci_wt2 <= 164.229 )
									ret := 0.318182
								if( ci_wt2 > 164.229 )
									ret := -0.301587
					if( wt2 > 33.7705 )
						if( ci_wt2 <= 133.542 )
							if( wt2 <= 55.4633 )
								ret := -0.750000 // sell
							if( wt2 > 55.4633 )
								if( ci <= 184.622 )
									ret := -0.333333
								if( ci > 184.622 )
									ret := 0.777778 // buy
						if( ci_wt2 > 133.542 )
							if( ap <= 69.993 )
								if( ap <= 18.9683 )
									ret := -0.576923
								if( ap > 18.9683 )
									ret := -0.868852 // sell
							if( ap > 69.993 )
								if( esa <= 70.5193 )
									ret := 0.500000
								if( esa > 70.5193 )
									ret := -0.142857
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_APPS_15Min_ba3df2cf(tci, ci, d_tci, esa, d, ci_wt2, wt2, ap)

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


