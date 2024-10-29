//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: ADX_and_DI
// ID_model: LYFT_15Min_1ADX_ff1e1f37 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LYFT_15Min_1ADX_ff1e1f37", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LYFT_15Min_ff1e1f37(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( directionalMovementMinus <= 0.112711 )
		if( trueRange <= 0.087459 )
			if( diPlus <= 36.0415 )
				if( smoothedTrueRange <= 0.065184 )
					if( diMinus <= 3.90541 )
						if( smoothedTrueRange <= 0.052573 )
							if( adx <= 47.547 )
								ret := -0.588235
							if( adx > 47.547 )
								ret := 0.000000
						if( smoothedTrueRange > 0.052573 )
							if( smoothedTrueRange <= 0.055759 )
								ret := 1.000000 // buy
							if( smoothedTrueRange > 0.055759 )
								if( diPlus <= 32.8723 )
									ret := 0.772727 // buy
								if( diPlus > 32.8723 )
									ret := 0.250000
					if( diMinus > 3.90541 )
						if( diMinus <= 15.9007 )
							if( adx <= 43.5031 )
								if( diMinus <= 15.0716 )
									ret := 0.005624
								if( diMinus > 15.0716 )
									ret := -0.256637
							if( adx > 43.5031 )
								if( smoothedTrueRange <= 0.051287 )
									ret := 0.015564
								if( smoothedTrueRange > 0.051287 )
									ret := 0.241758
						if( diMinus > 15.9007 )
							if( directionalMovementMinus <= 0.005275 )
								if( diMinus <= 16.5476 )
									ret := 0.358333
								if( diMinus > 16.5476 )
									ret := 0.045233
							if( directionalMovementMinus > 0.005275 )
								if( dx <= 19.8888 )
									ret := 0.225243
								if( dx > 19.8888 )
									ret := 0.096477
				if( smoothedTrueRange > 0.065184 )
					if( adx <= 57.7351 )
						if( diPlus <= 17.2547 )
							if( smoothedDirectionalMovementMinus <= 0.046404 )
								if( adx <= 12.2278 )
									ret := -0.567901
								if( adx > 12.2278 )
									ret := -0.060563
							if( smoothedDirectionalMovementMinus > 0.046404 )
								if( directionalMovementMinus <= 0.016813 )
									ret := 0.005967
								if( directionalMovementMinus > 0.016813 )
									ret := 0.224359
						if( diPlus > 17.2547 )
							if( dx <= 71.5491 )
								if( adx <= 8.74784 )
									ret := -0.553191
								if( adx > 8.74784 )
									ret := 0.048642
							if( dx > 71.5491 )
								if( adx <= 28.9661 )
									ret := 0.725000 // buy
								if( adx > 28.9661 )
									ret := 0.256881
					if( adx > 57.7351 )
						if( dx <= 85.6878 )
							if( diMinus <= 63.7406 )
								if( diMinus <= 55.9568 )
									ret := 0.221586
								if( diMinus > 55.9568 )
									ret := -0.652174
							if( diMinus > 63.7406 )
								if( directionalMovementPlus <= 0.009231 )
									ret := 1.000000 // buy
								if( directionalMovementPlus > 0.009231 )
									ret := 0.727273 // buy
						if( dx > 85.6878 )
							if( adx <= 84.0929 )
								if( diPlus <= 2.98171 )
									ret := -0.066667
								if( diPlus > 2.98171 )
									ret := -0.480769
							if( adx > 84.0929 )
								if( directionalMovementMinus <= 0.001525 )
									ret := -0.300000
								if( directionalMovementMinus > 0.001525 )
									ret := 0.869565 // buy
			if( diPlus > 36.0415 )
				if( dx <= 8.82197 )
					if( adx <= 15.9647 )
						if( smoothedDirectionalMovementPlus <= 0.012518 )
							ret := -0.153846
						if( smoothedDirectionalMovementPlus > 0.012518 )
							if( adx <= 10.2724 )
								ret := -0.466667
							if( adx > 10.2724 )
								if( smoothedTrueRange <= 0.059726 )
									ret := -0.881356 // sell
								if( smoothedTrueRange > 0.059726 )
									ret := -0.690476
					if( adx > 15.9647 )
						if( directionalMovementMinus <= 0.018243 )
							if( smoothedTrueRange <= 0.082229 )
								if( smoothedTrueRange <= 0.056 )
									ret := 0.071429
								if( smoothedTrueRange > 0.056 )
									ret := 0.539683
							if( smoothedTrueRange > 0.082229 )
								if( dx <= 6.32944 )
									ret := 0.085106
								if( dx > 6.32944 )
									ret := -0.803922 // sell
						if( directionalMovementMinus > 0.018243 )
							if( smoothedDirectionalMovementPlus <= 0.019643 )
								if( dx <= 3.59038 )
									ret := -0.266667
								if( dx > 3.59038 )
									ret := 0.200000
							if( smoothedDirectionalMovementPlus > 0.019643 )
								if( dx <= 5.5762 )
									ret := -0.868421 // sell
								if( dx > 5.5762 )
									ret := -0.500000
				if( dx > 8.82197 )
					if( diPlus <= 55.5268 )
						if( adx <= 87.353 )
							if( smoothedDirectionalMovementMinus <= 0.077679 )
								if( trueRange <= 0.045491 )
									ret := -0.000559
								if( trueRange > 0.045491 )
									ret := -0.095945
							if( smoothedDirectionalMovementMinus > 0.077679 )
								if( trueRange <= 0.027975 )
									ret := 0.705882 // buy
								if( trueRange > 0.027975 )
									ret := -0.030303
						if( adx > 87.353 )
							if( adx <= 93.802 )
								ret := 0.400000
							if( adx > 93.802 )
								ret := 1.000000 // buy
					if( diPlus > 55.5268 )
						if( diPlus <= 59.7909 )
							if( diMinus <= 10.2255 )
								if( trueRange <= 0.037807 )
									ret := 0.843750 // buy
								if( trueRange > 0.037807 )
									ret := 0.250000
							if( diMinus > 10.2255 )
								if( dx <= 50.2317 )
									ret := 0.433333
								if( dx > 50.2317 )
									ret := 0.021277
						if( diPlus > 59.7909 )
							if( diPlus <= 60.896 )
								if( smoothedDirectionalMovementMinus <= 0.020578 )
									ret := -0.520000
								if( smoothedDirectionalMovementMinus > 0.020578 )
									ret := 0.083333
							if( diPlus > 60.896 )
								if( adx <= 52.9793 )
									ret := -0.010000
								if( adx > 52.9793 )
									ret := 0.423077
		if( trueRange > 0.087459 )
			if( adx <= 28.2255 )
				if( trueRange <= 1.0081 )
					if( adx <= 17.393 )
						if( smoothedTrueRange <= 0.078546 )
							if( smoothedDirectionalMovementPlus <= 0.023615 )
								if( trueRange <= 0.133768 )
									ret := -0.152263
								if( trueRange > 0.133768 )
									ret := 0.338028
							if( smoothedDirectionalMovementPlus > 0.023615 )
								if( dx <= 41.5273 )
									ret := -0.736842 // sell
								if( dx > 41.5273 )
									ret := 0.625000
						if( smoothedTrueRange > 0.078546 )
							if( directionalMovementPlus <= 0.075306 )
								if( diMinus <= 34.6204 )
									ret := 0.097804
								if( diMinus > 34.6204 )
									ret := -0.223837
							if( directionalMovementPlus > 0.075306 )
								if( smoothedTrueRange <= 0.087475 )
									ret := 0.882353 // buy
								if( smoothedTrueRange > 0.087475 )
									ret := -0.085066
					if( adx > 17.393 )
						if( diPlus <= 29.4248 )
							if( diPlus <= 24.2384 )
								if( trueRange <= 0.646626 )
									ret := -0.065819
								if( trueRange > 0.646626 )
									ret := -0.515464
							if( diPlus > 24.2384 )
								if( dx <= 29.4834 )
									ret := -0.006442
								if( dx > 29.4834 )
									ret := 0.213311
						if( diPlus > 29.4248 )
							if( dx <= 2.3443 )
								if( smoothedTrueRange <= 0.246801 )
									ret := -0.611111
								if( smoothedTrueRange > 0.246801 )
									ret := 0.092593
							if( dx > 2.3443 )
								if( smoothedTrueRange <= 0.159868 )
									ret := -0.205096
								if( smoothedTrueRange > 0.159868 )
									ret := -0.092216
				if( trueRange > 1.0081 )
					if( smoothedDirectionalMovementMinus <= 0.173652 )
						if( smoothedDirectionalMovementPlus <= 0.101825 )
							ret := 0.714286 // buy
						if( smoothedDirectionalMovementPlus > 0.101825 )
							if( smoothedTrueRange <= 0.213268 )
								ret := -0.727273 // sell
							if( smoothedTrueRange > 0.213268 )
								if( dx <= 60.8978 )
									ret := -0.020513
								if( dx > 60.8978 )
									ret := 0.812500 // buy
					if( smoothedDirectionalMovementMinus > 0.173652 )
						if( smoothedDirectionalMovementPlus <= 0.280274 )
							if( dx <= 18.2049 )
								if( adx <= 18.7548 )
									ret := 1.000000 // buy
								if( adx > 18.7548 )
									ret := 0.857143 // buy
							if( dx > 18.2049 )
								ret := 0.153846
						if( smoothedDirectionalMovementPlus > 0.280274 )
							ret := 0.142857
			if( adx > 28.2255 )
				if( dx <= 30.3555 )
					if( smoothedDirectionalMovementMinus <= 0.037365 )
						if( directionalMovementPlus <= 0.028459 )
							if( directionalMovementPlus <= 0.026081 )
								if( dx <= 1.61237 )
									ret := 0.535714
								if( dx > 1.61237 )
									ret := 0.040904
							if( directionalMovementPlus > 0.026081 )
								if( diMinus <= 18.8347 )
									ret := 1.000000 // buy
								if( diMinus > 18.8347 )
									ret := 0.600000
						if( directionalMovementPlus > 0.028459 )
							if( diMinus <= 18.6301 )
								if( dx <= 9.72962 )
									ret := 0.470085
								if( dx > 9.72962 )
									ret := 0.018391
							if( diMinus > 18.6301 )
								if( adx <= 39.8241 )
									ret := -0.229779
								if( adx > 39.8241 )
									ret := 0.005102
					if( smoothedDirectionalMovementMinus > 0.037365 )
						if( smoothedTrueRange <= 0.213375 )
							if( trueRange <= 0.23205 )
								if( smoothedDirectionalMovementPlus <= 0.023013 )
									ret := -0.767442 // sell
								if( smoothedDirectionalMovementPlus > 0.023013 )
									ret := -0.123922
							if( trueRange > 0.23205 )
								if( smoothedDirectionalMovementPlus <= 0.092349 )
									ret := -0.334225
								if( smoothedDirectionalMovementPlus > 0.092349 )
									ret := 0.411765
						if( smoothedTrueRange > 0.213375 )
							if( dx <= 8.03563 )
								if( smoothedDirectionalMovementPlus <= 0.116627 )
									ret := -0.001815
								if( smoothedDirectionalMovementPlus > 0.116627 )
									ret := 0.232932
							if( dx > 8.03563 )
								if( adx <= 40.3276 )
									ret := -0.142733
								if( adx > 40.3276 )
									ret := 0.019925
				if( dx > 30.3555 )
					if( dx <= 83.9781 )
						if( adx <= 28.8994 )
							if( dx <= 56.3016 )
								if( directionalMovementMinus <= 0.014046 )
									ret := -0.130081
								if( directionalMovementMinus > 0.014046 )
									ret := 0.341880
							if( dx > 56.3016 )
								if( diMinus <= 5.82729 )
									ret := 0.000000
								if( diMinus > 5.82729 )
									ret := 0.785185 // buy
						if( adx > 28.8994 )
							if( diPlus <= 39.2024 )
								if( diMinus <= 65.9686 )
									ret := 0.028002
								if( diMinus > 65.9686 )
									ret := -0.589286
							if( diPlus > 39.2024 )
								if( diMinus <= 6.56609 )
									ret := 0.183272
								if( diMinus > 6.56609 )
									ret := -0.100828
					if( dx > 83.9781 )
						if( smoothedDirectionalMovementMinus <= 0.001312 )
							if( smoothedDirectionalMovementMinus <= 0.000793 )
								if( trueRange <= 0.195719 )
									ret := 0.347107
								if( trueRange > 0.195719 )
									ret := -0.268657
							if( smoothedDirectionalMovementMinus > 0.000793 )
								if( adx <= 57.0747 )
									ret := 0.272727
								if( adx > 57.0747 )
									ret := 0.862069 // buy
						if( smoothedDirectionalMovementMinus > 0.001312 )
							if( trueRange <= 1.12599 )
								if( diPlus <= 3.69218 )
									ret := -0.032319
								if( diPlus > 3.69218 )
									ret := -0.242303
							if( trueRange > 1.12599 )
								if( smoothedDirectionalMovementPlus <= 0.203199 )
									ret := -0.939394 // sell
								if( smoothedDirectionalMovementPlus > 0.203199 )
									ret := -0.291667
	if( directionalMovementMinus > 0.112711 )
		if( dx <= 45.0779 )
			if( diMinus <= 31.6641 )
				if( diPlus <= 24.8903 )
					if( adx <= 32.0442 )
						if( diPlus <= 23.0624 )
							if( dx <= 17.5605 )
								if( diMinus <= 30.6043 )
									ret := 0.107309
								if( diMinus > 30.6043 )
									ret := 1.000000 // buy
							if( dx > 17.5605 )
								if( diMinus <= 27.3446 )
									ret := -0.252174
								if( diMinus > 27.3446 )
									ret := -0.007782
						if( diPlus > 23.0624 )
							if( adx <= 14.9038 )
								if( trueRange <= 0.187851 )
									ret := -0.153846
								if( trueRange > 0.187851 )
									ret := -0.861111 // sell
							if( adx > 14.9038 )
								if( diMinus <= 21.703 )
									ret := -0.571429
								if( diMinus > 21.703 )
									ret := 0.104651
					if( adx > 32.0442 )
						if( directionalMovementPlus <= 0.006889 )
							if( adx <= 34.4886 )
								if( smoothedDirectionalMovementMinus <= 0.132889 )
									ret := 0.504854
								if( smoothedDirectionalMovementMinus > 0.132889 )
									ret := -0.666667
							if( adx > 34.4886 )
								if( smoothedTrueRange <= 0.175458 )
									ret := 0.347368
								if( smoothedTrueRange > 0.175458 )
									ret := -0.026578
						if( directionalMovementPlus > 0.006889 )
							if( adx <= 52.674 )
								if( adx <= 35.0448 )
									ret := 0.157895
								if( adx > 35.0448 )
									ret := 0.929825 // buy
							if( adx > 52.674 )
								if( smoothedDirectionalMovementMinus <= 0.125943 )
									ret := 0.428571
								if( smoothedDirectionalMovementMinus > 0.125943 )
									ret := -0.800000 // sell
				if( diPlus > 24.8903 )
					if( smoothedDirectionalMovementPlus <= 0.025917 )
						if( adx <= 42.7933 )
							if( smoothedDirectionalMovementPlus <= 0.020492 )
								ret := 0.750000 // buy
							if( smoothedDirectionalMovementPlus > 0.020492 )
								if( diPlus <= 27.9042 )
									ret := 0.818182 // buy
								if( diPlus > 27.9042 )
									ret := 0.967742 // buy
						if( adx > 42.7933 )
							ret := 0.363636
					if( smoothedDirectionalMovementPlus > 0.025917 )
						if( smoothedDirectionalMovementMinus <= 0.218641 )
							if( diMinus <= 25.1672 )
								if( diPlus <= 29.6312 )
									ret := 0.194286
								if( diPlus > 29.6312 )
									ret := -0.007311
							if( diMinus > 25.1672 )
								if( dx <= 0.731068 )
									ret := -0.534884
								if( dx > 0.731068 )
									ret := 0.250000
						if( smoothedDirectionalMovementMinus > 0.218641 )
							if( trueRange <= 1.3177 )
								ret := 0.925926 // buy
							if( trueRange > 1.3177 )
								ret := 0.555556
			if( diMinus > 31.6641 )
				if( smoothedDirectionalMovementMinus <= 0.096001 )
					if( diMinus <= 43.3804 )
						if( diPlus <= 36.5634 )
							if( adx <= 58.028 )
								if( dx <= 39.3599 )
									ret := -0.077158
								if( dx > 39.3599 )
									ret := -0.386792
							if( adx > 58.028 )
								if( smoothedTrueRange <= 0.15685 )
									ret := 0.142857
								if( smoothedTrueRange > 0.15685 )
									ret := 0.800000 // buy
						if( diPlus > 36.5634 )
							if( adx <= 20.6204 )
								if( smoothedDirectionalMovementPlus <= 0.087575 )
									ret := 0.200000
								if( smoothedDirectionalMovementPlus > 0.087575 )
									ret := -0.950000 // sell
							if( adx > 20.6204 )
								if( diPlus <= 39.4638 )
									ret := 0.755814 // buy
								if( diPlus > 39.4638 )
									ret := 0.209459
					if( diMinus > 43.3804 )
						if( smoothedDirectionalMovementMinus <= 0.077948 )
							if( diPlus <= 34.9857 )
								if( diMinus <= 49.0273 )
									ret := 0.273224
								if( diMinus > 49.0273 )
									ret := -0.159624
							if( diPlus > 34.9857 )
								if( diMinus <= 46.0334 )
									ret := -0.200000
								if( diMinus > 46.0334 )
									ret := 0.563636
						if( smoothedDirectionalMovementMinus > 0.077948 )
							if( diPlus <= 39.1132 )
								if( adx <= 25.5191 )
									ret := -0.289474
								if( adx > 25.5191 )
									ret := 0.714286 // buy
							if( diPlus > 39.1132 )
								ret := -0.230769
				if( smoothedDirectionalMovementMinus > 0.096001 )
					if( smoothedDirectionalMovementMinus <= 0.200945 )
						if( dx <= 11.096 )
							if( dx <= 3.42247 )
								if( smoothedTrueRange <= 0.373208 )
									ret := 0.425000
								if( smoothedTrueRange > 0.373208 )
									ret := -0.500000
							if( dx > 3.42247 )
								if( smoothedTrueRange <= 0.411498 )
									ret := -0.555556
								if( smoothedTrueRange > 0.411498 )
									ret := -0.913043 // sell
						if( dx > 11.096 )
							if( smoothedTrueRange <= 0.29846 )
								if( smoothedDirectionalMovementMinus <= 0.098206 )
									ret := -0.602941
								if( smoothedDirectionalMovementMinus > 0.098206 )
									ret := -0.204044
							if( smoothedTrueRange > 0.29846 )
								if( diMinus <= 40.0565 )
									ret := 0.074866
								if( diMinus > 40.0565 )
									ret := -0.180147
					if( smoothedDirectionalMovementMinus > 0.200945 )
						if( diPlus <= 38.7511 )
							if( dx <= 16.9956 )
								if( smoothedDirectionalMovementMinus <= 0.218389 )
									ret := -0.777778 // sell
								if( smoothedDirectionalMovementMinus > 0.218389 )
									ret := -0.400000
							if( dx > 16.9956 )
								if( smoothedDirectionalMovementMinus <= 0.25349 )
									ret := 0.344086
								if( smoothedDirectionalMovementMinus > 0.25349 )
									ret := -0.073171
						if( diPlus > 38.7511 )
							ret := 0.800000 // buy
		if( dx > 45.0779 )
			if( trueRange <= 0.360186 )
				if( directionalMovementMinus <= 0.164786 )
					if( diPlus <= 3.85027 )
						if( dx <= 84.5515 )
							ret := 0.888889 // buy
						if( dx > 84.5515 )
							if( directionalMovementMinus <= 0.11995 )
								ret := 0.928571 // buy
							if( directionalMovementMinus > 0.11995 )
								if( directionalMovementMinus <= 0.141487 )
									ret := 0.160000
								if( directionalMovementMinus > 0.141487 )
									ret := 0.909091 // buy
					if( diPlus > 3.85027 )
						if( smoothedDirectionalMovementMinus <= 0.0703 )
							if( smoothedDirectionalMovementMinus <= 0.039248 )
								if( dx <= 68.8049 )
									ret := 0.178571
								if( dx > 68.8049 )
									ret := -0.447368
							if( smoothedDirectionalMovementMinus > 0.039248 )
								if( directionalMovementPlus <= 0.012406 )
									ret := -0.163743
								if( directionalMovementPlus > 0.012406 )
									ret := -0.875000 // sell
						if( smoothedDirectionalMovementMinus > 0.0703 )
							if( adx <= 23.8118 )
								if( smoothedDirectionalMovementMinus <= 0.110408 )
									ret := 0.920000 // buy
								if( smoothedDirectionalMovementMinus > 0.110408 )
									ret := 0.500000
							if( adx > 23.8118 )
								if( diMinus <= 62.0501 )
									ret := 0.165049
								if( diMinus > 62.0501 )
									ret := -0.305556
				if( directionalMovementMinus > 0.164786 )
					if( diMinus <= 56.2848 )
						if( adx <= 23.9869 )
							if( directionalMovementMinus <= 0.170204 )
								ret := 0.714286 // buy
							if( directionalMovementMinus > 0.170204 )
								if( trueRange <= 0.275277 )
									ret := -0.609756
								if( trueRange > 0.275277 )
									ret := 0.230769
						if( adx > 23.9869 )
							if( diMinus <= 31.7306 )
								if( diPlus <= 9.42371 )
									ret := 0.679012
								if( diPlus > 9.42371 )
									ret := 0.357895
							if( diMinus > 31.7306 )
								if( diMinus <= 33.0519 )
									ret := -0.300000
								if( diMinus > 33.0519 )
									ret := 0.248731
					if( diMinus > 56.2848 )
						if( diPlus <= 22.659 )
							if( smoothedDirectionalMovementMinus <= 0.127485 )
								if( diPlus <= 15.7814 )
									ret := 0.403509
								if( diPlus > 15.7814 )
									ret := 0.794872 // buy
							if( smoothedDirectionalMovementMinus > 0.127485 )
								if( smoothedTrueRange <= 0.353505 )
									ret := 0.978723 // buy
								if( smoothedTrueRange > 0.353505 )
									ret := 0.777778 // buy
						if( diPlus > 22.659 )
							ret := -0.800000 // sell
			if( trueRange > 0.360186 )
				if( diMinus <= 60.7982 )
					if( diMinus <= 10.4721 )
						if( smoothedDirectionalMovementMinus <= 0.039967 )
							if( smoothedTrueRange <= 0.450194 )
								if( smoothedDirectionalMovementPlus <= 0.108958 )
									ret := -0.185185
								if( smoothedDirectionalMovementPlus > 0.108958 )
									ret := -0.565217
							if( smoothedTrueRange > 0.450194 )
								ret := 0.571429
						if( smoothedDirectionalMovementMinus > 0.039967 )
							if( trueRange <= 0.85 )
								if( dx <= 59.9748 )
									ret := -0.142857
								if( dx > 59.9748 )
									ret := 0.833333 // buy
							if( trueRange > 0.85 )
								if( adx <= 44.8095 )
									ret := -0.300000
								if( adx > 44.8095 )
									ret := -0.909091 // sell
					if( diMinus > 10.4721 )
						if( dx <= 52.694 )
							if( smoothedDirectionalMovementMinus <= 0.154886 )
								if( diMinus <= 11.9268 )
									ret := -0.600000
								if( diMinus > 11.9268 )
									ret := 0.482301
							if( smoothedDirectionalMovementMinus > 0.154886 )
								if( smoothedTrueRange <= 0.452804 )
									ret := -0.361111
								if( smoothedTrueRange > 0.452804 )
									ret := 0.325000
						if( dx > 52.694 )
							if( trueRange <= 0.744109 )
								if( adx <= 18.7325 )
									ret := -0.806452 // sell
								if( adx > 18.7325 )
									ret := 0.044255
							if( trueRange > 0.744109 )
								if( smoothedTrueRange <= 0.242386 )
									ret := 0.743902 // buy
								if( smoothedTrueRange > 0.242386 )
									ret := 0.117470
				if( diMinus > 60.7982 )
					if( diPlus <= 2.9562 )
						if( diMinus <= 68.0752 )
							ret := -0.416667
						if( diMinus > 68.0752 )
							ret := -1.000000 // sell
					if( diPlus > 2.9562 )
						if( smoothedDirectionalMovementMinus <= 0.138966 )
							if( diPlus <= 9.53074 )
								if( diMinus <= 64.505 )
									ret := -0.705882 // sell
								if( diMinus > 64.505 )
									ret := 0.472222
							if( diPlus > 9.53074 )
								if( diPlus <= 15.3358 )
									ret := -0.853659 // sell
								if( diPlus > 15.3358 )
									ret := -0.276923
						if( smoothedDirectionalMovementMinus > 0.138966 )
							if( smoothedDirectionalMovementPlus <= 0.029808 )
								if( diPlus <= 9.09418 )
									ret := 0.428571
								if( diPlus > 9.09418 )
									ret := 1.000000 // buy
							if( smoothedDirectionalMovementPlus > 0.029808 )
								if( smoothedDirectionalMovementPlus <= 0.047655 )
									ret := -0.465116
								if( smoothedDirectionalMovementPlus > 0.047655 )
									ret := 0.361111
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator ADX_and_DI 
//@version=5
// This source code is subject to the terms of the Mozilla Public License 2.0 at https://mozilla.org/MPL/2.0/
// © BeikabuOyaji

