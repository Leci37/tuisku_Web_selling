//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI
// ID_model: LTCUSDT_15Min_1S00_7804a4e2 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_1S00_7804a4e2", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_7804a4e2(d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( smoothK_k <= 34.6441 )
		if( k <= 15.1319 )
			if( d <= 4.80801 )
				if( k <= 9.77038 )
					if( d <= 3.15948 )
						if( rsi1 <= 37.7496 )
							if( k <= 4.41545 )
								if( rsi1 <= 27.5787 )
									ret := -0.476579
								if( rsi1 > 27.5787 )
									ret := -0.350459
							if( k > 4.41545 )
								if( d <= 1.84821 )
									ret := -0.780488 // sell
								if( d > 1.84821 )
									ret := -0.542857
						if( rsi1 > 37.7496 )
							if( smoothK_k <= -1.22057 )
								if( rsi1 <= 39.4562 )
									ret := 0.153846
								if( rsi1 > 39.4562 )
									ret := -0.285535
							if( smoothK_k > -1.22057 )
								if( d_k <= -1.37285 )
									ret := -0.279476
								if( d_k > -1.37285 )
									ret := -0.537954
					if( d > 3.15948 )
						if( smoothD_d <= 0.177555 )
							if( rsi1 <= 28.9939 )
								ret := 0.545455
							if( rsi1 > 28.9939 )
								ret := -0.062500
						if( smoothD_d > 0.177555 )
							if( rsi1 <= 35.5543 )
								if( k <= 4.73345 )
									ret := -0.392379
								if( k > 4.73345 )
									ret := -0.586331
							if( rsi1 > 35.5543 )
								if( rsi1 <= 48.1828 )
									ret := -0.113318
								if( rsi1 > 48.1828 )
									ret := -0.396970
				if( k > 9.77038 )
					if( rsi1 <= 46.8441 )
						if( rsi1 <= 26.486 )
							if( smoothD_d <= 1.22035 )
								ret := -0.533333
							if( smoothD_d > 1.22035 )
								ret := -0.666667
						if( rsi1 > 26.486 )
							if( rsi1 <= 34.2508 )
								if( rsi1 <= 33.4587 )
									ret := -0.888889 // sell
								if( rsi1 > 33.4587 )
									ret := -1.000000 // sell
							if( rsi1 > 34.2508 )
								if( d_k <= -7.94037 )
									ret := -1.000000 // sell
								if( d_k > -7.94037 )
									ret := -0.700000 // sell
					if( rsi1 > 46.8441 )
						if( smoothD_d <= 1.50228 )
							if( smoothD_d <= 0.622662 )
								ret := -0.363636
							if( smoothD_d > 0.622662 )
								if( k <= 10.7536 )
									ret := -0.920000 // sell
								if( k > 10.7536 )
									ret := -0.375000
						if( smoothD_d > 1.50228 )
							ret := 0.000000
			if( d > 4.80801 )
				if( rsi1 <= 44.4166 )
					if( d <= 20.2322 )
						if( d_k <= -7.12812 )
							if( smoothK_k <= 11.2258 )
								if( smoothK_k <= 10.1781 )
									ret := -0.333333
								if( smoothK_k > 10.1781 )
									ret := -0.883495 // sell
							if( smoothK_k > 11.2258 )
								if( rsi1 <= 36.9397 )
									ret := -0.853659 // sell
								if( rsi1 > 36.9397 )
									ret := 0.031250
						if( d_k > -7.12812 )
							if( smoothK_k <= -2.33021 )
								if( smoothD_d <= 9.99029 )
									ret := -0.362553
								if( smoothD_d > 9.99029 )
									ret := -0.611732
							if( smoothK_k > -2.33021 )
								if( rsi1 <= 15.1477 )
									ret := -0.691803
								if( rsi1 > 15.1477 )
									ret := -0.271485
					if( d > 20.2322 )
						if( smoothD_d <= 34.2929 )
							if( k <= 1.32005 )
								if( d <= 23.1339 )
									ret := -0.477273
								if( d > 23.1339 )
									ret := -0.831683 // sell
							if( k > 1.32005 )
								if( d_k <= 14.6963 )
									ret := -0.524444
								if( d_k > 14.6963 )
									ret := -0.311943
						if( smoothD_d > 34.2929 )
							if( d <= 45.7682 )
								if( d <= 42.9261 )
									ret := -0.741259 // sell
								if( d > 42.9261 )
									ret := -0.307692
							if( d > 45.7682 )
								ret := -1.000000 // sell
				if( rsi1 > 44.4166 )
					if( d_k <= 23.2563 )
						if( d_k <= 11.6322 )
							if( smoothD_d <= 16.0383 )
								if( smoothK_k <= 7.26316 )
									ret := -0.223837
								if( smoothK_k > 7.26316 )
									ret := -0.113636
							if( smoothD_d > 16.0383 )
								if( smoothD_d <= 18.6644 )
									ret := 0.176030
								if( smoothD_d > 18.6644 )
									ret := -0.265734
						if( d_k > 11.6322 )
							if( rsi1 <= 50.083 )
								if( d <= 17.9846 )
									ret := -0.681159
								if( d > 17.9846 )
									ret := -0.294686
							if( rsi1 > 50.083 )
								if( rsi1 <= 52.4009 )
									ret := 0.104575
								if( rsi1 > 52.4009 )
									ret := -0.257699
					if( d_k > 23.2563 )
						if( k <= 12.5181 )
							if( rsi1 <= 51.5879 )
								if( smoothD_d <= 36.5553 )
									ret := 0.164557
								if( smoothD_d > 36.5553 )
									ret := -0.736842 // sell
							if( rsi1 > 51.5879 )
								if( d <= 30.4467 )
									ret := 0.600000
								if( d > 30.4467 )
									ret := 0.217949
						if( k > 12.5181 )
							if( d_k <= 26.833 )
								if( smoothD_d <= 36.4133 )
									ret := -0.520000
								if( smoothD_d > 36.4133 )
									ret := -1.000000 // sell
							if( d_k > 26.833 )
								ret := -0.315789
		if( k > 15.1319 )
			if( smoothD_d <= 13.8759 )
				if( d <= 12.7853 )
					if( k <= 25.8805 )
						if( k <= 16.1808 )
							if( d <= 9.83134 )
								if( smoothD_d <= 5.56454 )
									ret := -0.198830
								if( smoothD_d > 5.56454 )
									ret := -0.663043
							if( d > 9.83134 )
								if( d <= 11.1007 )
									ret := 0.313953
								if( d > 11.1007 )
									ret := -0.171171
						if( k > 16.1808 )
							if( rsi1 <= 23.8344 )
								if( smoothK_k <= 14.5588 )
									ret := -0.096774
								if( smoothK_k > 14.5588 )
									ret := -0.899083 // sell
							if( rsi1 > 23.8344 )
								if( smoothD_d <= 9.26967 )
									ret := -0.341952
								if( smoothD_d > 9.26967 )
									ret := -0.536000
					if( k > 25.8805 )
						if( smoothK_k <= 29.943 )
							if( d <= 10.596 )
								ret := -0.333333
							if( d > 10.596 )
								if( d_k <= -17.9312 )
									ret := 0.800000 // buy
								if( d_k > -17.9312 )
									ret := 0.306452
						if( smoothK_k > 29.943 )
							ret := -0.764706 // sell
				if( d > 12.7853 )
					if( rsi1 <= 34.1219 )
						if( k <= 21.1573 )
							if( smoothD_d <= 13.1722 )
								if( smoothK_k <= 16.9297 )
									ret := -0.335244
								if( smoothK_k > 16.9297 )
									ret := 0.181818
							if( smoothD_d > 13.1722 )
								if( k <= 19.118 )
									ret := -0.500000
								if( k > 19.118 )
									ret := -0.916667 // sell
						if( k > 21.1573 )
							if( d <= 16.1922 )
								if( smoothD_d <= 12.6264 )
									ret := -0.703349 // sell
								if( smoothD_d > 12.6264 )
									ret := -0.270833
							if( d > 16.1922 )
								if( d <= 16.5055 )
									ret := -1.000000 // sell
								if( d > 16.5055 )
									ret := -0.688889
					if( rsi1 > 34.1219 )
						if( rsi1 <= 56.6863 )
							if( d_k <= 0.907306 )
								if( d_k <= -16.9567 )
									ret := -0.548387
								if( d_k > -16.9567 )
									ret := -0.148125
							if( d_k > 0.907306 )
								ret := 0.857143 // buy
						if( rsi1 > 56.6863 )
							if( d <= 13.5474 )
								if( rsi1 <= 63.5256 )
									ret := 0.100000
								if( rsi1 > 63.5256 )
									ret := -0.769231 // sell
							if( d > 13.5474 )
								if( smoothK_k <= 25.4928 )
									ret := 0.432927
								if( smoothK_k > 25.4928 )
									ret := -0.102564
			if( smoothD_d > 13.8759 )
				if( rsi1 <= 38.6702 )
					if( smoothD_d <= 33.513 )
						if( rsi1 <= 21.7249 )
							if( k <= 25.6756 )
								if( smoothD_d <= 17.8318 )
									ret := -0.228571
								if( smoothD_d > 17.8318 )
									ret := -0.701149 // sell
							if( k > 25.6756 )
								if( k <= 31.9104 )
									ret := 0.000000
								if( k > 31.9104 )
									ret := -0.666667
						if( rsi1 > 21.7249 )
							if( d <= 18.3324 )
								if( smoothK_k <= 12.8077 )
									ret := -0.613636
								if( smoothK_k > 12.8077 )
									ret := 0.088542
							if( d > 18.3324 )
								if( d_k <= 2.98472 )
									ret := -0.079312
								if( d_k > 2.98472 )
									ret := -0.298496
					if( smoothD_d > 33.513 )
						if( smoothK_k <= 28.2916 )
							if( d_k <= 21.6441 )
								if( smoothK_k <= 21.8951 )
									ret := -0.720307 // sell
								if( smoothK_k > 21.8951 )
									ret := -0.500000
							if( d_k > 21.6441 )
								if( smoothD_d <= 48.7963 )
									ret := -0.233449
								if( smoothD_d > 48.7963 )
									ret := -0.572414
						if( smoothK_k > 28.2916 )
							if( d <= 49.8659 )
								if( rsi1 <= 37.3413 )
									ret := 0.017921
								if( rsi1 > 37.3413 )
									ret := -0.640625
							if( d > 49.8659 )
								if( smoothD_d <= 59.2935 )
									ret := -0.588542
								if( smoothD_d > 59.2935 )
									ret := 0.000000
				if( rsi1 > 38.6702 )
					if( smoothD_d <= 33.394 )
						if( d <= 28.7616 )
							if( smoothD_d <= 24.8355 )
								if( rsi1 <= 40.7281 )
									ret := 0.164329
								if( rsi1 > 40.7281 )
									ret := -0.013934
							if( smoothD_d > 24.8355 )
								if( k <= 27.5577 )
									ret := 0.083333
								if( k > 27.5577 )
									ret := 0.420732
						if( d > 28.7616 )
							if( k <= 33.222 )
								if( rsi1 <= 39.0816 )
									ret := 0.615385
								if( rsi1 > 39.0816 )
									ret := -0.116174
							if( k > 33.222 )
								if( d_k <= -6.48027 )
									ret := -0.625000
								if( d_k > -6.48027 )
									ret := 0.240076
					if( smoothD_d > 33.394 )
						if( rsi1 <= 45.184 )
							if( d_k <= 14.0844 )
								if( smoothK_k <= 32.0809 )
									ret := -0.571930
								if( smoothK_k > 32.0809 )
									ret := -0.146067
							if( d_k > 14.0844 )
								if( smoothD_d <= 60.7971 )
									ret := -0.174326
								if( smoothD_d > 60.7971 )
									ret := -0.833333 // sell
						if( rsi1 > 45.184 )
							if( k <= 29.3146 )
								if( smoothD_d <= 43.8734 )
									ret := -0.290422
								if( smoothD_d > 43.8734 )
									ret := 0.086705
							if( k > 29.3146 )
								if( rsi1 <= 69.2076 )
									ret := -0.042146
								if( rsi1 > 69.2076 )
									ret := 0.362205
	if( smoothK_k > 34.6441 )
		if( k <= 76.9707 )
			if( smoothK_k <= 52.7687 )
				if( smoothD_d <= 46.5394 )
					if( rsi1 <= 32.8166 )
						if( smoothK_k <= 39.8448 )
							if( smoothD_d <= 24.3174 )
								if( d <= 18.8721 )
									ret := 0.000000
								if( d > 18.8721 )
									ret := -0.811881 // sell
							if( smoothD_d > 24.3174 )
								if( d <= 31.9265 )
									ret := 0.340000
								if( d > 31.9265 )
									ret := -0.361702
						if( smoothK_k > 39.8448 )
							if( smoothK_k <= 42.4557 )
								if( rsi1 <= 22.6199 )
									ret := -1.000000 // sell
								if( rsi1 > 22.6199 )
									ret := 0.323171
							if( smoothK_k > 42.4557 )
								if( d <= 37.9163 )
									ret := -0.459627
								if( d > 37.9163 )
									ret := 0.020833
					if( rsi1 > 32.8166 )
						if( smoothD_d <= 36.3649 )
							if( rsi1 <= 67.0003 )
								if( smoothK_k <= 36.9439 )
									ret := 0.155945
								if( smoothK_k > 36.9439 )
									ret := -0.030833
							if( rsi1 > 67.0003 )
								if( d_k <= -3.33837 )
									ret := 0.623616
								if( d_k > -3.33837 )
									ret := -0.357143
						if( smoothD_d > 36.3649 )
							if( d <= 42.2735 )
								if( k <= 50.6264 )
									ret := 0.404151
								if( k > 50.6264 )
									ret := 0.003413
							if( d > 42.2735 )
								if( d <= 49.052 )
									ret := 0.113300
								if( d > 49.052 )
									ret := 0.440000
				if( smoothD_d > 46.5394 )
					if( rsi1 <= 62.4196 )
						if( smoothD_d <= 58.599 )
							if( d_k <= 21.4643 )
								if( smoothD_d <= 47.3158 )
									ret := -0.338028
								if( smoothD_d > 47.3158 )
									ret := -0.076709
							if( d_k > 21.4643 )
								if( d <= 61.0384 )
									ret := -0.681818
								if( d > 61.0384 )
									ret := -0.846154 // sell
						if( smoothD_d > 58.599 )
							if( d <= 73.287 )
								if( smoothD_d <= 65.3922 )
									ret := 0.064562
								if( smoothD_d > 65.3922 )
									ret := -0.098662
							if( d > 73.287 )
								if( k <= 53.9248 )
									ret := 0.360000
								if( k > 53.9248 )
									ret := 0.061728
					if( rsi1 > 62.4196 )
						if( d_k <= 0.169768 )
							if( d_k <= -4.29441 )
								ret := 0.181818
							if( d_k > -4.29441 )
								if( k <= 54.3631 )
									ret := 0.615385
								if( k > 54.3631 )
									ret := 0.918919 // buy
						if( d_k > 0.169768 )
							if( smoothK_k <= 40.9981 )
								if( rsi1 <= 71.4388 )
									ret := 0.226415
								if( rsi1 > 71.4388 )
									ret := 0.800000 // buy
							if( smoothK_k > 40.9981 )
								if( rsi1 <= 72.99 )
									ret := 0.157546
								if( rsi1 > 72.99 )
									ret := -0.226744
			if( smoothK_k > 52.7687 )
				if( d_k <= 22.2704 )
					if( smoothD_d <= 83.6387 )
						if( rsi1 <= 52.6002 )
							if( rsi1 <= 26.1193 )
								if( d_k <= 6.9635 )
									ret := -0.628099
								if( d_k > 6.9635 )
									ret := -0.121622
							if( rsi1 > 26.1193 )
								if( smoothD_d <= 57.2923 )
									ret := 0.076853
								if( smoothD_d > 57.2923 )
									ret := -0.037170
						if( rsi1 > 52.6002 )
							if( rsi1 <= 68.3929 )
								if( d_k <= 14.292 )
									ret := 0.115015
								if( d_k > 14.292 )
									ret := 0.406780
							if( rsi1 > 68.3929 )
								if( d_k <= -22.0167 )
									ret := 0.677419
								if( d_k > -22.0167 )
									ret := 0.277058
					if( smoothD_d > 83.6387 )
						if( d <= 86.7211 )
							ret := 0.750000 // buy
						if( d > 86.7211 )
							if( smoothK_k <= 73.8577 )
								if( d <= 87.7367 )
									ret := 0.310976
								if( d > 87.7367 )
									ret := 0.478528
							if( smoothK_k > 73.8577 )
								ret := -0.285714
				if( d_k > 22.2704 )
					if( d <= 80.8855 )
						if( smoothD_d <= 77.1563 )
							ret := 0.733333 // buy
						if( smoothD_d > 77.1563 )
							ret := 0.187500
					if( d > 80.8855 )
						if( d_k <= 24.2005 )
							if( smoothD_d <= 81.3694 )
								if( smoothD_d <= 79.2581 )
									ret := 0.809524 // buy
								if( smoothD_d > 79.2581 )
									ret := 1.000000 // buy
							if( smoothD_d > 81.3694 )
								ret := 0.500000
						if( d_k > 24.2005 )
							ret := 0.444444
		if( k > 76.9707 )
			if( k <= 93.8992 )
				if( rsi1 <= 73.7983 )
					if( d <= 91.1955 )
						if( rsi1 <= 22.9295 )
							if( d <= 77.9756 )
								ret := -1.000000 // sell
							if( d > 77.9756 )
								ret := -0.750000 // sell
						if( rsi1 > 22.9295 )
							if( smoothD_d <= 76.4358 )
								if( smoothK_k <= 86.9405 )
									ret := 0.196808
								if( smoothK_k > 86.9405 )
									ret := 0.332966
							if( smoothD_d > 76.4358 )
								if( smoothD_d <= 81.6595 )
									ret := 0.055884
								if( smoothD_d > 81.6595 )
									ret := 0.179553
					if( d > 91.1955 )
						if( k <= 93.4482 )
							if( d <= 96.9116 )
								if( smoothK_k <= 89.9391 )
									ret := 0.274458
								if( smoothK_k > 89.9391 )
									ret := 0.456140
							if( d > 96.9116 )
								if( rsi1 <= 72.1842 )
									ret := 0.178344
								if( rsi1 > 72.1842 )
									ret := -0.750000 // sell
						if( k > 93.4482 )
							if( d_k <= 0.995031 )
								if( smoothK_k <= 90.8645 )
									ret := 0.245763
								if( smoothK_k > 90.8645 )
									ret := -0.545455
							if( d_k > 0.995031 )
								if( smoothK_k <= 90.8018 )
									ret := -0.161905
								if( smoothK_k > 90.8018 )
									ret := -0.394737
				if( rsi1 > 73.7983 )
					if( smoothK_k <= 77.8989 )
						if( k <= 77.3605 )
							if( rsi1 <= 76.6055 )
								ret := 0.375000
							if( rsi1 > 76.6055 )
								ret := 0.880000 // buy
						if( k > 77.3605 )
							if( smoothD_d <= 83.0285 )
								if( smoothD_d <= 59.9628 )
									ret := 0.622951
								if( smoothD_d > 59.9628 )
									ret := -0.142857
							if( smoothD_d > 83.0285 )
								if( rsi1 <= 75.9457 )
									ret := 0.545455
								if( rsi1 > 75.9457 )
									ret := 0.921569 // buy
					if( smoothK_k > 77.8989 )
						if( d <= 95.6603 )
							if( k <= 82.4045 )
								if( d <= 85.3915 )
									ret := 0.809917 // buy
								if( d > 85.3915 )
									ret := 0.571429
							if( k > 82.4045 )
								if( rsi1 <= 81.9934 )
									ret := 0.457466
								if( rsi1 > 81.9934 )
									ret := 0.282680
						if( d > 95.6603 )
							if( d_k <= 5.26193 )
								if( smoothK_k <= 90.0952 )
									ret := 0.869231 // buy
								if( smoothK_k > 90.0952 )
									ret := 0.611111
							if( d_k > 5.26193 )
								if( rsi1 <= 75.2885 )
									ret := 0.272727
								if( rsi1 > 75.2885 )
									ret := 0.659574
			if( k > 93.8992 )
				if( smoothK_k <= 96.8666 )
					if( k <= 98.9045 )
						if( d <= 97.4923 )
							if( smoothK_k <= 91.0667 )
								if( d <= 78.2336 )
									ret := -0.050000
								if( d > 78.2336 )
									ret := 0.602041
							if( smoothK_k > 91.0667 )
								if( d_k <= 2.17095 )
									ret := 0.302719
								if( d_k > 2.17095 )
									ret := -0.043103
						if( d > 97.4923 )
							if( smoothK_k <= 95.1687 )
								if( rsi1 <= 64.8403 )
									ret := 0.247706
								if( rsi1 > 64.8403 )
									ret := 0.504318
							if( smoothK_k > 95.1687 )
								if( rsi1 <= 92.6147 )
									ret := 0.583624
								if( rsi1 > 92.6147 )
									ret := -0.500000
					if( k > 98.9045 )
						if( rsi1 <= 38.7735 )
							if( k <= 99.6106 )
								if( smoothD_d <= 89.544 )
									ret := -0.631579
								if( smoothD_d > 89.544 )
									ret := 0.076923
							if( k > 99.6106 )
								if( rsi1 <= 35.352 )
									ret := -0.785714 // sell
								if( rsi1 > 35.352 )
									ret := -1.000000 // sell
						if( rsi1 > 38.7735 )
							if( d_k <= -0.606758 )
								if( rsi1 <= 82.1966 )
									ret := 0.317191
								if( rsi1 > 82.1966 )
									ret := 0.656085
							if( d_k > -0.606758 )
								if( k <= 99.2065 )
									ret := -0.086022
								if( k > 99.2065 )
									ret := 0.227612
				if( smoothK_k > 96.8666 )
					if( d_k <= -1.01548 )
						if( smoothD_d <= 78.6262 )
							if( d_k <= -18.8491 )
								if( d_k <= -19.2368 )
									ret := 0.606061
								if( d_k > -19.2368 )
									ret := -0.083333
							if( d_k > -18.8491 )
								if( rsi1 <= 74.4628 )
									ret := 0.970588 // buy
								if( rsi1 > 74.4628 )
									ret := 0.900000 // buy
						if( smoothD_d > 78.6262 )
							if( d <= 83.2888 )
								if( d <= 83.1478 )
									ret := 0.202703
								if( d > 83.1478 )
									ret := -0.727273 // sell
							if( d > 83.2888 )
								if( d <= 96.9021 )
									ret := 0.432301
								if( d > 96.9021 )
									ret := 0.299408
					if( d_k > -1.01548 )
						if( smoothK_k <= 96.9924 )
							if( smoothD_d <= 96.9697 )
								if( d <= 99.8741 )
									ret := 0.634146
								if( d > 99.8741 )
									ret := 0.883333 // buy
							if( smoothD_d > 96.9697 )
								if( d_k <= 0.014467 )
									ret := 1.000000 // buy
								if( d_k > 0.014467 )
									ret := 0.238095
						if( smoothK_k > 96.9924 )
							if( rsi1 <= 63.6899 )
								if( d_k <= -0.539078 )
									ret := 0.479167
								if( d_k > -0.539078 )
									ret := 0.066327
							if( rsi1 > 63.6899 )
								if( rsi1 <= 65.0978 )
									ret := 0.860465 // buy
								if( rsi1 > 65.0978 )
									ret := 0.568161
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_7804a4e2(d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


