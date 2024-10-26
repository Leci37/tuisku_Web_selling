//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Money_Flow_Index
// ID_model: XLMUSDT_15Min_2CM0_85982d74 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_15Min_2CM0_85982d74", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_15Min_85982d74(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad_mf <= -142107 )
		if( Typical_Price <= 0.12055 )
			if( Negative_Money_Flow_Sum <= 600073 )
				if( Negative_Money_Flow <= 262.815 )
					if( ad <= -2.20816e+06 )
						if( ad <= -3.07962e+06 )
							if( ad <= -6.14169e+06 )
								ret := 0.750000 // buy
							if( ad > -6.14169e+06 )
								if( Positive_Money_Flow_Sum <= 1.67692e+06 )
									ret := 0.111111
								if( Positive_Money_Flow_Sum > 1.67692e+06 )
									ret := -0.500000
						if( ad > -3.07962e+06 )
							if( Money_Flow_Ratio <= 6.24491 )
								if( Money_Flow_Ratio <= 3.62825 )
									ret := -0.500000
								if( Money_Flow_Ratio > 3.62825 )
									ret := -0.750000 // sell
							if( Money_Flow_Ratio > 6.24491 )
								ret := -1.000000 // sell
					if( ad > -2.20816e+06 )
						if( Positive_Money_Flow_Sum <= 523606 )
							if( ad_mf <= -159386 )
								if( Positive_Money_Flow_Sum <= 280269 )
									ret := 0.070952
								if( Positive_Money_Flow_Sum > 280269 )
									ret := 0.152328
							if( ad_mf > -159386 )
								if( mf <= -0.132122 )
									ret := 0.229167
								if( mf > -0.132122 )
									ret := -0.135514
						if( Positive_Money_Flow_Sum > 523606 )
							if( Positive_Money_Flow_Sum <= 1.08212e+06 )
								if( mf <= -0.029438 )
									ret := 0.131148
								if( mf > -0.029438 )
									ret := -0.161290
							if( Positive_Money_Flow_Sum > 1.08212e+06 )
								if( Positive_Money_Flow <= 45944 )
									ret := 0.653846
								if( Positive_Money_Flow > 45944 )
									ret := 0.101449
				if( Negative_Money_Flow > 262.815 )
					if( Positive_Money_Flow <= 3195.16 )
						if( Positive_Money_Flow_Sum <= 269942 )
							if( MFI <= 18.732 )
								if( ad <= -194885 )
									ret := 0.219355
								if( ad > -194885 )
									ret := 0.510870
							if( MFI > 18.732 )
								if( Negative_Money_Flow_Sum <= 425418 )
									ret := 0.077741
								if( Negative_Money_Flow_Sum > 425418 )
									ret := -0.089310
						if( Positive_Money_Flow_Sum > 269942 )
							if( Positive_Money_Flow_Sum <= 1.41337e+06 )
								if( Negative_Money_Flow_Sum <= 137370 )
									ret := -0.068404
								if( Negative_Money_Flow_Sum > 137370 )
									ret := 0.183568
							if( Positive_Money_Flow_Sum > 1.41337e+06 )
								if( Positive_Money_Flow_Sum <= 1.96056e+06 )
									ret := -0.282759
								if( Positive_Money_Flow_Sum > 1.96056e+06 )
									ret := 0.410256
					if( Positive_Money_Flow > 3195.16 )
						if( mf <= 0.234681 )
							if( Positive_Money_Flow <= 7246.87 )
								if( Raw_Money_Flow <= 18439.7 )
									ret := -0.200000
								if( Raw_Money_Flow > 18439.7 )
									ret := 0.820896 // buy
							if( Positive_Money_Flow > 7246.87 )
								if( ad_mf <= -236340 )
									ret := 0.378378
								if( ad_mf > -236340 )
									ret := 0.139535
						if( mf > 0.234681 )
							if( Positive_Money_Flow <= 86782.3 )
								if( MFI_High <= -1.75667 )
									ret := 0.052632
								if( MFI_High > -1.75667 )
									ret := -0.700000 // sell
							if( Positive_Money_Flow > 86782.3 )
								ret := 1.000000 // buy
			if( Negative_Money_Flow_Sum > 600073 )
				if( Positive_Money_Flow_Sum <= 920761 )
					if( MFI_High <= -72.2008 )
						if( Raw_Money_Flow <= 402014 )
							if( mf <= -0.292706 )
								if( mf <= -0.393131 )
									ret := -0.310345
								if( mf > -0.393131 )
									ret := -0.794872 // sell
							if( mf > -0.292706 )
								if( Typical_Price <= 0.101763 )
									ret := 0.454545
								if( Typical_Price > 0.101763 )
									ret := -0.366667
						if( Raw_Money_Flow > 402014 )
							if( Typical_Price <= 0.112687 )
								if( Negative_Money_Flow_Sum <= 2.09711e+06 )
									ret := 0.111111
								if( Negative_Money_Flow_Sum > 2.09711e+06 )
									ret := 0.821429 // buy
							if( Typical_Price > 0.112687 )
								if( mf <= -0.374119 )
									ret := 0.750000 // buy
								if( mf > -0.374119 )
									ret := -1.000000 // sell
					if( MFI_High > -72.2008 )
						if( Typical_Price <= 0.113866 )
							if( mf <= -0.155141 )
								if( Typical_Price <= 0.10529 )
									ret := 0.339791
								if( Typical_Price > 0.10529 )
									ret := 0.161194
							if( mf > -0.155141 )
								if( Negative_Money_Flow_Sum <= 1.09588e+06 )
									ret := 0.301747
								if( Negative_Money_Flow_Sum > 1.09588e+06 )
									ret := 0.485804
						if( Typical_Price > 0.113866 )
							if( Negative_Money_Flow_Sum <= 2.42004e+06 )
								if( MFI_Low <= 23.7623 )
									ret := 0.218310
								if( MFI_Low > 23.7623 )
									ret := 0.003690
							if( Negative_Money_Flow_Sum > 2.42004e+06 )
								if( Negative_Money_Flow_Sum <= 3.28511e+06 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow_Sum > 3.28511e+06 )
									ret := 0.153846
				if( Positive_Money_Flow_Sum > 920761 )
					if( MFI_High <= -43.125 )
						if( ad <= -2.07471e+06 )
							if( Typical_Price <= 0.11202 )
								if( Typical_Price <= 0.101623 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.101623 )
									ret := 0.750000 // buy
							if( Typical_Price > 0.11202 )
								if( Negative_Money_Flow <= 347607 )
									ret := -0.600000
								if( Negative_Money_Flow > 347607 )
									ret := 0.636364
						if( ad > -2.07471e+06 )
							if( Negative_Money_Flow_Sum <= 4.40169e+06 )
								if( Positive_Money_Flow_Sum <= 1.90595e+06 )
									ret := 0.150000
								if( Positive_Money_Flow_Sum > 1.90595e+06 )
									ret := -0.846154 // sell
							if( Negative_Money_Flow_Sum > 4.40169e+06 )
								if( ad <= -1.49009e+06 )
									ret := -0.400000
								if( ad > -1.49009e+06 )
									ret := 0.884615 // buy
					if( MFI_High > -43.125 )
						if( MFI_High <= -27.0393 )
							if( mf <= -0.168847 )
								if( Typical_Price <= 0.117428 )
									ret := -0.638889
								if( Typical_Price > 0.117428 )
									ret := 0.500000
							if( mf > -0.168847 )
								if( ad <= -1.79515e+06 )
									ret := -0.265152
								if( ad > -1.79515e+06 )
									ret := 0.001901
						if( MFI_High > -27.0393 )
							if( Positive_Money_Flow_Sum <= 1.70671e+06 )
								if( Positive_Money_Flow_Sum <= 1.38188e+06 )
									ret := 0.073718
								if( Positive_Money_Flow_Sum > 1.38188e+06 )
									ret := 0.480349
							if( Positive_Money_Flow_Sum > 1.70671e+06 )
								if( ad <= -3.06575e+06 )
									ret := 0.474576
								if( ad > -3.06575e+06 )
									ret := -0.034653
		if( Typical_Price > 0.12055 )
			if( Negative_Money_Flow_Sum <= 2.55045e+06 )
				if( Positive_Money_Flow_Sum <= 4.82624e+06 )
					if( ad_mf <= -198463 )
						if( Typical_Price <= 0.142894 )
							if( Money_Flow_Ratio <= 0.900691 )
								if( Money_Flow_Ratio <= 0.715076 )
									ret := 0.042473
								if( Money_Flow_Ratio > 0.715076 )
									ret := -0.228045
							if( Money_Flow_Ratio > 0.900691 )
								if( Negative_Money_Flow <= 68675.8 )
									ret := -0.028262
								if( Negative_Money_Flow > 68675.8 )
									ret := 0.153377
						if( Typical_Price > 0.142894 )
							if( ad_mf <= -210640 )
								if( Positive_Money_Flow_Sum <= 3.22345e+06 )
									ret := -0.132245
								if( Positive_Money_Flow_Sum > 3.22345e+06 )
									ret := 0.269231
							if( ad_mf > -210640 )
								if( Negative_Money_Flow <= 70064.1 )
									ret := 0.142857
								if( Negative_Money_Flow > 70064.1 )
									ret := 0.900000 // buy
					if( ad_mf > -198463 )
						if( Raw_Money_Flow <= 75244.2 )
							if( MFI <= 32.2103 )
								if( Raw_Money_Flow <= 48421.4 )
									ret := 0.177778
								if( Raw_Money_Flow > 48421.4 )
									ret := 0.714286 // buy
							if( MFI > 32.2103 )
								if( Positive_Money_Flow_Sum <= 667276 )
									ret := 0.113772
								if( Positive_Money_Flow_Sum > 667276 )
									ret := 0.325792
						if( Raw_Money_Flow > 75244.2 )
							if( mf <= 0.148298 )
								if( ad_mf <= -177124 )
									ret := 0.124031
								if( ad_mf > -177124 )
									ret := -0.245033
							if( mf > 0.148298 )
								if( Negative_Money_Flow_Sum <= 463464 )
									ret := 0.045455
								if( Negative_Money_Flow_Sum > 463464 )
									ret := 0.593750
				if( Positive_Money_Flow_Sum > 4.82624e+06 )
					if( Negative_Money_Flow_Sum <= 1.99094e+06 )
						if( Negative_Money_Flow_Sum <= 742955 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 742955 )
							if( ad <= -792621 )
								if( Typical_Price <= 0.156293 )
									ret := 0.272727
								if( Typical_Price > 0.156293 )
									ret := -0.636364
							if( ad > -792621 )
								if( Negative_Money_Flow_Sum <= 1.31868e+06 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 1.31868e+06 )
									ret := -0.875000 // sell
					if( Negative_Money_Flow_Sum > 1.99094e+06 )
						if( Typical_Price <= 0.129588 )
							ret := 0.000000
						if( Typical_Price > 0.129588 )
							if( mf <= 0.003172 )
								if( Money_Flow_Ratio <= 2.60018 )
									ret := 0.000000
								if( Money_Flow_Ratio > 2.60018 )
									ret := -1.000000 // sell
							if( mf > 0.003172 )
								ret := -1.000000 // sell
			if( Negative_Money_Flow_Sum > 2.55045e+06 )
				if( mf <= 0.035526 )
					if( Negative_Money_Flow_Sum <= 4.00013e+06 )
						if( Typical_Price <= 0.144598 )
							if( Positive_Money_Flow_Sum <= 699689 )
								if( Positive_Money_Flow_Sum <= 557054 )
									ret := 0.350000
								if( Positive_Money_Flow_Sum > 557054 )
									ret := -0.411765
							if( Positive_Money_Flow_Sum > 699689 )
								if( ad <= -1.01645e+07 )
									ret := -1.000000 // sell
								if( ad > -1.01645e+07 )
									ret := 0.654545
						if( Typical_Price > 0.144598 )
							if( Raw_Money_Flow <= 265987 )
								if( ad_mf <= -293510 )
									ret := 0.755556 // buy
								if( ad_mf > -293510 )
									ret := -0.100000
							if( Raw_Money_Flow > 265987 )
								if( Negative_Money_Flow_Sum <= 2.95231e+06 )
									ret := -0.605263
								if( Negative_Money_Flow_Sum > 2.95231e+06 )
									ret := 0.287129
					if( Negative_Money_Flow_Sum > 4.00013e+06 )
						if( Negative_Money_Flow <= 243885 )
							if( Negative_Money_Flow_Sum <= 8.74196e+06 )
								if( Negative_Money_Flow_Sum <= 4.80691e+06 )
									ret := 0.029412
								if( Negative_Money_Flow_Sum > 4.80691e+06 )
									ret := -0.666667
							if( Negative_Money_Flow_Sum > 8.74196e+06 )
								if( ad <= -2.3197e+06 )
									ret := 0.166667
								if( ad > -2.3197e+06 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 243885 )
							if( MFI <= 27.2575 )
								if( Positive_Money_Flow_Sum <= 1.02975e+06 )
									ret := -0.513514
								if( Positive_Money_Flow_Sum > 1.02975e+06 )
									ret := 0.148649
							if( MFI > 27.2575 )
								if( ad_mf <= -1.38372e+07 )
									ret := -1.000000 // sell
								if( ad_mf > -1.38372e+07 )
									ret := 0.472803
				if( mf > 0.035526 )
					if( Positive_Money_Flow <= 379013 )
						if( Negative_Money_Flow_Sum <= 8.89002e+06 )
							if( ad <= -504142 )
								if( Raw_Money_Flow <= 171380 )
									ret := -0.928571 // sell
								if( Raw_Money_Flow > 171380 )
									ret := -0.118421
							if( ad > -504142 )
								if( mf <= 0.202842 )
									ret := 0.727273 // buy
								if( mf > 0.202842 )
									ret := -0.833333 // sell
						if( Negative_Money_Flow_Sum > 8.89002e+06 )
							if( Typical_Price <= 0.158977 )
								if( Positive_Money_Flow_Sum <= 7.55386e+07 )
									ret := 0.911765 // buy
								if( Positive_Money_Flow_Sum > 7.55386e+07 )
									ret := 0.166667
							if( Typical_Price > 0.158977 )
								if( Negative_Money_Flow_Sum <= 1.35452e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.35452e+07 )
									ret := -0.800000 // sell
					if( Positive_Money_Flow > 379013 )
						if( MFI_High <= -6.90404 )
							if( Money_Flow_Ratio <= 1.35676 )
								if( Raw_Money_Flow <= 636590 )
									ret := -0.714286 // sell
								if( Raw_Money_Flow > 636590 )
									ret := 0.000000
							if( Money_Flow_Ratio > 1.35676 )
								if( ad_mf <= -533731 )
									ret := -1.000000 // sell
								if( ad_mf > -533731 )
									ret := -0.750000 // sell
						if( MFI_High > -6.90404 )
							ret := 0.142857
	if( ad_mf > -142107 )
		if( MFI <= 36.468 )
			if( Positive_Money_Flow_Sum <= 255391 )
				if( Raw_Money_Flow <= 181810 )
					if( Raw_Money_Flow <= 155733 )
						if( Typical_Price <= 0.111185 )
							if( mf <= -0.025259 )
								if( ad <= -58890.9 )
									ret := 0.157962
								if( ad > -58890.9 )
									ret := 0.018312
							if( mf > -0.025259 )
								if( MFI_High <= -67.4871 )
									ret := 0.224138
								if( MFI_High > -67.4871 )
									ret := -0.058619
						if( Typical_Price > 0.111185 )
							if( MFI <= 33.1361 )
								if( mf <= 0.083352 )
									ret := 0.176406
								if( mf > 0.083352 )
									ret := -0.004184
							if( MFI > 33.1361 )
								if( Negative_Money_Flow_Sum <= 415350 )
									ret := -0.043796
								if( Negative_Money_Flow_Sum > 415350 )
									ret := -0.333333
					if( Raw_Money_Flow > 155733 )
						if( mf <= 0.2739 )
							if( Negative_Money_Flow_Sum <= 1.93904e+06 )
								if( Negative_Money_Flow_Sum <= 1.42707e+06 )
									ret := -0.369048
								if( Negative_Money_Flow_Sum > 1.42707e+06 )
									ret := -1.000000 // sell
							if( Negative_Money_Flow_Sum > 1.93904e+06 )
								ret := 0.666667
						if( mf > 0.2739 )
							ret := 1.000000 // buy
				if( Raw_Money_Flow > 181810 )
					if( ad_mf <= 195880 )
						if( Negative_Money_Flow_Sum <= 657064 )
							if( MFI_High <= -64.0266 )
								ret := -0.750000 // sell
							if( MFI_High > -64.0266 )
								if( Typical_Price <= 0.110172 )
									ret := 0.666667
								if( Typical_Price > 0.110172 )
									ret := 0.250000
						if( Negative_Money_Flow_Sum > 657064 )
							if( mf <= 0.012514 )
								if( Negative_Money_Flow_Sum <= 906422 )
									ret := 0.888889 // buy
								if( Negative_Money_Flow_Sum > 906422 )
									ret := 1.000000 // buy
							if( mf > 0.012514 )
								ret := 0.714286 // buy
					if( ad_mf > 195880 )
						if( MFI_Low <= -2.00643 )
							if( Raw_Money_Flow <= 557215 )
								if( MFI_High <= -64.2996 )
									ret := 0.157895
								if( MFI_High > -64.2996 )
									ret := 0.666667
							if( Raw_Money_Flow > 557215 )
								if( ad_mf <= 4.12755e+06 )
									ret := 1.000000 // buy
								if( ad_mf > 4.12755e+06 )
									ret := 0.250000
						if( MFI_Low > -2.00643 )
							if( mf <= 0.092326 )
								if( mf <= -0.049692 )
									ret := 0.000000
								if( mf > -0.049692 )
									ret := -0.560000
							if( mf > 0.092326 )
								if( Negative_Money_Flow <= 284255 )
									ret := 0.600000
								if( Negative_Money_Flow > 284255 )
									ret := -0.800000 // sell
			if( Positive_Money_Flow_Sum > 255391 )
				if( Typical_Price <= 0.129349 )
					if( Raw_Money_Flow <= 391933 )
						if( Money_Flow_Ratio <= 0.205862 )
							if( mf <= -0.33749 )
								if( ad <= 796806 )
									ret := -0.230769
								if( ad > 796806 )
									ret := -0.937500 // sell
							if( mf > -0.33749 )
								if( Positive_Money_Flow_Sum <= 295051 )
									ret := 0.273973
								if( Positive_Money_Flow_Sum > 295051 )
									ret := -0.140449
						if( Money_Flow_Ratio > 0.205862 )
							if( Negative_Money_Flow_Sum <= 2.13227e+06 )
								if( Positive_Money_Flow <= 116323 )
									ret := 0.168107
								if( Positive_Money_Flow > 116323 )
									ret := -0.031780
							if( Negative_Money_Flow_Sum > 2.13227e+06 )
								if( Positive_Money_Flow_Sum <= 1.66243e+06 )
									ret := 0.387405
								if( Positive_Money_Flow_Sum > 1.66243e+06 )
									ret := -0.057143
					if( Raw_Money_Flow > 391933 )
						if( Positive_Money_Flow <= 404618 )
							if( Negative_Money_Flow_Sum <= 1.76823e+06 )
								if( Negative_Money_Flow_Sum <= 1.25728e+06 )
									ret := 0.666667
								if( Negative_Money_Flow_Sum > 1.25728e+06 )
									ret := 0.058824
							if( Negative_Money_Flow_Sum > 1.76823e+06 )
								if( MFI <= 34.5215 )
									ret := 0.843478 // buy
								if( MFI > 34.5215 )
									ret := 0.375000
						if( Positive_Money_Flow > 404618 )
							if( Positive_Money_Flow_Sum <= 3.632e+06 )
								if( ad <= 2.0849e+06 )
									ret := 0.700000 // buy
								if( ad > 2.0849e+06 )
									ret := -0.175000
							if( Positive_Money_Flow_Sum > 3.632e+06 )
								if( ad <= 5.12644e+06 )
									ret := 0.750000 // buy
								if( ad > 5.12644e+06 )
									ret := 1.000000 // buy
				if( Typical_Price > 0.129349 )
					if( mf <= -0.031077 )
						if( MFI_High <= -49.9819 )
							if( MFI <= 9.59018 )
								if( Money_Flow_Ratio <= 0.055934 )
									ret := 0.500000
								if( Money_Flow_Ratio > 0.055934 )
									ret := 1.000000 // buy
							if( MFI > 9.59018 )
								if( Positive_Money_Flow <= 55543.6 )
									ret := 0.112500
								if( Positive_Money_Flow > 55543.6 )
									ret := -0.176656
						if( MFI_High > -49.9819 )
							if( Positive_Money_Flow <= 95008.5 )
								if( Positive_Money_Flow <= 91696.1 )
									ret := 0.136364
								if( Positive_Money_Flow > 91696.1 )
									ret := -0.909091 // sell
							if( Positive_Money_Flow > 95008.5 )
								if( ad <= 1.33986e+06 )
									ret := 0.635514
								if( ad > 1.33986e+06 )
									ret := 0.060606
					if( mf > -0.031077 )
						if( Negative_Money_Flow_Sum <= 1.33725e+07 )
							if( Negative_Money_Flow_Sum <= 2.22508e+06 )
								if( Positive_Money_Flow <= 123928 )
									ret := 0.028497
								if( Positive_Money_Flow > 123928 )
									ret := -0.420290
							if( Negative_Money_Flow_Sum > 2.22508e+06 )
								if( Raw_Money_Flow <= 920732 )
									ret := -0.484375
								if( Raw_Money_Flow > 920732 )
									ret := 0.263158
						if( Negative_Money_Flow_Sum > 1.33725e+07 )
							ret := 1.000000 // buy
		if( MFI > 36.468 )
			if( Typical_Price <= 0.141249 )
				if( mf <= 0.104813 )
					if( Negative_Money_Flow_Sum <= 1.99282e+06 )
						if( ad <= 4.3002e+06 )
							if( Negative_Money_Flow_Sum <= 1.20496e+06 )
								if( ad <= -36539.2 )
									ret := 0.065863
								if( ad > -36539.2 )
									ret := 0.013715
							if( Negative_Money_Flow_Sum > 1.20496e+06 )
								if( Positive_Money_Flow_Sum <= 2.83822e+06 )
									ret := -0.073869
								if( Positive_Money_Flow_Sum > 2.83822e+06 )
									ret := -0.346774
						if( ad > 4.3002e+06 )
							if( Typical_Price <= 0.096983 )
								ret := -0.666667
							if( Typical_Price > 0.096983 )
								ret := -1.000000 // sell
					if( Negative_Money_Flow_Sum > 1.99282e+06 )
						if( mf <= -0.136475 )
							if( Negative_Money_Flow_Sum <= 3.77556e+06 )
								if( Negative_Money_Flow_Sum <= 2.59269e+06 )
									ret := -0.269231
								if( Negative_Money_Flow_Sum > 2.59269e+06 )
									ret := -0.925926 // sell
							if( Negative_Money_Flow_Sum > 3.77556e+06 )
								if( mf <= -0.169754 )
									ret := 1.000000 // buy
								if( mf > -0.169754 )
									ret := -0.769231 // sell
						if( mf > -0.136475 )
							if( Negative_Money_Flow <= 291738 )
								if( Negative_Money_Flow_Sum <= 3.20476e+06 )
									ret := 0.444444
								if( Negative_Money_Flow_Sum > 3.20476e+06 )
									ret := 0.104396
							if( Negative_Money_Flow > 291738 )
								if( Negative_Money_Flow_Sum <= 5.61134e+06 )
									ret := -0.571429
								if( Negative_Money_Flow_Sum > 5.61134e+06 )
									ret := 0.500000
				if( mf > 0.104813 )
					if( Positive_Money_Flow_Sum <= 1.11339e+06 )
						if( ad_mf <= 87488.4 )
							if( Positive_Money_Flow_Sum <= 675002 )
								if( Negative_Money_Flow_Sum <= 297462 )
									ret := -0.028624
								if( Negative_Money_Flow_Sum > 297462 )
									ret := 0.079279
							if( Positive_Money_Flow_Sum > 675002 )
								if( Negative_Money_Flow <= 4826.95 )
									ret := 0.041916
								if( Negative_Money_Flow > 4826.95 )
									ret := 0.307692
						if( ad_mf > 87488.4 )
							if( Negative_Money_Flow_Sum <= 1.55053e+06 )
								if( Positive_Money_Flow <= 547633 )
									ret := -0.080244
								if( Positive_Money_Flow > 547633 )
									ret := 0.571429
							if( Negative_Money_Flow_Sum > 1.55053e+06 )
								if( mf <= 0.147418 )
									ret := -0.750000 // sell
								if( mf > 0.147418 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 1.11339e+06 )
						if( Positive_Money_Flow_Sum <= 1.64397e+06 )
							if( Negative_Money_Flow_Sum <= 954831 )
								if( mf <= 0.425544 )
									ret := 0.081108
								if( mf > 0.425544 )
									ret := 0.521739
							if( Negative_Money_Flow_Sum > 954831 )
								if( Negative_Money_Flow_Sum <= 1.03496e+06 )
									ret := 0.789474 // buy
								if( Negative_Money_Flow_Sum > 1.03496e+06 )
									ret := 0.290043
						if( Positive_Money_Flow_Sum > 1.64397e+06 )
							if( Typical_Price <= 0.109933 )
								if( Positive_Money_Flow_Sum <= 2.06491e+06 )
									ret := 0.008475
								if( Positive_Money_Flow_Sum > 2.06491e+06 )
									ret := 0.401015
							if( Typical_Price > 0.109933 )
								if( Positive_Money_Flow_Sum <= 1.04154e+07 )
									ret := -0.118705
								if( Positive_Money_Flow_Sum > 1.04154e+07 )
									ret := 0.818182 // buy
			if( Typical_Price > 0.141249 )
				if( Positive_Money_Flow_Sum <= 447370 )
					if( ad_mf <= 222758 )
						if( MFI <= 46.0377 )
							if( Positive_Money_Flow_Sum <= 427162 )
								if( Positive_Money_Flow <= 64351.8 )
									ret := -0.407407
								if( Positive_Money_Flow > 64351.8 )
									ret := 0.600000
							if( Positive_Money_Flow_Sum > 427162 )
								if( Negative_Money_Flow <= 20010.1 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow > 20010.1 )
									ret := 0.333333
						if( MFI > 46.0377 )
							if( Positive_Money_Flow <= 45416.5 )
								if( Typical_Price <= 0.185733 )
									ret := 0.805556 // buy
								if( Typical_Price > 0.185733 )
									ret := 0.000000
							if( Positive_Money_Flow > 45416.5 )
								if( Positive_Money_Flow_Sum <= 419431 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 419431 )
									ret := 0.666667
					if( ad_mf > 222758 )
						if( Positive_Money_Flow_Sum <= 436348 )
							if( Negative_Money_Flow_Sum <= 612864 )
								if( mf <= -0.027719 )
									ret := 0.000000
								if( mf > -0.027719 )
									ret := -0.375000
							if( Negative_Money_Flow_Sum > 612864 )
								ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 436348 )
							ret := -1.000000 // sell
				if( Positive_Money_Flow_Sum > 447370 )
					if( Typical_Price <= 0.160034 )
						if( Negative_Money_Flow <= 475848 )
							if( Positive_Money_Flow_Sum <= 7.60314e+06 )
								if( mf <= 0.069974 )
									ret := -0.067869
								if( mf > 0.069974 )
									ret := -0.277922
							if( Positive_Money_Flow_Sum > 7.60314e+06 )
								if( Negative_Money_Flow_Sum <= 2.15717e+06 )
									ret := 0.676471
								if( Negative_Money_Flow_Sum > 2.15717e+06 )
									ret := 0.066667
						if( Negative_Money_Flow > 475848 )
							if( Typical_Price <= 0.156196 )
								if( Positive_Money_Flow_Sum <= 4.09629e+06 )
									ret := 0.333333
								if( Positive_Money_Flow_Sum > 4.09629e+06 )
									ret := 0.956522 // buy
							if( Typical_Price > 0.156196 )
								if( ad_mf <= 2.20033e+06 )
									ret := 0.600000
								if( ad_mf > 2.20033e+06 )
									ret := -1.000000 // sell
					if( Typical_Price > 0.160034 )
						if( Negative_Money_Flow_Sum <= 1.96736e+06 )
							if( MFI_High <= -38.799 )
								if( Positive_Money_Flow_Sum <= 681607 )
									ret := -0.780488 // sell
								if( Positive_Money_Flow_Sum > 681607 )
									ret := 0.250000
							if( MFI_High > -38.799 )
								if( MFI_High <= -3.63117 )
									ret := -0.141176
								if( MFI_High > -3.63117 )
									ret := -0.565789
						if( Negative_Money_Flow_Sum > 1.96736e+06 )
							if( Negative_Money_Flow <= 16711.6 )
								if( Money_Flow_Ratio <= 0.974537 )
									ret := -0.200000
								if( Money_Flow_Ratio > 0.974537 )
									ret := -0.706897 // sell
							if( Negative_Money_Flow > 16711.6 )
								if( Typical_Price <= 0.170116 )
									ret := -0.886364 // sell
								if( Typical_Price > 0.170116 )
									ret := -0.500000
	
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
float op_operation = decision_tree_0_XLMUSDT_15Min_85982d74(ad, ad_mf, mf, Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum)

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