//indicator "ADX and DI for v5", overlay=false)

// Input parameters
len = input(14, title="Length")
th = input(20, title="Threshold")

// Calculate True Range
trueRange = math.max(math.max(high - low, math.abs(high - nz(close[1]))), math.abs(low - nz(close[1])))

// Calculate Directional Movements
directionalMovementPlus = high - nz(high[1]) > nz(low[1]) - low ? math.max(high - nz(high[1]), 0) : 0
directionalMovementMinus = nz(low[1]) - low > high - nz(high[1]) ? math.max(nz(low[1]) - low, 0) : 0

// Initialize and calculate smoothed values
var float smoothedTrueRange = 0
var float smoothedDirectionalMovementPlus = 0
var float smoothedDirectionalMovementMinus = 0

smoothedTrueRange := nz(smoothedTrueRange[1]) - (nz(smoothedTrueRange[1]) / len) + trueRange
smoothedDirectionalMovementPlus := nz(smoothedDirectionalMovementPlus[1]) - (nz(smoothedDirectionalMovementPlus[1]) / len) + directionalMovementPlus
smoothedDirectionalMovementMinus := nz(smoothedDirectionalMovementMinus[1]) - (nz(smoothedDirectionalMovementMinus[1]) / len) + directionalMovementMinus

// Calculate DI+ and DI-
diPlus = (smoothedDirectionalMovementPlus / smoothedTrueRange) * 100
diMinus = (smoothedDirectionalMovementMinus / smoothedTrueRange) * 100

// Calculate DX and ADX
dx = math.abs(diPlus - diMinus) / (diPlus + diMinus) * 100
adx = ta.sma(dx, len)

// Plot DI+, DI-, and ADX
plot(diPlus, color=color.green, title="DI+")
plot(diMinus, color=color.red, title="DI-")
plot(adx, color=color.navy, title="ADX")

// Plot threshold line
hline(th, "Threshold", color=color.black)

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
float op_operation = decision_tree_0_LYFT_15Min_ff1e1f37(dx, directionalMovementMinus, diPlus, smoothedDirectionalMovementMinus, trueRange, smoothedDirectionalMovementPlus, smoothedTrueRange, directionalMovementPlus, diMinus, adx)

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


