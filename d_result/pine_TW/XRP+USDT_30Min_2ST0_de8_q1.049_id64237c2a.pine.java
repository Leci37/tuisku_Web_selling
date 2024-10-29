//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: XRPUSDT_30Min_2ST0_64237c2a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_30Min_2ST0_64237c2a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_30Min_64237c2a(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( rsi1 <= 43.1694 )
		if( ema12 <= -0.003079 )
			if( rsi1 <= 32.4098 )
				if( d_k <= -1.04576 )
					if( tema <= 0.433024 )
						if( rsi1 <= 29.2978 )
							if( smoothD_d <= 33.1237 )
								if( d <= 10.5653 )
									ret := -0.006623
								if( d > 10.5653 )
									ret := 0.412162
							if( smoothD_d > 33.1237 )
								if( smoothK_k <= 64.0897 )
									ret := -0.793103 // sell
								if( smoothK_k > 64.0897 )
									ret := -0.181818
						if( rsi1 > 29.2978 )
							if( d_k <= -1.66615 )
								if( d <= 54.4253 )
									ret := 0.743902 // buy
								if( d > 54.4253 )
									ret := 0.250000
							if( d_k > -1.66615 )
								ret := -0.250000
					if( tema > 0.433024 )
						if( rsi1 <= 21.8815 )
							if( d_k <= -16.4888 )
								ret := 0.428571
							if( d_k > -16.4888 )
								if( ema12 <= -0.022671 )
									ret := -0.187500
								if( ema12 > -0.022671 )
									ret := -0.615616
						if( rsi1 > 21.8815 )
							if( ema12 <= -0.009986 )
								if( smoothD_d <= 5.36442 )
									ret := -0.444444
								if( smoothD_d > 5.36442 )
									ret := 0.219925
							if( ema12 > -0.009986 )
								if( ema12 <= -0.0039 )
									ret := -0.184633
								if( ema12 > -0.0039 )
									ret := -0.497561
				if( d_k > -1.04576 )
					if( ema1 <= 0.328066 )
						if( k <= 2.65589 )
							if( ema3 <= 0.313963 )
								if( ema12 <= -0.003933 )
									ret := 0.920000 // buy
								if( ema12 > -0.003933 )
									ret := 0.571429
							if( ema3 > 0.313963 )
								if( ema3 <= 0.330162 )
									ret := -0.250000
								if( ema3 > 0.330162 )
									ret := 1.000000 // buy
						if( k > 2.65589 )
							if( smoothK_k <= 1.67183 )
								if( rsi1 <= 20.3655 )
									ret := -1.000000 // sell
								if( rsi1 > 20.3655 )
									ret := 0.000000
							if( smoothK_k > 1.67183 )
								if( ema12 <= -0.003575 )
									ret := 0.597015
								if( ema12 > -0.003575 )
									ret := -0.133333
					if( ema1 > 0.328066 )
						if( tema <= 0.640576 )
							if( rsi1 <= 19.4946 )
								if( tema <= 0.39644 )
									ret := -0.328767
								if( tema > 0.39644 )
									ret := -0.777372 // sell
							if( rsi1 > 19.4946 )
								if( k <= 41.8177 )
									ret := -0.184783
								if( k > 41.8177 )
									ret := -0.619792
						if( tema > 0.640576 )
							if( rsi1 <= 25.3661 )
								if( rsi1 <= 15.0167 )
									ret := -0.963918 // sell
								if( rsi1 > 15.0167 )
									ret := -0.817844 // sell
							if( rsi1 > 25.3661 )
								if( smoothD_d <= -2.88733 )
									ret := 0.333333
								if( smoothD_d > -2.88733 )
									ret := -0.638079
			if( rsi1 > 32.4098 )
				if( d_k <= -0.409285 )
					if( ema12 <= -0.011722 )
						if( tema <= 1.55734 )
							if( d <= 95.2099 )
								if( d_k <= -4.38652 )
									ret := 0.826493 // buy
								if( d_k > -4.38652 )
									ret := 0.362832
							if( d > 95.2099 )
								if( rsi1 <= 39.6206 )
									ret := 0.500000
								if( rsi1 > 39.6206 )
									ret := -1.000000 // sell
						if( tema > 1.55734 )
							if( rsi1 <= 35.9586 )
								if( ema1 <= 1.6372 )
									ret := -0.166667
								if( ema1 > 1.6372 )
									ret := -1.000000 // sell
							if( rsi1 > 35.9586 )
								if( ema3 <= 1.74409 )
									ret := 0.400000
								if( ema3 > 1.74409 )
									ret := 1.000000 // buy
					if( ema12 > -0.011722 )
						if( d <= 45.0781 )
							if( rsi1 <= 37.8384 )
								if( ema12 <= -0.004056 )
									ret := 0.457103
								if( ema12 > -0.004056 )
									ret := 0.124444
							if( rsi1 > 37.8384 )
								if( tema <= 0.546586 )
									ret := 0.836134 // buy
								if( tema > 0.546586 )
									ret := 0.543253
						if( d > 45.0781 )
							if( ema3 <= 0.293416 )
								ret := -1.000000 // sell
							if( ema3 > 0.293416 )
								if( rsi1 <= 37.3728 )
									ret := -0.060000
								if( rsi1 > 37.3728 )
									ret := 0.399679
				if( d_k > -0.409285 )
					if( tema <= 0.754049 )
						if( smoothD_d <= 65.9658 )
							if( d <= 4.41316 )
								if( ema12 <= -0.00335 )
									ret := -0.760000 // sell
								if( ema12 > -0.00335 )
									ret := 0.500000
							if( d > 4.41316 )
								if( ema12 <= -0.004703 )
									ret := 0.690476
								if( ema12 > -0.004703 )
									ret := 0.225681
						if( smoothD_d > 65.9658 )
							if( d <= 77.037 )
								if( ema12 <= -0.008184 )
									ret := 1.000000 // buy
								if( ema12 > -0.008184 )
									ret := -0.654545
							if( d > 77.037 )
								if( k <= 64.6349 )
									ret := 0.666667
								if( k > 64.6349 )
									ret := -0.137615
					if( tema > 0.754049 )
						if( d_k <= 2.16378 )
							if( ema12 <= -0.004484 )
								if( tema <= 1.612 )
									ret := 0.056497
								if( tema > 1.612 )
									ret := -1.000000 // sell
							if( ema12 > -0.004484 )
								if( ema1 <= 0.975477 )
									ret := -0.333333
								if( ema1 > 0.975477 )
									ret := -0.842105 // sell
						if( d_k > 2.16378 )
							if( tema <= 1.12197 )
								if( smoothD_d <= 2.63754 )
									ret := 0.833333 // buy
								if( smoothD_d > 2.63754 )
									ret := -0.417647
							if( tema > 1.12197 )
								if( ema13 <= -0.01082 )
									ret := -0.882353 // sell
								if( ema13 > -0.01082 )
									ret := -0.425000
		if( ema12 > -0.003079 )
			if( ema1 <= 0.381888 )
				if( ema3 <= 0.3016 )
					if( d <= 34.3305 )
						if( ema13 <= -0.00586 )
							if( rsi1 <= 42.2879 )
								ret := -0.500000
							if( rsi1 > 42.2879 )
								ret := -1.000000 // sell
						if( ema13 > -0.00586 )
							if( tema <= 0.234423 )
								if( ema12 <= -0.002313 )
									ret := 0.892857 // buy
								if( ema12 > -0.002313 )
									ret := 0.254902
							if( tema > 0.234423 )
								if( ema12 <= 0.000324 )
									ret := 0.123369
								if( ema12 > 0.000324 )
									ret := 0.818182 // buy
					if( d > 34.3305 )
						if( smoothK_k <= 66.9246 )
							if( ema2 <= 0.250954 )
								if( d_k <= -6.35292 )
									ret := -0.300000
								if( d_k > -6.35292 )
									ret := -0.006944
							if( ema2 > 0.250954 )
								if( d <= 50.3297 )
									ret := -0.203125
								if( d > 50.3297 )
									ret := -0.533333
						if( smoothK_k > 66.9246 )
							if( smoothK_k <= 79.0382 )
								if( rsi1 <= 33.6906 )
									ret := 0.000000
								if( rsi1 > 33.6906 )
									ret := 0.533333
							if( smoothK_k > 79.0382 )
								if( smoothK_k <= 80.6531 )
									ret := -0.625000
								if( smoothK_k > 80.6531 )
									ret := 0.162162
				if( ema3 > 0.3016 )
					if( ema13 <= -0.000822 )
						if( d_k <= -1.63283 )
							if( rsi1 <= 39.2686 )
								if( rsi1 <= 26.3175 )
									ret := -0.324324
								if( rsi1 > 26.3175 )
									ret := 0.030928
							if( rsi1 > 39.2686 )
								if( smoothD_d <= 33.957 )
									ret := 0.476821
								if( smoothD_d > 33.957 )
									ret := 0.056818
						if( d_k > -1.63283 )
							if( rsi1 <= 25.6759 )
								if( ema3 <= 0.352278 )
									ret := -0.425000
								if( ema3 > 0.352278 )
									ret := -0.781250 // sell
							if( rsi1 > 25.6759 )
								if( ema12 <= -0.001679 )
									ret := -0.037234
								if( ema12 > -0.001679 )
									ret := -0.331924
					if( ema13 > -0.000822 )
						if( rsi1 <= 34.2419 )
							if( rsi1 <= 29.255 )
								if( ema13 <= -1.2e-05 )
									ret := -0.703297 // sell
								if( ema13 > -1.2e-05 )
									ret := -0.946429 // sell
							if( rsi1 > 29.255 )
								if( ema12 <= 0.000171 )
									ret := -0.471698
								if( ema12 > 0.000171 )
									ret := -0.902439 // sell
						if( rsi1 > 34.2419 )
							if( d_k <= 5.86368 )
								if( d_k <= 4.35029 )
									ret := -0.146067
								if( d_k > 4.35029 )
									ret := 0.428571
							if( d_k > 5.86368 )
								if( ema12 <= 2.8e-05 )
									ret := -0.372727
								if( ema12 > 2.8e-05 )
									ret := -0.700637 // sell
			if( ema1 > 0.381888 )
				if( ema12 <= 0.000617 )
					if( rsi1 <= 33.3331 )
						if( ema3 <= 0.631974 )
							if( rsi1 <= 25.8215 )
								if( smoothD_d <= 16.3327 )
									ret := -0.770912 // sell
								if( smoothD_d > 16.3327 )
									ret := -0.591195
							if( rsi1 > 25.8215 )
								if( ema12 <= -0.000158 )
									ret := -0.444772
								if( ema12 > -0.000158 )
									ret := -0.628261
						if( ema3 > 0.631974 )
							if( rsi1 <= 30.3697 )
								if( d <= 19.0571 )
									ret := -0.785347 // sell
								if( d > 19.0571 )
									ret := -0.923875 // sell
							if( rsi1 > 30.3697 )
								if( ema13 <= -0.000374 )
									ret := -0.602230
								if( ema13 > -0.000374 )
									ret := -0.798507 // sell
					if( rsi1 > 33.3331 )
						if( ema12 <= -0.001732 )
							if( ema3 <= 0.62545 )
								if( d <= 63.8901 )
									ret := 0.131551
								if( d > 63.8901 )
									ret := -0.207843
							if( ema3 > 0.62545 )
								if( d_k <= -2.05578 )
									ret := -0.065217
								if( d_k > -2.05578 )
									ret := -0.490814
						if( ema12 > -0.001732 )
							if( ema3 <= 0.539569 )
								if( ema12 <= -0.000605 )
									ret := -0.137449
								if( ema12 > -0.000605 )
									ret := -0.324113
							if( ema3 > 0.539569 )
								if( rsi1 <= 41.7548 )
									ret := -0.487468
								if( rsi1 > 41.7548 )
									ret := -0.228311
				if( ema12 > 0.000617 )
					if( ema12 <= 0.0012 )
						if( ema1 <= 0.462741 )
							if( d <= 6.23942 )
								if( d <= 5.13685 )
									ret := -0.852941 // sell
								if( d > 5.13685 )
									ret := -0.428571
							if( d > 6.23942 )
								if( smoothK_k <= 18.7401 )
									ret := -0.904762 // sell
								if( smoothK_k > 18.7401 )
									ret := -1.000000 // sell
						if( ema1 > 0.462741 )
							if( rsi1 <= 34.2777 )
								if( rsi1 <= 28.9345 )
									ret := -0.900000 // sell
								if( rsi1 > 28.9345 )
									ret := -0.703226 // sell
							if( rsi1 > 34.2777 )
								if( tema <= 0.532539 )
									ret := -0.380117
								if( tema > 0.532539 )
									ret := -0.594527
					if( ema12 > 0.0012 )
						if( ema12 <= 0.002484 )
							if( ema13 <= 0.005707 )
								if( ema13 <= -0.001293 )
									ret := 0.000000
								if( ema13 > -0.001293 )
									ret := -0.785530 // sell
							if( ema13 > 0.005707 )
								if( ema3 <= 0.870586 )
									ret := -0.293103
								if( ema3 > 0.870586 )
									ret := -0.806452 // sell
						if( ema12 > 0.002484 )
							if( ema13 <= 0.006228 )
								if( ema2 <= 1.05993 )
									ret := -1.000000 // sell
								if( ema2 > 1.05993 )
									ret := -0.826087 // sell
							if( ema13 > 0.006228 )
								if( ema12 <= 0.003449 )
									ret := -0.649123
								if( ema12 > 0.003449 )
									ret := -0.858934 // sell
	if( rsi1 > 43.1694 )
		if( smoothK_k <= 79.6632 )
			if( ema12 <= -0.000556 )
				if( ema12 <= -0.002391 )
					if( d_k <= -4.56409 )
						if( ema3 <= 0.33678 )
							if( ema1 <= 0.313247 )
								if( ema2 <= 0.305041 )
									ret := 0.000000
								if( ema2 > 0.305041 )
									ret := 1.000000 // buy
							if( ema1 > 0.313247 )
								if( ema3 <= 0.331852 )
									ret := -1.000000 // sell
								if( ema3 > 0.331852 )
									ret := -0.400000
						if( ema3 > 0.33678 )
							if( ema3 <= 1.45427 )
								if( ema12 <= -0.003778 )
									ret := 0.851759 // buy
								if( ema12 > -0.003778 )
									ret := 0.718870 // buy
							if( ema3 > 1.45427 )
								if( smoothD_d <= 64.8922 )
									ret := 0.568182
								if( smoothD_d > 64.8922 )
									ret := -0.555556
					if( d_k > -4.56409 )
						if( smoothD_d <= 87.4386 )
							if( smoothD_d <= 7.97505 )
								if( rsi1 <= 43.9352 )
									ret := 0.777778 // buy
								if( rsi1 > 43.9352 )
									ret := 0.100000
							if( smoothD_d > 7.97505 )
								if( ema13 <= -0.005675 )
									ret := 0.540305
								if( ema13 > -0.005675 )
									ret := 0.761905 // buy
						if( smoothD_d > 87.4386 )
							if( rsi1 <= 44.6718 )
								ret := -1.000000 // sell
							if( rsi1 > 44.6718 )
								ret := -0.500000
				if( ema12 > -0.002391 )
					if( rsi1 <= 48.469 )
						if( ema13 <= -0.004787 )
							if( smoothK_k <= 77.3817 )
								if( ema3 <= 0.37837 )
									ret := 0.600000
								if( ema3 > 0.37837 )
									ret := -0.432990
							if( smoothK_k > 77.3817 )
								ret := 0.857143 // buy
						if( ema13 > -0.004787 )
							if( ema12 <= -0.001105 )
								if( ema13 <= -0.002323 )
									ret := 0.231111
								if( ema13 > -0.002323 )
									ret := 0.457983
							if( ema12 > -0.001105 )
								if( ema13 <= -3.2e-05 )
									ret := 0.040189
								if( ema13 > -3.2e-05 )
									ret := 0.528846
					if( rsi1 > 48.469 )
						if( rsi1 <= 55.8366 )
							if( smoothD_d <= 51.0836 )
								if( tema <= 0.232888 )
									ret := -0.375000
								if( tema > 0.232888 )
									ret := 0.587395
							if( smoothD_d > 51.0836 )
								if( ema12 <= -0.001541 )
									ret := 0.666667
								if( ema12 > -0.001541 )
									ret := 0.248380
						if( rsi1 > 55.8366 )
							if( ema1 <= 0.311627 )
								ret := -0.500000
							if( ema1 > 0.311627 )
								if( ema13 <= -0.003071 )
									ret := 0.554795
								if( ema13 > -0.003071 )
									ret := 0.782857 // buy
			if( ema12 > -0.000556 )
				if( rsi1 <= 57.6261 )
					if( ema12 <= 0.001433 )
						if( rsi1 <= 51.112 )
							if( smoothD_d <= 53.6494 )
								if( ema12 <= 0.000204 )
									ret := 0.012151
								if( ema12 > 0.000204 )
									ret := -0.201108
							if( smoothD_d > 53.6494 )
								if( ema12 <= 0.000481 )
									ret := -0.182278
								if( ema12 > 0.000481 )
									ret := -0.479401
						if( rsi1 > 51.112 )
							if( ema13 <= 0.003381 )
								if( ema12 <= 0.000369 )
									ret := 0.184748
								if( ema12 > 0.000369 )
									ret := 0.021649
							if( ema13 > 0.003381 )
								if( ema13 <= 0.006698 )
									ret := 0.594737
								if( ema13 > 0.006698 )
									ret := -0.315789
					if( ema12 > 0.001433 )
						if( d_k <= 7.92424 )
							if( rsi1 <= 52.9216 )
								if( ema1 <= 0.445255 )
									ret := -0.008333
								if( ema1 > 0.445255 )
									ret := -0.463526
							if( rsi1 > 52.9216 )
								if( d_k <= 4.12877 )
									ret := -0.066069
								if( d_k > 4.12877 )
									ret := -0.306358
						if( d_k > 7.92424 )
							if( ema12 <= 0.003859 )
								if( ema13 <= 0.007042 )
									ret := -0.523954
								if( ema13 > 0.007042 )
									ret := -0.058824
							if( ema12 > 0.003859 )
								if( d_k <= 8.29746 )
									ret := -0.071429
								if( d_k > 8.29746 )
									ret := -0.757634 // sell
				if( rsi1 > 57.6261 )
					if( ema12 <= 0.003807 )
						if( d_k <= -2.86243 )
							if( tema <= 0.643518 )
								if( ema2 <= 0.282015 )
									ret := -0.016529
								if( ema2 > 0.282015 )
									ret := 0.414146
							if( tema > 0.643518 )
								if( ema2 <= 0.864025 )
									ret := 0.580448
								if( ema2 > 0.864025 )
									ret := 0.777480 // buy
						if( d_k > -2.86243 )
							if( ema1 <= 0.414581 )
								if( smoothD_d <= 46.2034 )
									ret := 0.236000
								if( smoothD_d > 46.2034 )
									ret := -0.008029
							if( ema1 > 0.414581 )
								if( rsi1 <= 61.5916 )
									ret := 0.133053
								if( rsi1 > 61.5916 )
									ret := 0.426237
					if( ema12 > 0.003807 )
						if( rsi1 <= 64.0397 )
							if( d_k <= 4.80796 )
								if( d <= 65.3539 )
									ret := 0.118677
								if( d > 65.3539 )
									ret := -0.446541
							if( d_k > 4.80796 )
								if( d <= 50.325 )
									ret := -0.253488
								if( d > 50.325 )
									ret := -0.580756
						if( rsi1 > 64.0397 )
							if( smoothD_d <= 68.1822 )
								if( d_k <= 3.42324 )
									ret := 0.478714
								if( d_k > 3.42324 )
									ret := -0.066597
							if( smoothD_d > 68.1822 )
								if( d_k <= 0.58063 )
									ret := 0.431250
								if( d_k > 0.58063 )
									ret := -0.189971
		if( smoothK_k > 79.6632 )
			if( rsi1 <= 67.0401 )
				if( ema12 <= -0.000513 )
					if( rsi1 <= 54.6843 )
						if( ema12 <= -0.00191 )
							if( tema <= 0.309087 )
								ret := -1.000000 // sell
							if( tema > 0.309087 )
								if( d_k <= -7.53876 )
									ret := 0.671105
								if( d_k > -7.53876 )
									ret := 0.371113
						if( ema12 > -0.00191 )
							if( rsi1 <= 47.824 )
								if( smoothD_d <= 62.0813 )
									ret := 0.823529 // buy
								if( smoothD_d > 62.0813 )
									ret := -0.048387
							if( rsi1 > 47.824 )
								if( ema1 <= 0.455291 )
									ret := 0.458515
								if( ema1 > 0.455291 )
									ret := 0.161172
					if( rsi1 > 54.6843 )
						if( ema1 <= 0.633155 )
							if( rsi1 <= 57.7659 )
								if( ema12 <= -0.001034 )
									ret := 0.626335
								if( ema12 > -0.001034 )
									ret := 0.337500
							if( rsi1 > 57.7659 )
								if( k <= 91.0237 )
									ret := 0.792982 // buy
								if( k > 91.0237 )
									ret := 0.627871
						if( ema1 > 0.633155 )
							if( d_k <= 1.05921 )
								if( ema13 <= -0.043018 )
									ret := 0.142857
								if( ema13 > -0.043018 )
									ret := 0.798507 // buy
							if( d_k > 1.05921 )
								if( ema12 <= -0.003023 )
									ret := 0.111111
								if( ema12 > -0.003023 )
									ret := 0.633333
				if( ema12 > -0.000513 )
					if( ema12 <= 0.004461 )
						if( rsi1 <= 57.5683 )
							if( ema12 <= 0.000795 )
								if( rsi1 <= 49.3612 )
									ret := -0.268182
								if( rsi1 > 49.3612 )
									ret := 0.083832
							if( ema12 > 0.000795 )
								if( d <= 69.0144 )
									ret := 1.000000 // buy
								if( d > 69.0144 )
									ret := -0.287918
						if( rsi1 > 57.5683 )
							if( ema3 <= 0.630528 )
								if( ema12 <= 0.000457 )
									ret := 0.361357
								if( ema12 > 0.000457 )
									ret := 0.113881
							if( ema3 > 0.630528 )
								if( rsi1 <= 61.8686 )
									ret := 0.332418
								if( rsi1 > 61.8686 )
									ret := 0.603648
					if( ema12 > 0.004461 )
						if( rsi1 <= 59.6344 )
							if( k <= 87.4076 )
								if( d_k <= 6.57025 )
									ret := -0.909091 // sell
								if( d_k > 6.57025 )
									ret := -0.500000
							if( k > 87.4076 )
								if( d <= 90.4396 )
									ret := 0.611111
								if( d > 90.4396 )
									ret := -0.840000 // sell
						if( rsi1 > 59.6344 )
							if( ema2 <= 0.920776 )
								if( smoothD_d <= 77.1309 )
									ret := 0.240000
								if( smoothD_d > 77.1309 )
									ret := -0.403509
							if( ema2 > 0.920776 )
								if( ema13 <= 0.006953 )
									ret := -0.333333
								if( ema13 > 0.006953 )
									ret := 0.432099
			if( rsi1 > 67.0401 )
				if( ema2 <= 0.312243 )
					if( ema12 <= 0.002343 )
						if( ema1 <= 0.262439 )
							if( ema13 <= 0.003851 )
								if( ema12 <= 0.001831 )
									ret := -0.081522
								if( ema12 > 0.001831 )
									ret := -0.419355
							if( ema13 > 0.003851 )
								ret := 1.000000 // buy
						if( ema1 > 0.262439 )
							if( smoothD_d <= 84.3142 )
								if( d_k <= -19.903 )
									ret := 0.000000
								if( d_k > -19.903 )
									ret := 0.866667 // buy
							if( smoothD_d > 84.3142 )
								if( ema12 <= 0.0015 )
									ret := 0.456522
								if( ema12 > 0.0015 )
									ret := -0.250000
					if( ema12 > 0.002343 )
						if( d <= 91.6493 )
							if( k <= 98.7818 )
								if( d <= 90.0646 )
									ret := -0.418605
								if( d > 90.0646 )
									ret := 0.875000 // buy
							if( k > 98.7818 )
								if( ema1 <= 0.279725 )
									ret := 0.500000
								if( ema1 > 0.279725 )
									ret := 1.000000 // buy
						if( d > 91.6493 )
							if( rsi1 <= 85.9343 )
								if( d_k <= 6.01696 )
									ret := -0.746667 // sell
								if( d_k > 6.01696 )
									ret := 0.000000
							if( rsi1 > 85.9343 )
								if( rsi1 <= 86.852 )
									ret := 1.000000 // buy
								if( rsi1 > 86.852 )
									ret := -0.777778 // sell
				if( ema2 > 0.312243 )
					if( rsi1 <= 77.4247 )
						if( ema13 <= 0.013436 )
							if( ema3 <= 0.631293 )
								if( ema12 <= 0.003013 )
									ret := 0.565531
								if( ema12 > 0.003013 )
									ret := 0.236674
							if( ema3 > 0.631293 )
								if( d_k <= 0.300497 )
									ret := 0.806738 // buy
								if( d_k > 0.300497 )
									ret := 0.494186
						if( ema13 > 0.013436 )
							if( tema <= 0.845867 )
								if( rsi1 <= 72.4298 )
									ret := -0.588235
								if( rsi1 > 72.4298 )
									ret := -0.037383
							if( tema > 0.845867 )
								if( rsi1 <= 69.7831 )
									ret := -0.147541
								if( rsi1 > 69.7831 )
									ret := 0.402235
					if( rsi1 > 77.4247 )
						if( ema13 <= 0.025761 )
							if( ema3 <= 0.347221 )
								if( ema12 <= 0.006696 )
									ret := 0.537415
								if( ema12 > 0.006696 )
									ret := -0.857143 // sell
							if( ema3 > 0.347221 )
								if( d_k <= 0.346313 )
									ret := 0.794907 // buy
								if( d_k > 0.346313 )
									ret := 0.671149
						if( ema13 > 0.025761 )
							if( tema <= 0.652343 )
								if( k <= 91.6628 )
									ret := 0.666667
								if( k > 91.6628 )
									ret := -0.930233 // sell
							if( tema > 0.652343 )
								if( d_k <= 0.981816 )
									ret := 0.845455 // buy
								if( d_k > 0.981816 )
									ret := 0.372881
	
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
float op_operation = decision_tree_0_XRPUSDT_30Min_64237c2a(smoothK_k, d_k, k, smoothD_d, rsi1, d, ema2, tema, ema12, ema3, ema1, ema13)

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


