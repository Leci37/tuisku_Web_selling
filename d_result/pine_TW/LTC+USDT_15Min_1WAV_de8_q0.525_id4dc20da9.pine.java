//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: LTCUSDT_15Min_1WAV_4dc20da9 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1WAV_4dc20da9", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_4dc20da9(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci <= -48.0727 )
		if( d <= 0.31256 )
			if( ap <= 69.5363 )
				if( d <= 0.131397 )
					if( wt2 <= -11.2131 )
						if( d_tci <= 18.3656 )
							if( d <= 0.078186 )
								ret := 0.000000
							if( d > 0.078186 )
								if( ci_wt2 <= -81.421 )
									ret := 0.000000
								if( ci_wt2 > -81.421 )
									ret := -0.689655
						if( d_tci > 18.3656 )
							if( wt2 <= -17.2868 )
								if( wt2 <= -26.4738 )
									ret := -0.018286
								if( wt2 > -26.4738 )
									ret := 0.125296
							if( wt2 > -17.2868 )
								if( d <= 0.118532 )
									ret := -0.040201
								if( d > 0.118532 )
									ret := -0.437500
					if( wt2 > -11.2131 )
						if( tci <= 17.0456 )
							if( ci <= -51.6995 )
								if( ci_wt2 <= -52.0226 )
									ret := 0.132934
								if( ci_wt2 > -52.0226 )
									ret := -0.355556
							if( ci > -51.6995 )
								if( d_tci <= -8.98354 )
									ret := 0.694444
								if( d_tci > -8.98354 )
									ret := 0.232143
						if( tci > 17.0456 )
							if( ci <= -133.038 )
								if( ci_wt2 <= -173.981 )
									ret := 0.625000
								if( ci_wt2 > -173.981 )
									ret := 1.000000 // buy
							if( ci > -133.038 )
								if( ci_wt2 <= -151.831 )
									ret := -0.576923
								if( ci_wt2 > -151.831 )
									ret := -0.025701
				if( d > 0.131397 )
					if( d_tci <= 68.8847 )
						if( ci <= -237.197 )
							if( d <= 0.254714 )
								ret := 1.000000 // buy
							if( d > 0.254714 )
								ret := 0.250000
						if( ci > -237.197 )
							if( esa <= 53.4142 )
								if( ci <= -175.37 )
									ret := -0.411765
								if( ci > -175.37 )
									ret := 0.301607
							if( esa > 53.4142 )
								if( tci <= -26.4437 )
									ret := 0.217985
								if( tci > -26.4437 )
									ret := 0.128459
					if( d_tci > 68.8847 )
						if( ap <= 52.545 )
							ret := 0.857143 // buy
						if( ap > 52.545 )
							if( d <= 0.306325 )
								if( tci <= -69.0629 )
									ret := -0.198276
								if( tci > -69.0629 )
									ret := -0.888889 // sell
							if( d > 0.306325 )
								ret := 0.833333 // buy
			if( ap > 69.5363 )
				if( ci <= -193.055 )
					if( tci <= -33.2839 )
						if( esa <= 74.9604 )
							ret := -0.200000
						if( esa > 74.9604 )
							if( esa <= 96.4792 )
								if( ci <= -199.387 )
									ret := 0.906977 // buy
								if( ci > -199.387 )
									ret := 0.500000
							if( esa > 96.4792 )
								ret := 0.250000
					if( tci > -33.2839 )
						if( tci <= -23.8376 )
							if( ci <= -235.504 )
								ret := 1.000000 // buy
							if( ci > -235.504 )
								if( d <= 0.129265 )
									ret := -0.500000
								if( d > 0.129265 )
									ret := -0.882353 // sell
						if( tci > -23.8376 )
							if( tci <= -3.52824 )
								if( ap <= 85.3729 )
									ret := 0.888889 // buy
								if( ap > 85.3729 )
									ret := 0.400000
							if( tci > -3.52824 )
								if( d_tci <= -3.70838 )
									ret := 0.000000
								if( d_tci > -3.70838 )
									ret := -0.250000
				if( ci > -193.055 )
					if( esa <= 89.653 )
						if( ap <= 86.8969 )
							if( d_tci <= 33.7891 )
								if( ap <= 74.32 )
									ret := -0.056025
								if( ap > 74.32 )
									ret := 0.046990
							if( d_tci > 33.7891 )
								if( ci <= -130.409 )
									ret := 0.290030
								if( ci > -130.409 )
									ret := 0.032307
						if( ap > 86.8969 )
							if( ap <= 87.3198 )
								if( ap <= 87.2542 )
									ret := 0.257576
								if( ap > 87.2542 )
									ret := 0.740741 // buy
							if( ap > 87.3198 )
								if( d <= 0.22625 )
									ret := 0.001603
								if( d > 0.22625 )
									ret := 0.292000
					if( esa > 89.653 )
						if( d_tci <= 45.0157 )
							if( wt2 <= -39.2908 )
								if( wt2 <= -40.881 )
									ret := -0.282609
								if( wt2 > -40.881 )
									ret := -0.807692 // sell
							if( wt2 > -39.2908 )
								if( ci <= -124.735 )
									ret := 0.104683
								if( ci > -124.735 )
									ret := -0.078780
						if( d_tci > 45.0157 )
							if( ci_wt2 <= -77.3148 )
								if( ci_wt2 <= -88.2336 )
									ret := 0.063492
								if( ci_wt2 > -88.2336 )
									ret := -0.681818
							if( ci_wt2 > -77.3148 )
								if( wt2 <= -53.1979 )
									ret := -0.125000
								if( wt2 > -53.1979 )
									ret := 0.306306
		if( d > 0.31256 )
			if( esa <= 100.881 )
				if( esa <= 66.2605 )
					if( d_tci <= 61.1519 )
						if( esa <= 42.7439 )
							ret := 1.000000 // buy
						if( esa > 42.7439 )
							if( ci_wt2 <= -103.07 )
								if( esa <= 60.8718 )
									ret := -0.246445
								if( esa > 60.8718 )
									ret := 0.191257
							if( ci_wt2 > -103.07 )
								if( esa <= 62.3408 )
									ret := 0.212963
								if( esa > 62.3408 )
									ret := -0.050119
					if( d_tci > 61.1519 )
						if( d_tci <= 80.8077 )
							if( tci <= -72.775 )
								if( d <= 0.452856 )
									ret := -0.257143
								if( d > 0.452856 )
									ret := 0.275701
							if( tci > -72.775 )
								if( esa <= 51.2731 )
									ret := -0.012500
								if( esa > 51.2731 )
									ret := 0.459364
						if( d_tci > 80.8077 )
							if( d <= 0.860837 )
								if( esa <= 65.2276 )
									ret := 0.437500
								if( esa > 65.2276 )
									ret := -1.000000 // sell
							if( d > 0.860837 )
								if( d <= 1.71581 )
									ret := -0.783784 // sell
								if( d > 1.71581 )
									ret := 0.000000
				if( esa > 66.2605 )
					if( ci_wt2 <= -166.525 )
						if( ci <= -190.333 )
							if( ap <= 70.9246 )
								if( ci_wt2 <= -239.986 )
									ret := 0.750000 // buy
								if( ci_wt2 > -239.986 )
									ret := 1.000000 // buy
							if( ap > 70.9246 )
								if( d <= 0.69965 )
									ret := 0.068493
								if( d > 0.69965 )
									ret := 1.000000 // buy
						if( ci > -190.333 )
							if( ci <= -119.817 )
								if( d_tci <= 3.11691 )
									ret := 0.716667 // buy
								if( d_tci > 3.11691 )
									ret := 0.951613 // buy
							if( ci > -119.817 )
								ret := -0.500000
					if( ci_wt2 > -166.525 )
						if( d_tci <= 75.4284 )
							if( tci <= 33.6413 )
								if( ci <= -180.379 )
									ret := -0.619048
								if( ci > -180.379 )
									ret := 0.250979
							if( tci > 33.6413 )
								if( tci <= 51.1485 )
									ret := -0.311111
								if( tci > 51.1485 )
									ret := 0.777778 // buy
						if( d_tci > 75.4284 )
							if( wt2 <= -87.8384 )
								if( ci_wt2 <= 31.8922 )
									ret := -0.533333
								if( ci_wt2 > 31.8922 )
									ret := 0.307692
							if( wt2 > -87.8384 )
								if( esa <= 68.3783 )
									ret := 0.052632
								if( esa > 68.3783 )
									ret := 0.603687
			if( esa > 100.881 )
				if( ap <= 102.212 )
					if( wt2 <= -27.8229 )
						if( wt2 <= -64.0713 )
							if( esa <= 101.419 )
								ret := -0.571429
							if( esa > 101.419 )
								if( esa <= 102.313 )
									ret := -0.818182 // sell
								if( esa > 102.313 )
									ret := -1.000000 // sell
						if( wt2 > -64.0713 )
							if( tci <= -54.2313 )
								if( ci_wt2 <= -80.7109 )
									ret := -0.750000 // sell
								if( ci_wt2 > -80.7109 )
									ret := 0.062500
							if( tci > -54.2313 )
								if( esa <= 102.693 )
									ret := -0.594203
								if( esa > 102.693 )
									ret := 0.181818
					if( wt2 > -27.8229 )
						if( esa <= 101.903 )
							if( esa <= 101.007 )
								if( ci <= -83.1073 )
									ret := -0.166667
								if( ci > -83.1073 )
									ret := -0.800000 // sell
							if( esa > 101.007 )
								if( ap <= 101.334 )
									ret := 0.638889
								if( ap > 101.334 )
									ret := -0.250000
						if( esa > 101.903 )
							if( d_tci <= 16.4431 )
								if( ci_wt2 <= -145.485 )
									ret := 0.400000
								if( ci_wt2 > -145.485 )
									ret := -0.588235
							if( d_tci > 16.4431 )
								if( wt2 <= -15.544 )
									ret := -0.500000
								if( wt2 > -15.544 )
									ret := -1.000000 // sell
				if( ap > 102.212 )
					if( ci <= -61.1631 )
						if( tci <= -60.214 )
							if( esa <= 103.955 )
								ret := 0.666667
							if( esa > 103.955 )
								if( wt2 <= -59.09 )
									ret := 0.000000
								if( wt2 > -59.09 )
									ret := -1.000000 // sell
						if( tci > -60.214 )
							if( ci <= -75.1351 )
								if( d_tci <= 42.2087 )
									ret := 0.188406
								if( d_tci > 42.2087 )
									ret := 0.684211
							if( ci > -75.1351 )
								if( ci <= -67.9181 )
									ret := 0.925926 // buy
								if( ci > -67.9181 )
									ret := 0.437500
					if( ci > -61.1631 )
						if( ci_wt2 <= -60.1033 )
							if( tci <= 17.7102 )
								ret := 0.000000
							if( tci > 17.7102 )
								if( d <= 0.391825 )
									ret := 1.000000 // buy
								if( d > 0.391825 )
									ret := 0.444444
						if( ci_wt2 > -60.1033 )
							if( ci_wt2 <= -27.2107 )
								if( d_tci <= 12.9867 )
									ret := -0.750000 // sell
								if( d_tci > 12.9867 )
									ret := -1.000000 // sell
							if( ci_wt2 > -27.2107 )
								if( ap <= 105.253 )
									ret := 0.666667
								if( ap > 105.253 )
									ret := -0.833333 // sell
	if( ci > -48.0727 )
		if( ap <= 100.525 )
			if( wt2 <= -57.0703 )
				if( tci <= -77.0959 )
					if( ci_wt2 <= 50.9031 )
						if( esa <= 69.1359 )
							if( d <= 0.657667 )
								ret := -0.750000 // sell
							if( d > 0.657667 )
								ret := -1.000000 // sell
						if( esa > 69.1359 )
							if( ci <= -44.9381 )
								ret := -0.750000 // sell
							if( ci > -44.9381 )
								ret := 0.000000
					if( ci_wt2 > 50.9031 )
						ret := 0.142857
				if( tci > -77.0959 )
					if( ci_wt2 <= 30.7626 )
						if( esa <= 70.5309 )
							if( ci <= -44.035 )
								if( d <= 0.942071 )
									ret := -0.073684
								if( d > 0.942071 )
									ret := 1.000000 // buy
							if( ci > -44.035 )
								if( tci <= -56.2145 )
									ret := 0.554585
								if( tci > -56.2145 )
									ret := 0.070175
						if( esa > 70.5309 )
							if( ci <= -30.6116 )
								if( ci_wt2 <= 18.9511 )
									ret := 0.363636
								if( ci_wt2 > 18.9511 )
									ret := 0.031390
							if( ci > -30.6116 )
								if( ci <= -29.489 )
									ret := -0.846154 // sell
								if( ci > -29.489 )
									ret := -0.090909
					if( ci_wt2 > 30.7626 )
						if( d <= 1.53974 )
							if( wt2 <= -61.4246 )
								if( ci <= -7.54468 )
									ret := -0.066763
								if( ci > -7.54468 )
									ret := 0.190789
							if( wt2 > -61.4246 )
								if( ap <= 47.0571 )
									ret := -1.000000 // sell
								if( ap > 47.0571 )
									ret := 0.215504
						if( d > 1.53974 )
							if( esa <= 83.9601 )
								if( tci <= -74.9222 )
									ret := 0.000000
								if( tci > -74.9222 )
									ret := 0.760870 // buy
							if( esa > 83.9601 )
								ret := -0.400000
			if( wt2 > -57.0703 )
				if( ap <= 51.8841 )
					if( d <= 0.540781 )
						if( ap <= 47.487 )
							if( d <= 0.31269 )
								if( tci <= 18.5805 )
									ret := 0.270833
								if( tci > 18.5805 )
									ret := -0.307692
							if( d > 0.31269 )
								if( ap <= 43.2333 )
									ret := 1.000000 // buy
								if( ap > 43.2333 )
									ret := -0.435374
						if( ap > 47.487 )
							if( d <= 0.127051 )
								if( d_tci <= -18.2342 )
									ret := -0.134454
								if( d_tci > -18.2342 )
									ret := 0.079121
							if( d > 0.127051 )
								if( d_tci <= 46.5941 )
									ret := 0.233038
								if( d_tci > 46.5941 )
									ret := -0.229508
					if( d > 0.540781 )
						if( d_tci <= -12.7127 )
							if( wt2 <= 8.1025 )
								if( d <= 0.68991 )
									ret := -0.500000
								if( d > 0.68991 )
									ret := -1.000000 // sell
							if( wt2 > 8.1025 )
								if( wt2 <= 59.6462 )
									ret := 0.534247
								if( wt2 > 59.6462 )
									ret := -0.214286
						if( d_tci > -12.7127 )
							if( ap <= 51.0997 )
								if( ci_wt2 <= 134.147 )
									ret := 0.976744 // buy
								if( ci_wt2 > 134.147 )
									ret := 0.750000 // buy
							if( ap > 51.0997 )
								if( tci <= -36.4615 )
									ret := 0.000000
								if( tci > -36.4615 )
									ret := 1.000000 // buy
				if( ap > 51.8841 )
					if( ci <= 38.2646 )
						if( ci <= 36.6505 )
							if( d <= 1.08297 )
								if( ap <= 62.6984 )
									ret := 0.060436
								if( ap > 62.6984 )
									ret := 0.009524
							if( d > 1.08297 )
								if( ci_wt2 <= -17.8151 )
									ret := 0.612500
								if( ci_wt2 > -17.8151 )
									ret := -0.025000
						if( ci > 36.6505 )
							if( esa <= 54.0217 )
								if( ap <= 52.0223 )
									ret := 0.250000
								if( ap > 52.0223 )
									ret := -0.535714
							if( esa > 54.0217 )
								if( esa <= 86.4864 )
									ret := 0.262231
								if( esa > 86.4864 )
									ret := 0.023121
					if( ci > 38.2646 )
						if( d <= 0.364255 )
							if( ap <= 60.8318 )
								if( wt2 <= 53.9385 )
									ret := -0.062154
								if( wt2 > 53.9385 )
									ret := 0.153846
							if( ap > 60.8318 )
								if( ci <= 213.041 )
									ret := 0.014870
								if( ci > 213.041 )
									ret := -0.423729
						if( d > 0.364255 )
							if( ci_wt2 <= 113.128 )
								if( wt2 <= -5.50661 )
									ret := -0.217617
								if( wt2 > -5.50661 )
									ret := -0.059106
							if( ci_wt2 > 113.128 )
								if( d <= 0.583887 )
									ret := 0.012966
								if( d > 0.583887 )
									ret := 0.371747
		if( ap > 100.525 )
			if( d_tci <= 2.82041 )
				if( ci_wt2 <= -76.765 )
					if( ci <= -45.4128 )
						ret := 0.250000
					if( ci > -45.4128 )
						if( d_tci <= -37.7145 )
							if( ap <= 106.188 )
								ret := 0.200000
							if( ap > 106.188 )
								ret := 1.000000 // buy
						if( d_tci > -37.7145 )
							ret := 1.000000 // buy
				if( ci_wt2 > -76.765 )
					if( d_tci <= -40.3138 )
						if( d_tci <= -58.2052 )
							if( ap <= 104.492 )
								if( ci_wt2 <= -7.65684 )
									ret := 0.485714
								if( ci_wt2 > -7.65684 )
									ret := 0.027778
							if( ap > 104.492 )
								if( ci <= 55.5151 )
									ret := 0.238095
								if( ci > 55.5151 )
									ret := -0.622642
						if( d_tci > -58.2052 )
							if( ci <= 143.718 )
								if( wt2 <= 51.1441 )
									ret := -0.257576
								if( wt2 > 51.1441 )
									ret := -0.534884
							if( ci > 143.718 )
								if( esa <= 102.91 )
									ret := -0.400000
								if( esa > 102.91 )
									ret := 0.909091 // buy
					if( d_tci > -40.3138 )
						if( d <= 0.332369 )
							if( ci_wt2 <= 172.884 )
								if( wt2 <= 17.9473 )
									ret := -0.449367
								if( wt2 > 17.9473 )
									ret := -0.044944
							if( ci_wt2 > 172.884 )
								if( d_tci <= -8.15529 )
									ret := 0.750000 // buy
								if( d_tci > -8.15529 )
									ret := 1.000000 // buy
						if( d > 0.332369 )
							if( ap <= 107.915 )
								if( ci_wt2 <= 132.067 )
									ret := 0.426230
								if( ci_wt2 > 132.067 )
									ret := -0.666667
							if( ap > 107.915 )
								if( ci <= 8.38619 )
									ret := 0.333333
								if( ci > 8.38619 )
									ret := -0.617647
			if( d_tci > 2.82041 )
				if( d <= 0.214078 )
					if( wt2 <= -29.547 )
						if( esa <= 102.063 )
							if( tci <= -31.8499 )
								if( ap <= 100.943 )
									ret := 0.500000
								if( ap > 100.943 )
									ret := -0.333333
							if( tci > -31.8499 )
								if( ap <= 101.31 )
									ret := 0.375000
								if( ap > 101.31 )
									ret := 1.000000 // buy
						if( esa > 102.063 )
							if( d <= 0.143757 )
								ret := -0.500000
							if( d > 0.143757 )
								if( esa <= 105.616 )
									ret := -0.062500
								if( esa > 105.616 )
									ret := 0.714286 // buy
					if( wt2 > -29.547 )
						if( ci_wt2 <= 133.14 )
							if( ci <= -30.1432 )
								if( wt2 <= -13.4978 )
									ret := 0.909091 // buy
								if( wt2 > -13.4978 )
									ret := -0.500000
							if( ci > -30.1432 )
								if( wt2 <= -16.987 )
									ret := -0.600000
								if( wt2 > -16.987 )
									ret := -0.171429
						if( ci_wt2 > 133.14 )
							ret := 1.000000 // buy
				if( d > 0.214078 )
					if( wt2 <= -14.2968 )
						if( wt2 <= -20.4719 )
							if( d_tci <= 50.6968 )
								if( tci <= -16.9266 )
									ret := -0.615819
								if( tci > -16.9266 )
									ret := 0.000000
							if( d_tci > 50.6968 )
								if( tci <= -56.1711 )
									ret := -0.391304
								if( tci > -56.1711 )
									ret := 0.230769
						if( wt2 > -20.4719 )
							if( ap <= 101.208 )
								if( d <= 0.297193 )
									ret := 0.200000
								if( d > 0.297193 )
									ret := -0.750000 // sell
							if( ap > 101.208 )
								if( d <= 0.415962 )
									ret := 0.222222
								if( d > 0.415962 )
									ret := 1.000000 // buy
					if( wt2 > -14.2968 )
						if( ap <= 101.34 )
							if( esa <= 100.682 )
								ret := -0.857143 // sell
							if( esa > 100.682 )
								ret := 0.428571
						if( ap > 101.34 )
							if( ci_wt2 <= -11.199 )
								if( esa <= 107.202 )
									ret := -1.000000 // sell
								if( esa > 107.202 )
									ret := -0.750000 // sell
							if( ci_wt2 > -11.199 )
								if( d <= 0.490783 )
									ret := -0.444444
								if( d > 0.490783 )
									ret := -0.916667 // sell
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_4dc20da9(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


