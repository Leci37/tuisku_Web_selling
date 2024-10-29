//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ATOMUSDT_15Min_2MS0_d6562c67 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2MS0_d6562c67", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_d6562c67(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( k <= 46.6668 )
		if( rsi1 <= 38.0831 )
			if( MFI_Low <= 19.2873 )
				if( Raw_Money_Flow <= 131971 )
					if( rsi1 <= 31.7418 )
						if( Typical_Price <= 8.27885 )
							if( smoothD_d <= 13.5044 )
								if( MFI_High <= -42.7587 )
									ret := -0.744534 // sell
								if( MFI_High > -42.7587 )
									ret := -0.507937
							if( smoothD_d > 13.5044 )
								if( Money_Flow_Ratio <= 0.131971 )
									ret := 0.185185
								if( Money_Flow_Ratio > 0.131971 )
									ret := -0.614314
						if( Typical_Price > 8.27885 )
							if( smoothD_d <= -1.43301 )
								if( MFI <= 30.5902 )
									ret := 0.245283
								if( MFI > 30.5902 )
									ret := -0.625000
							if( smoothD_d > -1.43301 )
								if( Money_Flow_Ratio <= 0.436177 )
									ret := -0.331250
								if( Money_Flow_Ratio > 0.436177 )
									ret := -0.552743
					if( rsi1 > 31.7418 )
						if( MFI_High <= -45.4247 )
							if( MFI_Low <= -3.32765 )
								if( d <= 34.9593 )
									ret := -0.018519
								if( d > 34.9593 )
									ret := 0.923077 // buy
							if( MFI_Low > -3.32765 )
								if( Typical_Price <= 9.45382 )
									ret := -0.259450
								if( Typical_Price > 9.45382 )
									ret := -0.066176
						if( MFI_High > -45.4247 )
							if( Money_Flow_Ratio <= 0.561278 )
								if( d <= 24.6574 )
									ret := -0.805310 // sell
								if( d > 24.6574 )
									ret := -0.388889
							if( Money_Flow_Ratio > 0.561278 )
								if( Positive_Money_Flow <= 42109.4 )
									ret := -0.169591
								if( Positive_Money_Flow > 42109.4 )
									ret := -0.505263
				if( Raw_Money_Flow > 131971 )
					if( rsi1 <= 22.7998 )
						if( Typical_Price <= 11.2558 )
							if( Negative_Money_Flow_Sum <= 2.97132e+06 )
								if( d_k <= 6.56105 )
									ret := -0.720772 // sell
								if( d_k > 6.56105 )
									ret := -0.330435
							if( Negative_Money_Flow_Sum > 2.97132e+06 )
								if( smoothD_d <= -2.87587 )
									ret := 0.277778
								if( smoothD_d > -2.87587 )
									ret := -0.317801
						if( Typical_Price > 11.2558 )
							if( MFI <= 11.5714 )
								if( Typical_Price <= 16.0684 )
									ret := 0.511364
								if( Typical_Price > 16.0684 )
									ret := -0.244444
							if( MFI > 11.5714 )
								if( Negative_Money_Flow <= 1.60894e+06 )
									ret := -0.313409
								if( Negative_Money_Flow > 1.60894e+06 )
									ret := 0.213235
					if( rsi1 > 22.7998 )
						if( Raw_Money_Flow <= 1.422e+06 )
							if( Negative_Money_Flow_Sum <= 2.98145e+06 )
								if( rsi1 <= 33.3064 )
									ret := -0.346190
								if( rsi1 > 33.3064 )
									ret := -0.068376
							if( Negative_Money_Flow_Sum > 2.98145e+06 )
								if( Money_Flow_Ratio <= 0.348858 )
									ret := 0.033927
								if( Money_Flow_Ratio > 0.348858 )
									ret := -0.160042
						if( Raw_Money_Flow > 1.422e+06 )
							if( smoothD_d <= 7.30323 )
								if( MFI_Low <= -1.14983 )
									ret := -0.811321 // sell
								if( MFI_Low > -1.14983 )
									ret := -0.109756
							if( smoothD_d > 7.30323 )
								if( MFI <= 37.7208 )
									ret := 0.518610
								if( MFI > 37.7208 )
									ret := -0.928571 // sell
			if( MFI_Low > 19.2873 )
				if( rsi1 <= 28.8373 )
					if( d <= 28.7164 )
						if( k <= 0.001376 )
							if( Positive_Money_Flow_Sum <= 3.5616e+06 )
								if( Typical_Price <= 6.46309 )
									ret := -0.851852 // sell
								if( Typical_Price > 6.46309 )
									ret := -0.543624
							if( Positive_Money_Flow_Sum > 3.5616e+06 )
								if( MFI_Low <= 30.4529 )
									ret := -1.000000 // sell
								if( MFI_Low > 30.4529 )
									ret := -0.894737 // sell
						if( k > 0.001376 )
							if( Raw_Money_Flow <= 84121.1 )
								if( Negative_Money_Flow_Sum <= 893705 )
									ret := -0.741935 // sell
								if( Negative_Money_Flow_Sum > 893705 )
									ret := -0.309091
							if( Raw_Money_Flow > 84121.1 )
								if( MFI_Low <= 19.4705 )
									ret := -0.222222
								if( MFI_Low > 19.4705 )
									ret := -0.841136 // sell
					if( d > 28.7164 )
						if( d_k <= 10.7769 )
							if( d <= 46.6362 )
								if( Raw_Money_Flow <= 176411 )
									ret := -0.698413
								if( Raw_Money_Flow > 176411 )
									ret := -0.142857
							if( d > 46.6362 )
								ret := 0.142857
						if( d_k > 10.7769 )
							if( Typical_Price <= 8.38443 )
								if( MFI_Low <= 34.8226 )
									ret := -0.911111 // sell
								if( MFI_Low > 34.8226 )
									ret := -0.611111
							if( Typical_Price > 8.38443 )
								if( Money_Flow_Ratio <= 0.746993 )
									ret := -0.285714
								if( Money_Flow_Ratio > 0.746993 )
									ret := -0.696970
				if( rsi1 > 28.8373 )
					if( Money_Flow_Ratio <= 0.88835 )
						if( d_k <= -1.57576 )
							if( Raw_Money_Flow <= 2.05339e+06 )
								if( Negative_Money_Flow <= 383201 )
									ret := -0.502604
								if( Negative_Money_Flow > 383201 )
									ret := -0.806452 // sell
							if( Raw_Money_Flow > 2.05339e+06 )
								ret := 0.333333
						if( d_k > -1.57576 )
							if( Negative_Money_Flow <= 118982 )
								if( d <= 23.3021 )
									ret := -0.368421
								if( d > 23.3021 )
									ret := -0.610989
							if( Negative_Money_Flow > 118982 )
								if( d_k <= 12.797 )
									ret := -0.188406
								if( d_k > 12.797 )
									ret := 0.246377
					if( Money_Flow_Ratio > 0.88835 )
						if( k <= 0.005021 )
							if( Positive_Money_Flow_Sum <= 2.8539e+06 )
								if( d_k <= 3.1081 )
									ret := -0.074380
								if( d_k > 3.1081 )
									ret := -0.368421
							if( Positive_Money_Flow_Sum > 2.8539e+06 )
								if( Raw_Money_Flow <= 1.02339e+06 )
									ret := -0.696970
								if( Raw_Money_Flow > 1.02339e+06 )
									ret := 0.153846
						if( k > 0.005021 )
							if( Positive_Money_Flow <= 76605.3 )
								if( k <= 33.5286 )
									ret := -0.605056
								if( k > 33.5286 )
									ret := -0.321429
							if( Positive_Money_Flow > 76605.3 )
								if( MFI_High <= -25.0406 )
									ret := -0.664740
								if( MFI_High > -25.0406 )
									ret := -0.862069 // sell
		if( rsi1 > 38.0831 )
			if( MFI_Low <= 31.1336 )
				if( Negative_Money_Flow <= 70204.8 )
					if( MFI_Low <= 21.1886 )
						if( k <= 29.2377 )
							if( Positive_Money_Flow_Sum <= 6.13302e+06 )
								if( Positive_Money_Flow <= 1.2043e+06 )
									ret := -0.081409
								if( Positive_Money_Flow > 1.2043e+06 )
									ret := 0.588235
							if( Positive_Money_Flow_Sum > 6.13302e+06 )
								if( Raw_Money_Flow <= 879952 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 879952 )
									ret := -0.818182 // sell
						if( k > 29.2377 )
							if( Typical_Price <= 15.5677 )
								if( Typical_Price <= 11.661 )
									ret := 0.093081
								if( Typical_Price > 11.661 )
									ret := -0.096104
							if( Typical_Price > 15.5677 )
								if( d <= 39.6133 )
									ret := 0.642857
								if( d > 39.6133 )
									ret := 1.000000 // buy
					if( MFI_Low > 21.1886 )
						if( MFI <= 45.8566 )
							if( rsi1 <= 42.5946 )
								if( k <= 36.0016 )
									ret := -0.512048
								if( k > 36.0016 )
									ret := -0.118644
							if( rsi1 > 42.5946 )
								if( Negative_Money_Flow_Sum <= 3.67715e+06 )
									ret := -0.062871
								if( Negative_Money_Flow_Sum > 3.67715e+06 )
									ret := -0.388889
						if( MFI > 45.8566 )
							if( MFI_Low <= 30.9667 )
								if( MFI_High <= -30.23 )
									ret := -0.073986
								if( MFI_High > -30.23 )
									ret := -0.219925
							if( MFI_Low > 30.9667 )
								if( Negative_Money_Flow_Sum <= 1.40922e+06 )
									ret := -0.111111
								if( Negative_Money_Flow_Sum > 1.40922e+06 )
									ret := 0.534884
				if( Negative_Money_Flow > 70204.8 )
					if( MFI_High <= -45.9263 )
						if( smoothD_d <= 18.5318 )
							if( Raw_Money_Flow <= 463006 )
								if( Positive_Money_Flow_Sum <= 673260 )
									ret := -0.013699
								if( Positive_Money_Flow_Sum > 673260 )
									ret := -0.263941
							if( Raw_Money_Flow > 463006 )
								if( Negative_Money_Flow_Sum <= 1.25708e+07 )
									ret := 0.442953
								if( Negative_Money_Flow_Sum > 1.25708e+07 )
									ret := -0.454545
						if( smoothD_d > 18.5318 )
							if( rsi1 <= 42.8829 )
								if( Negative_Money_Flow <= 915371 )
									ret := 0.248447
								if( Negative_Money_Flow > 915371 )
									ret := 0.813559 // buy
							if( rsi1 > 42.8829 )
								if( d_k <= -9.99837 )
									ret := 0.269841
								if( d_k > -9.99837 )
									ret := 0.572539
					if( MFI_High > -45.9263 )
						if( Raw_Money_Flow <= 666918 )
							if( smoothK_k <= 24.3752 )
								if( Positive_Money_Flow_Sum <= 3.83287e+06 )
									ret := 0.060051
								if( Positive_Money_Flow_Sum > 3.83287e+06 )
									ret := -0.215962
							if( smoothK_k > 24.3752 )
								if( MFI_High <= -31.4341 )
									ret := 0.150282
								if( MFI_High > -31.4341 )
									ret := 0.363946
						if( Raw_Money_Flow > 666918 )
							if( Money_Flow_Ratio <= 0.672826 )
								if( d <= 50.2389 )
									ret := -0.447115
								if( d > 50.2389 )
									ret := 0.142857
							if( Money_Flow_Ratio > 0.672826 )
								if( MFI <= 42.1393 )
									ret := 0.535714
								if( MFI > 42.1393 )
									ret := -0.059226
			if( MFI_Low > 31.1336 )
				if( rsi1 <= 57.3939 )
					if( MFI_Low <= 42.9841 )
						if( rsi1 <= 44.3013 )
							if( Positive_Money_Flow <= 76378.4 )
								if( smoothD_d <= 54.8743 )
									ret := -0.370166
								if( smoothD_d > 54.8743 )
									ret := 0.360656
							if( Positive_Money_Flow > 76378.4 )
								if( Money_Flow_Ratio <= 1.64617 )
									ret := -0.636232
								if( Money_Flow_Ratio > 1.64617 )
									ret := -0.277778
						if( rsi1 > 44.3013 )
							if( rsi1 <= 48.2773 )
								if( MFI_High <= -22.9015 )
									ret := -0.139299
								if( MFI_High > -22.9015 )
									ret := -0.347174
							if( rsi1 > 48.2773 )
								if( Typical_Price <= 15.2535 )
									ret := -0.059183
								if( Typical_Price > 15.2535 )
									ret := -0.642105
					if( MFI_Low > 42.9841 )
						if( Positive_Money_Flow <= 108036 )
							if( rsi1 <= 49.3975 )
								if( k <= 0.010586 )
									ret := -0.273973
								if( k > 0.010586 )
									ret := -0.539804
							if( rsi1 > 49.3975 )
								if( Positive_Money_Flow_Sum <= 5.03061e+06 )
									ret := -0.177255
								if( Positive_Money_Flow_Sum > 5.03061e+06 )
									ret := -0.455446
						if( Positive_Money_Flow > 108036 )
							if( k <= 2.11346 )
								if( Negative_Money_Flow_Sum <= 2.48946e+06 )
									ret := -0.387500
								if( Negative_Money_Flow_Sum > 2.48946e+06 )
									ret := 0.269231
							if( k > 2.11346 )
								if( Positive_Money_Flow <= 309224 )
									ret := -0.563380
								if( Positive_Money_Flow > 309224 )
									ret := -0.753550 // sell
				if( rsi1 > 57.3939 )
					if( rsi1 <= 68.0809 )
						if( MFI_Low <= 45.2889 )
							if( Positive_Money_Flow <= 30952.2 )
								if( smoothD_d <= 12.5289 )
									ret := 0.000000
								if( smoothD_d > 12.5289 )
									ret := 0.436389
							if( Positive_Money_Flow > 30952.2 )
								if( smoothD_d <= 30.0034 )
									ret := -0.056604
								if( smoothD_d > 30.0034 )
									ret := 0.288557
						if( MFI_Low > 45.2889 )
							if( MFI_Low <= 60.6058 )
								if( rsi1 <= 59.4177 )
									ret := -0.229287
								if( rsi1 > 59.4177 )
									ret := -0.019976
							if( MFI_Low > 60.6058 )
								if( rsi1 <= 62.7061 )
									ret := -0.661932
								if( rsi1 > 62.7061 )
									ret := -0.224913
					if( rsi1 > 68.0809 )
						if( MFI_High <= 12.6053 )
							if( Typical_Price <= 11.6848 )
								if( MFI_High <= -17.9225 )
									ret := 0.710145 // buy
								if( MFI_High > -17.9225 )
									ret := 0.396527
							if( Typical_Price > 11.6848 )
								if( Negative_Money_Flow <= 383698 )
									ret := 0.061538
								if( Negative_Money_Flow > 383698 )
									ret := 0.475000
						if( MFI_High > 12.6053 )
							if( Money_Flow_Ratio <= 16.1184 )
								ret := -0.187500
							if( Money_Flow_Ratio > 16.1184 )
								if( rsi1 <= 71.7594 )
									ret := -0.909091 // sell
								if( rsi1 > 71.7594 )
									ret := -0.181818
	if( k > 46.6668 )
		if( rsi1 <= 56.3084 )
			if( Negative_Money_Flow <= 87043.9 )
				if( Money_Flow_Ratio <= 0.734715 )
					if( MFI <= 32.227 )
						if( smoothK_k <= 87.6489 )
							if( Raw_Money_Flow <= 156347 )
								if( d <= 32.6767 )
									ret := -0.463768
								if( d > 32.6767 )
									ret := 0.095833
							if( Raw_Money_Flow > 156347 )
								if( d_k <= 6.05398 )
									ret := 0.310613
								if( d_k > 6.05398 )
									ret := -0.261364
						if( smoothK_k > 87.6489 )
							if( Positive_Money_Flow <= 552505 )
								if( MFI_Low <= 11.3746 )
									ret := 0.375598
								if( MFI_Low > 11.3746 )
									ret := -0.125000
							if( Positive_Money_Flow > 552505 )
								if( Typical_Price <= 13.123 )
									ret := 0.921875 // buy
								if( Typical_Price > 13.123 )
									ret := 0.250000
					if( MFI > 32.227 )
						if( rsi1 <= 47.9621 )
							if( MFI_Low <= 17.3992 )
								if( Typical_Price <= 9.58873 )
									ret := -0.292285
								if( Typical_Price > 9.58873 )
									ret := -0.092424
							if( MFI_Low > 17.3992 )
								if( rsi1 <= 40.9698 )
									ret := -0.287918
								if( rsi1 > 40.9698 )
									ret := 0.014398
						if( rsi1 > 47.9621 )
							if( MFI_High <= -46.763 )
								if( rsi1 <= 48.3994 )
									ret := 0.538462
								if( rsi1 > 48.3994 )
									ret := -0.090909
							if( MFI_High > -46.763 )
								if( Raw_Money_Flow <= 634526 )
									ret := 0.345444
								if( Raw_Money_Flow > 634526 )
									ret := -0.181102
				if( Money_Flow_Ratio > 0.734715 )
					if( k <= 72.4955 )
						if( rsi1 <= 45.4105 )
							if( d <= 51.5484 )
								if( d_k <= -5.21268 )
									ret := -0.096447
								if( d_k > -5.21268 )
									ret := -0.547945
							if( d > 51.5484 )
								if( Raw_Money_Flow <= 121623 )
									ret := -0.364672
								if( Raw_Money_Flow > 121623 )
									ret := -0.625641
						if( rsi1 > 45.4105 )
							if( Money_Flow_Ratio <= 1.47653 )
								if( Money_Flow_Ratio <= 0.73892 )
									ret := -0.869565 // sell
								if( Money_Flow_Ratio > 0.73892 )
									ret := -0.080189
							if( Money_Flow_Ratio > 1.47653 )
								if( smoothD_d <= 59.2685 )
									ret := -0.410305
								if( smoothD_d > 59.2685 )
									ret := -0.207080
					if( k > 72.4955 )
						if( Positive_Money_Flow_Sum <= 2.57956e+06 )
							if( Positive_Money_Flow_Sum <= 2.40947e+06 )
								if( Positive_Money_Flow <= 219751 )
									ret := -0.040525
								if( Positive_Money_Flow > 219751 )
									ret := 0.190202
							if( Positive_Money_Flow_Sum > 2.40947e+06 )
								if( Money_Flow_Ratio <= 1.49029 )
									ret := 0.543689
								if( Money_Flow_Ratio > 1.49029 )
									ret := -0.777778 // sell
						if( Positive_Money_Flow_Sum > 2.57956e+06 )
							if( Typical_Price <= 10.9622 )
								if( Positive_Money_Flow_Sum <= 3.54103e+06 )
									ret := -0.502347
								if( Positive_Money_Flow_Sum > 3.54103e+06 )
									ret := 0.005682
							if( Typical_Price > 10.9622 )
								if( Negative_Money_Flow_Sum <= 3.64956e+06 )
									ret := -0.345238
								if( Negative_Money_Flow_Sum > 3.64956e+06 )
									ret := 0.192771
			if( Negative_Money_Flow > 87043.9 )
				if( MFI_Low <= 19.6241 )
					if( MFI_High <= -61.3827 )
						if( d <= 41.8858 )
							if( Positive_Money_Flow_Sum <= 1.50965e+06 )
								if( Raw_Money_Flow <= 237865 )
									ret := -0.039216
								if( Raw_Money_Flow > 237865 )
									ret := 0.574713
							if( Positive_Money_Flow_Sum > 1.50965e+06 )
								if( Raw_Money_Flow <= 571289 )
									ret := 0.250000
								if( Raw_Money_Flow > 571289 )
									ret := -1.000000 // sell
						if( d > 41.8858 )
							if( Positive_Money_Flow_Sum <= 822689 )
								if( k <= 76.6322 )
									ret := 0.598214
								if( k > 76.6322 )
									ret := 0.745856 // buy
							if( Positive_Money_Flow_Sum > 822689 )
								if( Negative_Money_Flow <= 1.16276e+06 )
									ret := 0.375000
								if( Negative_Money_Flow > 1.16276e+06 )
									ret := 0.941860 // buy
					if( MFI_High > -61.3827 )
						if( d <= 37.7691 )
							if( Raw_Money_Flow <= 869239 )
								if( rsi1 <= 47.457 )
									ret := -0.223684
								if( rsi1 > 47.457 )
									ret := 0.425532
							if( Raw_Money_Flow > 869239 )
								ret := 0.571429
						if( d > 37.7691 )
							if( Negative_Money_Flow <= 1.86823e+06 )
								if( rsi1 <= 42.1907 )
									ret := 0.097143
								if( rsi1 > 42.1907 )
									ret := 0.529197
							if( Negative_Money_Flow > 1.86823e+06 )
								if( smoothD_d <= 45.2741 )
									ret := 0.545455
								if( smoothD_d > 45.2741 )
									ret := 0.930435 // buy
				if( MFI_Low > 19.6241 )
					if( Negative_Money_Flow_Sum <= 5.90741e+06 )
						if( MFI_Low <= 31.9042 )
							if( k <= 74.6609 )
								if( MFI_High <= -31.5074 )
									ret := 0.029949
								if( MFI_High > -31.5074 )
									ret := 0.263274
							if( k > 74.6609 )
								if( d <= 88.8813 )
									ret := 0.353017
								if( d > 88.8813 )
									ret := 0.016447
						if( MFI_Low > 31.9042 )
							if( smoothD_d <= 74.0782 )
								if( Negative_Money_Flow_Sum <= 2.01038e+06 )
									ret := -0.054152
								if( Negative_Money_Flow_Sum > 2.01038e+06 )
									ret := -0.296625
							if( smoothD_d > 74.0782 )
								if( d_k <= -9.65234 )
									ret := 0.833333 // buy
								if( d_k > -9.65234 )
									ret := 0.039663
					if( Negative_Money_Flow_Sum > 5.90741e+06 )
						if( Money_Flow_Ratio <= 0.945889 )
							if( Positive_Money_Flow_Sum <= 6.85686e+06 )
								if( smoothD_d <= 64.3828 )
									ret := 0.098765
								if( smoothD_d > 64.3828 )
									ret := -0.792453 // sell
							if( Positive_Money_Flow_Sum > 6.85686e+06 )
								if( rsi1 <= 42.4011 )
									ret := -0.301887
								if( rsi1 > 42.4011 )
									ret := 0.492647
						if( Money_Flow_Ratio > 0.945889 )
							if( rsi1 <= 53.8793 )
								if( d <= 46.1276 )
									ret := -0.071429
								if( d > 46.1276 )
									ret := -0.701149 // sell
							if( rsi1 > 53.8793 )
								if( Money_Flow_Ratio <= 1.16799 )
									ret := -0.800000 // sell
								if( Money_Flow_Ratio > 1.16799 )
									ret := 0.250000
		if( rsi1 > 56.3084 )
			if( MFI_High <= -29.8864 )
				if( Money_Flow_Ratio <= 0.720918 )
					if( Negative_Money_Flow_Sum <= 1.11752e+06 )
						if( Raw_Money_Flow <= 107166 )
							if( Negative_Money_Flow <= 47112.5 )
								if( d_k <= -0.04349 )
									ret := 0.406780
								if( d_k > -0.04349 )
									ret := 0.216535
							if( Negative_Money_Flow > 47112.5 )
								if( smoothK_k <= 88.9573 )
									ret := 0.700483 // buy
								if( smoothK_k > 88.9573 )
									ret := 0.446043
						if( Raw_Money_Flow > 107166 )
							if( Positive_Money_Flow <= 112970 )
								if( smoothD_d <= 91.7431 )
									ret := 0.836601 // buy
								if( smoothD_d > 91.7431 )
									ret := 0.575000
							if( Positive_Money_Flow > 112970 )
								if( d <= 96.5016 )
									ret := 0.555556
								if( d > 96.5016 )
									ret := 0.130435
					if( Negative_Money_Flow_Sum > 1.11752e+06 )
						if( Typical_Price <= 13.1984 )
							if( smoothK_k <= 97 )
								if( Money_Flow_Ratio <= 0.290338 )
									ret := 0.871951 // buy
								if( Money_Flow_Ratio > 0.290338 )
									ret := 0.743277 // buy
							if( smoothK_k > 97 )
								if( Typical_Price <= 5.96433 )
									ret := 0.837838 // buy
								if( Typical_Price > 5.96433 )
									ret := 0.541833
						if( Typical_Price > 13.1984 )
							if( Positive_Money_Flow_Sum <= 7.72093e+06 )
								if( MFI_Low <= 14.4263 )
									ret := -0.062500
								if( MFI_Low > 14.4263 )
									ret := 0.654545
							if( Positive_Money_Flow_Sum > 7.72093e+06 )
								ret := -1.000000 // sell
				if( Money_Flow_Ratio > 0.720918 )
					if( Negative_Money_Flow_Sum <= 3.88143e+06 )
						if( rsi1 <= 66.4013 )
							if( Typical_Price <= 8.90751 )
								if( Negative_Money_Flow <= 47224 )
									ret := 0.386364
								if( Negative_Money_Flow > 47224 )
									ret := 0.732938 // buy
							if( Typical_Price > 8.90751 )
								if( Typical_Price <= 13.3929 )
									ret := 0.344628
								if( Typical_Price > 13.3929 )
									ret := -0.052083
						if( rsi1 > 66.4013 )
							if( Typical_Price <= 10.5756 )
								if( d_k <= -24.7454 )
									ret := -0.090909
								if( d_k > -24.7454 )
									ret := 0.729309 // buy
							if( Typical_Price > 10.5756 )
								if( smoothK_k <= 71.9003 )
									ret := -0.217391
								if( smoothK_k > 71.9003 )
									ret := 0.464706
					if( Negative_Money_Flow_Sum > 3.88143e+06 )
						if( rsi1 <= 61.0711 )
							if( Typical_Price <= 10.0366 )
								if( smoothD_d <= 68.7478 )
									ret := -0.153846
								if( smoothD_d > 68.7478 )
									ret := 0.935484 // buy
							if( Typical_Price > 10.0366 )
								if( smoothD_d <= 77.1986 )
									ret := 0.112069
								if( smoothD_d > 77.1986 )
									ret := -0.297297
						if( rsi1 > 61.0711 )
							if( Money_Flow_Ratio <= 0.923965 )
								if( Positive_Money_Flow_Sum <= 3.46762e+06 )
									ret := 0.113636
								if( Positive_Money_Flow_Sum > 3.46762e+06 )
									ret := 0.753731 // buy
							if( Money_Flow_Ratio > 0.923965 )
								if( Money_Flow_Ratio <= 0.979608 )
									ret := -0.243243
								if( Money_Flow_Ratio > 0.979608 )
									ret := 0.608696
			if( MFI_High > -29.8864 )
				if( MFI <= 66.6324 )
					if( Positive_Money_Flow_Sum <= 6.30185e+06 )
						if( smoothK_k <= 82.5866 )
							if( MFI_Low <= 40.3771 )
								if( Positive_Money_Flow <= 116635 )
									ret := 0.429960
								if( Positive_Money_Flow > 116635 )
									ret := 0.244043
							if( MFI_Low > 40.3771 )
								if( Raw_Money_Flow <= 264070 )
									ret := 0.316865
								if( Raw_Money_Flow > 264070 )
									ret := 0.175151
						if( smoothK_k > 82.5866 )
							if( Typical_Price <= 12.6724 )
								if( rsi1 <= 69.7883 )
									ret := 0.296840
								if( rsi1 > 69.7883 )
									ret := 0.629096
							if( Typical_Price > 12.6724 )
								if( d_k <= -3.05207 )
									ret := 0.239496
								if( d_k > -3.05207 )
									ret := 0.000000
					if( Positive_Money_Flow_Sum > 6.30185e+06 )
						if( Positive_Money_Flow <= 751616 )
							if( k <= 83.3787 )
								if( MFI_Low <= 32.518 )
									ret := -0.714286 // sell
								if( MFI_Low > 32.518 )
									ret := 0.002890
							if( k > 83.3787 )
								if( Positive_Money_Flow_Sum <= 1.67974e+07 )
									ret := 0.463519
								if( Positive_Money_Flow_Sum > 1.67974e+07 )
									ret := -1.000000 // sell
						if( Positive_Money_Flow > 751616 )
							if( Negative_Money_Flow_Sum <= 9.36108e+06 )
								if( d_k <= -4.03741 )
									ret := -0.139344
								if( d_k > -4.03741 )
									ret := -0.562500
							if( Negative_Money_Flow_Sum > 9.36108e+06 )
								if( Positive_Money_Flow_Sum <= 1.32388e+07 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 1.32388e+07 )
									ret := 0.095238
				if( MFI > 66.6324 )
					if( Typical_Price <= 11.7902 )
						if( smoothK_k <= 78.1776 )
							if( Positive_Money_Flow_Sum <= 1.2974e+06 )
								if( d <= 73.2991 )
									ret := 0.186375
								if( d > 73.2991 )
									ret := 0.436842
							if( Positive_Money_Flow_Sum > 1.2974e+06 )
								if( Money_Flow_Ratio <= 4.48111 )
									ret := 0.138738
								if( Money_Flow_Ratio > 4.48111 )
									ret := -0.124088
						if( smoothK_k > 78.1776 )
							if( Typical_Price <= 6.34603 )
								if( MFI_High <= -2.01522 )
									ret := 0.686499
								if( MFI_High > -2.01522 )
									ret := 0.384000
							if( Typical_Price > 6.34603 )
								if( Positive_Money_Flow_Sum <= 2.2094e+06 )
									ret := 0.417241
								if( Positive_Money_Flow_Sum > 2.2094e+06 )
									ret := 0.269916
					if( Typical_Price > 11.7902 )
						if( Positive_Money_Flow_Sum <= 5.34976e+06 )
							if( smoothK_k <= 86.833 )
								if( Money_Flow_Ratio <= 3.13685 )
									ret := -0.262087
								if( Money_Flow_Ratio > 3.13685 )
									ret := -0.050114
							if( smoothK_k > 86.833 )
								if( MFI <= 94.8056 )
									ret := 0.033378
								if( MFI > 94.8056 )
									ret := -0.916667 // sell
						if( Positive_Money_Flow_Sum > 5.34976e+06 )
							if( Positive_Money_Flow_Sum <= 5.50745e+06 )
								if( d_k <= 0.268567 )
									ret := 0.388889
								if( d_k > 0.268567 )
									ret := 0.914286 // buy
							if( Positive_Money_Flow_Sum > 5.50745e+06 )
								if( MFI_High <= 11.0851 )
									ret := 0.007551
								if( MFI_High > 11.0851 )
									ret := 0.512821
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_ATOMUSDT_15Min_d6562c67(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


